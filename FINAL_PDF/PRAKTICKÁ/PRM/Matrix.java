package FinalMaturitaCodes;
/**
 * Created by Ash258 on 05.04.2016.
 */

import java.util.Random;

/**
 * Třída představující matici
 */
public class _Matrix{
	/** Dvourozměrné pole - Matice */
	private int matrix[][];

	/**
	 * Vytvoření prázdné matice
	 *
	 * @param rows Počet řádků
	 * @param cols Počet sloupců
	 */
	public _Matrix(int rows, int cols){
		this.matrix = new int[rows][cols];
	}

	/**
	 * Getter na matici
	 *
	 * @return Matice
	 */
	public int[][] getMatrix(){
		return matrix;
	}

	/**
	 * Setter na matici
	 *
	 * @param matrix Matice
	 */
	public void setMatrix(int[][] matrix){
		this.matrix = matrix;
	}

	/**
	 * Naplnění matrixu náhdnými hodnotami
	 *
	 * @param max Maximální hodnota pro generování
	 */
	public void fillMatrix(int max){
		Random rd = new Random();
		for(int i = 0; i < this.matrix.length; i++) {
			for(int j = 0; j < this.matrix[i].length; j++) {
				this.matrix[i][j] = rd.nextInt(max);
			}
		}
	}

	/**
	 * Metoda pro sčítání matic. Matice lze sčítat pouze, pokud jsou matice stejné (stejný počet řádků a sloupců)
	 *
	 * @param b Matice, se kterou se má sečíst aktuální matice
	 *
	 * @return Výsledná matice
	 *
	 * @throws IllegalArgumentException Pokud jsou matice různé
	 */
	public _Matrix sumMatrix(_Matrix b){
		if((this.matrix.length != b.matrix.length) ||
				(this.matrix[0].length != b.matrix[0].length)) {
			throw new IllegalArgumentException("Matice musi byt stejne");
		}
		int result[][] = new int[this.matrix.length][this.matrix[0].length];
		/** Sčítání prvků na stejné pozici*/
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				result[i][j] = this.matrix[i][j] + b.matrix[i][j];
			}
		}
		/** Vytvoření objektu matice z dvourozměrného pole */
		_Matrix resMatrix = new _Matrix(result.length, result[0].length);
		resMatrix.setMatrix(result);
		return resMatrix;
	}

	/**
	 * Metoda pro odečítání matic. Matice lze odečítat pouze, pokud jsou matice stejné (stejný počet řádků a sloupců)
	 *
	 * @return Výslednou matici
	 *
	 * @throws IllegalArgumentException Pokud matice nejsou stejné
	 */
	public _Matrix diffMatrix(_Matrix b){
		if((this.matrix.length != b.matrix.length) ||
				(this.matrix[0].length != b.matrix[0].length)) {
			throw new IllegalArgumentException("Matice musi byt stejne");
		}
		int result[][] = new int[this.matrix.length][this.matrix[0].length];
		/** Rozdíl prvků na stejné pozici*/
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				result[i][j] = this.matrix[i][j] - b.matrix[i][j];
			}
		}
		/** Vytvoření objektu matice z dvourozměrného pole */
		_Matrix resMatrix = new _Matrix(result.length, result[0].length);
		resMatrix.setMatrix(result);
		return resMatrix;
	}

	/**
	 * Metoda pro násobení matic. Počet sloupců první matice musí být stejný jako počet řádků druhé matice!!
	 *
	 * @param b Matice, se kterou se má matice vynásobit
	 *
	 * @return Výsledná matice
	 *
	 * @throws IllegalArgumentException Pokud mají matice nesprávný rozměr
	 */
	public _Matrix multiplyMatrix(_Matrix b){
		if((this.matrix.length != b.matrix[0].length) ||
				(this.matrix[0].length != b.matrix.length)) {
			throw new IllegalArgumentException("Matice maji nespravny rozmer");
		}
		/** Vytvoření výsledné "matice" se správnými rozměry */
		int result[][] = new int[this.matrix.length][b.matrix[0].length];
		for(int i = 0; i < this.matrix.length; i++) {
			for(int j = 0; j < b.matrix[i].length; j++) {
				for(int k = 0; k < b.matrix.length; k++) {
					result[i][j] += (this.matrix[i][k] * b.matrix[k][j]);
				}
			}
		}
		_Matrix resMatrix = new _Matrix(result.length, result[0].length);
		resMatrix.setMatrix(result);
		return resMatrix;
	}

	/**
	 * Metoda pro vynásobení matice číslem
	 *
	 * @param number Číslo, kterým se má matice vynásobit
	 *
	 * @return Výsledná matice
	 */
	public _Matrix multiplyMatrixByNumber(int number){
		int result[][] = new int[this.matrix.length][this.matrix[0].length];
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				result[i][j] = this.matrix[i][j] * number;
			}
		}
		/** Vytvoření objektu matice z dvourozměrného pole */
		_Matrix resMatrix = new _Matrix(result.length, result[0].length);
		resMatrix.setMatrix(result);
		return resMatrix;
	}

	/**
	 * Metoda pro transponování matice
	 *
	 * @return Výsledná matice
	 */
	public _Matrix transposeMatrix(){
		int[][] temp = new int[this.matrix[0].length][this.matrix.length];
		for(int i = 0; i < this.matrix.length; i++) {
			for(int j = 0; j < this.matrix[0].length; j++) {
				temp[j][i] = this.matrix[i][j];
			}
		}
		_Matrix resMatrix = new _Matrix(temp.length, temp[0].length);
		resMatrix.setMatrix(temp);
		return resMatrix;
	}

	/**
	 * Výpis matice
	 *
	 * @return Výpis matice
	 */
	@Override
	public String toString(){
		String result = "";
		for(int i = 0; i < this.matrix.length; i++) {
			for(int j = 0; j < this.matrix[i].length; j++) {
				result += this.matrix[i][j] + "\t";
			}
			result += "\n";
		}
		return result;
	}

	public static void main(String[] args){
		_Matrix test  = new _Matrix(2, 2);
		_Matrix test2 = new _Matrix(2, 6);
		_Matrix test3 = new _Matrix(2, 2);
		test.fillMatrix(25);
		test2.fillMatrix(20);
		test3.fillMatrix(20);
		System.out.println(test.toString());
		System.out.println(test2.toString());
		System.out.println(test3.toString());
		//System.out.println(test.sumMatrix(test2).toString());
		//System.out.println(test.diffMatrix(test2));
		//System.out.println(test.multiplyMatrix(test3).toString());
		//System.out.println(test.multiplyMatrixByNumber(6));
		//System.out.println(test2.transposeMatrix().toString());
	}
}
