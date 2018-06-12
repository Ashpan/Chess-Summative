import javafx.scene.image.Image;

public class Knight extends Piece {

    public int xCoord, yCoord;
    public int moves;
    public Image image;

    Knight(int xCoord, int yCoord, Image image) {

        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.image = image;
//        Piece.boardArray[yCoord][xCoord] = "N";
    }

    public boolean canMove() { return true; }

}
