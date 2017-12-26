<?php
	ob_start();
	require_once './db_connect.php';
	require_once './scripts.php';
	session_start();

	$id       = $_SESSION[session_id()];
	$uzivatel = getUserLogin($_SESSION[session_id()], $db);
	echo "<h1>Moje rezervace</h1><br />";
	echo "Uživatel: $uzivatel a jeho rezervace<br /><br />";
	try{
		$query  = $db->prepare("SELECT kino_saly_id,kino_saly_nazev,kino_saly_program,kino_rezervace_kreslo FROM kino_saly JOIN kino_rezervace ON kino_saly.kino_saly_id = kino_rezervace.kino_rezervace_idSal WHERE kino_rezervace_idUzivatel = ?");
		$params = [$id];
		$query->execute($params);
	} catch(PDOException $e){
		die($e->getMessage());
	}
	echo "<table border=\'1\'>";
	echo "<tr> <td>Sál</td><td>Film</td><td>Kreslo</td><td>&nbsp;</td></tr>";

	while($row = $query->fetch(PDO::FETCH_BOTH)){
		$kino_saly_id          = $row['kino_saly_id'];
		$kino_saly_nazevp      = $row['kino_saly_nazev'];
		$kino_saly_program     = $row['kino_saly_program'];
		$kino_rezervace_kreslo = $row['kino_rezervace_kreslo'];
		$kreslo                = $kino_rezervace_kreslo + 1;
		echo "<tr> <td>$kino_saly_nazevp</td>
					<td>$kino_saly_program</td>
					<td>$kreslo</td>
					<td><a href='zrusit_rezervaci.php?id=$kino_saly_id&den=$kino_rezervace_kreslo'>Zrusit</a></td></tr>\n";
		$kreslo = 0;
	}
	echo "</table>";
	echo "<a href='index.php'>Zpět na hlavní stránku</a> ";
?>
