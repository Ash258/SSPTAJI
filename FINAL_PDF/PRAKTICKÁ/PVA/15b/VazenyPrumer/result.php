<!-- Created by: Jonyberry -->
<!DOCTYPE html>
<html lang="cz">
<head>
	<meta charset="UTF-8">
	<title>Prumer</title>

</head>
<body>
	<h1>Vypocet prumeru</h1>
	<?php
		if(isset($_REQUEST['result'])){
			$marks  = $_POST['mark'];
			$weight = $_POST['weight'];
			$result = 0;
			$pos    = 1;
			$wei    = 0;
			foreach($marks as $mark){
				$result += ($mark * $weight[$pos]);
				$wei += $weight[$pos];
				$pos++;
			}
			$result /= $wei;
			echo 'Výsledný prumer je: ' . $result;
			echo '<br /><a href="index.html">Zpet</a>';
		}
	?>

</body>
</html>
