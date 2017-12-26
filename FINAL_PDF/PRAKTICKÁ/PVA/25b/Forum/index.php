<?php
	//nastartovani session
	session_start();
	//output buffering
	ob_start();
	//pripojeni k DB
	require_once 'DBconnect.php';
	//scripty
	require_once './scripts_PDO.php';
?>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="content-type" content="text/html; charset=" UTF-8>
		<link rel="stylesheet" type="text/css" href="./styl.css">
		<title>Forum</title>
	</head>
	<?php
		$chyba = "";
		if(isset($_REQUEST['prihl'])){
			$login = trim(htmlspecialchars($_REQUEST['login']));
			$heslo = trim(htmlspecialchars($_REQUEST['heslo']));
			if(($login == "") || ($heslo == "")){
				$chyba = "Vyplnte login a heslo";
			} else {
				$heslo = md5($heslo);
				if(userLogin($login, $heslo, $db)){
				} else {
					$chyba = "Neplatny login a heslo";
				}
			}
		}
		if(isset($_REQUEST['odhl'])){
			if(!userLogout()){
				$chyba = "Odhlaseni se nezdarilo";
			}
		}
	?>
	<body>
		<h1>Forum</h1>

		<?php
			if(isset($_REQUEST['add_submit'])){
				$predmet    = htmlspecialchars($_REQUEST['predmet']);
				$obsahprisp = htmlspecialchars($_REQUEST['text']);
				$id         = $_SESSION[session_id()];
				//zjistim si jeho login kvuli vypisu kdo je prihlasen
				$uzivatel = getUserLogin($id, $db);
				try{
					$query = $db->prepare("INSERT INTO zaznamy (nazevz, textz, login) VALUES (?, ?, ?)");
				} catch(PDOException $e){
					die($e->getMessage());
				}
				$params = [$predmet, $obsahprisp, $uzivatel];
				try{
					$query->execute($params);
				} catch(PDOException $e){
					die($e->getMessage());
				}
				header("Location: ./index.php");
			}
			if(isset($_REQUEST['prihl'])){
				$login = htmlspecialchars($_REQUEST['login']);
				$heslo = htmlspecialchars($_REQUEST['heslo']);
				if(($login == '') || ($heslo == '')){
					echo "Vyplnte login a heslo";
				} else {
					//jinak spocitam hash z jeho hesla
					$heslo = md5($heslo);
					//pokusim se prihlasit
					if(userLogin($login, $heslo, $db)){
						//pokud se to povedlo
						//vytahnu si id uzivatele ze session
						$chyba = "prihlaseni se zdarilo";
						$id    = $_SESSION[session_id()];
						//zjistim si jeho login kvuli vypisu kdo je prihlasen
						$login = getUserLogin($id, $db);
					} else {
						//pokud to nenaslo shodu, vypisu chybou hlasku
						$chyba = "Neplatny login a heslo";
					}
				}
			} else if(isset($_REQUEST['odhl'])){
				//pokusim se odhlasit
				if(!userLogout()){
					//pokud se to nepovedlo, vypisu chybovou hlasku
					$chyba = "Odhlaseni se nezdarilo";
				}
			}
		?>

		<div id="wrap_body">
			<div id="body">
				<?php
					try{
						$query = $db->prepare("SELECT idz, nazevz, textz, login, idr, id_uz, text  FROM  zaznamy
						LEFT JOIN reply ON zaznamy.idz = reply.idr ORDER BY text DESC");
					} catch(PDOException $e){
						die($e->getMessage());
					}
					try{
						$query->execute();
					} catch(PDOException $e){
						die($e->getMessage());
					}
					while(($row = $query->fetch(PDO::FETCH_BOTH)) != FALSE){
						$idz           = $row['idz'];
						$nazevprisp    = $row['nazevz'];
						$autorprisp    = $row['login'];
						$text          = $row['textz'];
						$autorodpovedi = $row['id_uz'];
						$idrady        = $row['idr'];
						$odpoved       = $row['text'];
						if(isLoggedIn()){
							//vytahnu si jeho id, kvuli identifikaci
							$id = $_SESSION[session_id()];
							echo("<fieldset>");
							echo("<legend>Predmet: $nazevprisp</legend>");
							echo("<table>");
							echo "<tr> <td> Autor: $autorprisp </td></tr>";
							echo "<tr> <td> TEXT: $text </td></tr>";
							echo("</table><br />");
							if($idrady != NULL){
								echo("<fieldset>");
								echo("<table>");
								echo "<tr> <td> Autor: $autorodpovedi </td></tr>";
								echo "<tr> <td> TEXT: $odpoved </td></tr>";
								echo("</table>");
								echo("</fieldset>");
							} else {
								echo("<fieldset>");
								echo("<table>");
								if($autorprisp == $id){
									echo "<tr> <td> Zatim ti na tvuj problem nikdo neodpovedel. </td></tr>";
								} else {
									echo "<tr> <td> Bez odpovedi, pridej <a href='./odpoved.php?IDzaz=$idz'>Zde</a> </td></tr>";
								}
								echo("</table>");
								echo("</fieldset>");
							}
							echo("</fieldset><br />");
						} else {
							//pokud si stranku prohlizi neprihlaseny uzivatel, zobrazim mu pouze prehled knih a hlaseni ze se musi prihlasit
							echo("<fieldset>");
							echo("<legend>Predmet: $nazevprisp</legend>");
							echo("<table>");
							echo "<tr> <td> Autor: $autorprisp </td></tr>";
							echo "<tr> <td> TEXT: $text </td></tr>";
							echo("</table><br />");
							echo("<fieldset>");
							echo("<table>");
							echo "<tr> <td> Nejprve se musite prihlasit, abyste mohl videt nebo pridavat odpovedi </td></tr>";
							echo("</table>");
							echo("</fieldset>");
							echo("</fieldset><br />");
						}
					}
				?>
			</div>
		</div>

		<div id="wrap_login">
			<div id="login">
				<?php
					if(!isLoggedIn()){
						echo("<form action='' method='POST'>\n");
						echo("login: <input type='text' name='login'><br>\n");
						echo("heslo: <input type='password' name='heslo'><br>\n");
						echo("<input type='submit' name='prihl' value='Prihlasit'>\n");
						if($chyba != ''){
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
						//vyechovany jednoduchy formular na pridani prispevku aktualnim uzivatelem
						echo("<fieldset>");
						echo("  <form action='' method='POST'>
						Predmet prispevku <input type='text' name='predmet'><br>
						Text prispevku <input type='text' name='text'><br>
						<input type='submit' name='add_submit' value='Pridat prispevek'>
						</form>  ");
						echo("</fieldset>");
					}
				?>
			</div>
		</div>
	</body>
</html>
<?
	ob_end_flush();
?>
