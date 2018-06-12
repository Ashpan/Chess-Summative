import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Pawn extends Piece {

    public int xCoord, yCoord;
//    public int moves;
    public Image image;

    Pawn(int xCoord, int yCoord, Image image) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.image = image;
        Piece.boardArray[yCoord][xCoord] = new ImageView(image);
        System.out.println("Pawn");
    }


    public boolean canMoveDiagonal() { return true; }
    public boolean canMoveOneSpace() { return true; }
    public boolean canMoveTwoSpaces() { return true; }

}
