<!-- Created by: Jonyberry --><!DOCTYPE html>
<html lang="cz">
	<head>
		<meta charset="UTF-8">
		<title>Avarage</title>
		<style>
			input[type="number"] {
				width : 160px;
			}
		</style>
	</head>
	<body>
		<h1>Vypocet vazeneho prumeru</h1>
		<form action="result.php" method="post">
			<fieldset>
				<legend>Zadejte hodnoty</legend>
				<?php
					echo '</table>';
					if(isset($_REQUEST['avarage'])){
						$count = (int)htmlspecialchars($_REQUEST['count']);
						$start = 1;
						echo '<table>';
						while($start <= $count){
							echo '<tr>';
							echo '<td><input type="number" min="1" max="5" name="mark[' . $start . ']" placeholder="Zadejte ' . $start . '. znamku"></td>';
							echo '<td><input type="number" min="1" max="10" name="weight[' . $start . ']" placeholder="Zadejte vahu ' . $start . '. znamky"></td>';
							echo '</tr>';
							$start++;
						}
					}
				?>
			</fieldset>
			<input type="submit" name="result" value="Pocitej">
		</form>
	</body>
</html>
