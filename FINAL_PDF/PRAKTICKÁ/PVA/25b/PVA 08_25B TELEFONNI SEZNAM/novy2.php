<?php
	ob_start();
	/**
	 * Created by PhpStorm.
	 * User: Jonyberry
	 * Date: 15.04.2016
	 * Time: 16:52
	 */
	require_once './db_connect.php';
	require_once './scripts.php';
	if(isset($_REQUEST['next'])) {
		$type = $_REQUEST['type'];
		if($type == "domacnost") {
?>
			<h1>Novy zaznam</h1>
			<fieldset>
				<legend>Nova Domacnost</legend>
				<form action="" type="POST">
					<table>
						<tr><td>Jmeno</td><td><input type="text" name="jmeno"
													 placeholder="Zadejte jmeno vlastnika"></td></tr>
						<tr><td>Mesto</td><td><input type="text" name="mesto" placeholder="Zadejte mesto"></td></tr>
						<tr><td>Telefon</td><td><input type="number" name="cislo"
													   placeholder="Zadejte cislo"><br /></td></tr>
					</table>
					<input type="submit" name="save_dom" value="Ulozit">
				</form>
			</fieldset>

<?php
		} elseif($type == "firma") {
?>
			<h1>Novy zaznam</h1>
			<fieldset>
				<legend>Nova Firma</legend>
				<form action="" type="POST">
					<table>
						<tr><td>Jmeno</td><td><input type="text" name="jmeno" placeholder="Zadejte jmeno firmy"></td></tr>
						<tr><td>ICO</td><td><input type="number" name="ico" placeholder="Zadejte ICO"></td></tr>
						<tr><td>Mesto</td><td><input type="text" name="mesto" placeholder="Zadejte mesto"></td></tr>
						<tr><td>Telefon</td><td><input type="number" name="cislo"
													   placeholder="Zadejte cislo"><br /></td></tr>
					</table>
					<input type="submit" name="save_firm" value="Ulozit">
				</form>
			</fieldset>
<?php
		}
	}

	if(isset($_REQUEST['save_dom'])) {
		$jmeno = $_REQUEST['jmeno'];
		$mesto = $_REQUEST['mesto'];
		$cislo = $_REQUEST['cislo'];
		try {
			$query  =
				$db->prepare("INSERT INTO telefony_domacnosti (telefony_domacnosti_jmeno, telefony_domacnosti_mesto, telefony_domacnosti_telefon) VALUES (?, ?, ?)");
			$params = [$jmeno, $mesto, $cislo];
			$query->execute($params);
		} catch(PDOException $e) {
			die($e->getMessage());
		}
		header("Location: ./index.php");
	}
	if(isset($_REQUEST['save_firm'])) {
		$jmeno = $_REQUEST['jmeno'];
		$ico   = $_REQUEST['ico'];
		$mesto = $_REQUEST['mesto'];
		$cislo = $_REQUEST['cislo'];
		try {
			$query  =
				$db->prepare("INSERT INTO telefony_firmy (telefony_firmy_nazev, telefony_firmy_ico, telefony_firmy_mesto, telefony_firmy_telefon) VALUES (?, ?, ?, ?)");
			$params = [$jmeno, $ico, $mesto, $cislo];
			$query->execute($params);
		} catch(PDOException $e) {
			die($e->getMessage());
		}
		header("Location: ./index.php");
	}
?>
