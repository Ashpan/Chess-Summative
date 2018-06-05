public class Bishop extends Piece {

    public int xCoord, yCoord;
    public int moves;

    Bishop(int xCoord, int yCoord) {

        super();
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        Piece.boardArray[yCoord][xCoord] = "B";
    }

    public boolean canMoveDiagonal() { return true; }

}
