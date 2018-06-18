import javafx.scene.image.Image;

public class PieceQueen extends Piece {

    private int xCoord, yCoord;
    private int moves;
    public Image image;

    PieceQueen(int xCoord, int yCoord, boolean isBlack, Image image) {
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

    public boolean canMoveVertical(int currX, int currY, int prevX, int prevY) {

        // currX/Y -> position that the user wants the pieces to go to
        // prevX/Y -> position that piece is currently on

        if(prevX == currX) {
            for (int y = (prevY - 1); y > currY; y--) {
                if(boardArray[y][prevX] != null) {
                    return false;
                }
            }
            for (int y = (prevY + 1); y < currY; y++) {
                if(boardArray[y][prevX] != null) {
                    return false;
                }
            }
            return true;
        }
        return false;


    }

    public boolean canMoveHorizontal(int currX, int currY, int prevX, int prevY) {

        // 4/3
        // currX/Y -> position that the user wants the pieces to go to
        // 3/0
        // prevX/Y -> position that piece is currently on

        if (prevY == currY) {
            for (int x = (prevX + 1); x < currX; x++) {
                if(boardArray[prevY][x] != null) {
                    return false;
                }
            }
            for (int x = (prevX - 1); x > currX; x--) {
                if(boardArray[prevY][x] != null) {
                    return false;
                }
            }
            return true;
        }
        return false;

    }

}
