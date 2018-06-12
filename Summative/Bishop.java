import javafx.scene.image.Image;

public class Bishop extends Piece {

    public int xCoord, yCoord;
    public int moves;
    public Image image;

    Bishop(int xCoord, int yCoord, Image image) {

        super();
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.image = image;
        Piece.boardArray[yCoord][xCoord] = "B";
    }

    public boolean canMoveDiagonal() { return true; }

}
