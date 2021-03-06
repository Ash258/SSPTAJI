<?php
	session_start();
	ob_start();
	require_once './db_connect.php';
	require_once './scripts.php';

	if(isLoggedIn()) {
		$id_kniha = $_REQUEST['id_kniha'];
		$id_uziv  = $_SESSION[session_id()];
		try {
			$query  = $db->prepare("INSERT INTO puj_vypujcky (puj_vyp_idUzivatel, puj_vyp_idKniha) VALUES (?, ?)");
			$params = [$id_uziv, $id_kniha];
			$query->execute($params);
		} catch(PDOException $e) {
			die($e->getMessage());
		}
		try {
			$query  = $db->prepare("UPDATE puj_knihy SET puj_knihy_pocet = puj_knihy_pocet-1 WHERE puj_knihy_id = ?");
			$params = [$id_kniha];
			$query->execute($params);
		} catch(PDOException $e) {
			die($e->getMessage());
		}
	}
	header("Location: ./index.php");
	ob_end_flush();
?>