import javafx.scene.image.Image;

public class Bishop extends Piece {

    public int xCoord, yCoord;
    public int moves;
    public Image image;

    Bishop(int xCoord, int yCoord, Image image) {

        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.image = image;
//        Piece.boardArray[yCoord][xCoord] = "B";
    }

    public int getX(){
        return this.xCoord;
    }
    public int getY(){
        return this.yCoord;
    }

    public boolean canMoveDiagonal() { return true; }

}
