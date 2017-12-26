<?php
	session_start();
	ob_start();
	require_once './db_connect.php';
	/* @var $db PDO */
	require_once './scripts.php';
?>
	<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Pujcovna</title>
		<link rel="stylesheet" type="text/css" href="styl.css" />
	</head>
	<?php
		$chyba = "";
		if(isset($_REQUEST['puj_prihl'])) {
			$login = trim(htmlspecialchars($_REQUEST['puj_login']));
			$heslo = trim(htmlspecialchars($_REQUEST['puj_heslo']));
			if(($login == "") || ($heslo == "")) {
				$chyba = "Vyplnte login a heslo";
			} else {
				$heslo = md5($heslo);
				if(userLogin($login, $heslo, $db)) {
				} else {
					$chyba = "Neplatny login a heslo";
				}
			}
		}
		if(isset($_REQUEST['puj_odhl'])) {
			if(!userLogout()) {
				$chyba = "Odhlaseni se nezdarilo";
			}
		}
	?>
	<body>
	<div id="wrap_head">
		<div id="head">
			<h1>Pujcovna</h1>
		</div>
	</div>

	<div id="wrap_body">
		<div id="body">
			<?php
				try {
					$query = $db->prepare("SELECT * FROM puj_knihy");
					$query->execute();
				} catch(PDOException $e) {
					die($e->getMessage());
				}
				echo "<table border=\"1\">\n";
				echo "<tr> <th>Nazev</th> <th>Autor</th> <th>Zanr</th> <th>Pocet kusu</th> <th>&nbsp;</th> </tr>\n";

				while($row = $query->fetch(PDO::FET)) {
					//stahnu vsechna data do promennych
					$id_kniha = $row['puj_knihy_id'];
					$nazev    = $row['puj_knihy_nazev'];
					$autor    = $row['puj_knihy_autor'];
					$zanr     = $row['puj_knihy_zanr'];
					$pocet    = $row['puj_knihy_pocet'];
					echo "<tr> <td>$nazev</td> <td>$autor</td> <td>$zanr</td> <td>$pocet</td>";
					if(isLoggedIn()) {
						$id_uziv = $_SESSION[session_id()];
						try {
							$query2 = $db->prepare("SELECT COUNT(*) FROM puj_vypujcky WHERE puj_vyp_idUzivatel = ? AND puj_vyp_idKniha = ?");
							$params = [$id_uziv, $id_kniha];
							$query2->execute($params);
						} catch(PDOException $e) {
							die($e->getMessage());
						}
						if($query2->fetchColumn(0) == 1) {
							echo "<td><a href=\"./vratit.php?id_kniha=$id_kniha\">vratit</a></td>";
						} else {
							if($pocet > 0) {
								echo "<td><a href=\"./pujcit.php?id_kniha=$id_kniha\">pujcit</a></td>";
							} else {
								echo "<td>nelze pujcit</td>";
							}
						}
					} else {
						echo "<td>musite se prihlasit</td>";
					}
					echo "</tr>\n";
				}
				echo "</table>\n";
			?>
		</div>
	</div>
	<div id="wrap_login">
		<div id="login">
			<?php
				if(!isLoggedIn()) {
					echo "<form action=\"\" method=\"POST\">\n";
					echo "Login: <input type=\"text\" name=\"puj_login\" /><br />\n";
					echo "Heslo: <input type=\"password\" name=\"puj_heslo\" /><br />";
					echo "<input type=\"submit\" name=\"puj_prihl\" value=\"Prihlasit\" />";
					echo "<input type=\"submit\" name=\"reg_submit2\" value=\"Registrovat\" />\n";
					echo "</form>\n";
				} else {
					echo "Prihlasen: " . getUserLogin($_SESSION[session_id()], $db) . "<br />\n";
					echo "<form action=\"\" method=\"POST\">\n";
					echo "<input type=\"submit\" name=\"puj_odhl\" value=\"Odhlasit\" />\n";
					echo "</form>\n";
				}
				if($chyba != "") {
					echo "<p class=\"error\">" . $chyba . "</p>\n";
				}
				if(isset($_REQUEST['reg_submit2'])) {
					header("Location: ./registrace.php");
				}
			?>
		</div>
	</div>
	</body>
</html>

<?php
	ob_end_flush();
?>
