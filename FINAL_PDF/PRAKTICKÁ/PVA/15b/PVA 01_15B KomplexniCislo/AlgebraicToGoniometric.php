<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8">
		<title>Algebraicky --> Goniometricky</title>
	</head>
	<body>
		<h1>Převody komplexních čísel</h1>
		<form action="" method="POST">
			<fieldset>
			<legend>Algebraicky --> Goniometricky</legend>
				Reálná část:      <input type="number" name='real' value="" /> <br />
				Imaginární část:  <input type="number" name='imag' value="" /> <br />
				<input type='submit' name='vypocti' value='Vypočítej' /> <br />
			</fieldset>
		</form>
	</body>
</html>
<?php
	/**
	 * @author "Jakub Čábera"
	 */
	if(isset($_REQUEST['vypocti'])) {
		$real    = trim(htmlspecialchars($_REQUEST['real']));
		$imag    = trim(htmlspecialchars($_REQUEST['imag']));
		$vypocet = "$real" . " + " . $imag . " i = ";
		$absolut = round((sqrt((pow($real, 2)) + (pow($imag, 2)))), 3);
		$phi     = acos($real / $absolut);
		$phiDeg  = round(rad2deg($phi), 3);
		echo("<br/><br />");
		$vypocet .= "$absolut * (cos($phiDeg) + i *sin($phiDeg))";

		echo $vypocet;
	}
?>
