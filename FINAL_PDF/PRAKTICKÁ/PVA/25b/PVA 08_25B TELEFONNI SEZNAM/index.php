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
		<title>Seznam</title>
		<link rel="stylesheet" type="text/css" href="styl.css" />
	</head>

	<?php
		$chyba = "";
		if(isset($_REQUEST['prihl'])) {
			$login = trim(htmlspecialchars($_REQUEST['login']));
			$heslo = trim(htmlspecialchars($_REQUEST['heslo']));
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
		if(isset($_REQUEST['odhl'])) {
			if(!userLogout()) {
				$chyba = "Odhlaseni se nezdarilo";
			}
		}
	?>

	<body>
		<div id="wrap_head">
			<div id="head">
				<h1>Telefonni seznam</h1>
			</div>
		</div>
		<div id="wrap_body">
			<div id="body">
				<?php
					try {
						$query = $db->prepare("SELECT * FROM telefony_domacnosti");
						$query->execute();
					} catch(PDOException $e) {
						die($e->getMessage());
					}
					echo '<h2>Domacnosti</h2>';
					echo "<table border=\"1\">\n";
					echo "<tr> <th>Jmeno</th> <th>Mesto</th> <th>Telefon</th></tr>\n";
					while($row = $query->fetch(PDO::FETCH_BOTH)) {
						$id_dom_tel      = $row['telefony_domacnosti_id'];
						$jmeno_dom_tel   = $row['telefony_domacnosti_jmeno'];
						$mesto_dom_tel   = $row['telefony_domacnosti_mesto'];
						$telefon_dom_tel = $row['telefony_domacnosti_telefon'];
						echo "<tr> <td>$jmeno_dom_tel</td> <td>$mesto_dom_tel</td> <td>$telefon_dom_tel</td>";
						if(isLoggedIn()) {
							echo "<td><a href='upravit.php?id_domacnost=$id_dom_tel'>Upravit</a></td>";
							echo "<td><a href=\"./smazat.php?id_domacnost=$id_dom_tel\">Smazat</a></td>";
						}
						echo "</tr>";
					}
					echo "</table>";
					try {
						$query = $db->prepare("SELECT * FROM telefony_firmy");
						$query->execute();
					} catch(PDOException $e) {
						die($e->getMessage());
					}
					echo '<h2>Firmy</h2>';
					echo "<table border=\"1\">\n";
					echo "<tr> <th>Jmeno</th><th>ICO</th> <th>Mesto</th> <th>Telefon</th></tr>\n";
					while($row = $query->fetch(PDO::FETCH_BOTH)) {
						$id_firm_tel      = $row['telefony_firmy_id'];
						$jmeno_firm_tel   = $row['telefony_firmy_nazev'];
						$ico_firm_tel     = $row['telefony_firmy_ico'];
						$mesto_firm_tel   = $row['telefony_firmy_mesto'];
						$telefon_firm_tel = $row['telefony_firmy_telefon'];
						echo "<tr> <td>$jmeno_firm_tel</td><td>$ico_firm_tel</td> <td>$mesto_firm_tel</td> <td>$telefon_firm_tel</td>";
						if(isLoggedIn()) {
							echo "<td><a href=\"./upravit.php?id_firma=$id_firm_tel\">Upravit</a></td>";
							echo "<td><a href=\"./smazat.php?id_firma=$id_firm_tel\">Smazat</a></td>";
						}
						echo "</tr>";
					}
					echo "</table>";
				?>
			</div>
		</div>
		<div id="wrap_login">
			<div id="login">
				<?php
					if(!isLoggedIn()) {
						echo "<form action=\"\" method=\"POST\">\n";
						echo "Login: <input type=\"text\" name=\"login\" /><br />\n";
						echo "Heslo: <input type=\"password\" name=\"heslo\" /><br />";
						echo "<input type=\"submit\" name=\"prihl\" value=\"Prihlasit\" />";
						echo "<input type=\"submit\" name=\"reg_submit\" value=\"Registrovat\" />\n";
						echo "</form>\n";
					} else {
						echo "Prihlasen: " . getUserLogin($_SESSION[session_id()], $db) . "<br />\n";
						echo "<form action=\"\" method=\"POST\">\n";
						echo "<input type=\"submit\" name=\"odhl\" value=\"Odhlasit\" />\n";
						echo "</form>\n";
						echo "<br /><a href=\"./novy.php\">Novy zaznam</a>\n";
					}
					echo "<br /><br /><a href=\"./vyhledat.php\">Vyhledavani</a>\n";
					if($chyba != "") {
						echo "<p class=\"error\">" . $chyba . "</p>\n";
					}
					if(isset($_REQUEST['reg_submit'])) {
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
