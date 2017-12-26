package FinalMaturitaCodes.Chess.Aisik;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Pavlos
 */
public class Chess{
	//napr B4
	protected String pozice;
	//napr Jezdec
	protected String figurka;

	public Chess(String pozice, String figurka){
		this.pozice = pozice;
		this.figurka = figurka;
	}

	public static void nacti(ArrayList<Chess> list){
		Scanner sc = new Scanner(System.in);
		//nacteni vstupniho souboru
		System.out.println("Zadejte název vstupního souboru!");
		String nazev = sc.next();
		File   vstup = new File(nazev);
		try {
			//prirazeni souboru scanneru
			sc = new Scanner(vstup);
		} catch(FileNotFoundException e) {
			System.out.println("Vstupní soubor nenalezen");
			System.exit(0);
		}
		while(sc.hasNext()) {
			//nacteni radku
			String nacti = sc.next();
			//pridani do stringbuilderu
			StringBuilder sb = new StringBuilder(nacti);
			//pozice jsou posledni dva znaky
			String pozice = sb.substring(sb.length() - 2);
			//figurka jsou znaky od zacatku az po delku stringu -3
			sb.delete(sb.length() - 3, sb.length());
			String figurkaNact = sb.toString();
			//predani do instance a do listu
			Chess figurka = new Chess(pozice, figurkaNact);
			list.add(figurka);
		}
	}

	public static void vypisSachovnici(char[][] sachovnice){
		int j = 0;
		for(int i = 0; i < 8; i++) {
			while(j != 8) {
				System.out.print(sachovnice[i][j] + " ");
				j++;
			}
			System.out.println("");
			j = 0;
		}
	}

	//vygeneruje prazdnou sachovnici
	public static void generujSachovnici(char[][] sachovnice){
		int posun   = 1;
		int i       = 1;
		int counter = 0;
		int j       = 0;
		while(counter != 64) {
			if((i % 9) == 0) {
				i = 1;
				j++;
				posun++;
			} else {
				if((posun % 2) == 0) {
					char znak = '\u25A0';
					sachovnice[j][i - 1] = znak;
					counter++;
				} else {
					char znak = '\u2610';
					sachovnice[j][i - 1] = znak;
					counter++;
				}
				i++;
				posun++;
			}
		}
	}

	public static void rozkodovani(ArrayList<Chess> figurky, char[][] sachovnice){
		//vygenerovani nove sachovnice
		generujSachovnici(sachovnice);
		//jed dokud nedojdou figurky
		for(int i = 0; i < figurky.size(); i++) {
			//vytahni si figurku
			Chess pom = figurky.get(i);
			//rada je 2. znak z pozice
			int rada = Integer.parseInt(pom.pozice.substring(1));
			//musim radu otocit, protoze rada 1 se do pole zapisuje jako 8
			rada = 8 - rada;
			//sloupec je 1. znak z pozice
			String sloupecPom = pom.pozice.substring(0, 1);
			//predam sloupec enumu, kterej ho premeni na cislo, kvuli zapisu do array
			Pozice sloupecE = Pozice.valueOf(sloupecPom);
			int    sloupec  = sloupecE.ordinal();
			//vytahnu si nazev figurky, ktery predam enumu a ten to zmeni na znak
			String  figurkaPom = pom.figurka;
			Figurka figurkaA   = Figurka.valueOf(figurkaPom);
			char    figurka    = figurkaA.getTyp();
			//zapisu do pole
			sachovnice[rada][sloupec] = figurka;
		}
		System.out.println("");
	}

	public static void zapisDoSouboru(char[][] sachovnice){
		//to same jako zapis, akorat si to ukladam do stringu
		String zapis = "";
		int    j     = 0;
		for(int i = 0; i < 8; i++) {
			while(j != 8) {
				zapis += sachovnice[i][j] + " ";
				j++;
			}
			zapis += "\r\n";
			j = 0;
		}
		//nacteni vystupniho osuboru
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadejte nazev vystupniho souboru!");
		String vyst   = sc.next();
		File   vystup = new File(vyst);
		//jestli uz exituje, tak ho prepis
		if(vystup.exists()) {
			vystup.delete();
			System.out.println("Vystupní soubor byl přepsán");
		}
		//zapis do souboru String s sachovnici
		try {
			FileWriter fw = new FileWriter(vystup);
			fw.write(zapis);
			fw.close();
		} catch(IOException e) {
			System.out.println("CHYBA!");
		}
	}

	public static void main(String[] args){
		//vytvoreni listu, kde budu uchovavat figurky
		ArrayList<Chess> figurky = new ArrayList();
		//pole s sachovnici
		char[][] sachovnice = new char[8][8];
		nacti(figurky);
		rozkodovani(figurky, sachovnice);
		vypisSachovnici(sachovnice);
		zapisDoSouboru(sachovnice);
	}
}

