<?php
	function vracenibankovek($vstup) {
		$polebankovek = [5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1];
		$polepoctu    = [];
		for($i = 0; $i < count($polebankovek); $i++) {
			$polepoctu[$i] = 0;
		}
		while($vstup != 0) {
			for($i = 0; $i < count($polebankovek); $i++) {
				while($vstup >= $polebankovek[$i]) {
					$vstup -= $polebankovek[$i];
					$polepoctu[$i]++;
				}
			}
		}
		echo("Vracene bankovky: <br />");
		for($i = 0; $i < count($polepoctu); $i++) {
			if($polepoctu[$i] == 0) {
			} else {
				echo($polebankovek[$i] . " - " . $polepoctu[$i] . "<br />");
			}
		}
	}
?>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<form action="" method="POST">
			<fieldset>
				<legend><h2>Automat na vraceni bankovek a minci</h2></legend>
				Zadejte castku pro vraceni (v celych korunach): <input type="text" name="vstup">
				<br />
				<input type="submit" name="submit" value="Odeslat" />
			</fieldset>
		</form>
		<?php
			if(isset($_REQUEST['submit'])) {
				$vstup = (int)htmlspecialchars($_REQUEST['vstup']);
				vracenibankovek($vstup);
			}
		?>
	</body>
</html>
