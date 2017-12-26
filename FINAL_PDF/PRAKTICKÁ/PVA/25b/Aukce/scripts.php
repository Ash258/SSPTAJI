<?php
	/**
	 * Přihlášení uživatele
	 *
	 * @param $login Přihlašovací jmén uživatele
	 * @param $pass  Heslo uživatele
	 * @param $db    Databáze
	 *
	 * @return boolean TRUE Pokud se uživatel úspěšně přihlhásil
	 */
	function userLogin($login, $pass, $db)
	{
		try {
			$query  = $db->prepare("SELECT COUNT(*) FROM uziv WHERE uziv_login = ? AND uziv_heslo = ?");
			$params = [$login, $pass];
			$query->execute($params);
		} catch(PDOException $e) {
			die($e->getMessage());
		}
		/** Login a heslo jsou správné */
		if($query->fetchColumn(0) == 1) {
			session_regenerate_id();
			try {
				$query = $db->prepare("SELECT uziv_id FROM uziv WHERE uziv_login = ? AND uziv_heslo = ?");
			} catch(PDOException $e) {
				die($e->getMessage());
			}
			$query->execute($params);
			$id                     = $query->fetchColumn(0);
			$_SESSION[session_id()] = $id;
			return TRUE;
		} else {
			return FALSE;
		}
	}

	/**
	 * Je uživatel přihlášen?
	 * @return bool
	 */
	function isLoggedIn()
	{
		if(isset($_SESSION[session_id()])) {
			return TRUE;
		} else {
			return FALSE;
		}
	}

	/**
	 * Odhlášení uživatele
	 * @return boolean TRUE Pokud se odhlášení zdařilo
	 */
	function userLogout()
	{
		if(isLoggedIn()) {
			unset ($_SESSION[session_id()]);
			return TRUE;
		} else {
			return FALSE;
		}
	}

	/**
	 * Na základě ID zjistí login uživatele
	 *
	 * @param $id ID uživatele
	 * @param $db Databáze
	 *
	 * @return string Login uživatele
	 */
	function getUserLogin($id, $db)
	{
		try {
			$query = $db->prepare("SELECT uziv_login FROM uziv WHERE uziv_id = ?");
		} catch(PDOException $e) {
			die($e->getMessage());
		}
		$params = [$id];
		$query->execute($params);
		$login = $query->fetchColumn(0);
		return $login;
	}
?>
