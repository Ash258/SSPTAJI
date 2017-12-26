<?php
	session_start();
	ob_start();
	require_once './db_connect.php';
	require_once './scripts.php';
?>
	<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="cs">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Registrace</title>
		<link rel="stylesheet" type="text/css" href="../styl.css">
	</head>
	<body>
		<?php
			$chyba = "";
			if(isset($_REQUEST['reg_submit'])) {
				$login = htmlspecialchars($_REQUEST['reg_login']);
				$heslo = htmlspecialchars($_REQUEST['reg_heslo']);
				if(($login == '') || ($heslo == '')) {
					$chyba = "Vyplnte login a heslo";
				} else {
					try {
						$query  = $db->prepare("SELECT COUNT(*) FROM uziv WHERE uziv_login = ?");
						$params = [$login];
						$query->execute($params);
					} catch(PDOException $e) {
						die($e->getMessage());
					}
					if($query->fetchColumn(0) == 1) {
						$chyba = "Tento login jiz existuje";
					} else {
						$heslo = md5($heslo);
						try {
							$query  = $db->prepare("INSERT INTO uziv (uziv_login, uziv_heslo) VALUES (?, ?)");
							$params = [$login, $heslo];
							$query->execute($params);
						} catch(PDOException $e) {
							die($e->getMessage());
						}
						userLogin($login, $heslo, $db);
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
			if($chyba != "") {
				echo "<p class=error> $chyba </p>";
			}
		?>
	</body>
</html>
<?php
	ob_end_flush();
?>
