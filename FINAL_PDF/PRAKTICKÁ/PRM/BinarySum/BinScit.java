package FinalMaturitaCodes._BinarySum;

//Vrací čísla naopak

/**
 * Vypisuje pozpátku. Je potřeba upravit. Veškeré souty předělat --> string += cosi --> potom to obrátit
 */
public class BinScit{
	private Stavy aktualniStav;

	public BinScit(){
		this.aktualniStav = Stavy.bezPrenosu;
	}

	public void analyze(String vstup){
		switch(aktualniStav) {
			case bezPrenosu:
				switch(vstup) {
					case "00":
						System.out.print("0");
						break;
					case "10":
					case "01":
						System.out.print("1");
						break;
					case "11":
						System.out.print("0");
						this.aktualniStav = Stavy.sPrenosem;
						break;
					case "__":
						System.out.println();
						this.aktualniStav = Stavy.konec;
						break;
					default:
						this.aktualniStav = Stavy.chyba;
						break;
				}
				break;
			case sPrenosem:
				switch(vstup) {
					case "00":
						System.out.print("1");
						this.aktualniStav = Stavy.bezPrenosu;
						break;
					case "10":
					case "01":
						System.out.print("0");
						break;
					case "11":
						System.out.print("1");
						break;
					case "__":
						System.out.println("1");
						this.aktualniStav = Stavy.konec;
						break;
					default:
						this.aktualniStav = Stavy.chyba;
						break;
				}
				break;
			case konec:
				break;
			case chyba:
				break;
		}
	}

	public Stavy getAktualniStav(){
		return aktualniStav;
	}

	public static void main(String[] args){
		//testovaci retezce
		String ret1 = "_010101111110101010";
		String ret2 = "_011001100101011010";
		//konecny automat
		BinScit bs = new BinScit();
		//analyza retezce
		for(int i = ret1.length() - 1; i >= 0; i--) {
			String dvojRet = Character.toString(ret1.charAt(i)) +
					Character.toString(ret2.charAt(i));
			bs.analyze(dvojRet);
		}
		//test konce
		if(bs.getAktualniStav() != Stavy.konec) {
			System.out.println("Chyba na vstupu");
		}
	}
}
