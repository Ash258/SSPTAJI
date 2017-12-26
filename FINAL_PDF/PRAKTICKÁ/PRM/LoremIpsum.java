package FinalMaturitaCodes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ""
 * @version 1.0
 */
public class _LoremIpsum{

    /**
     * Metoda, ktera slouzi pro pole ktera bude zadavat uzivatel
     */
    private static final Scanner sc = new Scanner(System.in);
    
    /**
     * Metoda pro generovani odstavcu
     * @param slovnik ArrayList kde jsou ulozena slova ze kterych se bude generovat
     * @param wordCount Zada se kolik slov bude obsahovat veta
     * @param sentenceCount Zada se kolik vet bude obsahovat odstavec
     * @return vraci odstavec
     */
    public static String GenerujOdstavec (ArrayList<String> slovnik, int wordCount, int sentenceCount) {
        String paragraph = "";
        String sentence = "";
        for (int i = 0; i < sentenceCount-1; i++) {
            sentence = GenerujVetu(slovnik, wordCount);
            paragraph += sentence + " ";
        }
        sentence = GenerujVetu(slovnik, wordCount);
        paragraph += sentence + "\n";
        return paragraph;
    }
    
    /**
     * Metoda pro generovani vet
     * @param slovnik ArrayList kde jsou ulozena slova ze kterych se bude generovat
     * @param wordCount Zada se kolik slov bude obsahovat veta
     * @return Vraci vygenerovanou vetu
     */
    public static String GenerujVetu(ArrayList<String> slovnik, int wordCount) {
        String sentence = "";
        String word;
        String nahWord = GenerujSlovo(slovnik);
        word = Character.toUpperCase(nahWord.charAt(0)) + nahWord.substring(1);
        sentence += word + " ";
        
        for (int i = 0; i < wordCount-2; i++) {
            nahWord = GenerujSlovo(slovnik);
            sentence += nahWord + " ";
        }
        sentence += GenerujSlovo(slovnik)+ ".";
        return sentence;
    }
    
    /**
     * Metoda pro generovani slov
     * @param slovnik ArrayList kde jsou ulozena slova ze kterych se bude generovat
     * @return vraci vygenerovane slovo 
     */
    public static String GenerujSlovo(ArrayList<String> slovnik) {
        Random rd = new Random();
        int rozsah = rd.nextInt(slovnik.size());
        String word = slovnik.get(rozsah); 
        return word;
    }
    
    /**
     * main
     * <ul>
     * <li>nacte soubor se slovy</li>
     * <li>cte radky a uklada do Arraylistu</li>
     * <li>uzivatel zada jmeno souboru do ktereho se budou vypisovat slova, vety nebo odstavce</li>
     * <li>nasledne uzivatel zada jestli chce vypsat slova, vety nebo odstavce - reseno pomoci switche</li>
     * <li>Zobrazi vysledek do konzole a zapise do souboru</li>
     * </ul>
     * @param args parametry z prikazove radky
     * @throws FileNotFoundException vyhodi v pripade pokud vstupni soubor neexistuje
     * @throws IOException vyhodi v pripade ze nastane chyba v souboru
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //cesta k souboru kde je ulozeny slovnik
        File vstupni = new File("LoremIpsum.txt");
        
        //pokud vstupni soubor existuje
        if(vstupni.exists()) {
            BufferedReader br = new BufferedReader(new FileReader(vstupni));
            ArrayList<String> slovnik = new ArrayList();
            
            //dokud ma co cist
            while(br.ready()) {
                //precte a ulozi do promenne prectu
                String prectu = br.readLine();
                //prida do slovniku
                slovnik.add(prectu);
            }
            br.close();
            System.out.println("Zadej jmeno vystupniho souboru");
            //uzivatel zada jmeno vystupniho souboru
            File vystupni = new File(sc.nextLine());
            FileWriter fw = new FileWriter(vystupni);
            
            System.out.println("Vyberte jednu z nabizenych moznosti");
            System.out.println("Vlozte 1 pro vypsani slov");
            System.out.println("Vlozte 2 pro vypsani vet");
            System.out.println("Vlozte 3 pro vypsani odstavcu");
            
            //promenne ktere jsou potreba pro generovani slov, vet a odstavcu
            int pocetSlov, pocetVet, pocetSlovVeVete, pocetOdstavcu;
            String vystup = "";
            //uzivatel zada co chce vygenerovat
            int zadanaMoznost = sc.nextInt();
            System.out.println("Vybral jsi: ");
            switch(zadanaMoznost) {
                //vybral 1. moznost 
                case 1:
                    System.out.println("VYPSANI SLOV");
                    System.out.println("Zadejte kolik slov chcete vypsat");
                    pocetSlov = sc.nextInt();
                    
                    for (int i = 0; i < pocetSlov; i++) {
                        vystup += GenerujSlovo(slovnik) + " ";
                    }
                    System.out.println(vystup);
                    fw.write(vystup);
                    fw.close();
                    break;
                //vybral 2. moznost 
                case 2:
                    System.out.println("VYPSANI VET");
                    System.out.println("Zadejte kolik vet chcete vypsat");
                    pocetVet = sc.nextInt();
                    System.out.println("Zadejte kolik slov bude mit veta");
                    pocetSlovVeVete = sc.nextInt();
                    for (int i = 0; i < pocetVet; i++) {
                        vystup += GenerujVetu(slovnik, pocetSlovVeVete) + " ";
                    }
                    System.out.println(vystup);
                    fw.write(vystup);
                    fw.close();
                    break;
                //vybral 3. moznost 
                case 3:
                    System.out.println("VYPSANI ODSTAVCU");
                    System.out.println("Zadejte kolik chcete vypsat odstavcu");
                    pocetOdstavcu = sc.nextInt();
                    System.out.println("Zadejte kolik vet bude obsahovat odstavec");
                    pocetVet = sc.nextInt();
                    System.out.println("Zadejte kolik slov bude obsahovat veta");
                    pocetSlov = sc.nextInt();
                    for (int i = 0; i < pocetOdstavcu; i++) {
                        vystup += GenerujOdstavec(slovnik, pocetSlov, pocetVet);
                    }
                    System.out.println(vystup);
                    fw.write(vystup);
                    fw.close();
                    break;
            }
        } else {
            //pokud soubor neexistuje
            System.err.println("Vstupni soubor nenalezen.");
        }
    }
}