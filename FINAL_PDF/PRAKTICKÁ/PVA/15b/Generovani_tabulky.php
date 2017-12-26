<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Tabulka</title>
	</head>
	<body>
	<fieldset>
		<legend>Tabulka</legend>
		<table border="0">
			<form action="" method="POST">
				<tr><td>Zadej pocet radku:</td><td><input type="text" name="radky"></td></tr>
				<tr><td>Zadej pocet sloupcu:</td><td><input type="text" name="sloupce"></td></tr>
				<tr><td>Vyber barvu ramecku:</td><td><select name="barva">
					<option value="red">cervena</option>
					<option value="green">zelena</option>
					<option value="blue">modra</option>
				</select></td></tr>
				<tr><td></td><td><input type="radio" name="sirka" value="300px" checked>300px</td></tr>
				<tr><td>Zadej sirku tabulky:</td><td><input type="radio" name="sirka" value="500px">500px</td></tr>
				<tr><td></td><td><input type="radio" name="sirka" value="700px">700px</td></tr>
				<tr><td><input type="submit" name="tlacitko" value="Odeslat"></td><td></td></tr>
			</form>
		</table>
	</fieldset>
		<?php
			function Generuj($color, $radio, $lines, $columns){
				echo("<table border='1' bordercolor='$color' width='$radio'>");
				for($i = 1; $i <= $lines; $i++){
					echo("<tr>\n");
					for($j = 1; $j <= $columns; $j++){
						echo("<td>PHP</td>");
					}
					echo("</tr>\n");
				}
				echo("</table>\n");
				echo("<tr>");
				echo("<td align='center'>");
				echo("Transponovat tabulku na nove strance?");
				echo("<a href='_Generovani_tabulky.php?otocit&columns=$columns&lines=$lines&color=$color&width=$radio'> ANO");
				echo("</a>");
				echo("</td>");
				echo("</tr>\n");
			}

			if(isset($_REQUEST['tlacitko'])){
				if($_REQUEST['radky'] == "" or $_REQUEST['radky'] == ""){
					echo("<p align='center'>Nemuzes odeslat prazdny formular!!!</p>\n");
				} else {
					$radky   = $_POST['radky'];
					$sloupce = $_POST['sloupce'];
					$barva   = $_POST['barva'];
					$sirka   = $_POST['sirka'];
					Generuj($barva, $sirka, $radky, $sloupce);
				}
			}
		?>
		<?php
			if(isset($_REQUEST['otocit'])){
				$columns = $_GET["columns"];
				$lines   = $_GET["lines"];
				$color   = $_GET["color"];
				$width   = $_GET["width"];
				Generuj($color, $width, $columns, $lines);
			}
		?>

	</body>
</html>
