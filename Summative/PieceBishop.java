import javafx.scene.image.Image;

public class PieceBishop extends Piece {

    public int xCoord, yCoord;
    public int moves;
    public Image image;

    PieceBishop(int xCoord, int yCoord, Image image) {

        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.image = image;
//        Piece.boardArray[xCoord][yCoord] = "B";
    }
    public int getX(){
        return this.xCoord;
    }
    public int getY(){
        return this.yCoord;
    }
    public boolean canMoveDiagonal() { return true; }

}
