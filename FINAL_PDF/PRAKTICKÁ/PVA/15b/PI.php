<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>PI</title>
	</head>
	<body>
	<fieldset>
		<legend>Program pro vypsání PI na zadný počet desetiných míst</legend>
		<form action='' method='POST'>
			Počet desetiných míst: <input type='number' min="1" name='hodnota'><br><br />
			<input type='submit' name='pocitej' value='Počítej'>
		</form>
	</fieldset>
		<?php
			if(isset($_REQUEST['pocitej'])){
				if($_REQUEST['hodnota'] == ""){
					echo("<p>Musite zadat pocet mist!!</p><br />\n");
				} else {
					$mista = $_REQUEST['hodnota'];
					if(($mista < 0)){
						echo("<p>Pro tento pocet mist neresitelne!</p><br />\n");
					}
					if($mista == 0){
						echo("Vysledek je: 3");
					} else {
						$delenec = 355;
						$delitel = 113;
						$zb      = ($delenec % $delitel) * 10;
						$delenec = $zb;
						echo("Vysledek je: 3,");
						while($mista > 0){
							$poc = (int)($delenec / $delitel);
							echo($poc);
							$zb      = ($delenec % $delitel) * 10;
							$delenec = $zb;
							$mista--;
						}
					}
				}
			}
		?>

	</body>
</html>
