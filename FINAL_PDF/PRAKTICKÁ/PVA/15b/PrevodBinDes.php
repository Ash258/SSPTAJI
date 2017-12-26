<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Bin Dec</title>
	</head>
	<body>
	<fieldset>
		<legend>Program pro převod mezi číselnými soustavami</legend>
		<form action='' method='POST'>
			Číslo (Des / bin): <input type='text' min="1" name='hodnota'><br><br />
			Převod do soustavy :
			<select name="soustava">
				<option value="des" selected> Desítkové </option>
				<option value="bin"> Dvojkové </option>
			</select> <br />
			<input type='submit' name='pocitej' value='Počítej'>
		</form>
	</fieldset>
		<?php
			function toBinary($value){
				$binStr = '';
				while($value >= 1){
					$bin   = $value % 2;
					$value = round($value / 2, 0, PHP_ROUND_HALF_DOWN);
					$binStr .= $bin;
				}
				$binStr = strrev($binStr);
				return $binStr;
			}

			function toDecimal($value){
				$decimal = 0;
				$p       = 0;
				while(TRUE){
					if($value == 0){
						return;
					} else {
						$tmp = (int)$value % 10;
						$decimal += $tmp * pow(2, $p);
						$value /= 10;
						$p++;
					}
				}
				return $decimal;
			}

			if(isset($_REQUEST['pocitej'])){
				$number = trim($_REQUEST['hodnota']);
				$select = $_REQUEST['soustava'];
				echo "Číslo $number je v soustavě ";
				if($select == "bin"){
					echo "dvojkové: " . toBinary($number);
				} else {
					echo "desítkové: " . toDecimal($number);
				}
			}
		?>
	</body>
</html>
