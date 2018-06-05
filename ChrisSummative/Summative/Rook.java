package TheNewICS4UR.Summative;

public class Rook extends Queen { // The Rook inherits the Queen's Movement Abilities
    private static final String NAME = "Rook"; // The name given to all instances of the Rook

    public Rook(boolean isBlack) {
        // The constructor of the Rook will call its super class constructor
        super(isBlack, NAME);
    }
}

