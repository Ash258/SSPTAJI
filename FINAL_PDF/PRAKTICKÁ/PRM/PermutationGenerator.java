package FinalMaturitaCodes;

import java.util.Random;

/**
 * Created by Ash258 on 03.04.2016.
 */
public class _PermutationGenerator{

	public static int permutation[];
	public static int maximum;
	Random rd = new Random();

	/**
	 * Konstruktor permutace.
	 *
	 * @param maximum Maximální velikost pole.
	 */
	public _PermutationGenerator(int maximum){
		permutation = new int[maximum];
	}

	/**
	 * Otestuje, zda se prvek nachází v poli.
	 *
	 * @param search Hledaný prvek.
	 * @param max Maximimální počet prvků.
	 *
	 * @return true Prvek se nachází v poli.
	 */
	private boolean isIn(int search, int max){
		for(int i = 0; i < max; i++) {
			if(permutation[i] == search) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Generování permutací pomocí hrubé síly
	 */
	public void bruteForce(){
		/** Číslo pro generování */
		int number;
		for(int i = 0; i < permutation.length; i++) {
			do {
				/** Generuj náhodný prvek */
				number = rd.nextInt(permutation.length) + 1;
				/** Opakuj dokud se prvek nachází v poli */
			} while(isIn(number, i));
			/** Prvek, který není v poli --> do pole*/
			permutation[i] = number;
		}
	}

	/**
	 * Generování permutací pomocí pole výskytů.
	 */
	public void memoryForce(){
		/** Pole výskutů */
		boolean presence[] = new boolean[permutation.length];
		/** Číslo pro generování */
		int number;
		for(int i = 0; i < permutation.length; i++) {
			do {
				/** Generuj prvek */
				number = rd.nextInt(permutation.length);
				/** Opakuj dokud se prvek ještě nevyskytuje */
			} while(presence[number]);
			/** Označ prvek jako true */
			presence[number] = true;
			/** Ulož ho do permutace */
			permutation[i] = number + 1;
		}
	}

	/** Generování permutací pomocí dvou průchodového algoritmu */
	public void twoPasses(){
		/** Vyplnění posloupnosti */
		for(int i = 0; i < permutation.length; i++) {
			permutation[i] = i + 1;
		}
		Random rd = new Random();
		for(int i = 0; i < permutation.length; i++) {
			/** Generování náhodné pozice */
			int position = rd.nextInt(permutation.length);
			/** Prohození prvků */
			int tmp = permutation[i];
			permutation[i] = permutation[position];
			permutation[position] = tmp;
		}
	}

	@Override
	public String toString(){
		String vysl = "[";
		for(int i = 0; i < permutation.length; i++) {
			vysl += permutation[i] + ", ";
		}
		vysl += "]";
		return vysl;
	}

	/**
	 * "Chrlič". Rekurzivní generátor permutací.
	 *
	 * @param s Vzor.
	 *
	 * @return Vygenerovaný řetězec.
	 */
	public static String generate(String s){
		/** Úroveň zanoření */
		int level = 0;
		/** Jezdci */
		int    l        = 0, r;
		String finalStr = "";
		for(r = 0; r < s.length(); r++) {
			boolean condition1 = "0123456789;".contains(String.valueOf(s.charAt(r)));
			if(condition1) {
				if(s.charAt(r) == ';') {
					level--;
					if(level == 0) {
						int condition = Integer.valueOf(String.valueOf(s.charAt(l)));
						for(int i = 0; i < condition; i++) {
							finalStr += generate(s.substring(l + 1, r));
						}
					}
				} else {
					if(level == 0) {
						l = r;
					}
					level++;
				}
			} else {
				if(level == 0) {
					finalStr += s.charAt(r);
				}
			}
		}
		finalStr += " ";
		return finalStr;
	}

	public static void main(String args[]){
		_PermutationGenerator test = new _PermutationGenerator(255);
		System.out.println(test);
		test.twoPasses();
		System.out.println(test);
		/*
		System.out.println(generate("32ab;c;").length());
		System.out.println(generate("2a;"));
		System.out.println(generate("32ab;c;"));
		System.out.format("Test %03d", 46);
		*/
	}
}