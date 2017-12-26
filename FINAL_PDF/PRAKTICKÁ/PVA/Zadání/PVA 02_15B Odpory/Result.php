<!-- Created by: Jonyberry --><!DOCTYPE html>
<html lang="cz">
<head>
    <meta charset="UTF-8">
    <title>Resistence</title>
</head>
<body>
    <h1>Vypocet odporu</h1>
	<?php
		/**
		 * @author "Jan Bártl"
		 */
		if(isset($_REQUEST['countRes'])){
			$resistances = $_POST['resistances'];
			$result      = 0;
			if($_REQUEST['shift'] == 0){
				foreach($resistances as $resistance){
					$result += $resistance;
				}
				echo "Vysledny odpor je: " . $result;
			} elseif($_REQUEST['shift'] == 1){
				foreach($resistances as $resistance){
					$result += pow($resistance, -1);
				}
				$result = pow($result, -1);
				echo "Vysledny odpor je: " . $result;
			}
		}
	?>
</body>
</html>