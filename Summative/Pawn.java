import javafx.scene.image.Image;

public class Pawn extends Piece {

    public int xCoord, yCoord;
    public int moves;
    public Image image;

    Pawn(int xCoord, int yCoord, Image image) {

        super();
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.image = image;
        Piece.boardArray[yCoord][xCoord] = "P";
    }


    public boolean canMoveDiagonal() { return true; }
    public boolean canMoveOneSpace() { return true; }
    public boolean canMoveTwoSpaces() { return true; }

}
