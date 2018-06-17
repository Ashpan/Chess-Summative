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
    public boolean canMoveVertical(int currX, int currY, int prevX, int prevY) {

        // currX/Y -> position that the user wants the pieces to go to
        // prevX/Y -> position that piece is currently on

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

    public boolean canMoveHorizontal(int currX, int currY, int prevX, int prevY) {

        // currX/Y -> position that the user wants the pieces to go to
        // prevX/Y -> position that piece is currently on

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

}
