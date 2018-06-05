public class Queen extends Piece {

    public int xCoord, yCoord;
    public int moves;

    Queen(int xCoord, int yCoord) {

        super();
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        Piece.boardArray[yCoord][xCoord] = "Q";
    }

    public boolean canMoveDiagonal() { return true; }
    public boolean canMoveVertical() { return true; }
    public boolean canMoveHorizontal() { return true; }

}
