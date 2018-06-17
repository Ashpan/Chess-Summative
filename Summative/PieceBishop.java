import javafx.scene.image.Image;

public class PieceBishop extends Piece {

    private int xCoord, yCoord;
    public int moves;
    public Image image;
    private static boolean isBlack;

    PieceBishop(int xCoord, int yCoord, boolean isBlack, Image image) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.image = image;
        this.isBlack = isBlack;
//        Piece.boardArray[xCoord][yCoord] = this;
    }
    public int getX(){
        return this.xCoord;
    }
    public int getY(){
        return this.yCoord;
    }

    public static boolean isBlack() { return isBlack; }
    public Image getImage() { return image; }


    public boolean canMoveDiagonal() { return true; }

}
