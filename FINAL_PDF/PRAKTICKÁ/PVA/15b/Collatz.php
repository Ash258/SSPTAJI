<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<meta charset="UTF-8">
		<title>Collatz</title>
	</head>
	<body>
		<fieldset>
			<legend>Collatz problem</legend>
			<form action="" method="POST">
				Cislo: <input value="" name="cislo" type="number"><br><br>
				<input name="submit" value="Odeslat" type="submit">
			</form>
		</fieldset>
<?php
	function collatz($value, &$max, &$count){
		echo $value . "<br />";
		if($value > $max){
			$max = $value;
		}
		if($value == 1){
			echo "Maximum je: " . $max;
			echo "<br />Počet Průchodů je: " . $count; //bez jedničky
			return;
		} else if($value % 2 == 0){
			$count++;
			collatz($value / 2, $max, $count);
		} else {
			$count++;
			collatz(3 * $value + 1, $max, $count);
		}
	}

	if(isset($_REQUEST['submit'])){
		$hodnota = $_REQUEST['cislo'];
		$max     = 0;
		$count   = 0;
		collatz($hodnota, $max, $count);
	}
?>
