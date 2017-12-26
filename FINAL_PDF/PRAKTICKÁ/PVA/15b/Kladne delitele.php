<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>PI</title>
	</head>
	<body>
	<fieldset>
		<legend>Kladní dělitelé</legend>
		<form action='' method='POST'>
			Číslo: <input type='number' min="1" name='hodnota'><br><br />
			<input type='submit' name='pocitej' value='Počítej'>
		</form>
	</fieldset>
		<?php
			if(isset($_REQUEST['pocitej'])){
				$hodnota = $_REQUEST['hodnota'];
				if($_REQUEST['hodnota'] == ""){
					echo("<p>Musite zadat nejake cislo</p>\n");
				} else {
					delitele($hodnota);
				}
			}
			function delitele($cislo){
				echo("Veškeří kladní dělitelé čísla: $cislo jsou: ");
				for($i = 1; $i <= $cislo; $i++){
					$res = $cislo % $i;
					if(($res) == 0){
						if($i != $cislo){ //kvůli vypisování poslední čárky
							echo($i . ", ");
						} else {
							echo($i);
						}
					}
				}
			}

		?>
	</body>
</html>
