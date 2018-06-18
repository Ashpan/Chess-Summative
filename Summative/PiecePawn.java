import javafx.scene.image.Image;

public class PiecePawn extends Piece {

    private int xCoord, yCoord;
    private int moves;
    private Image image;

    PiecePawn(int xCoord, int yCoord, boolean isBlack, Image image) {
        super(isBlack);
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.image = image;
    }
    public int getX(){
        return this.xCoord;
    }
    public int getY(){
        return this.yCoord;
    }

    public Image getImage() { return image; }
    public boolean canMoveDiagonal(int currX, int currY, int prevX, int prevY) {

        // currX/Y -> position that the user wants the pieces to go to
        // prevX/Y -> position that piece is currently on

        if(isBlack()) {
            // black
            if ((boardArray[currY][currX] != null) && (prevX + 1 == currX) && (prevY + 1 == currY)) {
                return true;
            } else if ((boardArray[currY][currX] != null) && (prevX - 1 == currX) && (prevY + 1 == currY)) {
                return true;
            } else {
                return false;
            }

        } else {
            // white
            if ((boardArray[currY][currX] != null) && (prevX - 1 == currX) && (prevY - 1 == currY)) {
                return true;
            } else if ((boardArray[currY][currX] != null) && (prevX + 1 == currX) && (prevY - 1 == currY)) {
                return true;
            } else {
                return false;
            }

        }

    }
    public boolean canMoveOneSpace(int currX, int currY, int prevX, int prevY) {


        // currX/Y -> position that the user wants the pieces to go to
        // prevX/Y -> position that piece is currently on

        if(isBlack()) {
            // black
            System.out.println("pawn is black");
            if ((boardArray[currY][currX] == null) && (prevX == currX) && (prevY + 1 == currY)) {
                System.out.println("pawn is black: true");
                moves++;
                return true;
            } else {
                System.out.println("pawn is black: false");
                return false;
            }

        } else {
            // white
            if ((boardArray[currY][currX] == null) && (prevX == currX) && (prevY - 1 == currY)) {
                moves++;
                return true;
            } else {
                return false;
            }

        }

    }

    public boolean canMoveTwoSpaces(int currX, int currY, int prevX, int prevY) {

        // currX/Y -> position that the user wants the pieces to go to
        // prevX/Y -> position that piece is currently on

        if(isBlack()) {
            // black
            if ((moves == 0) && (boardArray[currY][currX] == null) && (prevX == currX) && (prevY + 2 == currY)) {
                moves++;
                return true;
            } else {
                return false;
            }

        } else {
            // white
            if ((moves == 0) && (boardArray[currY][currX] == null) && (currX == prevX) && (prevY - 2 == currY)) {
                moves++;
                return true;
            } else {
                return false;
            }

        }

    }

}
