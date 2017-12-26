<?php
	ob_start();
	require_once './db_connect.php';
	require_once './scripts.php';
	session_start();

	$id       = $_SESSION[session_id()];
	$uzivatel = getUserLogin($_SESSION[session_id()], $db);
	echo "<h1>Moje rezervace</h1><br />";
	echo "Uživatel: $uzivatel a jeho rezervace<br /><br />";
	try {
		$query  =
			$db->prepare("SELECT hotel_pokoje_id,hotel_pokoje_cislo,hotel_pokoje_popis,hotel_pokoje_kapacita,hotel_rezervace_den FROM hotel_pokoje JOIN hotel_rezervace ON hotel_pokoje.hotel_pokoje_id = hotel_rezervace.hotel_rezervace_idPokoj WHERE hotel_rezervace_idUzivatel = ?");
		$params = [$id];
		$query->execute($params);
	} catch(PDOException $e) {
		die($e->getMessage());
	}
	echo "<table border=\'1\'>";
	echo("<tr> <th>Pokoj</th><th>Popis</th><th>Kapacita</th><th>Den</th><th>&nbsp;</th></tr>
		  </tr>");

	while($row = $query->fetch(PDO::FETCH_BOTH)) {
		$hotel_pokoje_id    = $row['hotel_pokoje_id'];
		$hotel_pokoje_kap   = $row['hotel_pokoje_kapacita'];
		$hotel_pokoje_cislo = $row['hotel_pokoje_cislo'];
		$hotel_pokoje_popis = $row['hotel_pokoje_popis'];
		$den                = $row['hotel_rezervace_den'];
		echo("<tr><td>$hotel_pokoje_cislo</td><td>$hotel_pokoje_popis</td><td>$hotel_pokoje_kap</td><td>$den</td><td><a href='zrusit.php?id=$hotel_pokoje_id&den=$den'>Zrusit</a></td></tr>\n");
	}
	echo "</table> <br/>";
	echo "<a href='index.php'>Zpět na hlavní stránku</a> ";
?>
