/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalMaturitaCodes._Cetnost;

/**
 * @author Ondry
 */
public class Znaky{
	private final char nazevznaku;
	private       int  pocet;

	public Znaky(char nazevznaku, int pocet){
		this.nazevznaku = nazevznaku;
		this.pocet = pocet;
	}

	public char getNazevznaku(){
		return nazevznaku;
	}

	public int getPocet(){
		return pocet;
	}

	public void setPocet(int pocet){
		this.pocet = pocet;
	}

	@Override
	public boolean equals(Object object){
		boolean stejne = false;
		if(object != null && object instanceof Znaky) {
			stejne = this.nazevznaku == ((Znaky) object).nazevznaku;
		}
		return stejne;
	}
}
