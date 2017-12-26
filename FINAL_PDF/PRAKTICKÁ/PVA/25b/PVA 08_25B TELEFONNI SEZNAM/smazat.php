<?php
	ob_start();
	/**
	 * Created by PhpStorm.
	 * User: Jonyberry
	 * Date: 15.04.2016
	 * Time: 18:34
	 */
	require_once './db_connect.php';
	if(isset($_REQUEST['id_domacnost'])) {
		$id = $_REQUEST['id_domacnost'];
		try {
			$query  = $db->prepare("SELECT COUNT(*) FROM telefony_domacnosti WHERE telefony_domacnosti_id = ? ");
			$params = [$id];
			$query->execute($params);
		} catch(PDOException $e) {
			die($e->getMessage());
		}
		/** Pokud jsem našel id v db */
		if($query->fetchColumn(0) == 1) {
			try {
				$query  = $db->prepare("DELETE FROM telefony_domacnosti WHERE telefony_domacnosti_id = ?");
				$params = [$id];
				$query->execute($params);
			} catch(PDOException $e) {
				die($e->getMessage());
			}
		}
		header("Location: ./index.php");
	}
	if(isset($_REQUEST['id_firma'])) {
		$id = $_REQUEST['id_firma'];
		try {
			$query  = $db->prepare("SELECT COUNT(*) FROM telefony_firmy WHERE telefony_firmy_id = ? ");
			$params = [$id];
			$query->execute($params);
		} catch(PDOException $e) {
			die($e->getMessage());
		}
		/** Pokud jsem našel id v db */
		if($query->fetchColumn(0) == 1) {
			try {
				$query  = $db->prepare("DELETE FROM telefony_firmy WHERE telefony_firmy_id = ?");
				$params = [$id];
				$query->execute($params);
			} catch(PDOException $e) {
				die($e->getMessage());
			}
		}
		header("Location: ./index.php");
	}
