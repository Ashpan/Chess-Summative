import javafx.scene.image.Image;

public class Queen extends Piece {

    public int xCoord, yCoord;
    public int moves;
    public Image image;

    Queen(int xCoord, int yCoord, Image image) {

        super();
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.image = image;
        Piece.boardArray[yCoord][xCoord] = "Q";
    }

    public boolean canMoveDiagonal() { return true; }
    public boolean canMoveVertical() { return true; }
    public boolean canMoveHorizontal() { return true; }

}
