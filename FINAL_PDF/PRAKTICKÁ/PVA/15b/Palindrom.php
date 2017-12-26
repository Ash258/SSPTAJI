<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Palindrom</title>
	</head>
	<body>
	<fieldset>
		<legend>Palindrom</legend>
		<form action='' method='POST'>
			Číslo: <input type='number' min="0" name='hodnota'><br><br />
			<input type='submit' name='pocitej' value='Počítej'>
		</form>
	</fieldset>
		<?php
			if(isset($_REQUEST['pocitej'])){
				$cislo = $_REQUEST['hodnota'];
				echo $cislo;
				echo palindrom($cislo);
			}
			function palindrom($text){
				if((strlen($text) == 1) || (strlen($text) == 0)){
					echo " Je Palindrom";
				} elseif(substr($text, 0, 1) == substr($text, (strlen($text) - 1), 1)) {
					return palindrom(substr($text, 1, strlen($text) - 2));
				} else {
					return " Neni Palindrom";
				}
			}

		?>
	</body>
</html>
