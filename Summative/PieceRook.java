import javafx.scene.image.Image;

public class PieceRook extends Piece {

    public int xCoord, yCoord;
    public int moves;
    public Image image;

    PieceRook(int xCoord, int yCoord, Image image) {

        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.image = image;
//        Piece.boardArray[xCoord][yCoord] = "R";
    }
    public int getX(){
        return this.xCoord;
    }
    public int getY(){
        return this.yCoord;
    }
    public boolean canMoveVertical() { return true; }
    public boolean canMoveHorizontal() { return true; }

}
