<?php
	session_start();
?>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Prumer</title>
	</head>
	<body>
		<form action="" method="POST">
			Zadejte pocet znamek:<input type="text" name="pocet" /> <br />
			<input type="submit" name="submit" /><br />
		</form>
		<?php
			//kdyz kliknu na odeslat
			/**
			 * @author "Nevím kdo to dělal :D nejspíše Líby nebo Aisik
			 */
			if(isset($_REQUEST['submit'])){
				//stahnu si pocet znamek
				$pocet = (int)htmlspecialchars($_REQUEST['pocet']);
				//pocet znamek nesmi byt zaporny
				if($pocet > 0){
					//pocet si ulozim do session, budu ho potrebova i dyl
					$_SESSION['pocetZnamek'] = $pocet;
					//kdyz si zadam napr. 3 znamky, tak jim dam v inputu name 1-3
					//a promenna j je pro vahy, kterejm priradim 4-6
					$j = $pocet + 1;
					echo("<form action='' method='POST'\>");
					//ve forcyklu vypisuju inputy a zvetsuju i a j
					for($i = 1; $i <= $pocet; $i++, $j++){
						echo("Zadej $i. znamku<input type='text' name='$i'/>&nbsp&nbsp&nbsp&nbsp&nbsp");
						echo("Zadej $i. vahu<input type='text' name='$j'/><br />");
					}
					echo("<input type='submit' name='pocitej' value='pocitej'/>");
					echo("</form>");
				} else {
					echo("Zadali jste chybny pocet znamek!");
				}
			}
		?>
		<?php
			//kdyz kliknu na pocitej
			if(isset($_REQUEST['pocitej'])){
				//ze session si stahnu pocet znamek
				$pocet = $_SESSION['pocetZnamek'];
				//zase promena pro vahy
				$j = $pocet + 1;
				//postupne si ukladam hodnoty znamek a vah do pole
				//zase zvesuju i a j
				for($i = 1; $i <= $pocet; $i++, $j++){
					$poleZnamek[] = (int)htmlspecialchars($_REQUEST[$i]);
					$poleVah[]    = (int)htmlspecialchars($_REQUEST[$j]);
				}
				//do mezivysl ukladam vynasobene znamky s vahami
				$mezivysl = 0;
				//do soucetvah ulozim soucet vah, kterym to pak ve vysledku vydelim
				$soucetVah = 0;
				for($i = 0, $j = $pocet; $i < $pocet; $i++, $j++){
					$mezivysl += $poleZnamek[$i] * $poleVah[$i];
					$soucetVah += $poleVah[$i];
				}
				//posledni operace (vynasobene vahy se znamkami deleno soucetvah)
				$vysl = $mezivysl / $soucetVah;
				//vypis
				echo("Průměr je: $vysl");
			}
		?>
	</body>
</html>
