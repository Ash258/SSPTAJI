<?php
	ob_start();
	session_start();
	require_once './db_connect.php';

	if(isset($_REQUEST['ID'])){
		$id   = (int)$_REQUEST['ID'];
		$uziv = $_SESSION[session_id()];
		try{
			$query = $db->prepare("SELECT hlas FROM uziv WHERE ID = ?");
		} catch(PDOException $e){
			die($e->getMessage());
		}
		$params = [$uziv];
		try{
			$query->execute($params);
		} catch(PDOException $e){
			die($e->getMessage());
		}
		$hlasoval = $query->fetchColumn(0);
		if($hlasoval > 0){
			header("Location: ./zobraz.php");
			$_SESSION[chyba] = "jiz jsi hlasoval, pockej na dalsi volby";
		} else {
			$quer  = "UPDATE prezident SET Hlasy = (Hlasy + 1) WHERE ID = ?";
			$quer2 = "UPDATE uziv SET hlas = (hlas + 1) WHERE ID = ?";
			try{
				$query = $db->prepare($quer2);
			} catch(PDOException $e){
				die($e->getMessage());
			}
			$params = [$id];
			try{
				$query->execute($params);
			} catch(PDOException $e){
				die($e->getMessage());
			}
			try{
				$query = $db->prepare($quer);
			} catch(PDOException $e){
				die($e->getMessage());
			}
			$params = [$id];
			try{
				$query->execute($params);
			} catch(PDOException $e){
				die($e->getMessage());
			}
		}
	}

	header("Location: ./zobraz.php");
	ob_end_flush();
?>
