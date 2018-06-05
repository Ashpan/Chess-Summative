public class King extends Piece {

    public int xCoord, yCoord;
    public int moves;

    King(int xCoord, int yCoord) {

        super();
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        Piece.boardArray[yCoord][xCoord] = "K";
    }

    public boolean canMoveDiagonal() { return true; }
    public boolean canMoveVertical() { return true; }
    public boolean canMoveHorizontal() { return true; }

}
