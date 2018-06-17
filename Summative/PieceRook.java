import javafx.scene.image.Image;

public class PieceRook extends PieceQueen {

    private int xCoord, yCoord;
    private int moves;
    public Image image;
    private static boolean isBlack;

    PieceRook(int xCoord, int yCoord, boolean isBlack, Image image) {
        super(xCoord, yCoord, isBlack, image);
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

}
