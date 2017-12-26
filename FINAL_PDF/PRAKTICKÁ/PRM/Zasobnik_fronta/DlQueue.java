package FinalMaturitaCodes._Zasobnik_fronta;

/**
 * Třída představující Double Link Queue
 */
public class DlQueue{
	/** První prvek fronty */
	private DlElement first;
	/** Poslední prvek fronty */
	private DlElement last;

	/**
	 * Vytvoří prázdnou frontu
	 */
	public DlQueue(){
		this.first = null;
		this.last = null;
	}

	/**
	 * Test na prázdnost fronty
	 *
	 * @return true Pokud je fronta prázdnas
	 */
	public boolean isEmpty(){
		if((this.first == null) && (this.last == null)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * "Getter" na první prvek fronty
	 *
	 * @return Vrátí první prvek fronty
	 *
	 * @throws NullPointerException Je vyhozena pokud je fronta prázdná
	 */
	public DlElement first(){
		if(this.isEmpty()) {
			throw new NullPointerException("Fronta je prazdna");
		} else {
			return this.first;
		}
	}

	/**
	 * "Getter" na poslední prvek fronty
	 *
	 * @return Vrátí poslední prvek fronty
	 *
	 * @throws NullPointerException Je vyhozena pokud je fronta prázdná
	 */
	public DlElement last(){
		if(this.isEmpty()) {
			throw new NullPointerException("Fronta je prazdna");
		} else {
			return this.last;
		}
	}

	/**
	 * Metoda pro přidání prvku na konec fronty
	 *
	 * @param e Přidávaný prvek
	 */
	public void add(DlElement e){
		if(this.isEmpty()) {
			this.first = e;
		} else {
			this.last.setNext(e);
		}
		e.setPrev(this.last);
		this.last = e;
	}

	/**
	 * Metoda pro odebrání prvního prvku fronty
	 *
	 * @return Odebíraný prvek
	 */
	public DlElement remove(){
		if(this.isEmpty()) {
			throw new NullPointerException("Fronta je prazdna");
		} else {
			DlElement tmp = this.first;
			this.first = this.first.getNext();
			if(this.first == null) {
				this.last = null;
			} else {
				tmp.setNext(null);
				this.first.setPrev(null);
			}
			return tmp;
		}
	}

	/**
	 * Vyhledávání zadaného prvku
	 *
	 * @param value Hledaná hodnota
	 *
	 * @return true Pokud hledaná hodnota je ve frotné
	 */
	public boolean search(int value){
		for(DlElement tmp = first; tmp != null; tmp = tmp.getNext()) {
			if(tmp.getValue() == value) {
				return true;
			}
		}
		return false;
	}
}