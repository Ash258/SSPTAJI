<?php
	// pokus o pripojeni k databazi
	/*dsn - data source name
	 * typ DB
	 * adresa serveru (host)
	 * port na kterem DB bezi
	 * jmeno DB ke ktere se pripojuji
	 */
	$dsn = "mysql:host=127.0.0.1;port=3306;dbname=aukce";
	/* jmeno uzivatele kterz muze spravovat DB
	 */
	$user = "root";
	/* heslo uzivatele kterz muze spravovat DB
	 */
	$pass = "";
	/*Vytvoreni instance PDO
	 * PDO::ERRMODE_EXCEPTION - chyby budou oznamovany jako vyjimky
	 * PDO::MYSQL_ATTR_INIT_COMMAND - nastaveni kodovani utf8
	 */
	try{
		$db = new PDO($dsn, $user, $pass, [PDO::ATTR_ERRMODE            => PDO::ERRMODE_EXCEPTION,
										   PDO::MYSQL_ATTR_INIT_COMMAND => "SET NAMES utf8"]);
	} catch(PDOException $e){
		/* pokud selze pripojeni k db, nema cenu pokracovat */
		die("Pripojeni selhalo " . $e->getMessage());
	}
?>
