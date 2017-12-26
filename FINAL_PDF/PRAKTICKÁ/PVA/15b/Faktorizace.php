<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Faktorizace</title>
	</head>
	<body>
	<fieldset>
		<legend>Faktorizace</legend>
		<form action='' method='POST'>
			Číslo: <input type='number' min="3" name='hodnota'><br><br />
			<input type='submit' name='pocitej' value='Počítej'>
		</form>
	</fieldset>
		<?php
			if(isset($_REQUEST['pocitej'])){
				$hodnota = $_REQUEST['hodnota'];
				$zbytek  = $hodnota;
				for($i = 2; $i <= sqrt($zbytek); $i++){
					while($zbytek % $i == 0){
						$zbytek = $zbytek / $i;
						echo $i . " * ";
					}
				}
				if($zbytek > 1){
					echo $zbytek;
				}
				echo(" = " . $hodnota);
			}
		?>
	</body>
</html>
