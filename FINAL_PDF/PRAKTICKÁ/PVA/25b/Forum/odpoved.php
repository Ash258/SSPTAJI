<?php
	//script zajistujici registraci noveho uzivatele
	//nastartovani prace se session
	session_start();
	//output buffering - kvuli hlasce s odeslanymi hlavickami
	ob_start();
	//require souboru pro pripojeni k db
	require_once 'DBconnect.php';
	//require souboru s  funkcemi
	require_once './scripts_PDO.php';
?>

<?php
	$idzaznamu = htmlspecialchars($_REQUEST['IDzaz']);
	//promenna pro chybova hlaseni - dokud je prazdna tak nenastala zadna chyba
	$chyba = "";
	//uzivatel klikl na registrovat
	if(isset($_REQUEST['Odpovedet'])){
		$id = $_SESSION[session_id()];
		//zjistim si jeho login kvuli vypisu kdo je prihlasen
		$login = getUserLogin($id, $db);
		//vytahnu si text odpovedi
		//$login = htmlspecialchars(mysql_real_escape_string(($_REQUEST['odpoved'])));
		$odpoved = htmlspecialchars($_REQUEST['odpoved']);
		//pokud jsou prazdne
		if($odpoved == ''){
			//nastavim chybovou hlasku
			$chyba = "Vyplnte prosim odpoved, nebo bezte doprdele";
		} else {
			//pokud ne, podivam jestli uz v dn neni uzivatel tohoto jmena
			try{
				$query = $db->prepare("INSERT INTO reply (idr, id_uz, text) VALUES (?, ?, ?)");
			} catch(PDOException $e){
				die($e->getMessage());
			}
			//parametry
			$params = [$idzaznamu, $login, $odpoved];
			//Dotaz spustim
			try{
				$query->execute($params);
			} catch(PDOException $e){
				die($e->getMessage());
			}
			header("Location: ./index.php");
		}
	}
?>

	<h1>Registrace</h1>
	<form action='' method='POST'>
		Vase odpoved <input type='text' name='odpoved'><br>
		<input type='submit' name='Odpovedet' value='Odpovedet'>
	</form>

<?php
	//pokud nastala nekde pred tim chyba, vypisu ji
	if($chyba != ""){
		echo("<p class=error> $chyba </p>");
	}
?>

<?php
	//output buffering - kvuli hlasce s odeslanymi hlavickami
	ob_end_flush();
?>
