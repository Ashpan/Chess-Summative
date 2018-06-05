public class Knight extends Piece {

    public int xCoord, yCoord;
    public int moves;

    Knight(int xCoord, int yCoord) {

        super();
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        Piece.boardArray[yCoord][xCoord] = "N";
    }

    public boolean canMove() { return true; }

}
