package FinalMaturitaCodes;

import java.io.*;
import java.util.Scanner;

/**
 * Trida predstavujici Josephus problem - hra
 * @author 
 */
public class _Josephus{

    /**
     * <ul>
     * <li>nacte vstupni soubor</li>
     * <li>otevre vstupni soubor a hodnoty z nej ulozi do pole</li>
     * <li>do jednotlivych promennych ulozim honoty z pole</li>
     * <li>osetrim program podminkou</li>
     * <li>inicializace pole na všechny pravdive hodnoty</li>
     * <li>dokud nezbyde jediny zivy hrac tak hraju</li>
     * <li>vytvorim vystupni soubor</li>
     * <li>ulozim data do vystupniho souboru</li>
     * </ul>
     * @param args
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int pole[] = new int[3];
        /**
         * Nactu si nejaky soubor
         * otevru vstupni soubor
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte nazev vstupniho souboru: ");
        String jmenoSoub = sc.nextLine();
        File vstup = new File(jmenoSoub);
        if (vstup.exists() == true) {
            //soubor existuje
            FileReader fr = new FileReader(vstup);
            BufferedReader br = new BufferedReader(fr);
            int i = 0;
            //cti dokud mas co
            while (br.ready()) {
                String pom = br.readLine();
                int pom2 = Integer.parseInt(pom);
                pole[i] = pom2;
                i++;
            }
            br.close();
            fr.close();
        } else {
            System.out.println("Vstupni soubor neexistuje");
        }
        //pocet vojaku 
        int m = pole[0];
        //kolikaty zivy bude v kazdem kole popraven
        int n = pole[1];
        //pozice kterou sis vybral
        int p = pole[2];
        //chyba pozice nemuze byt vetsi nez pocet vojaku
        if (p > m) {
            System.out.println("Nemuzu si stoupnou na vetsi pozici nez je vojaku");
        } else {
            int jezdec = 0;
            int mrtvol = 0;

            boolean rotpole[] = new boolean[m];
            /**
             * 
             */
            for (int i = 0; i < rotpole.length; i++) {
                rotpole[i] = true; //inicializace pole na všechny hodnoty pravdivé - pravda se rovná živému člověku
            }
            jezdec = 0;
            mrtvol = 0;
            int index = 0; //cislo do ktereho ukladam zive

            while (rotpole.length != (mrtvol + 1)) {
                //opakuje dokud nezbyde jeden živý (v kazdem pruchodu je jeden popraven)
                while (index != (n - 1)) {
                    //while zajistujici prejeti na dalsiho k popraveni (prejede o pocet zadany na zacatku programu)
                    if (rotpole[jezdec]) {
                        jezdec++;
                        index++;
                        jezdec = jezdec % rotpole.length;
                    } else {
                        //preskoceni mrtvoly
                        jezdec++;
                        jezdec = jezdec % rotpole.length;
                    }
                }
                index = 0;

                if (rotpole[jezdec]) {
                    //kdyz je na jezdci na ktery jsme dojeli mrtvola tak ji preskocime na ziveho popravime dalsiho, kdyz je na jezdci zivy popravime ho
                    rotpole[jezdec] = false;//hrac je popraven
                    mrtvol++;
                } else {
                    while (!rotpole[jezdec]) {
                        //zajistuje prejeti na ziveho, ktery bude vzapeti popraven
                        jezdec++;
                        jezdec = jezdec % rotpole.length;
                    }

                    rotpole[jezdec] = false;//hrac je popraven                      
                    mrtvol++;
                }
            }

            int iprezivsiho = 0;//index prezivsiho
            while (!rotpole[iprezivsiho]) {
                iprezivsiho++;
            }

            Scanner ul = new Scanner(System.in);
            System.out.println("Zadejte nazev vystupniho souboru: ");
            String jmenoulSoub = ul.nextLine();
            //vytvorim vystupni soubor 
            File vystup = new File(jmenoulSoub);
            FileWriter fr = new FileWriter(vystup);
            //ulozim data do vystupniho souboru
            fr.write("Pocet vojaku je: " + m + System.lineSeparator());
            fr.write("Kolikaty zivy bude v kazdem kole popraven: " + n + System.lineSeparator());
            fr.write("Pozice kterou si hrac vybral: " + p + System.lineSeparator());
            fr.write(System.lineSeparator());
            fr.write("Nebude popraven clovek na " + (iprezivsiho + 1) + ". miste ." + System.lineSeparator());
            //if jestli hrac prezil
            if ((iprezivsiho + 1) == p) {
                fr.write("Hrac vyhral" + System.lineSeparator());
            } else {
                fr.write("Hrac prohral" + System.lineSeparator());
            }
            fr.close();

        }
    }
}