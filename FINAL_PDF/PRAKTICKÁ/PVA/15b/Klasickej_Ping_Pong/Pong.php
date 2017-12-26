<?php
	session_start();
	ob_start();
?>
	<!DOCTYPE html>
	<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Pong - sessions</title>
	</head>
	<body>
		<?php
			if(isset($_REQUEST['Reset'])){
				unset($_SESSION['id']);
				unset($_SESSION['pocet']);
			}
			if(isset($_SESSION['id'])){
			} else {
				$_SESSION['id'] = rand(0, 1000);
			}
			if(isset($_SESSION['pocet'])){
				$_SESSION['pocet'] = ++$_SESSION['pocet'];
			} else {
				$_SESSION['pocet'] = 1;
			}
			echo("<h1>Pong</h1>\n");
			echo("<p>Vase udaje jsou:</p>\n");
			echo("<p>ID: " . $_SESSION['id'] . "</p>\n");
			echo("<p>Pocet navstev: " . $_SESSION['pocet'] . "</p>\n");
			echo("<p><a href=\"Ping.php\">Ping</a></p>\n");
		?>
		<form action="Ping.php" method="GET">
			<input type="submit" name="Reset" value="Reset" />
		</form>
	</body>
</html>
<?php
	ob_end_flush();
?>
