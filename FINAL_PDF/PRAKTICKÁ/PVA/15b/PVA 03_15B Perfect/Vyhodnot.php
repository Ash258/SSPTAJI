<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Vysledek</title>
	</head>
	<body>
		<h1> Výpočet abundantních, perfektních a deficientních cisel </h1>
		<?php
			/**
			 * @author "Jakub Čábera"
			 */
			function isAbundant($number){
				$tmp = 0;
				for($index = 1; $index < $number; $index++){
					if(($number % $index) == 0){
						$tmp += $index;
					}
				}
				if($number < $tmp){
					return TRUE;
				} else{
					return FALSE;
				}
			}

			function isPerfect($number){
				$tmp = 0;
				for($index = 1; $index <= $number / 2; $index++){
					if(($number % $index) == 0){
						$tmp += $index;
					}
				}
				if(($tmp == $number) && ($tmp != 0)){
					return TRUE;
				} else{
					return FALSE;
				}
			}

			function isDeficient($number){
				$tmp = 0;
				for($index = 1; $index < $number; $index++){
					if(($number % $index) == 0){
						$tmp += $index;
					}
				}
				if($number > $tmp){
					return TRUE;
				} else{
					return FALSE;
				}
			}

			$mez = $_REQUEST['mez'];
			if($mez < 1){
				die("Neplatný vstup");
			}
			if(empty($_REQUEST['cisloo'])){
				die("Nic jste nevybrali");
			}
			$cislo         = $_REQUEST['cisloo'];
			$abundantPole  = [];
			$perfectPole   = [];
			$deficientPole = [];

			for($index = 1; $index < $mez; $index++){
				if(isAbundant($index) == TRUE){
					$abundantPole[count($abundantPole)] = $index;
				}
				if(isPerfect($index) == TRUE){
					$perfectPole[count($perfectPole)] = $index;
				}
				if(isDeficient($index) == TRUE){
					$deficientPole[count($deficientPole)] = $index;
				}
			}
			for($j = 0; $j < count($cislo); $j++){
				switch($cislo[$j]){
					case "abundant":
						echo "<br/>Abundantní čísla: ";
						for($test = 0; $test < count($abundantPole); $test++) echo $abundantPole[$test] . ", ";
						break;
					case "perfect":
						echo "<br/>Perfektní čísla: ";
						for($test = 0; $test < count($perfectPole); $test++) echo $perfectPole[$test] . ", ";
						break;
					case "deficient":
						echo "<br/>Deficientní čísla: ";
						for($test = 0; $test < count($deficientPole); $test++) echo $deficientPole[$test] . ", ";
						break;
				}
			}
		?>
	</body>
</html>
