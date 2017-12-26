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
				$query  = $db->prepare("DELETE FROM kino_rezervace WHERE kino_rezervace_idUzivatel = ? AND kino_rezervace_idSal = ? AND kino_rezervace_kreslo = ?");
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
