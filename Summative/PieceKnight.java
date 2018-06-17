import javafx.scene.image.Image;

public class PieceKnight extends Piece {

    public int xCoord, yCoord;
    public int moves;
    public Image image;

    PieceKnight(int xCoord, int yCoord, Image image) {

        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.image = image;
//        Piece.boardArray[xCoord][yCoord] = "N";
    }
    public int getX(){
        return this.xCoord;
    }
    public int getY(){
        return this.yCoord;
    }
    public boolean canMove() { return true; }

}
