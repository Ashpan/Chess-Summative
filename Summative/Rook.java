import javafx.scene.image.Image;

public class Rook extends Piece {

    public int xCoord, yCoord;
    public int moves;
    public Image image;

    Rook(int xCoord, int yCoord, Image image) {

        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.image = image;
//        Piece.boardArray[yCoord][xCoord] = "R";
    }

    public int getX(){
        return this.xCoord;
    }
    public int getY(){ return this.yCoord; }

    public boolean canMoveVertical() { return true; }
    public boolean canMoveHorizontal() { return true; }

}
