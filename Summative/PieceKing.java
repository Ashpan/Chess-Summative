import javafx.scene.image.Image;

public class PieceKing extends Piece {

    private int xCoord, yCoord;
    private int moves;
    public Image image;

    PieceKing(int xCoord, int yCoord, boolean isBlack, Image image) {
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

        return (prevX - currX == 1 && prevY - currY == 1) ||
                (currX - prevX == 1 && prevY - currY == 1) ||
                (prevX - currX == 1 && currY - prevY == 1) ||
                (currX - prevX == 1 && currY - prevY == 1);

    }
    public boolean canMoveVertical(int currX, int currY, int prevX, int prevY) {
        // currX/Y -> position that the user wants the pieces to go to
        // prevX/Y -> position that piece is currently on
        return ((prevX == currX && prevY - currY == 1) || (prevX == currX && currY - prevY == 1));
    }
    public boolean canMoveHorizontal(int currX, int currY, int prevX, int prevY) {
        // currX/Y -> position that the user wants the pieces to go to
        // prevX/Y -> position that piece is currently on
        return ((prevX - currX == 1 && prevY == currY) || (currX - prevX == 1 && prevY == currY));
    }

}
