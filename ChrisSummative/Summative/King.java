package TheNewICS4UR.Summative;

public class King extends Piece { // The King extends from the abstract Piece class
    private static final String NAME = "King"; // The name given to all instances of the King

    public King(boolean isBlack) {
        // The constructor of the King will call its super class constructor
        super(isBlack, NAME);
    }

    public boolean canMove(int originalX, int originalY, int translatedX, int translatedY, Piece[][] logicBoard) {
        // This function will return a  boolean whether the King is able to move in a certain area if the condition is true
        // The following conditions to check for are:
        // Move Left, Move Right, Move Top, Move Bottom, Move Top left, Move Top right, Move Bottom left, Move Bottom right
        if((originalX - translatedX == 1 && originalY == translatedY) || (translatedX - originalX == 1 && originalY == translatedY) || (originalX == translatedX && originalY - translatedY == 1)
                || (originalX == translatedX && translatedY - originalY == 1) || (originalX - translatedX == 1 && originalY - translatedY == 1) || (translatedX - originalX == 1 && originalY - translatedY == 1)
                || (originalX-translatedX == 1 && translatedY - originalY ==  1) || (translatedX-originalX == 1 && translatedY-originalY == 1)){
            return true;
        }else{
            return false;
        }
    }
}
