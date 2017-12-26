<?php
	/**
	 * @author "Jakub Čábera"
	 */
	ob_start();
?>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<title>Complex</title>
	</head>
	<body>
		<h1>Převody komplexních čísel</h1>
		<!-- Základní formulář -->
		<form action="" method="POST">
			<fieldset>
				<legend>Vyber typ převodu</legend>
				Algebraicky --> Goniometricky <input type="radio" name='volba' value="ag" checked /> <br />
				Goniometricky --> Algebraicky <input type="radio" name='volba' value="ga" /> <br />
				<input type='submit' name='odeslat' value='Pokračovat' />
			</fieldset>
		</form>
		<?php
			if(isset($_REQUEST['odeslat'])){
				$volba = $_REQUEST['volba'];
				if($volba == 'ag'){
					header("Location: ./AlgebraicToGoniometric.php");
				} elseif($volba == 'ga') {
					header("Location: ./GoniometricToAlgebraic.php");
				}
			}
		?>
		<?php
			ob_end_flush();
		?>
	</body>
</html>
