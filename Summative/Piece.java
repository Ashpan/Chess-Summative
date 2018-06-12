import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Piece {

    public static ImageView[][] boardArray = new ImageView[8][8];
    public void init(){
        Pawn wp1 = new Pawn(0, 1, new Image("https://i.imgur.com/I15r48j.png"));
        Pawn wp2 = new Pawn(1, 1, new Image("https://i.imgur.com/I15r48j.png"));
        Pawn wp3 = new Pawn(2, 1, new Image("https://i.imgur.com/I15r48j.png"));
        Pawn wp4 = new Pawn(3, 1, new Image("https://i.imgur.com/I15r48j.png"));
        Pawn wp5 = new Pawn(4, 1, new Image("https://i.imgur.com/I15r48j.png"));
        Pawn wp6 = new Pawn(5, 1, new Image("https://i.imgur.com/I15r48j.png"));
        Pawn wp7 = new Pawn(6, 1, new Image("https://i.imgur.com/I15r48j.png"));
        Pawn wp8 = new Pawn(7, 1, new Image("https://i.imgur.com/I15r48j.png"));
        Pawn bp1 = new Pawn(0, 6, new Image("https://i.imgur.com/IR1asxl.png"));
        Pawn bp2 = new Pawn(1, 6, new Image("https://i.imgur.com/IR1asxl.png"));
        Pawn bp3 = new Pawn(2, 6, new Image("https://i.imgur.com/IR1asxl.png"));
        Pawn bp4 = new Pawn(3, 6, new Image("https://i.imgur.com/IR1asxl.png"));
        Pawn bp5 = new Pawn(4, 6, new Image("https://i.imgur.com/IR1asxl.png"));
        Pawn bp6 = new Pawn(5, 6, new Image("https://i.imgur.com/IR1asxl.png"));
        Pawn bp7 = new Pawn(6, 6, new Image("https://i.imgur.com/IR1asxl.png"));
        Pawn bp8 = new Pawn(7, 6, new Image("https://i.imgur.com/IR1asxl.png"));
    }

    public void displayArray(){
        for(int i = 0; i < boardArray[1].length; i++){
            for(int j = 0; j < boardArray.length; j++){
                System.out.print(boardArray[i][j] + ", ");
            }
            System.out.println();
        }
    }
}