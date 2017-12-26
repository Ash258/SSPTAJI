package FinalMaturitaCodes._Cetnost;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Program, ktery zjisti kolik jakych znaku bylo v zadane vete(popr. vetach) a vypise tyto udaje do MS Excel.
 *
 * @author Ondry
 */
public class Cetnostznakudoxls{

	public static File             vystup;
	public static ArrayList<Znaky> ALznaky;

	/**
	 * Metoda, ktera zpracovava vetu a pripravi znaky k vypsani do .xls souboru.
	 *
	 * @param veta Je zadana veta nebo vice vet, zadava se do konzole.
	 */
	public static void Proces(String veta){
		char vetapole[] = veta.toCharArray();
		ALznaky = new ArrayList<>();
		for(int i = 0; i < vetapole.length; i++) {
			char pismeno = vetapole[i];
			if(ALznaky.contains(new Znaky(pismeno, 1))) {
				for(int j = 0; j < ALznaky.size(); j++) {
					Znaky hledany = ALznaky.get(j);
					if(hledany.equals(new Znaky(pismeno, 1))) {
						hledany.setPocet(hledany.getPocet() + 1);
					}
				}
			} else {
				Znaky pridej = new Znaky(pismeno, 1);
				ALznaky.add(pridej);
			}
		}
	}

	/**
	 * Metoda ktery seradi ArrayList podle abecedy, ve kterem jsou jednotlive znaky a jejich cetnosti.
	 */
	public static void Serazeni(){
		Collections.sort(ALznaky, new Comparator<Znaky>(){
			public int compare(Znaky znak1, Znaky znak2){
				return Character.toString(znak1.getNazevznaku()).compareTo(Character.toString(znak2.getNazevznaku()));
			}
		});
	}

	/**
	 * Metoda, ktera vypise obsah ArrayListu do souboru .xls
	 */
	public static void VypisExcel(){
		vystup = new File("vystup.xls");
		try {
			FileWriter fw = new FileWriter(vystup);
			fw.write("Znak\t_Cetnost znaku\r\n");
			for(Znaky c : ALznaky) {
				if(c.getNazevznaku() == ' ') {
					fw.write("mezera\t" + c.getPocet() + "x\r\n");
				} else {
					fw.write(c.getNazevznaku() + "\t" + c.getPocet() + "x \r\n");
				}
			}
			fw.close();
		} catch(Exception e) {
			System.err.println("Nelze, prvne zavrete vystupni soubor!");
		}
	}

	public static void main(String[] args) throws IOException{
		System.out.println("Zadejte větu");
		Scanner sc   = new Scanner(System.in);
		String  veta = sc.nextLine();
		Proces(veta);
		Serazeni();
		VypisExcel();
	}
}
