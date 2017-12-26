<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Euklides</title>
	</head>
	<body>
	<fieldset>
		<legend>Euklides</legend>
		<form action='' method='POST'>
			1. číslo: <input type='number' min="0" name='hodnota1'><br><br />
			2. číslo: <input type='number' min="0" name='hodnota2'><br><br />
			<input type='submit' name='pocitej' value='Zjisti největší společný dělitel'>
		</form>
	</fieldset>
		<?php
			function GCD_E($numerator, $denominator){
				//rekurze mi házela errory (insuficient allowed memory) - nevím proč
				//UPDATE: už vím proč :D
				//Měl jsem spuštěných o malinko více aplikací než normálně mívám, ale jak se mi povedlo dostat přes 32GB netuším :D
				//Tolik paměti by ten program neměl potřebovat :D

				//if($denominator == 0) return $numerator;
				//return GCD_E($denominator, $numerator & $denominator);
				$tmp = 0;
				while($denominator != 0){
					$tmp         = $denominator;
					$denominator = $numerator % $denominator;
					$numerator   = $tmp;
				}
				return $tmp;
			}

			if(isset($_REQUEST['pocitej'])){
				$a = $_REQUEST['hodnota1'];
				$b = $_REQUEST['hodnota2'];
				echo GCD_E($a, $b);
			}
		?>
	</body>
</html>
