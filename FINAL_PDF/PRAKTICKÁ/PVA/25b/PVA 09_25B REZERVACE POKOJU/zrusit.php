<?php
	session_start();
	ob_start();
	require_once './db_connect.php';
	require_once './scripts.php';

	if(isLoggedIn()) {
		if(isset($_REQUEST['id'])) {
			$kniha_id = htmlspecialchars($_REQUEST['id']);
			$den      = htmlspecialchars($_REQUEST['den']);
			$id       = $_SESSION[session_id()];
			try {
				$query  =
					$db->prepare("DELETE FROM hotel_rezervace WHERE hotel_rezervace_idUzivatel = ? AND hotel_rezervace_idPokoj = ? AND hotel_rezervace_den = ?");
				$params = [$id, $kniha_id, $den];
				$query->execute($params);
			} catch(PDOException $e) {
				die($e->getMessage());
			}
		}
	}

	header("Location: ./index.php");
	ob_end_flush();
?>
