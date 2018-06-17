import javafx.scene.image.Image;

public class PieceBishop extends Piece {

    public int xCoord, yCoord;
    public int moves;
    public Image image;
    public boolean isBlack;

    PieceBishop(int xCoord, int yCoord, Image image) {

        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.image = image;
//        this.isBlack = isBlack;
    }
    public int getX(){
        return this.xCoord;
    }
    public int getY(){
        return this.yCoord;
    }
    public boolean isBlack() { return true; }

    public boolean canMoveDiagonal() { return true; }

}
