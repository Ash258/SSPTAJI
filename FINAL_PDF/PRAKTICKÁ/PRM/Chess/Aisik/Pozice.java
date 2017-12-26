package FinalMaturitaCodes.Chess.Aisik;

/**
 *
 * @author Pavlos
 */
enum Pozice{
    A,
    B,
    C,
    D,
    E,
    F,
    G,
    H;
}

enum Figurka{
    Jezdec('\u2658'),
    Pesec('\u2659'),
    Vez('\u2656'),
    Strelec('\u2657'),
    Dama('\u2655'),
    Kral('\u2654');
    
    private char typ;

    private Figurka(char typ) {
        this.typ = typ;
    }         

    public char getTyp() {
        return typ;
    }
}
