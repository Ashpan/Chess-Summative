package TheNewICS4UR.Summative;

public class Knight extends Piece { // This Knight extends from the Piece class

    private static final String NAME = "Knight"; // The name given to all instances of the Knight

    public Knight(boolean isBlack) {
        // The constructor will call the constructor of the superclass
        super(isBlack, NAME);
    }

    public boolean canMoveInLShape(int originalX, int originalY, int translatedX, int translatedY) {
        // This function will return true or false whether the Knight is able to move in an L shape
        // This function takes the original location of the chess piece and the translated location of where the piece would like to move to
        // The following are the checks that the function looks for to determine whether the move is valid or not:
        // Top Right, Top Left, Left Mid Top, Left Mid Bottom, Right Mid Top, Right Mid Top, Right Mid Bottom, Bottom Left, Bottom Right
        if ((translatedX - originalX == 1 && originalY - translatedY == 2) || (originalX - translatedX == 1 && originalY - translatedY == 2) || (originalX - translatedX == 2 && originalY - translatedY == 1)
                || (originalX - translatedX == 2 && translatedY - originalY == 1) || (translatedX - originalX == 2 && originalY - translatedY == 1) || (translatedX - originalX == 2 && translatedY - originalY == 1) ||
                (originalX - translatedX == 1 && translatedY - originalY == 2) || (translatedX - originalX == 1 && translatedY - originalY == 2)) {
            return true;
        } else {
            return false;
        }
    }
}
