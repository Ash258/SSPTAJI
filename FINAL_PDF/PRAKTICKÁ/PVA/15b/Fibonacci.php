<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Fibonacci</title>
	</head>
	<body>
	<fieldset>
		<legend>Fibonacci</legend>
		<form action='' method='POST'>
			Vyhledat do čísla: <input type="radio" name="radio" value="prvni" checked>
			 <br />Vyhledat určitý počet: <input type="radio" name="radio" value="druhy"><br />
			<input type='number' min="1" name='hodnota'><br><br />
			<input type='submit' name='pocitej' value='Počítej'>
		</form>
	</fieldset>
		<?php
			function fibonacci($to){
				echo $to . ", ";
				if($to == 1){
					return 1;
				}
				$last_last = 0;
				$last      = 1;
				$result    = 0;
				for($i = 1; $i < $to; $i++){
					$result    = $last_last + $last;
					$last_last = $last;
					$last      = $result;
				}
				return $result;
				//Rekurzvině - nevhodné
				/*
				if($to == 0){
					return 0;
				} else if($to == 1){
					return 1;
				} else {
					return fibonacci_rek($to - 1) + fibonacci_rek($to - 2);
				}
				*/
			}

			if(isset($_REQUEST['pocitej'])){
				$hodnota        = $_REQUEST['hodnota'];
				$selected_radio = $_POST['radio'];
				$status         = 1;
				$status_before  = 0;
				$pom            = 0;
				$i              = 0;
				$sub            = 1;
				if($hodnota > 0 && $selected_radio == 'prvni'){
					echo($status_before . ", ");
					while($status <= $hodnota){
						echo($status . ", ");
						$pom           = $status;
						$status        = $status + $status_before;
						$status_before = $pom;
					};
				} elseif($hodnota > 0 && $selected_radio == 'druhy') {
					echo($status_before . ", ");
					while($i + 2 <= $hodnota){
						echo($status . ", ");
						$pom           = $status;
						$status        = $status + $status_before;
						$status_before = $pom;
						$i++;
					};
				} else {
					echo("<br>Zadejte prosím správné hodnoty!");
				}
			}
		?>
	</body>
</html>
