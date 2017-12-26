/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalMaturitaCodes.Chess;

import java.io.IOException;
import java.util.Map;

import static FinalMaturitaCodes.Chess.Chess.isPositionsAndFiguresInMapValid;
import static FinalMaturitaCodes.Chess.FileManager.loadSourceDataToMap;
import static FinalMaturitaCodes.Chess.FileManager.writeResultsToFile;

/**
 * @author Tomas Vondracek
 */
public class Main{

	public static void main(String[] args) throws IOException{
		Map<String, String> loadedMap = loadSourceDataToMap("chessPositions.txt");
		if(isPositionsAndFiguresInMapValid(loadedMap)) {
			Chess                ch  = new Chess();
			Map<Integer, String> map = ch.replacePositionsByNumber(loadedMap);
			//System.out.println(maptoString(map));
			ch.fillArray(map);
			ch.printArray();
			writeResultsToFile("chessRendered.txt", Chess.maptoString(map), ch.arrayToString());
		}
	}
}
