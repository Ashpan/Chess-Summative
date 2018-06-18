import javafx.scene.image.Image;

public class PieceKnight extends Piece {

    private int xCoord, yCoord;
    private int moves;
    public Image image;
    private static boolean isBlack;

    PieceKnight(int xCoord, int yCoord, boolean isBlack, Image image) {
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


    public boolean canMoveL(int currX, int currY, int prevX, int prevY) {
        boolean option1 = false;
        boolean option2 = false;
        boolean option3 = false;
        boolean option4 = false;
        boolean option5 = false;
        boolean option6 = false;
        boolean option7 = false;
        boolean option8 = false;
        try { option1 = (currX == prevX + 1) & (currY == prevY - 2); }catch(ArrayIndexOutOfBoundsException e){}
        try { option2 = (currX == prevX + 1) & (currY == prevY + 2); }catch(ArrayIndexOutOfBoundsException e){}
        try { option3 = (currX == prevX - 1) & (currY == prevY - 2); }catch(ArrayIndexOutOfBoundsException e){}
        try { option4 = (currX == prevX - 1) & (currY == prevY + 2); }catch(ArrayIndexOutOfBoundsException e){}
        try { option5 = (currX == prevX + 2) & (currY == prevY - 1); }catch(ArrayIndexOutOfBoundsException e){}
        try { option6 = (currX == prevX - 2) & (currY == prevY - 1); }catch(ArrayIndexOutOfBoundsException e){}
        try { option7 = (currX == prevX + 2) & (currY == prevY + 1); }catch(ArrayIndexOutOfBoundsException e){}
        try { option8 = (currX == prevX - 2) & (currY == prevY + 1); }catch(ArrayIndexOutOfBoundsException e){}
        return option1 || option2 || option3 || option4 || option5 || option6 || option7 || option8;
        }

}
