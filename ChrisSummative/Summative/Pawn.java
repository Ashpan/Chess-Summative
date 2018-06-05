package TheNewICS4UR.Summative;

import javafx.scene.image.ImageView; // Importing the ImageView to check for other Pieces on the board that may conflict with the Pawn's move.

public class Pawn extends Piece { // The Pawn extends from the Piece Class
    private static final String NAME = "Pawn"; // The name given to all instances of the Pawn

    public Pawn(boolean isBlack) {
        // The constructor of the Pawn will call its super class constructor
        super(isBlack, NAME);
    }

    public boolean canMoveDiagonal(int originalX, int originalY, int translatedX, int translatedY, boolean isBlackTurn, ImageView[][] imgBoard, Piece[][] logicBoard) {
        // This function will take in the original Pawn location with it's translated Pawn location, the turn whether it be Black or White's turn and with the game board and its pieces.
        // This function will determine whether the Pawn can move diagonal to take out the opposing opponents piece.
        // The ImageView array holds the images of the chess pieces and Piece 2D array holds the chess pieces according to the board layout
        // This will check if it's the White Pawn's Turn and whether the move is valid
        if (!isBlackTurn && ((translatedX - originalX == 1 && originalY - translatedY == 1) || (originalX - translatedX == 1 && originalY - translatedY == 1)) &&
                imgBoard[translatedY][translatedX] != null && (logicBoard[translatedY][translatedX]).isBlack() != isBlackTurn) {
            // Setting true such that the Pawn has moved
            setHasMoved(true);
            return true;
            // This will check if it's the Black Pawn's Turn and whether the move is valid
        }else if(isBlackTurn && ((translatedX - originalX == 1 && translatedY - originalY == 1) || (originalX - translatedX == 1 && translatedY - originalY == 1)) &&
                (imgBoard[translatedY][translatedX] != null && (logicBoard[translatedY][translatedX]).isBlack() != isBlackTurn)){
            // Setting true such that the Pawn has moved
            setHasMoved(true);
            return true;
        }else {
            return false;
        }
    }

    public boolean canMoveSingleSpace(int originalX, int originalY, int translatedX, int translatedY, boolean isBlackTurn, ImageView[][] imgBoard) {
        // This function will take in the original Pawn location with it's translated Pawn location, the turn whether it be Black or White's turn and with the game board and its pieces.
        // This function will determine whether the Pawn can move a single space to move in
        // This will check if it's the White Pawn's Turn and whether the move is valid
        if (!isBlackTurn && originalX == translatedX && originalY - translatedY <= 2 && originalY - translatedY >= 1 && imgBoard[translatedY][translatedX] == null) {
            if (hasMoved() && originalY - translatedY == 2) {
                return false;
            } else {
                // Setting true such that the Pawn has moved
                setHasMoved(true);
                return true;
            }
            // This will check if it's the Black Pawn's turn and whether the move is valid
        } else if (isBlackTurn && originalX == translatedX && translatedY - originalY <= 2 && translatedY - originalY >= 1 && imgBoard[translatedY][translatedX] == null) {
            if (hasMoved() && translatedY - originalY == 2) {
                return false;
            } else {
                // Setting true such that the Pawn has moved
                setHasMoved(true);
                return true;
            }
        } else {
            return false;
        }
    }
}
