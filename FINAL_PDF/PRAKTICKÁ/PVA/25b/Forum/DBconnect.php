<?php
	$dsn  = "mysql:host=127.0.0.1;port=3306;dbname=forum";
	$user = "root";
	$pass = "";
	try{
		$db = new PDO($dsn, $user, $pass, [PDO::ATTR_ERRMODE            => PDO::ERRMODE_EXCEPTION,
										   PDO::MYSQL_ATTR_INIT_COMMAND => "SET NAMES utf8"]);
	} catch(PDOExeption $e){
		die("Nepřipojeno : " . $e->getMess());
	}
?>
