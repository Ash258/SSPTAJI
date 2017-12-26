<?php
	$dsn      = "mysql:host=127.0.0.1;port=3306;dbname=telefony";
	$user     = "root";
	$password = "";
	try{
		$db = new PDO($dsn, $user, $password, [PDO::ATTR_ERRMODE            => PDO::ERRMODE_EXCEPTION,
											   PDO::MYSQL_ATTR_INIT_COMMAND => 'SET NAMES utf8',
											   PDO::ATTR_PERSISTENT         => TRUE]);
	} catch(PDOException $e){
		echo 'Connection failed: ' . $e->getTraceAsString();
	}
?>
