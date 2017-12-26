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
		<title>Pujcovna</title>
		<link rel="stylesheet" type="text/css" href="styl.css">
	</head>
	<?php
		$chyba = "";
		if(isset($_REQUEST['puj_prihl'])) {
			$login = htmlspecialchars($_REQUEST['puj_login']);
			$heslo = htmlspecialchars($_REQUEST['puj_heslo']);
			if(($login == '') || ($heslo == '')) {
				$chyba = "Vyplnte login a heslo";
			} else {
				$heslo = md5($heslo);
				if(userLogin($login, $heslo, $db)) {
				} else {
					$chyba = "Neplatny login a heslo";
				}
			}
		} else {
			if(isset($_REQUEST['puj_odhl'])) {
				if(!userLogout()) {
					$chyba = "Odhlaseni se nezdarilo";
				}
			}
		}
	?>

	<body>
		<div id="wrap_head">
			<div id="head">
				<h1>Rezervace pokoju</h1>
			</div>
		</div>

		<div id="wrap_body">
			<div id="body">
				<?php
					try {
						$query = $db->prepare("SELECT * FROM hotel_pokoje");
						$query->execute();
					} catch(PDOException $e) {
						die($e->getMessage());
					}
					echo "<table border='1'>\n";
					echo "<tr> <th>Pokoj</th> <th>Pondělí</th> <th>Úterý</th> <th>Středa</th> <th>Čtvrtek</th> <th>Pátek</th> <th>Sobota</th> <th>Neděle</th> </tr>\n";
					while($row = $query->fetch(PDO::FETCH_BOTH)) {
						$hotel_pokoje_id       = $row['hotel_pokoje_id'];
						$hotel_pokoje_cislo    = $row['hotel_pokoje_cislo'];
						$hotel_pokoje_popis    = $row['hotel_pokoje_popis'];
						$hotel_pokoje_kapacita = $row['hotel_pokoje_kapacita'];
						echo "<tr> <td>Pokoj: $hotel_pokoje_cislo</td>";

						for($i = 1; $i <= 7; $i++) {
							try {
								$query2 =
									$db->prepare("SELECT hotel_rezervace_idUzivatel FROM hotel_rezervace WHERE hotel_rezervace_idPokoj = ? AND hotel_rezervace_den = ?");
								$params = [$hotel_pokoje_id, $i];
								$query2->execute($params);
							} catch(PDOException $e) {
								die($e->getMessage());
							}
							$pom = $query2->fetchColumn(0);
							if(isLoggedIn()) {
								$id = $_SESSION[session_id()];
								if($pom == $id) {
									echo "<td rowspan='3' align='center'><a href='zrusit.php?id=$hotel_pokoje_id&den=$i'>Zrusit</a></td>\n";
								} elseif($pom > 0) {
									echo "<td rowspan='3' align='center'>Obsazeno</td>\n";
								} else {
									echo "<td rowspan='3' align='center'><a href='rezervovat.php?id=$hotel_pokoje_id&den=$i'>Rezervovat</a></td>\n";
								}
							} else {
								if($pom > 0) {
									echo "<td rowspan='3' align='center'>Obsazeno</td>\n";
								} else {
									echo "<td rowspan='3' align='center'>Volno</td>\n";
								}
							}
						}
						echo "<tr> <td>$hotel_pokoje_popis</td></tr>
								  <tr> <td>Kapacita: $hotel_pokoje_kapacita</td></tr> ";
					}
					echo "</table>";
				?>
			</div>
		</div>

		<div id="wrap_login">
			<div id="login">
				<?php
					if(!isLoggedIn()) {
						echo "<form action='' method='POST'>\n";
						echo "login: <input type='text' name='puj_login'><br>\n";
						echo "heslo: <input type='password' name='puj_heslo'><br>\n";
						echo "<input type='submit' name='puj_prihl' value='Prihlasit'>\n";
						if($chyba != '') {
							echo "<p class='error'> $chyba </p>\n";
						}
						echo "</form>\n";
					} else {
						echo "Prihlasen: " . getUserLogin($_SESSION[session_id()], $db) . "<br>\n";
						echo "<form action='' method='POST'>\n";
						echo "<input type='submit' name='puj_odhl' value='Odhlasit' />\n";
						echo "</form><br/>\n";
						echo "<a href='rezervace.php'>Moje rezervace</a>";
					}
				?>
			</div>
		</div>
	</body>
</html>

<?php
	ob_end_flush();
?>
