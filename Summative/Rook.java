public class Rook extends Piece {

    public int xCoord, yCoord;
    public int moves;

    Rook(int xCoord, int yCoord) {

        super();
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        Piece.boardArray[yCoord][xCoord] = "R";
    }

    public boolean canMoveVertical() { return true; }
    public boolean canMoveHorizontal() { return true; }

}
