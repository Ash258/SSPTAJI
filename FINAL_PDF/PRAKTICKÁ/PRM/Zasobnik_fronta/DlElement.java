package FinalMaturitaCodes._Zasobnik_fronta;

/**
 * Třída představují Double Link Element
 */
public class DlElement{
	/** Nesená hodnota */
	private int value;

	/** Reference na předchozí prvek */
	private DlElement prev;

	/** Reference na následující prvek */
	private DlElement next;

	/**
	 * Vytvoří nový DlElement
	 *
	 * @param value Nesena hodnota
	 */
	public DlElement(int value){
		this.value = value;
		this.prev = null;
		this.next = null;
	}

	/**
	 * Getter na value
	 *
	 * @return Vrátí nesenou hodnotu
	 */
	public int getValue(){
		return value;
	}

	/**
	 * Setter na value
	 *
	 * @param value Nová hodnota
	 */
	public void setValue(int value){
		this.value = value;
	}

	/**
	 * Getter na prev
	 *
	 * @return vrati Předchůdce
	 */
	public DlElement getPrev(){
		return prev;
	}

	/**
	 * Setter na prev
	 *
	 * @param prev Nový predchůdce
	 */
	public void setPrev(DlElement prev){
		this.prev = prev;
	}

	/**
	 * Getter na next
	 *
	 * @return Vrátí následníka
	 */
	public DlElement getNext(){
		return next;
	}

	/**
	 * Setter na next
	 *
	 * @param next Nový následník
	 */
	public void setNext(DlElement next){
		this.next = next;
	}

	@Override
	public String toString(){
		return Integer.toString(value);
	}

	public static void main(String[] args){
		DlElement e1 = new DlElement(1);
		System.out.println(e1);
		DlElement e2 = new DlElement(2);
		e1.setNext(e2);
		e2.setPrev(e1);
		System.out.println(e1.getNext());
		System.out.println(e2.getPrev());
	}
}