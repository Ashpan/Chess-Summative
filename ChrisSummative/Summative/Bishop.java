package TheNewICS4UR.Summative;

public class Bishop extends TheNewICS4UR.Summative.Queen { // The Bishop inherits the Queen's Movement Abilities
    private static final String NAME = "Bishop"; // The name given to all instances of the Bishop

    public Bishop(boolean isBlack) {
        // The constructor of the Bishop will call its super class constructor
        super(isBlack, NAME);
    }


}

