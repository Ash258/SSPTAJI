<?php
	session_start();
	ob_start();
	/**
	 * Created by PhpStorm.
	 * User: Jonyberry
	 * Date: 15.04.2016
	 * Time: 16:11
	 */
	require_once './db_connect.php';
	require_once './scripts.php';
?>


<?php
	if(isLoggedIn()) {
		echo   '<h1>Novy zaznam</h1>
				<fieldset>
					<legend>Vyber typu cisla</legend>
					<form action="./novy2.php" type="POST">
						<!--label je pro možnost vybrat radio button kliknutím na text-->
						<label for="check1">Domacnost</label><input id="check1" type="radio" name="type" value="domacnost" checked><br />
						<label for="check2">Firma</label><input id="check2" type="radio" name="type" value="firma"><br />
						<input type="submit" name="next" value="Ulozit">
					</form>
				</fieldset>';
	} else {
		header("Location: ./index.php");
	}
?><?php
	ob_end_flush()
?>
