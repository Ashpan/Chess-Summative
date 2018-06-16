import javafx.scene.image.Image;

public class Piece {

    public static Piece[][] boardArray = new Piece[8][8];

    public void init(){

        Pawn bp1 = new Pawn(0, 1, new Image("https://i.imgur.com/IR1asxl.png"));
        boardArray[bp1.getX()][bp1.getY()] = bp1;
        Pawn bp2 = new Pawn(1, 1, new Image("https://i.imgur.com/IR1asxl.png"));
        boardArray[bp2.getX()][bp2.getY()] = bp2;
        Pawn bp3 = new Pawn(2, 1, new Image("https://i.imgur.com/IR1asxl.png"));
        boardArray[bp3.getX()][bp3.getY()] = bp3;
        Pawn bp4 = new Pawn(3, 1, new Image("https://i.imgur.com/IR1asxl.png"));
        boardArray[bp4.getX()][bp4.getY()] = bp4;
        Pawn bp5 = new Pawn(4, 1, new Image("https://i.imgur.com/IR1asxl.png"));
        boardArray[bp5.getX()][bp5.getY()] = bp5;
        Pawn bp6 = new Pawn(5, 1, new Image("https://i.imgur.com/IR1asxl.png"));
        boardArray[bp6.getX()][bp6.getY()] = bp6;
        Pawn bp7 = new Pawn(6, 1, new Image("https://i.imgur.com/IR1asxl.png"));
        boardArray[bp7.getX()][bp7.getY()] = bp7;
        Pawn bp8 = new Pawn(7, 1, new Image("https://i.imgur.com/IR1asxl.png"));
        boardArray[bp8.getX()][bp8.getY()] = bp8;
        Rook br1 = new Rook(0, 0 , new Image("https://i.imgur.com/OPBhfr9.png"));
        boardArray[br1.getX()][br1.getY()] = br1;
        Knight bn1 = new Knight(1, 0, new Image("https://i.imgur.com/JtHhDdK.png"));
        Bishop bb1 = new Bishop(2, 0, new Image("https://i.imgur.com/brIfuCw.png"));
        Queen bq1 = new Queen(3, 0, new Image("https://i.imgur.com/1iLiq2G.png"));
        King bk1 = new King(4, 0, new Image("https://i.imgur.com/Pz2Xg9Y.png"));
        Bishop bb2 = new Bishop(5, 0,new Image("https://i.imgur.com/brIfuCw.png") );
        Knight bn2 = new Knight(6, 0, new Image("https://i.imgur.com/JtHhDdK.png"));
        Rook br2 = new Rook(7, 0 , new Image("https://i.imgur.com/OPBhfr9.png"));

        Pawn wp1 = new Pawn(0, 6, new Image("https://i.imgur.com/I15r48j.png"));
        Pawn wp2 = new Pawn(1, 6, new Image("https://i.imgur.com/I15r48j.png"));
        Pawn wp3 = new Pawn(2, 6, new Image("https://i.imgur.com/I15r48j.png"));
        Pawn wp4 = new Pawn(3, 6, new Image("https://i.imgur.com/I15r48j.png"));
        Pawn wp5 = new Pawn(4, 6, new Image("https://i.imgur.com/I15r48j.png"));
        Pawn wp6 = new Pawn(5, 6, new Image("https://i.imgur.com/I15r48j.png"));
        Pawn wp7 = new Pawn(6, 6, new Image("https://i.imgur.com/I15r48j.png"));
        Pawn wp8 = new Pawn(7, 6, new Image("https://i.imgur.com/I15r48j.png"));
        Rook wr1 = new Rook(0, 6, new Image("https://i.imgur.com/Jx5SEs8.png"));
        Knight wn1 = new Knight(1, 6, new Image("https://i.imgur.com/PYMOTu6.png"));
        Bishop wb1 = new Bishop(2, 6, new Image("https://i.imgur.com/rzBdMfr.png"));
        Queen wq1 = new Queen(3, 6, new Image("https://i.imgur.com/P0StNH9.png"));
        King wk1 = new King(4, 6, new Image("https://i.imgur.com/nWpexOt.png"));
        Bishop wb2 = new Bishop(5, 6, new Image("https://i.imgur.com/rzBdMfr.png"));
        Knight wn2 = new Knight(6, 6 , new Image("https://i.imgur.com/PYMOTu6.png"));
        Rook wr2 = new Rook(7, 6, new Image("https://i.imgur.com/Jx5SEs8.png"));

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