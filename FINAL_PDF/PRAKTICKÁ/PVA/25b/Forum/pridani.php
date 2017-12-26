<?php
	//script zajistujici registraci noveho uzivatele
	//nastartovani prace se session
	session_start();
	//output buffering - kvuli hlasce s odeslanymi hlavickami
	ob_start();
	//require souboru pro pripojeni k db
	require_once 'DBconnect.php';
	//require souboru s  funkcemi
	require_once'./scripts_PDO.php';
?>

<?php
	if(isset($_REQUEST[add_submit])) {
		$predmet = htmlspecialchars($_REQUEST['predmet']);
		$obsahprisp = htmlspecialchars($_REQUEST['text']);
		$id = $_SESSION[session_id()];
		//zjistim si jeho login kvuli vypisu kdo je prihlasen
		$uzivatel = getUserLogin($id, $db);

		try {
			$query = $db->prepare("INSERT INTO zaznamy (nazevz, textz, login) VALUES (?, ?, ?)");
		} catch (PDOException $e) {
			die($e->getMessage());
		}

		$params = array($predmet, $obsahprisp, $uzivatel);

		try {
			$query->execute($params);
		} catch (PDOException $e) {
			die($e->getMessage());
		}

		header("Location: ./index.php");
	}
?>

<fieldset>
	<form action='' method='POST'>
		Predmet prispevku <input type='text' name='predmet'><br>
		Text prispevku <input type='text' name='text'><br>
		<input type='submit' name='add_submit' value='Pridat prispevek'>
	</form>
</fieldset>

<?php
	//output buffering - kvuli hlasce s odeslanymi hlavickami
	ob_end_flush();
?>
