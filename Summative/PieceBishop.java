import javafx.scene.image.Image;

public class PieceBishop extends Piece {

    private int xCoord, yCoord;
    public int moves;
    public Image image;
    private static boolean isBlack;

    PieceBishop(int xCoord, int yCoord, boolean isBlack, Image image) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.image = image;
        this.isBlack = isBlack;
//        Piece.boardArray[xCoord][yCoord] = this;
    }
    public int getX(){
        return this.xCoord;
    }
    public int getY(){
        return this.yCoord;
    }

    public static boolean isBlack() { return isBlack; }
    public Image getImage() { return image; }


    public boolean canMoveDiagonal(int currX, int currY, int prevX, int prevY) {

        // currX/Y -> position that the user wants the pieces to go to
        // prevX/Y -> position that piece is currently on

        if ((prevX - currX == prevY - currY && prevX - currX > 0)) {
            // top left
            for (int x = prevX - 1; x > currX; x--) {
                if (boardArray[prevY -= 1][x] != null) {
                    return false;
                }
            }
            return true;
        } else if ((currX - prevX == prevY - currY && currX - prevX > 0)) {
            // top right
            for (int x = prevX + 1; x < currX; x++) {
                if (boardArray[prevY -= 1][x] != null) {
                    return false;
                }
            }
            return true;
        } else if ((currX - prevX == currY - prevY && currX - prevX > 0)) {
            for (int x = prevX + 1; x < currX; x++) {
                if (boardArray[prevY += 1][x] != null) {
                    return false;
                }
            }
            return true;
        } else if ((prevX - currX == currY - prevY && prevX - currX > 0)) {
            // top left
            for (int x = prevX - 1; x > currX; x--) {
                if (boardArray[prevY += 1][x] != null) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}
