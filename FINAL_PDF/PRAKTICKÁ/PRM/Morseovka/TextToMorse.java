package FinalMaturitaCodes._Morseovka;

public class TextToMorse{
	/**
	 * Pole znaků v morseové abecedě
	 */
	public static final String morse[]         = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
			"....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
			"--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
			"-.--", "--..", ".----", "..---", "...--", "....-", ".....",
			"-....", "--...", "---..", "----.", "-----", "|"};
	public static       String textToTranslate = "EIS WAS HERE";

	/**
	 * Metoda pro překlad textu do morseovy abecedy
	 *
	 * @param text Text s normálním textem
	 * @param array Pole znaků morseovy abecedy
	 *
	 * @return Přeložený string
	 */
	public static String transleText(String text, String[] array){
		String finalSt = "";
		for(int i = 0; i < text.length(); i++) {
			char znak = text.charAt(i);
			//Malá písmena
			if((znak >= 'a') && (znak <= 'z')) {
				finalSt += (morse[znak - 'a']);
			}
			if((znak >= 'A') && (znak <= 'Z')) {
				//Velká písmena
				finalSt += (morse[znak - 'A']);
			}
			finalSt += '/';
		}
		finalSt += '/';
		return finalSt;
	}
}