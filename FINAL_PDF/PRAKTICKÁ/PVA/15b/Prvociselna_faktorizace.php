<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Prvočíselná faktrorizace</title>
	</head>
	<body>
	<fieldset>
		<legend>Prvočíselná faktrorizace</legend>
		<form action='' method='POST'>
			Číslo: <input type='number' min="1" name='hodnota'><br><br />
			<input type='submit' name='pocitej' value='Počítej'>
		</form>
	</fieldset>
		<?php
			if(isset($_REQUEST['pocitej'])){
				$cislo = $_REQUEST['hodnota'];
				echo primeFactorization($cislo);
			}

			function primeFactorization($value){
				$tmp   = $value;
				$final = "";
				for($index = 2; $index <= sqrt($tmp); $index++){
					while($tmp % $index == 0){
						$tmp /= $index;
						$final .= $index . " * ";
					}
				}
				if($tmp > 1) $final .= $tmp;
				return $final;
			}

		?>
	</body>
</html>
