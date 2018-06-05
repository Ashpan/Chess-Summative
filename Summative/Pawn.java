public class Pawn extends Piece {

    public int xCoord, yCoord;
    public int moves;

    Pawn(int xCoord, int yCoord) {

        super();
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        Piece.boardArray[yCoord][xCoord] = "P";
    }

    public boolean canMoveDiagonal() { return true; }
    public boolean canMoveOneSpace() { return true; }
    public boolean canMoveTwoSpaces() { return true; }

}
