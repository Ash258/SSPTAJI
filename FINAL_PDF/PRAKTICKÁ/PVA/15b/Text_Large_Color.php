<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Text</title>
	</head>
	<body>
	<fieldset>
		<legend>Text</legend>
		</form>
		<form action='' method='POST'>
			Text: <input type='text' name='text'><br><br />
			Barva: <br />
			<select name="barva" size="1">
				<option value="red">červená</option>
				<option value="white">bílá</option>
				<option value="green">zelená</option>
				<option value="black">černá</option>
				<option value="blue">modrá</option>
			</select><br />
			Velikost písma:<br />
				<input type="radio" name="velikost" value="20px">+2<br />
				<input type="radio" name="velikost" value="22px">+4<br />
				<input type="radio" name="velikost" value="24px">+6<br />
			Kurzíva: <input type="checkbox" name="kurziva"><br />
			<input type='submit' name='pocitej' value='Odeslat'>
		</form>
	</fieldset>
		<?php
			if(isset($_REQUEST['pocitej'])){
				$text     = $_REQUEST['text'];
				$barva    = $_REQUEST['barva'];
				$velikost = 0;
				if(isset($_REQUEST['velikost'])){
					$velikost = $_REQUEST['velikost'];
				} else {
					$velikost = '18px';
				}
				if(isset($_REQUEST['kurziva'])){
					echo napis2($text, $barva, $velikost);
					return;
				}
				echo napis($text, $barva, $velikost);
			}
			//v PHP neexistuje přetěžování metod / funkcí, tak to lehce vyřešit takhle
			function napis($text, $barva, $velikost){
				//echo '<p align="center" style=\"color: $barva\";"color="' . $barva . '" style="font-size: ' . $velikost . '">' . $kurziva . $text . $kurziva2 . '</p>';
				return "<p align='center' style='color: $barva; font-size: $velikost;'>$text</p>";
			}

			function napis2($text, $barva, $velikost){
				//echo '<p align="center" style=\"color: $barva\";"color="' . $barva . '" style="font-size: ' . $velikost . '">' . $kurziva . $text . $kurziva2 . '</p>';
				return "<p align='center' style='color: $barva; font-size: $velikost;'><i>$text</i></p>";
			}

		?>
	</body>
</html>
