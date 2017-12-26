package FinalMaturitaCodes._Morseovka;

public class MorseToText{
	/**
	 *  Pole znaků
	 */
	public static final char   chars[]   = {'?', ' ', 'E', 'T', 'I', 'A', 'N', 'M', 'S', 'U', 'R', 'W', 'D', 'K', 'G',
			'O', 'H', 'V', 'F', '?', 'L', '?', 'P', 'J', 'B', 'X', 'C', 'Y', 'Z', 'Q'};
	public static       String morseText = "./../...//.--/.-/...//...././.-././";

	/**
	 *  Metoda pro převod morseovky do textu
	 * @param morse String s morseovkou
	 * @param array Pole znaků pro přeložení
	 * @return Přeložený string
	 */
	public static String morseToText(String morse, char[] array){
		String finalStr = "";
		int    position = 1;
		for(int i = 0; i < morse.length(); i++) {
			char character = morse.charAt(i);
			switch(character) {
				case '.':
					position = position * 2;
					break;
				case '-':
					position = position * 2 + 1;
					break;
				case '/':
					finalStr += chars[position];
					position = 1;
					break;
			}
		}
		finalStr += chars[position];
		return finalStr;
	}
}