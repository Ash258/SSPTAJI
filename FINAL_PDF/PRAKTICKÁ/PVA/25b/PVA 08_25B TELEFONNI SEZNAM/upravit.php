<?php
	ob_start();
	/**
	 * Created by PhpStorm.
	 * User: Jonyberry
	 * Date: 15.04.2016
	 * Time: 17:32
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
				$query  = $db->prepare("SELECT * FROM telefony_domacnosti WHERE telefony_domacnosti_id = ?");
				$params = [$id];
				$query->execute($params);
			} catch(PDOException $e) {
				die($e->getMessage());
			}
			$record = [];
			while($row = $query->fetch(PDO::FETCH_BOTH)) {
				$record[] = $row;
			}
			echo   '<form action="" type="POST">
						<fieldset>
							<legend>Uprava domacnosti</legend>
							Jmeno<input type="text" name="jmeno" value="' . $record[0]['telefony_domacnosti_jmeno'] . '" ><br />
							Mesto<input type="text" name="mesto" value="' . $record[0]['telefony_domacnosti_mesto'] . '" ><br />
							Telefon<input type="text" name="tel" value="' . $record[0]['telefony_domacnosti_telefon'] . '" ><br />
							<input type="hidden" name="id" value="' . $id . '">
							<input type="submit" name="change_dom" value="ulozit"><br /><br />
						</fieldset>
					</form>';
		} else {
			header("Location: ./index.php");
		}
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
				$query  = $db->prepare("SELECT * FROM telefony_firmy WHERE telefony_firmy_id = ?");
				$params = [$id];
				$query->execute($params);
			} catch(PDOException $e) {
				die($e->getMessage());
			}
			$record = [];
			while($row = $query->fetch(PDO::FETCH_BOTH)) {
				$record[] = $row;
			}
			echo   '<form action="" type="POST">
						<fieldset>
							<legend>Uprava domacnosti</legend>
							Jmeno<input type="text" name="jmeno" value="' . $record[0]['telefony_firmy_nazev'] . '" ><br />
							ICO<input type="text" name="mesto"   value="' . $record[0]['telefony_firmy_ico'] . '" ><br />
							Mesto<input type="text" name="mesto" value="' . $record[0]['telefony_firmy_mesto'] . '" ><br />
							Telefon<input type="text" name="tel" value="' . $record[0]['telefony_firmy_telefon'] . '" ><br />
							<input type="hidden" name="id" value="' . $id . '">
							<input type="submit" name="change_firm" value="ulozit"><br /><br />
						</fieldset>
					</form>';
		} else {
			header("Location: ./index.php");
		}
	}
	if(isset($_REQUEST['change_dom'])) {
		$id    = $_REQUEST['id'];
		$jmeno = $_REQUEST['jmeno'];
		$mesto = $_REQUEST['mesto'];
		$tel   = $_REQUEST['tel'];
		try {
			$query  =
				$db->prepare("UPDATE telefony_domacnosti SET telefony_domacnosti_jmeno = ?, telefony_domacnosti_mesto = ?, telefony_domacnosti_telefon = ? WHERE telefony_domacnosti_id = ?");
			$params = [$jmeno, $mesto, $tel, $id];
			$query->execute($params);
		} catch(PDOException $e) {
			die($e->getMessage());
		}
		header("Location: ./index.php");
	}
	if(isset($_REQUEST['change_firm'])) {
		$id    = $_REQUEST['id'];
		$jmeno = $_REQUEST['jmeno'];
		$ico   = $_REQUEST['ico'];
		$mesto = $_REQUEST['mesto'];
		$tel   = $_REQUEST['tel'];
		try {
			$query  =
				$db->prepare("UPDATE telefony_firmy SET telefony_firmy_nazev = ?, telefony_firmy_ico = ?, telefony_firmy_mesto = ?, telefony_firmy_telefon = ? WHERE telefony_firmy_id = ?");
			$params = [$jmeno, $ico, $mesto, $tel, $id];
			$query->execute($params);
		} catch(PDOException $e) {
			die($e->getMessage());
		}
		header("Location: ./index.php");
	}
