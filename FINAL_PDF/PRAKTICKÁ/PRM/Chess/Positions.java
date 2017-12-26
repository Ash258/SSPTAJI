/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalMaturitaCodes.Chess;

/**
 * @author Tomas Vondracek
 */
enum Positions{

	a(1), b(2), c(3), d(4), e(5), f(6), g(7), h(8);

	private int position;

	private Positions(int position){
		this.position = position;
	}

	/**
	 * @return Enum position by initialized enum
	 */
	public int getPosition(){
		return position;
	}

	/**
	 * @param pos String Enum value
	 *
	 * @return int position of give String, which present Enum value
	 */
	public static int getEnumPositionByString(String pos){
		for(Positions p : Positions.values()) {
			if(p.toString().equals(pos)) return p.getPosition();
		}
		return 0;
	}

	/**
	 * REDUNDANT :))
	 *
	 * @param value int identifier of declared Enum Position
	 *
	 * @return Enum by its indentifier, null if does not exists
	 */
	public static Positions getEnum(int value){
		for(Positions p : Positions.values()) {
			if(p.getPosition() == value) return p;
		}
		return null;
	}

}

enum Figures{
	King,
	LadyPillow,
	Shooter,
	Giraffe,
	Tower,
	Pingl;

	/**
	 * @param figure String name of figure
	 *
	 * @return true if String name matches declared Enum, false otherwise
	 */
	public static boolean isMatch(String figure){
		for(Figures f : Figures.values()) {
			if(f.toString().equals(figure)) return true;
		}
		return false;
	}
}
