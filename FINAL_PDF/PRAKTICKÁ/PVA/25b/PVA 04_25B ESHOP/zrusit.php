<?php
	ob_start();
	require_once './db_connect.php';
	require_once './scripts.php';
	session_start();

	if(isLoggedIn()){
		$id_zbozi_uz = $_REQUEST["id"];
		try{
			$query  = $db->prepare("DELETE FROM  zbozi_uziv WHERE id_zbozi_uziv = ?");
			$params = [$id_zbozi_uz];
			$query->execute($params);
		} catch(PDOException $e){
			die($e->getMessage());
		}
	}

	header("Location: ./kosik.php");
?>
