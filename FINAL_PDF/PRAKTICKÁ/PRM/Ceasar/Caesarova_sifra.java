package FinalMaturitaCodes._Ceasar;


public class Caesarova_sifra{

	public static int sifruj(int znak, int posun){
		if((znak >= 'A') && (znak <= 'Z')) {
			znak = (((znak - 'A') + posun) % 26) + 'A';
		}
		if((znak >= 'a') && (znak <= 'z')) {
			znak = (((znak - 'a') + posun) % 26) + 'a';
		}
		return znak;
	}

	public static int desifruj(int znak, int posun){
		if((znak >= 'A') && (znak <= 'Z')) {
			znak = (((znak - 'A') + (26 - posun)) % 26) + 'A';
		}
		if((znak >= 'a') && (znak <= 'z')) {
			znak = (((znak - 'a') + (26 - posun)) % 26) + 'a';
		}
		return znak;
	}
}
