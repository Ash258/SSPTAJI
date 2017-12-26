<?php
	//script zajistujici registraci noveho uzivatele
	//nastartovani prace se session
	session_start();
	//output buffering - kvuli hlasce s odeslanymi hlavickami
	ob_start();
	//require souboru pro pripojeni k db
	require_once './db_connect_PDO.php';
	//require souboru s  funkcemi
	require_once './scripts_PDO.php';
?>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="cs">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Registrace</title>
		<link rel="stylesheet" type="text/css" href="styl.css">
	</head>
	<body>
		<?php
			//promenna pro chybova hlaseni - dokud je prazdna tak nenastala zadna chyba
			$chyba = "";
			//uzivatel klikl na registrovat
			if(isset($_REQUEST[reg_submit])) {
				//vytahnu si jeho login a heslo
				//$login = htmlspecialchars(mysql_real_escape_string(($_REQUEST['reg_login'])));
				$login = htmlspecialchars($_REQUEST['reg_login']);
				//$heslo = htmlspecialchars(mysql_real_escape_string(($_REQUEST['reg_heslo'])));
				$heslo = htmlspecialchars($_REQUEST['reg_heslo']);
				//pokud jsou prazdne
				if(($login == '') || ($heslo == '')) {
					//nastavim chybovou hlasku
					$chyba = "Vyplnte login a heslo";
				} else {
					//pokud ne, podivam jestli uz v dn neni uzivatel tohoto jmena
					try {
						$query = $db->prepare("SELECT COUNT(*) FROM uziv WHERE uziv_login = ?");
					} catch (PDOException $e) {
						die($e->getMessage());
					}
					//parametry
					$params = array($login);
					//dotaz spustim
					try {
						$query->execute($params);
					} catch (PDOException $e) {
						die($e->getMessage());
					}
					//pokud ano
					if($query->fetchColumn(0) == 1) {
						//nastavim chybovou hlasku
						$chyba = "Tento login jiz existuje";
					} else {
						//pokud ne
						//zahashuju heslo
						$heslo = md5($heslo);
						//a vlozim noveho uzivatele do tabulky
						try {
							$query = $db->prepare("INSERT INTO uziv (uziv_login, uziv_heslo) VALUES (?, ?)");
						} catch (PDOException $e) {
							die($e->getMessage());
						}
						//parametry
						$params = array($login, $heslo);
						//Dotaz spustim
						try {
							$query->execute($params);
						} catch (PDOException $e) {
							die($e->getMessage());
						}
						//rovnou ho prihlasim
						userLogin($login, $heslo, $db);
						//presmeruji na index
						header("Location: ./index.php");
					}
				}
			}
		?>
		<!--registracni formular-->
		<h1>Registrace</h1>
		<form action='' method='POST'>
			Login <input type='text' name='reg_login'><br>
			Heslo <input type='password' name='reg_heslo'><br>
			<input type='submit' name='reg_submit' value='Registrovat'>
		</form>
		<?php
			//pokud nastala nekde pred tim chyba, vypisu ji
			if($chyba != "") {
				echo("<p class=error> $chyba </p>");
			}
		?>
	</body>
</html>
<?php
	//output buffering - kvuli hlasce s odeslanymi hlavickami
	ob_end_flush();
?>
