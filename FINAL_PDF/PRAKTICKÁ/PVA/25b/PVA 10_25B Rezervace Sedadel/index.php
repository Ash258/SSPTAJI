<?php
	session_start();
	ob_start();
	require_once './db_connect.php';
	require_once './scripts.php';
?>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Kino</title>
		<link rel="stylesheet" type="text/css" href="styl.css" />
	</head>

	<body>
		<?php
			$chyba = "";
			if(isset($_REQUEST['puj_prihl'])){
				$login = htmlspecialchars($_REQUEST['puj_login']);
				$heslo = htmlspecialchars($_REQUEST['puj_heslo']);
				if(($login == "") || ($heslo == "")){
					$chyba = "Vyplnte login a heslo";
				} else{
					$heslo = md5($heslo);
					if(userLogin($login, $heslo, $db)){
						$id    = $_SESSION[session_id()];
						$login = getUserLogin($id, $db);
					} else{
						$chyba = "Neplatny login a heslo";
					}
				}
			} else{
				if(isset($_REQUEST['puj_odhl'])){
					if(!userLogout()){
						$chyba = "Odhlaseni se nezdarilo";
					}
				}
			}
		?>

		<div id="wrap_head">
			<div id="head">
				<h1>Rezervace sedadel</h1>
			</div>
		</div>
		<div id="wrap_body">
			<div id="body">
				<?php
					try{
						$query = $db->prepare("SELECT * FROM kino_saly");
						$query->execute();
					} catch(PDOException $e){
						die($e->getMessage());
					}
					while($row = $query->fetch(PDO::FETCH_BOTH)){
						$sal     = $row['kino_saly_nazev'];
						$program = $row['kino_saly_program'];
						$sal_id  = $row['kino_saly_id'];
						echo "<h3>$sal</h3><br />";
						echo "Program: $program<br />";
						echo "Sedadla<br /><br />";
						echo "<table border=\"1\">";
						echo "<tr align='center'> <td>1</td><td>2</td><td>3</td><td>4</td><td>5</td><td>6</td><td>7</td><td>8</td><td>9</td><td>10</td> </tr>";

						for($i = 1; $i < 11; $i++){
							try{
								$query2 = $db->prepare("SELECT kino_rezervace_idUzivatel FROM kino_rezervace WHERE kino_rezervace_idSal = ? AND kino_rezervace_kreslo = ?");
								$params = [$sal_id, $i];
								$query2->execute($params);
							} catch(PDOException $e){
								die($e->getMessage());
							}
							$pom = $query2->fetchColumn(0);
							if(isLoggedIn()){
								$id = $_SESSION[session_id()];
								if($pom == $id){
									//v pomocn ulozen vysledek dotazu na obsazenost pokoje, pokud je shodny s mym id, muzu rusit
									echo "<td rowspan='3'><a href='zrusit_rezervaci.php?id=$sal_id&den=$i'>Zrušit</a></td>\n";
								} elseif($pom > 0){
									//pokud nebyl vysledek moje ID, ale nabyva nejake hodnoty, je jiz pokoj obsazen
									echo "<td rowspan='3'>Obsazeno</td>\n";
								} else{
									//v ostatnich pripadech lze rezervovat
									echo "<td rowspan='3'><a href='rezervovat.php?id=$sal_id&den=$i'>Rezervovat</a></td>\n";
								}
							} else{
								if($pom > 0){
									echo "<td rowspan='3'>Obsazeno</td>\n";
								} else{
									echo "<td rowspan='3'>Volno</td>\n";
								}
							}
						}
						echo "</table>";
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
						echo "</form>\n <br />";
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
