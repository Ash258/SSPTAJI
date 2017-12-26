<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Eratosthenovo sito</title>
	</head>
	<fieldset>
		<legend>Program na jednoduche vypsani prvocisel do vami zvoleneho maxima</legend>
		<form action='' method='POST'>
			Maximum: <input type='text' name='hodnota'><br><br />
			<input type='submit' name='pocitej' value='pocitej'>
		</form>
	</fieldset>
	<body>
		<?php
		if (isset($_REQUEST['pocitej'])) {
			$cislo = $_REQUEST['hodnota'];
			//napln pole TRUE hodnotami
			for ($i = 1; $i <= $cislo; $i++) {
				$pole[$i] = TRUE;
			}
			//e-sito
			//projdi do maxima
			for ($i = 2; $i <= $cislo; $i++) {
				//pokud je na pozici v poli TRUE
				if ($pole[$i] == TRUE) {
					//prijdi nasobky cisla (2*1, 2*2, 2*3...)
					for ($j = 2; $i * $j <= $cislo; $j++) {
						//zmen na false
						$pole[$i * $j] = FALSE;
					}
				}
			}
			//pocitadlo pro odradkovani po 10 prvcich
			$pocitadlo = 0;
			//vypis
			echo("<table border ='1'>\n");
			echo("<tr>");
			//projdi pole
			for ($i = 2; $i <= $cislo; $i++) {
				//kde je v poli jeste TRUE
				if ($pole[$i] == TRUE) {
					$pocitadlo++;
					//to vypis
					echo("<td>$i</td>");
				}
				//pokud uz je 10 prvku
				if ($pocitadlo == 10 ) {
					//odradkuj
					echo("</tr>\n<tr>");
					//a pocitej odznova
					$pocitadlo = 0;
				}
			}
			echo("</tr>");
			echo("</table>");
		}
		?>
	</body>
</html>
