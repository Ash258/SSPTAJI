<?php
	ob_start();
	require_once './db_connect.php';
	require_once './scripts.php';
	session_start();
	$id       = $_SESSION[session_id()];
	$uzivatel = getUserLogin($_SESSION[session_id()], $db);
	echo "<h1>Nakupní košík</h1><br />";
	echo "Přihlášen : $uzivatel<br /><br />";
	echo "Váš košík <br/><br/>";
	try{
		$query  = $db->prepare("SELECT *,pocet,id_zbozi_uziv FROM zbozi JOIN zbozi_uziv ON zbozi.ID_zbozi = zbozi_uziv.id_zbozi WHERE id_uzivatele = ?");
		$params = [$id];
		$query->execute($params);
	} catch(PDOException $e){
		die($e->getMessage());
	}
	$celkem = 0;
	echo("<table border=\"1\">");
	echo("<th width='55%'>Nazev</th><th>Kategorie</th><th>Pocet</th><th>Cena</th><th>Cena celkem</th>");

	while($row = $query->fetch(PDO::FETCH_BOTH)){
		$ID_zbozi        = $row['ID_zbozi'];
		$nazev_zbozi     = $row['nazev_zbozi'];
		$kategorie_zbozi = $row['kategorie_zbozi'];
		$pocet_zbozi     = $row['pocet'];
		$cena_zbozi      = $row['cena_zbozi'];
		$id_zbozi_uziv   = $row['id_zbozi_uziv'];
		$cena            = $pocet_zbozi * $cena_zbozi;
		$celkem          = $celkem + $cena;
		echo("<tr>
					<td>$nazev_zbozi</td><td>$kategorie_zbozi</td>
					<td>$pocet_zbozi</td><td>$cena</td>
					<td><a href='zrusit.php?id=$id_zbozi_uziv'>Odebrat z kosiku</a></td>");
		echo("</tr>");
		$cena = 0;
	}

	echo "<tr><td colspan = '3'>Celkem</td><td>$celkem</td><td>&nbsp;</td></tr>";
	echo "</table>";
	echo "<a href='./index.php'>Zpet</a> ";
?>
