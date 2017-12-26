<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Signum</title>
	</head>
	<body>
	<fieldset>
		<legend>Signum</legend>
		<h1>Kurva nevěřím, že je tohle zadání :D :D :D </h1>
		<form action='' method='POST'>
			Číslo: <input type='number' name='hodnota'><br><br />
			<input type='submit' name='pocitej' value='Počítej'>
		</form>
	</fieldset>
		<?php
			function Signum($a){
				if($a > 0){
					return "kladné";
					//return "1";
				} elseif($a < 0) {
					return "záporné";
					//return "-1";
				} else {
					return "0";
				}
			}

			if($_REQUEST['pocitej']){
				$cislo = $_REQUEST['hodnota'];
				echo Signum($cislo);
			}
		?>
	</body>
</html>
