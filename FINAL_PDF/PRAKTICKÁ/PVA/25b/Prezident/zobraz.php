<?php
	//nastartovani session
	session_start();
	//output buffering
	ob_start();
	//pripojeni k DB
	require_once './db_connect.php';
	//scripty
	require_once './scripts_PDO.php';
?>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Zobraz</title>
	</head>
	<body>
		<?php
			require_once './db_connect.php';
			try {
				$query = $db->prepare("SELECT * FROM prezident");
			} catch (PDOException $e) {
				die($e->getMessage());
			}


			try {
				$query->execute();
			} catch (PDOException $e) {
				die($e->getMessage());
			}

			if(isset($_REQUEST['prihl'])){
				$login = htmlspecialchars($_REQUEST['login']);
				$heslo = htmlspecialchars($_REQUEST['heslo']);

				if(($login == '') || ($heslo == '')) {
					echo "Vyplnte login a heslo";
				} else {
					//jinak spocitam hash z jeho hesla
					$heslo = md5($heslo);
					//pokusim se prihlasit
					if(userLogin($login, $heslo, $db)) {
						//pokud se to povedlo
						//vytahnu si id uzivatele ze session
						$chyba = "prihlaseni se zdarilo";
						$id = $_SESSION[session_id()];

						//zjistim si jeho login kvuli vypisu kdo je prihlasen
						$login = getUserLogin($id, $db);
					} else {
						//pokud to nenaslo shodu, vypisu chybou hlasku
						$chyba = "Neplatny login a heslo";
					}
				}
			} else if(isset($_REQUEST['odhl'])) {
				//pokusim se odhlasit
				if(!userLogout()) {
					//pokud se to nepovedlo, vypisu chybovou hlasku
					$chyba = "Odhlaseni se nezdarilo";
				}
			}
		?>

		<div id="wrap_body">
			<div id="body">
				<?php
					if(isLoggedIn()) {
						//vytahnu si jeho id, kvuli identifikaci
						$id = $_SESSION[session_id()];
						$chyba = $_SESSION[chyba];
						if($chyba != ""){
							echo $chyba;
							$chyba = "";
							unset ($_SESSION[chyba]);
						}

						try {
							$query = $db->prepare("SELECT * FROM  `prezident` ORDER BY  `prezident`.`Hlasy` DESC");
							$query->execute();
						} catch (PDOException $e) {
							die($e->getMessage());
						}

						echo("<h1>Volby prezidenta</h1>\n");
						echo("<table border=1>\n");
						echo("<tr> <th>Jmeno</th> <th>Hasy</th> <th>Hlasuj</th> ");

						while (($row = $query->fetch(PDO::FETCH_BOTH)) != false) {
							$id = $row['ID'];
							$jmeno = $row['Jmeno'];
							$hlasy = $row['Hlasy'];

							echo("<tr><td>$jmeno</td><td>$hlasy</td>
								  <td>&nbsp;<a href='./hodnoceni.php?ID=$id'>Hlasuj</a>&nbsp;</td></tr>");
						}
	 					echo("</table>\n");

					} else {
						//pokud si stranku prohlizi neprihlaseny uzivatel, zobrazim mu pouze prehled knih a hlaseni ze se musi prihlasit
						echo("<h1>Volby prezidenta</h1>\n");
						echo("<table border='1'>\n");
						echo("<tr> <th>Jmeno</th> <th>Hasy</th> <th>Hlasuj</th> ");
						while (($row = $query->fetch(PDO::FETCH_BOTH)) != false) {
							$id = $row['ID'];
							$jmeno = $row['Jmeno'];
							$hlasy = $row['Hlasy'];

							echo("<tr><td>$jmeno</td><td>$hlasy</td>
									   <td>&nbsp;Pro hlasovani prihlasit&nbsp;</td></tr>");
						}
						echo("</table>\n");
					}
				?>
			</div>
		</div>

		<div id="wrap_login">
			<div id="login">
				<?php
					if(!isLoggedIn()) {
						echo("<form action='' method='POST'>\n");
						echo("login: <input type='text' name='login'><br>\n");
						echo("heslo: <input type='password' name='heslo'><br>\n");
						echo("<input type='submit' name='prihl' value='Prihlasit'>\n");
						if($chyba != '') {
							echo("<p class='error'> $chyba </p>\n");
						}
						echo("</form>\n");
						//link na registracni formular
						echo("<a href='./register.php'>Registrace</a>\n");
					} else {
						//pokud je uzivatel prihlasen, zobrazuje kdo je prihlasen a formular pro odhlaseni
						echo("Prihlasen: " . getUserLogin($_SESSION[session_id()], $db) . "<br>\n");
						echo("<form action='' method='POST'>\n");
						echo("<input type='submit' name='odhl' value='Odhlasit'>\n");
						echo("</form>\n");
					}
				?>
			</div>
		</div>
	</body>
</html>
