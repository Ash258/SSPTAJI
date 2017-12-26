<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>PI</title>
	</head>
	<body>
	<fieldset>
		<legend>Program pro vypsání faktoriálu zadaného čísla</legend>
		<form action='' method='POST'>
			Číslo: <input type='number' min="1" name='hodnota'><br><br />
			<input type='submit' name='pocitej' $N='Počítej'>
		</form>
	</fieldset>
		<?php
			function factorial($N){
				if($N < 2){
					return 1;
				} else {
					return ($N * factorial($N - 1));
				}
			}

			if(isset($_REQUEST{'pocitej'})){
				$n = $_REQUEST['hodnota'];
				echo "Faktoriál čísla " . $n . " je: " . factorial($n);
			}
		?>
		</body>
	</html>
