<?php
ob_start();
require_once './db_connect_PDO.php';
require_once './scripts_PDO.php';

session_start();
	$id = $_SESSION[session_id()];
	$uzivatel = getUserLogin($_SESSION[session_id()], $db);

	echo "<h1>Nakupni kosik</h1><br />";
	echo "uzivatel: $uzivatel a jeho kosik<br /><br />";


	try {
		$query = $db->prepare("SELECT * ,ID_zbozi FROM zbozi JOIN uziv ON zbozi.ID_zbozi = uziv.uziv_id WHERE id_vlastnika = ?");
	} catch (PDOException $e) {
		die($e->getMessage());
	}

	//parametry
	$params = array($id);
	//dotaz spustim
	try {
		$query->execute($params);
	} catch (PDOException $e) {
		die($e->getMessage());
	}

	$celkem = 0;
	echo("<table border=\"1\">");
	echo("<tr> <th>nazev zbozi</th> <th>popis</th> <th>kategorie</th> <th>pocet</th> <th>cena</th>  </tr>\n");

	while($row = $query->fetch(PDO::FETCH_BOTH)){
		$ID_zbozi = $row['ID_zbozi'];
		$nazev = $row['nazev_zbozi'];
		$popis = $row['popis_zbozi'];
		$kategorie = $row['kategorie_zbozi'];
		$pocet = $row['pocet_zbozi'];
		$cena = $row['cena_zbozi'];

		echo("<tr> <td>$nazev</td><td>$popis</td><td>$kategorie</td><td>$pocet</td><td>$cena</td>");
	}

	echo("</table>");
	echo "<a href='./index.php'>Zpet</a> ";
?>
