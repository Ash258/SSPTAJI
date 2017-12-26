<?php
	//funkce ktera prevezme login a heslo a pokusi se prihlasit uzivatele
	function userLogin($login, $pass, $db){
		//pripravim si dotaz
		try {
			$query = $db->prepare("SELECT COUNT(*) FROM uziv WHERE uziv_login = ? AND uziv_heslo = ?");
		} catch(PDOException $e) {
			die($e->getMessage());
		}
		//pole s parametry
		$params = [$login, $pass];
		//dotaz spustim s parametry
		try {
			$query->execute($params);
		} catch(PDOException $e) {
			die($e->getMessage());
		}
		//pokud dotaz vratil 1 zaznam - je login a heslo spravne
		if($query->fetchColumn(0) == 1) {
			//pregeneruji session id
			session_regenerate_id();
			//vytahnu si id uzivatele, ktery se prihlasil
			try {
				$query = $db->prepare("SELECT uziv_id FROM uziv WHERE uziv_login = ? AND uziv_heslo = ?");
			} catch(PDOException $e) {
				die($e->getMessage());
			}
			//parametry zustavaji - dotaz spustim
			$query->execute($params);
			//vytahnu si id
			$id = $query->fetchColumn(0);
			//vytvorim Session
			$_SESSION[session_id()] = $id;
			//vracim TRUE - podarilo se prihlaseni
			return TRUE;
			//pokud ne, login nebo heslo je spatne
		} else {
			//vracim FALSE - prihlaseni se nepovedlo
			return FALSE;
		}
	}

	//funkce ktera zjisti zda je uzivatel prihlasen
	function isLoggedIn(){
		//pokud existuje session
		if(isset($_SESSION[session_id()])) {
			//uzivatel je prihlasen
			return TRUE;
		} else {
			//jinak neni prihlasen
			return FALSE;
		}
	}

	//funkce pro odhlaseni uzivatele
	function userLogout(){
		//odhlasit se lze pouze pokud jsem prihlasen
		if(isLoggedIn()) {
			//zrus session
			unset ($_SESSION[session_id()]);
			//odhlaseni se zdarilo
			return TRUE;
		} else {
			//jinak se odhlaseni nezdarilo
			return FALSE;
		}
	}

	//funkce, ktera na zaklade id zjisti uzivateluv login - kvuli vypisu
	function getUserLogin($id, $db){
		//pripravim si dotaz
		try {
			$query = $db->prepare("SELECT uziv_login FROM uziv WHERE uziv_id = ?");
		} catch(PDOException $e) {
			die($e->getMessage());
		}
		//pole s parametry
		$params = [$id];
		//dotaz spustim
		$query->execute($params);
		//Vytahnu si login
		$login = $query->fetchColumn(0);
		//a vratim ho zpet
		return $login;
	}
?>
