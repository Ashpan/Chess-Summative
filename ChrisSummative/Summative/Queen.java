package TheNewICS4UR.Summative;

public class Queen extends Piece { // The Queen extends from the Piece abstract class as it is a specialized type of Piece
    public static final String NAME = "Queen"; // The name given to all instances of the Queen class

    public Queen(boolean isBlack, String name) {
        // The constructor of the Queen class calls the super class constructor
        super(isBlack, name);
    }

    public boolean canMoveDiagonal(int originalX, int originalY, int translatedX, int translatedY, Piece[][] logicBoard) {
        // This function will return a boolean whether the Piece is able to move diagonally
        // This function takes in the original position of the chess piece, the location of where the chess piece is going to be translated and the chess board to check if there are any other pieces in front of it before moving diagonal
        // The function will check these conditions to ensure that the piece is able to move in that certain position

        if ((originalX - translatedX == originalY - translatedY && originalX - translatedX > 0)) { // Moving North West
            for (int x = originalX - 1; x > translatedX; x--) {
                if (logicBoard[originalY -= 1][x] != null) {
                    return false;
                }
            }
            return true;
        } else if (translatedX - originalX == originalY - translatedY && translatedX - originalX > 0) { // Moving North East
            for (int x = originalX + 1; x < translatedX; x++) {
                if (logicBoard[originalY -= 1][x] != null) {
                    return false;
                }
            }
            return true;
        } else if (translatedX - originalX == translatedY - originalY && translatedX - originalX > 0) { // Moving South East
            for (int x = originalX + 1; x < translatedX; x++) {
                if (logicBoard[originalY += 1][x] != null) {
                    return false;
                }
            }
            return true;
        } else if ((originalX - translatedX == translatedY - originalY && originalX - translatedX > 0)) { // Moving South West
            for (int x = originalX - 1; x > translatedX; x--) {
                if (logicBoard[originalY += 1][x] != null) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }


    public boolean canMoveVertical(int originalX, int originalY, int translatedX, int translatedY, Piece[][] logicBoard) {
        // This function will return a boolean whether the Piece is able to move vertically/horizontally
        // This function takes in the original position of the chess piece, the location of where the chess piece is going to be translated and the chess board to check if there are any other pieces in front of it before moving vertical/horizontal
        // The function will check these conditions to ensure that the piece is able to move in that certain position
        if (originalX == translatedX) { // Moving up
            for (int y = (originalY - 1); y > translatedY; y--) {
                if ((logicBoard[y][originalX]) != null) {
                    return false;
                }

            }
            for (int y = (originalY + 1); y < translatedY; y++) { // Moving Down
                if ((logicBoard[y][originalX]) != null) {
                    return false;
                }

            }
            return true;
        } else if (originalY == translatedY) { // Moving right
            for (int x = originalX + 1; x < translatedX; x++) {
                if ((logicBoard[originalY][x]) != null) {
                    return false;
                }
            }
            for (int x = originalX - 1; x > translatedX; x--) { // Moving left
                if ((logicBoard[originalY][x]) != null) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
