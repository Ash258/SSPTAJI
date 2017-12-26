package FinalMaturitaCodes._Zasobnik_fronta;

/**
 * Třída představující Frontu Přidávání = konec fronty Odebírání = začátek fronty
 */
public class Queue{
	/** První element */
	private Element first;
	/** Poslení element */
	private Element last;

	/** Konstruktor prázdné fronty */
	public Queue(){
		this.first = null;
		this.last = null;
	}

	/**
	 * Metoda pro zjištění, zda je fronta prázdná
	 *
	 * @return true Pokud je fronta prázdná
	 */
	public boolean isEmpty(){
		if((this.first == null) && (this.last == null)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * "Getter" na první prvek
	 *
	 * @return První prvek fronty
	 */
	public Element first(){
		if(this.isEmpty()) {
			throw new NullPointerException("Fronta je prazdna");
		} else {
			return this.first;
		}
	}

	/**
	 * Getter na poslední prvek fronty
	 *
	 * @return Poslední prvek fronty
	 */
	public Element last(){
		if(this.isEmpty()) {
			throw new NullPointerException("Fronta je prazdna");
		} else {
			return this.last;
		}
	}

	/**
	 * Metoda pro přidání prvku na konec fronty
	 *
	 * @param e Nový prvek
	 */
	public void add(Element e){
		if(this.isEmpty()) {
			this.first = e;
		} else {
			this.last.setNext(e);
		}
		this.last = e;
	}

	/**
	 * Metoda pro přidání prvku na začátek fronty
	 *
	 * @param e Přidávaný prvek
	 */
	public void priorityAdd(Element e){
		if(this.isEmpty()) {
			this.first = e;
		} else {
			e.setNext(this.first);
			this.first = e;
		}
	}

	/**
	 * Metoda pro odebírání prvního prvku fronty
	 *
	 * @return Odebraný prvek
	 */
	public Element remove(){
		if(this.isEmpty()) {
			throw new NullPointerException("Fronta je prazdna");
		} else {
			Element tmp = this.first;
			//Nejprve presmerujeme first
			this.first = this.first.getNext();
			//kontrola
			if(this.first == null) {
				//odebirame posledni prvek
				this.last = null;
			}
			return tmp;
		}
	}
}