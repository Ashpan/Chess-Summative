import javafx.scene.image.Image;

public class Pawn extends Piece {

    public int xCoord, yCoord;
//    public int moves;
    public Image image;

    Pawn(int xCoord, int yCoord, Image image) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.image = image;
        Piece.boardArray[yCoord][xCoord] = this;
        System.out.println("Pawn");
        System.out.println();
    }
    public int getX(){
        return this.xCoord;
    }
    public int getY(){
        return this.yCoord;
    }


    public boolean canMoveDiagonal() { return true; }
    public boolean canMoveOneSpace() { return true; }
    public boolean canMoveTwoSpaces() { return true; }

}
