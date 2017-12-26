package FinalMaturitaCodes;

import java.util.Scanner;

public class _VraceniPenezOdladeno{
	//pole s bankovkami
	public static int[] polebankovek = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
	public static int   polepoctu[]  = new int[polebankovek.length];

	public static void automat(int castka){
		for(int i = 0; i < polepoctu.length; i++) {
			polepoctu[i] = 0;
		}
		while(castka != 0) {
			for(int i = 0; i < polepoctu.length; i++) {
				while(castka >= polebankovek[i]) {
					castka -= polebankovek[i];
					polepoctu[i]++;
				}
			}
		}
		System.out.print("Vracene bankovky: \n");
		for(int i = 0; i < polepoctu.length; i++) {
			//výpis pouze daných bankovek
			if(polepoctu[i] == 0) {
			} else {
				System.out.println(polebankovek[i] + " - " + polepoctu[i]);
			}
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadejte castku pro vraceni(v celych korunach):");
		int castka2 = sc.nextInt();
		automat(castka2);
	}
}
