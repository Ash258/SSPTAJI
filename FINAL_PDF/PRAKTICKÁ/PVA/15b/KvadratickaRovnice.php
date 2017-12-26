<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Kvadraticka rovnice</title>
	</head>
	<body>
		<form action="" method="POST">
			Zadej A:<input type="number" name="cisloA" /><br />
			Zadej B:<input type="number" name="cisloB" /><br />
			Zadej C:<input type="number" name="cisloC" /><br />
			<input type="submit" name="vypocitej" value="Vypocitej" />
		</form>
	</body>
</html>
<?php
	function D($a, $b, $c) {
		$d = pow($b, 2) - (4 * $a * $c);
		return $d;
	}

	function x1($a, $b, $d) {
		$x1 = (-$b + sqrt($d)) / (2 * $a);
		return $x1;
	}

	function x2($a, $b, $d) {
		$x2 = (-$b - sqrt($d)) / (2 * $a);
		return $x2;
	}

	if(isset($_REQUEST['vypocitej'])) {
		$cisloA = trim(htmlspecialchars($_REQUEST['cisloA']));
		$cisloB = trim(htmlspecialchars($_REQUEST['cisloB']));
		$cisloC = trim(htmlspecialchars($_REQUEST['cisloC']));
		echo("<h3>$cisloAx" . "x<sup>2</sup> + $cisloB" . "x + $cisloC</h3><br />");
		$d = D($cisloA, $cisloB, $cisloC);
		echo "Diskriminant je:  " . $d . "<br />";
		if($d == 0) {
			echo "x = " . x1($cisloA, $cisloB, $d);
		} elseif($d < 0) {
			echo "Diskriminant je mensi nez 0<br />Nema reseni";
		} else {
			echo "x<sub>1</sub> = " . x1($cisloA, $cisloB, $d) . "<br />x<sub>2</sub> = " . x2($cisloA, $cisloB, $d);
		}
	}
?>


