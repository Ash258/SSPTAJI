<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8">
		<title>Goniometriky --> Algebraicky</title>
	</head>
	<body>
		<h1>Převody komplexních čísel</h1>
			<form action="" method="POST">
					<fieldset>
						<legend>Goniometricky --> Algebraicky</legend>
						Absolutní hodnota:      <input type="number" name='abs' value="" /> <br />
						Uhel:                   <input type="number" name='angle' value="" /> <br />
						<input type='submit' name='vypocti' value='Vypočítej' /> <br />
					</fieldset>
			</form>
	</body>
</html>
<?php
	/**
	 * @author "Jakub Čábera"
	 */
	if(isset($_REQUEST['vypocti'])){
		$absolut = trim(htmlspecialchars($_REQUEST['abs']));
		$uhel    = trim(htmlspecialchars($_REQUEST['angle']));
		$vypocet = "$absolut * (cos($uhel) + i * sin($uhel))";
		$a       = round($absolut * (cos(deg2rad($uhel))), 3);
		$b       = round($absolut * (sin(deg2rad($uhel))), 3);
		$vypocet .= " = $a + $b * i";
		echo "<br />";
		echo $vypocet;
	}
?>
