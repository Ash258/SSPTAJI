<?php
ob_start();
require_once './db_connect_PDO.php';
require_once './scripts_PDO.php';
session_start();

if(isLoggedIn()){
	$id = $_SESSION[session_id()];
	$uzivatel = getUserLogin($_SESSION[session_id()], $db);
	$ajdy = $_REQUEST["id"];
	try {
		$query = $db->prepare("DELETE FROM  zbozi_uziv WHERE id_zbozi_uziv = ?");
	} catch (PDOException $e) {
		die($e->getMessage());
	}
	//parametry
	$params = array($ajdy);
	//dotaz spustim
	try {
		$query->execute($params);
	} catch (PDOException $e) {
		die($e->getMessage());
	}
}

header("Location: ./rezervace.php");
?>
