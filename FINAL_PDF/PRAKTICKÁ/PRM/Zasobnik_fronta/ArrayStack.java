package FinalMaturitaCodes._Zasobnik_fronta;

/**
 * Created by Ash258 on 05.04.2016.
 */

/**
 * Třída realizující zásobník pomocí array
 */
public class ArrayStack{
	/** Pole pro ukládání hodnot */
	private int array[];
	/** "Počítadlo" prvků v poli */
	private int top;
	/** Maximální velikost pole */
	private int max;

	public ArrayStack(int max){
		this.max = max;
		this.array = new int[max];
		this.top = 0;
	}

	/**
	 * Getter na maximální hodnotu
	 *
	 * @return Maximální hodnotu
	 */
	public int getMax(){
		return this.max;
	}

	/**
	 * Test na prázdnost
	 *
	 * @return true Pokud je zásobník prázdný
	 */
	public boolean isEmtpy(){
		if(this.top == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Test na plnost
	 *
	 * @return true Pokud je zásobník plný
	 */
	public boolean isFull(){
		if(this.top == this.max) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * "Getter" na nejvyšší prvek
	 *
	 * @return Aktuální nejvyšší prvek
	 *
	 * @throws ArrayIndexOutOfBoundsException Pokud je zásobník prázdný
	 */
	public int top(){
		if(this.isEmtpy()) {
			throw new ArrayIndexOutOfBoundsException("Zasobnik je prazdny");
		} else {
			return this.array[this.top - 1];
		}
	}

	//metoda pro ulozeni hodnoty

	/**
	 * Metoda pro přidání hodnoty na vrchol. Zvětšuje array pokud je plné ze 70%
	 *
	 * @param value Přidávaná hodnota
	 *
	 * @throws ArrayIndexOutOfBoundsException Pokud je zásobník plný
	 */
	public void push(int value){
		if(this.isFull()) {
			throw new ArrayIndexOutOfBoundsException("Zasobnik je plný");
		} else {
			this.array[this.top] = value;
			this.top++;
			if(this.top >= 0.7 * this.max) {
				this.enlarge();
			}
		}
	}

	/**
	 * Metoda pro odebrání nejvyššího prvku. Zmenšuje pokud je array plně ze 30%
	 *
	 * @return Odebraný prvek
	 */
	public int pop(){
		if(this.isEmtpy()) {
			throw new ArrayIndexOutOfBoundsException("Zasobnik je prazdny");
		} else {
			this.top--;
			if((this.top <= 0.3 * this.max) && (this.max / 2 >= 5)) {
				this.schrink();
			}
			return this.array[this.top];
		}
	}

	/**
	 * Metoda pro zdvojnásobení kapacity array
	 */
	public void enlarge(){
		int newArray[] = new int[this.array.length * 2];
		System.arraycopy(array, 0, newArray, 0, top);
		this.array = newArray;
		this.max *= 2;
	}

	/**
	 * Metoda pro zmenšení kapacity pole
	 */
	public void schrink(){
		int newArray[] = new int[this.array.length / 2];
		for(int i = 0; i < this.top; i++) {
			newArray[i] = this.array[i];
		}
		this.array = newArray;
		this.max /= 2;
	}
}
