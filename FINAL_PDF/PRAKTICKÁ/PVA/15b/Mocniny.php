<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Mocniny</title>
	</head>
	<body>
	<fieldset>
		<legend>Mocniny</legend>
		<form action='' method='POST'>
			Základ: <input type='number' min="1" name='hodnota'><br><br />
			Řád: <input type='number' min="1" name='hodnota2'><br><br />
			<input type='submit' name='pocitej' value='Počítej'>
		</form>
	</fieldset>
		<?php
			//Pokud nepůjde použít vestavěná funkce jinak klasicky pow($a,$b)
			function mocnina($a, $b){
				$vysl = 1;
				for($i = 0; $i < $b; $i++){
					$vysl *= $a;
				}
				return "$a<sup>$b</sup> je: $vysl";
			}

			if(isset($_REQUEST['pocitej'])){
				$zaklad   = $_REQUEST['hodnota'];
				$exponent = $_REQUEST['hodnota2'];
				echo mocnina($zaklad, $exponent);
			}
		?>
	</body>
</html>
