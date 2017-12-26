<?php
	session_start();
	ob_start();
	require_once './db_connect.php';
	require_once './scripts.php';
?>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Eshop</title>
		<link rel="stylesheet" type="text/css" href="styl.css" />
	</head>

	<?php
		$chyba = "";
		if(isset($_REQUEST['puj_prihl'])){
			$login = trim(htmlspecialchars($_REQUEST['puj_login']));
			$heslo = trim(htmlspecialchars($_REQUEST['puj_heslo']));
			if(($login == "") || ($heslo == "")){
				$chyba = "Vyplnte login a heslo";
			} else{
				$heslo = md5($heslo);
				if(userLogin($login, $heslo, $db)){
				} else{
					$chyba = "Neplatny login a heslo";
				}
			}
		}
		if(isset($_REQUEST['puj_odhl'])){
			if(!userLogout()){
				$chyba = "Odhlaseni se nezdarilo";
			}
		}
	?>

	<body>
		<div id="wrap_head">
			<div id="head">
				<h1>Eshop</h1>
			</div>
		</div>
		<div id="wrap_body">
			<div id="body">
				<?php
					try{
						$query = $db->prepare("SELECT * FROM zbozi");
						$query->execute();
					} catch(PDOException $e){
						die($e->getMessage());
					}
					echo "<table border=\"1\">";
					echo "<tr><th>Nazev</th><th>Popis</th><th>Kategorie</th><th>Cena</th><th>&nbsp;</th></tr>";

					while($row = $query->fetch(PDO::FETCH_BOTH)){
						$ID_zbozi        = $row['ID_zbozi'];
						$nazev_zbozi     = $row['nazev_zbozi'];
						$popis_zbozi     = $row['popis_zbozi'];
						$kategorie_zbozi = $row['kategorie_zbozi'];
						$cena_zbozi      = $row['cena_zbozi'];
						$index           = $ID_zbozi;
						echo "<tr> <td>$nazev_zbozi</td><td>$popis_zbozi</td><td>$kategorie_zbozi</td><td>$cena_zbozi</td>";
						if(isLoggedIn()){
							echo "<td><form action=\"\" method=\"POST\">
									<input type=\"number\" style=\"width: 50px;\" min='0' placeholder='Zadejte počet kusů' name='castka$index' />
									<input type=\"submit\" name=\"pridat\" value=\"Pridat do kosiku\"/>
									</form>
								</td></tr>";
						} else{
							echo "<td>Musíte se přihlásit</td></tr>";
						}
						$_SESSION['index'] = $index;
					}

					echo "</table>";
				?>
				<?php
					if(isset($_REQUEST["pridat"])){
						$index = $_SESSION['index'];
						$pocet = 0;

						for($i = 1; $i <= $index; $i++){
							if(isset($_REQUEST["castka$i"])){
								$pocet = $_REQUEST["castka$i"];
							}
							if($pocet != ""){
								$index = $i;
								break;
							}
						}
						if($pocet == ""){
							echo "Počet musí být vyplněn";
						} else{
							$id = $_SESSION[session_id()];
							try{
								$query2 = $db->prepare("SELECT COUNT(*) FROM zbozi_uziv WHERE id_uzivatele = ? AND id_zbozi = ?");
								$params = [$id, $index];
								$query2->execute($params);
							} catch(PDOException $e){
								die($e->getMessage());
							}
							if($query2->fetchColumn(0) > 0){
								try{
									$query3 = $db->prepare("UPDATE zbozi_uziv SET pocet = pocet + ?  WHERE id_uzivatele = ? AND id_zbozi = ?");
									$params = [$pocet, $id, $index];
									$query3->execute($params);
								} catch(PDOException $e){
									die($e->getMessage());
								}
							} else{
								try{
									$query3 = $db->prepare("INSERT INTO zbozi_uziv (id_uzivatele,id_zbozi,pocet) VALUES (?,?,?)");
									$params = [$id, $index, $pocet];
									$query3->execute($params);
								} catch(PDOException $e){
									die($e->getMessage());
								}
							}
						}
					}
				?>
			</div>
		</div>
		<div id="wrap_login">
			<div id="login">
				<?php
					if(!isLoggedIn()){
						echo "<form action=\"\" method=\"POST\">\n";
						echo "Login: <input type=\"text\" name=\"puj_login\" /><br />\n";
						echo "Heslo: <input type=\"password\" name=\"puj_heslo\" /><br />\n";
						echo "<input type=\"submit\" name=\"puj_prihl\" value=\"Prihlasit\"/>\n";
						echo "</form>\n";
						if($chyba != ""){
							echo "<p class=\"error\"> $chyba </p> ";
						}
					} else{
						echo "Prihlasen: " . getUserLogin($_SESSION[session_id()], $db) . "<br />";
						echo "<form action=\"\" method=\"POST\">\n";
						echo "<input type=\"submit\" name=\"puj_odhl\" value=\"Odhlasit\"/>\n";
						echo "</form>\n";
						echo "<a href='Kosik.php'>Můj nákupní košík</a> ";
					}
				?>
			</div>
		</div>
	</body>
</html>

<?php
	ob_end_flush();
?>
