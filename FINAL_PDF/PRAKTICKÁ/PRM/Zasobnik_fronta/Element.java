package FinalMaturitaCodes._Zasobnik_fronta;

/**
 * Třída představující prvek fronty (zásobníku)
 */
public class Element{
	/** Nesená hodnota */
	private int     value;
	/** Reference na další prvek */
	private Element next;

	/**
	 * Konstruktor prvku Další prvek neexistuje --> this.next = null
	 *
	 * @param value Nesená hodnota
	 */
	public Element(int value){
		this.value = value;
		this.next = null;
	}

	/**
	 * Getter na nesenou hodnotu
	 *
	 * @return Nesenou hodnotu
	 */
	public int getValue(){
		return this.value;
	}

	/**
	 * Setter na nesenou hodnotu
	 *
	 * @param value Nová nesená hodnota
	 */
	public void setValue(int value){
		this.value = value;
	}

	/**
	 * Getter na další prvek
	 *
	 * @return Další prvek ve frontě (zásobníku)
	 */
	public Element getNext(){
		return this.next;
	}

	/**
	 * Setter na další prvek
	 *
	 * @param next Další prvek
	 */
	public void setNext(Element next){
		this.next = next;
	}
}
