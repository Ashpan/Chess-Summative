import javafx.scene.image.Image;

public class PiecePawn extends Piece {

    public int xCoord, yCoord;
//    public int moves;
    public Image image;

    PiecePawn(int xCoord, int yCoord, Image image) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.image = image;
//        Piece.boardArray[xCoord][yCoord] = this;
        System.out.println("PiecePawn");
        System.out.println();
    }
    public int getX(){
        return this.xCoord;
    }
    public int getY(){
        return this.yCoord;
    }
    public boolean isBlack() { return true; }
    public boolean canMoveDiagonal() { return true; }
    public boolean canMoveOneSpace() { return true; }
    public boolean canMoveTwoSpaces() { return true; }

}
