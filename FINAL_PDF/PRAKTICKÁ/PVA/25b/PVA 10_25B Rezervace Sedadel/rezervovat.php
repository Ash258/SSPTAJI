<?php
	session_start();
	ob_start();
	require_once './db_connect.php';
	require_once './scripts.php';

	if(isLoggedIn()){
		if(isset($_REQUEST['id'])){
			$kniha_id = htmlspecialchars($_REQUEST['id']);
			$den      = htmlspecialchars($_REQUEST['den']);
			$id       = $_SESSION[session_id()];
			try{
				$query  = $db->prepare("INSERT INTO kino_rezervace (kino_rezervace_idUzivatel, kino_rezervace_idSal, kino_rezervace_kreslo) VALUES (?, ?, ?)");
				$params = [$id, $kniha_id, $den];
				$query->execute($params);
			} catch(PDOException $e){
				die($e->getMessage());
			}
		}
	}

	header("Location: ./index.php");
	ob_end_flush();
?>
