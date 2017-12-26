<?php
	/**
	 * Created by PhpStorm.
	 * User: Jonyberry
	 * Date: 15.04.2016
	 * Time: 18:43
	 */
	require_once './db_connect.php';
?>
	<form action="" type="POST">
		<fieldset>
			<legend>Vyhledavaní podle jmena</legend>
			<table border="1px">
				<tr><td>Jmeno</td><td><input type="text" name="jmeno" placeholder="Zadejte jmeno"></td></tr>
				<tr><td>Domacnosti</td><td><input type="checkbox" name="check1" value="dom"></td></tr>
				<tr><td>Firma</td><td><input type="checkbox" name="check2" value="firm"></td></tr>
			</table>
			<input type="submit" name="search" value="hledej"><br /><br />
		</fieldset>
	</form><p><a href="./index.php">Zpet</a> na hlavní stranku</p>

<?php
	if(isset($_REQUEST['search'])) {
		$jmeno  = $_REQUEST['jmeno'];
		$params = [$jmeno];
		if(isset($_REQUEST['check1']) && !isset($_REQUEST['check2'])) {
			try {
				$query = $db->prepare("SELECT COUNT(*) FROM telefony_domacnosti WHERE telefony_domacnosti_jmeno = ?");
				$query->execute($params);
			} catch(PDOException $e) {
				die($e->getMessage());
			}
			$rows = $query->fetch();
			echo '<h2>Domacnosti</h2>';
			if($rows[0] > 0) {
				echo "Byly nalezeny " . $rows[0] . " polozky";
				//Pokud chcete vypsat i položky které se našli odkomentujte tuto část kodu
				/*
				try{
					$query  = $db->prepare("SELECT * FROM telefony_domacnosti WHERE telefony_domacnosti_jmeno = ?");
					$query->execute($params);

				} catch(PDOException $e){
					die($e->getMessage());
				}
				$result = $query ->fetchAll(PDO::FETCH_ASSOC);
				$test = 0;
				echo '<br /> <br /> <table border="1px">
						<tr><th>Jmeno</th><th>Mesto</th><th>Telefon</th></tr>';
				while ($test < $rows[0]){
					echo '<tr>';
					unset($result[$test]['telefony_firmy_ico']);
					unset($result[$test]['telefony_firmy_id']);
					unset($result[$test]['telefony_domacnosti_id']);
					foreach ($result[$test] as $item) {
						echo '<td>';
						echo $item;
						echo '</td>';
					}$test ++;
				}echo '</tr>';
				echo '</table>';*/
			} else {
				echo "Nebyl nalezen žádný výskyt";
			}
		}
		if(!isset($_REQUEST['check1']) && isset($_REQUEST['check2'])) {
			try {
				$query = $db->prepare("SELECT COUNT(*) FROM telefony_firmy WHERE telefony_firmy_nazev = ?");
				$query->execute($params);
			} catch(PDOException $e) {
				die($e->getMessage());
			}
			echo '<h2>Firmy</h2>';
			$rows = $query->fetch();
			if($rows[0] > 0) {
				echo "Byly nalezeny " . $rows[0] . " polozky";
				//Pokud chcete vypsat i položky které se našli odkomentujte tuto část kodu
				/*
				try{
					$query  = $db->prepare("SELECT * FROM telefony_firmy WHERE telefony_firmy_nazev = ?");
					$query->execute($params);

				} catch(PDOException $e){
					die($e->getMessage());
				}
				$result = $query ->fetchAll(PDO::FETCH_ASSOC);
				$test = 0;
				echo '<br /> <br /> <table border="1px">
						<tr><th>Jmeno</th><th>Mesto</th><th>Telefon</th></tr>';
				while ($test < $rows[0]){
					echo '<tr>';
					unset($result[$test]['telefony_firmy_ico']);
					unset($result[$test]['telefony_firmy_id']);
					unset($result[$test]['telefony_domacnosti_id']);
					foreach ($result[$test] as $item) {
						echo '<td>';
						echo $item;
						echo '</td>';
					}$test ++;
				}echo '</tr>';
				echo '</table>';*/
			} else {
				echo "Nebyl nalezen žádný výskyt";
			}
		}
		if(isset($_REQUEST['check1']) && isset($_REQUEST['check2'])) {
			try {
				$query1 = $db->prepare("SELECT COUNT(*) FROM telefony_firmy WHERE telefony_firmy_nazev = ?");
				$query1->execute($params);
			} catch(PDOException $e) {
				die($e->getMessage());
			}
			echo '<h2>Domacnosti a firmy</h2>';
			$rows1 = $query1->fetch();
			try {
				$query2 = $db->prepare("SELECT COUNT(*) FROM telefony_domacnosti WHERE telefony_domacnosti_jmeno = ?");
				$query2->execute($params);
			} catch(PDOException $e) {
				die($e->getMessage());
			}
			$rows2   = $query2->fetch();
			$rows[0] = $rows1[0] + $rows2[0];
			if($rows[0] > 0) {
				echo "Byly nalezeny " . $rows[0] . " polozky";
				//Pokud chcete vypsat i položky které se našli odkomentujte tuto část kodu
				/*
				try{
					$query3  = $db->prepare("SELECT * FROM telefony_firmy WHERE telefony_firmy_nazev = ?");
					$query3->execute($params);

				} catch(PDOException $e){
					die($e->getMessage());
				}
				$result1 = $query3 ->fetchAll(PDO::FETCH_ASSOC);
				try{
					$query4  = $db->prepare("SELECT * FROM telefony_domacnosti WHERE telefony_domacnosti_jmeno = ?");
					$query4->execute($params);
				} catch(PDOException $e){
					die($e->getMessage());
				}
				$result2 = $query4 ->fetchAll(PDO::FETCH_ASSOC);
				$result = array_merge($result1,$result2);
				$test = 0;
				echo '<br /> <br /> <table border="1px">
						<tr><th>Jmeno</th><th>Mesto</th><th>Telefon</th></tr>';
				while ($test < $rows[0]){
					echo '<tr>';
					unset($result[$test]['telefony_firmy_ico']);
					unset($result[$test]['telefony_firmy_id']);
					unset($result[$test]['telefony_domacnosti_id']);
					foreach ($result[$test] as $item) {
						echo '<td>';
						echo $item;
						echo '</td>';
					}$test ++;
				}echo '</tr>';
				echo '</table>';*/
			} else {
				echo "Nebyl nalezen žádný výskyt";
			}
		}
	}
?>
