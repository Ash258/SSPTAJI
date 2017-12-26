/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalMaturitaCodes.Chess;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

/**
 *
 * @author Tomas Vondracek
 */
public class FileManager {

    /**
     *
     * @param fileName name of file, which contains chess coordinates
     * @return map with String positions and String name of Figures
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static Map<String, String> loadSourceDataToMap(String fileName) throws FileNotFoundException, IOException {
        Map<String, String> map = new TreeMap();
        Scanner sc = new Scanner(new BufferedReader(new FileReader(new File(fileName))));
        while (sc.hasNext()) {
            String[] line = sc.nextLine().split(":");
            map.put(line[1], line[0]);
        }
        sc.close();
        return map;
    }

    /**
     *
     * @param fileName firstParam is String name of created file
     * @param params String params to be written in created file
     * @throws IOException
     */
    public static void writeResultsToFile(String fileName, String... params) throws IOException {
        File file = createNewFile(fileName);
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for (String param : params) {
            bw.write(param);
            bw.newLine();
        }
        bw.close();
    }

    /**
     *
     * @param fileName String name for File
     * @return file, the actual created file
     */
    private static File createNewFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return file;
        } catch (IOException ex) {
            System.err.println("Can not create new " + file
                    + " because " + ex.getMessage());
        }
        return null;
    }

}
