package FinalMaturitaCodes.Chess;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Tomas Vondracek
 */
public class Chess {

    private String chessboard[][] = new String[8][8];

    /**
     * Validate positions and figures, positions between a1 - h-8 are valid and
     * also validate Figures name,which are declared in Figures enum class
     *
     * last validation parameter: on chessboard can be max 32 figures at the
     * time
     *
     * @param map to validate
     * @return true if map contains only valid positions and figures, false
     * otherwise
     */
    public static boolean isPositionsAndFiguresInMapValid(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().matches("([a-h]|[0-8]){2}") && Figures.isMatch(entry.getValue()) && map.size() <= 32) {
            } else {
                System.err.println(entry.getKey() + " " + entry.getValue() + " Does not MATCHES");
                return false;
            }
        }
        return true;
    }

    /**
     * replace String positions in map by numbers, because of requeired
     * numerical index in 2D array
     *
     * @param map which keys are repleaced with
     * @return map with numerical coordinates of figures
     */
    public Map<Integer, String> replacePositionsByNumber(Map<String, String> map) {
        Map<Integer, String> newMap = new TreeMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Integer replaced = Positions.getEnumPositionByString(entry.getKey().substring(0, 1));
            Integer newPosition = Integer.valueOf(String.valueOf(replaced) + entry.getKey().substring(1, 2));
            newMap.put(newPosition, entry.getValue());
        }
        return newMap;
    }

    /**
     *
     * @param map from which positions and figures name to be array filled
     */
    public void fillArray(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            chessboard[((key / 10) % 10) - 1][(key % 10) - 1] = entry.getValue();
        }
    }

    public void printArray() {
        for (String[] strings : chessboard) {
            System.out.println(" ");
            for (String string : strings) {
                System.out.print(string + " ");
            }
        }
    }

    public String arrayToString() {
        StringBuilder sb = new StringBuilder();
        for (String[] strings : chessboard) {
            sb.append("\n");
            for (String string : strings) {
                sb.append("").append(string).append(" ");
            }
        }
        return sb.toString();
    }

    /**
     *
     * @param map to be converted to String sequence
     * @return converted map in String
     */
    public static String maptoString(Map<Integer, String> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            sb.append("Figure: ").append(entry.getValue())
                    .append(" at ").append(entry.getKey()).append("\n");
        }
        return sb.toString();
    }

}
