package FinalMaturitaCodes._Zasobnik_fronta;

/**
 * Třída představující Zásobník
 */
public class Stack{
	/** První prvek zásobníku */
	private Element top;

	/** Konstruktor prázdného zásobníku */
	public Stack(){
		this.top = null;
	}

	/**
	 * Test na prázdnost
	 *
	 * @return true Pokud je fronta prázdná
	 */
	public boolean isEmpty(){
		if(this.top == null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Kontrola nejvyššího prvku
	 *
	 * @return Aktuální nejvyšší prvek
	 */
	public Element top(){
		if(this.isEmpty()) {
			throw new NullPointerException("Zasobnik je prazdny");
		} else {
			return this.top;
		}
	}

	/**
	 * Přidání hodnoty na začátek zásobníku
	 *
	 * @param e Přidávaný prvek
	 */
	public void push(Element e){
		e.setNext(this.top);
		this.top = e;
	}

	/**
	 * Odebrání nejvyššího prvku
	 *
	 * @return Odebíraný prvek
	 */
	public Element pop(){
		if(this.isEmpty()) {
			throw new NullPointerException("Zasobnik je prazdny");
		} else {
			Element tmp = this.top;
			this.top = tmp.getNext();
			tmp.setNext(null);
			return tmp;
		}
	}

	/**
	 * Metoda pro vyhledávní v zásobníku
	 *
	 * @param value Hodnota, která se má najít v zásobníku
	 *
	 * @return true Pokud se daná hodnota nachází v zásobníku
	 */
	public boolean search(int value){
		for(Element tmp = this.top; tmp != null; tmp = tmp.getNext()) {
			if(tmp.getValue() == value) {
				return true;
			}
		}
		return false;
	}
}