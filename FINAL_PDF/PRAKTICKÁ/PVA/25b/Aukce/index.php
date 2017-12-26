<?php
	session_start();
	ob_start();
	require_once './db_connect_PDO.php';
	require_once './scripts_PDO.php';
?>
	<!DOCTYPE html>
	<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Aukce</title>
		<link rel="stylesheet" type="text/css" href="styl.css" />
	</head>
	<body>
		<?php
			//promenna ktera zobrazi chyby
			$chyba = "";
			// uzivatel se chce prihlasit
			if(isset($_REQUEST['puj_prihl'])){
				//vytahnu si login
				$login = htmlspecialchars($_REQUEST['puj_login']);
				$heslo = htmlspecialchars($_REQUEST['puj_heslo']);
				//zkontroluji zda nejsou prazdne
				if(($login == "") || ($heslo == "")){
					$chyba = "Vyplnte login a heslo";
				} else {
					$heslo = md5($heslo);
					if(userLogin($login, $heslo, $db)){
						//pokud se podarilo prihlaseni
						//vytahnu si id uzivatele
						$id = $_SESSION[session_id()];
						//vytahnu si uzivateluv login
						$login = getUserLogin($id, $db);
					} else {
						$chyba = "Neplatny login a heslo";
					}
				}
			} else if(isset($_REQUEST['puj_odhl'])){
				//pokusim se prihlasit
				if(!userLogout()){
					//pokud se nepovede odhlaseni
					$chyba = "Odhlaseni se nezdarilo";
				}
			}
			if(isset($_REQUEST["prihodit"])){
				$index = $_SESSION['index'];
				for($i = 0; $i <= $index; $i++){
					if(isset($_REQUEST["castka$i"])){
						$pomocna = $_REQUEST["castka$i"];
						$index   = $i;
						break;
					}
				}
				if($pomocna == ""){
					echo "musis vyplnit kolik chces prihodit :]";
				} else {
					$prihazujici = getUserLogin($_SESSION[session_id()], $db);
					$id          = $_SESSION[session_id()];
					try{
						$query2 = $db->prepare("SELECT cena_zbozi FROM zbozi WHERE id_zbozi = ?");
					} catch(PDOException $e){
						die($e->getMessage());
					}
					$params = [$index];
					try{
						$query2->execute($params);
					} catch(PDOException $e){
						die($e->getMessage());
					}
					if($query2->fetchColumn(0) < $pomocna){
						try{
							$query3 =
								$db->prepare("UPDATE zbozi SET cena_zbozi = ?, vlastnik_zbozi = ? ,ID_vlastnika = ?  WHERE id_zbozi = ?");
						} catch(PDOException $e){
							die($e->getMessage());
						}
						$params = [$pomocna, $prihazujici, $id, $index];
						try{
							$query3->execute($params);
						} catch(PDOException $e){
							die($e->getMessage());
						}
					} else {
						echo("musis zadat vyssi hodnotu nez je aktualni");
					}
				}
			}
		?>
		<div id="wrap_head">
			<div id="head">
				<h1>Aukce</h1>
			</div>
		</div>
		<div id="wrap_body">
			<div id="body">
				<?php
					//info o knihach
					try{
						$query = $db->prepare("SELECT * FROM zbozi");
						$query->execute();
					} catch(PDOException $e){
						die($e->getMessage());
					}
					//pokud je uzivatel prihlasen
					if(isLoggedIn()){
						$id = $_SESSION[session_id()];
						//tabulku si prohlizi prihlaseny
						//tabulku si prohlizi neprihlaseny
						echo("<table border=\"1\">");
						echo("<tr> <th>nazev zbozi</th> <th>popis</th> <th>kategorie</th> <th>pocet</th> <th>cena</th> <th>uzivatel</th> <th colspan=\"2\">&nbsp;</th> </tr>\n");
						while($row = $query->fetch(PDO::FETCH_BOTH)){
							$ID_zbozi  = $row['ID_zbozi'];
							$nazev     = $row['nazev_zbozi'];
							$popis     = $row['popis_zbozi'];
							$kategorie = $row['kategorie_zbozi'];
							$pocet     = $row['pocet_zbozi'];
							$cena      = $row['cena_zbozi'];
							$uzivatel  = $row['vlastnik_zbozi'];
							$index     = $ID_zbozi;
							echo("<tr> <td>$nazev</td><td>$popis</td><td>$kategorie</td><td>$pocet</td><td>$cena</td><td>$uzivatel</td>");
							echo("<td><form action=\"\" method=\"POST\">
								<input type=\"text\" name='castka$index' /><br />
								<input type=\"submit\" name=\"prihodit\" value=\"Prihodit\"/>
								</form></td></tr>");
						}
						echo("</table>");
						$_SESSION['index'] = $index;
					} else {
						//tabulku si prohlizi neprihlaseny
						echo("<table border=\"1\">");
						echo("<tr> <th>nazev zbozi</th> <th>popis</th> <th>kategorie</th> <th>pocet</th> <th>cena</th> <th colspan=\"2\">&nbsp;</th> </tr>\n");
						while($row = $query->fetch(PDO::FETCH_BOTH)){
							$ID_zbozi  = $row['ID_zbozi'];
							$nazev     = $row['nazev_zbozi'];
							$popis     = $row['popis_zbozi'];
							$kategorie = $row['kategorie_zbozi'];
							$pocet     = $row['pocet_zbozi'];
							$cena      = $row['cena_zbozi'];
							echo("<tr> <td>$nazev</td><td>$popis</td><td>$kategorie</td><td>$pocet</td><td>$cena</td>");
							echo("<td>Musite se prihlasit</td></tr>");
						}
						echo("</table>");
					}
				?>
			</div>
		</div>

		<div id="wrap_login">
			<div id="login">
				<?php
					if(!isLoggedIn()){
						//nejsem prihlasen zobraz prihl form
						echo("<form action=\"\" method=\"POST\">\n");
						echo("Login: <input type=\"text\" name=\"puj_login\" /><br />\n");
						echo("Heslo: <input type=\"password\" name=\"puj_heslo\" /><br />\n");
						echo("<input type=\"submit\" name=\"puj_prihl\" value=\"Prihlasit\"/>\n");
						echo("</form>\n");
						//zobrazeni chyby
						if($chyba != ""){
							echo("<p class=\"error\"> $chyba </p> ");
						}
						echo("<a href='registrace.php'>Registrace</a>\n");
					} else {
						//jsem prihlasen
						echo("Prihlasen: " . getUserLogin($_SESSION[session_id()], $db) . "<br />");
						echo("<form action=\"\" method=\"POST\">\n");
						echo("<input type=\"submit\" name=\"puj_odhl\" value=\"Odhlasit\"/>\n");
						echo("</form>\n");
						echo "<a href='rezervace.php'>Moje rezervace</a> ";
					}
				?>
			</div>
		</div>
	</body>
</html>
<?php
	ob_end_flush();
?>
