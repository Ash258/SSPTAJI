<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Ciferný součet</title>
	</head>
	<body>
	<fieldset>
		<legend>Program pro cif součet</legend>
		<form action='' method='POST'>
			Cifra: <input type='number' min="1" name='hodnota'><br><br />
			<input type='submit' name='pocitej' value='Počítej'>
		</form>
	</fieldset>
		<?php
			if(isset($_REQUEST['pocitej'])){
				$hodnota = $_REQUEST['hodnota'];
				echo "<h3>$hodnota</h3>";
				$test = strlen($hodnota);
				$vysl    = 0;
				$sum     = 0;
				while($hodnota > 0){
					$sum += $hodnota % 10;
					$hodnota /= 10;
				}
				$sum += $hodnota;
				echo "Ciferný součet je: " . $sum;
				echo "<br /> Počet cifer: " . $test;
			}
		?>
		</body>
</html>
