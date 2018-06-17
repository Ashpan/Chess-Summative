import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class Piece {

    public static Piece[][] boardArray = new Piece[8][8];

    public void init(){

        PiecePawn bp1 = new PiecePawn(0, 1, new Image("https://i.imgur.com/IR1asxl.png"));
        PiecePawn bp2 = new PiecePawn(1, 1, new Image("https://i.imgur.com/IR1asxl.png"));
        PiecePawn bp3 = new PiecePawn(2, 1, new Image("https://i.imgur.com/IR1asxl.png"));
        PiecePawn bp4 = new PiecePawn(3, 1, new Image("https://i.imgur.com/IR1asxl.png"));
        PiecePawn bp5 = new PiecePawn(4, 1, new Image("https://i.imgur.com/IR1asxl.png"));
        PiecePawn bp6 = new PiecePawn(5, 1, new Image("https://i.imgur.com/IR1asxl.png"));
        PiecePawn bp7 = new PiecePawn(6, 1, new Image("https://i.imgur.com/IR1asxl.png"));
        PiecePawn bp8 = new PiecePawn(7, 1, new Image("https://i.imgur.com/IR1asxl.png"));
        PieceRook br1 = new PieceRook(0, 0 , new Image("https://i.imgur.com/OPBhfr9.png"));
        PieceKnight bn1 = new PieceKnight(1, 0, new Image("https://i.imgur.com/JtHhDdK.png"));
        PieceBishop bb1 = new PieceBishop(2, 0, new Image("https://i.imgur.com/brIfuCw.png"));
        PieceQueen bq1 = new PieceQueen(3, 0, new Image("https://i.imgur.com/1iLiq2G.png"));
        PieceKing bk1 = new PieceKing(4, 0, new Image("https://i.imgur.com/Pz2Xg9Y.png"));
        PieceBishop bb2 = new PieceBishop(5, 0,new Image("https://i.imgur.com/brIfuCw.png") );
        PieceKnight bn2 = new PieceKnight(6, 0, new Image("https://i.imgur.com/JtHhDdK.png"));
        PieceRook br2 = new PieceRook(7, 0 , new Image("https://i.imgur.com/OPBhfr9.png"));
        PiecePawn wp1 = new PiecePawn(0, 6, new Image("https://i.imgur.com/I15r48j.png"));
        PiecePawn wp2 = new PiecePawn(1, 6, new Image("https://i.imgur.com/I15r48j.png"));
        PiecePawn wp3 = new PiecePawn(2, 6, new Image("https://i.imgur.com/I15r48j.png"));
        PiecePawn wp4 = new PiecePawn(3, 6, new Image("https://i.imgur.com/I15r48j.png"));
        PiecePawn wp5 = new PiecePawn(4, 6, new Image("https://i.imgur.com/I15r48j.png"));
        PiecePawn wp6 = new PiecePawn(5, 6, new Image("https://i.imgur.com/I15r48j.png"));
        PiecePawn wp7 = new PiecePawn(6, 6, new Image("https://i.imgur.com/I15r48j.png"));
        PiecePawn wp8 = new PiecePawn(7, 6, new Image("https://i.imgur.com/I15r48j.png"));
        PieceRook wr1 = new PieceRook(0, 7, new Image("https://i.imgur.com/Jx5SEs8.png"));
        PieceKnight wn1 = new PieceKnight(1, 7, new Image("https://i.imgur.com/PYMOTu6.png"));
        PieceBishop wb1 = new PieceBishop(2, 7, new Image("https://i.imgur.com/rzBdMfr.png"));
        PieceQueen wq1 = new PieceQueen(3, 7, new Image("https://i.imgur.com/P0StNH9.png"));
        PieceKing wk1 = new PieceKing(4, 7, new Image("https://i.imgur.com/nWpexOt.png"));
        PieceBishop wb2 = new PieceBishop(5, 7, new Image("https://i.imgur.com/rzBdMfr.png"));
        PieceKnight wn2 = new PieceKnight(6, 7 , new Image("https://i.imgur.com/PYMOTu6.png"));
        PieceRook wr2 = new PieceRook(7, 7, new Image("https://i.imgur.com/Jx5SEs8.png"));

        boardArray[bp1.getY()][bp1.getX()] = bp1;
        boardArray[bp2.getY()][bp2.getX()] = bp2;
        boardArray[bp3.getY()][bp3.getX()] = bp3;
        boardArray[bp4.getY()][bp4.getX()] = bp4;
        boardArray[bp5.getY()][bp5.getX()] = bp5;
        boardArray[bp6.getY()][bp6.getX()] = bp6;
        boardArray[bp7.getY()][bp7.getX()] = bp7;
        boardArray[bp8.getY()][bp8.getX()] = bp8;
        boardArray[br1.getY()][br1.getX()] = br1;
        boardArray[bn1.getY()][bn1.getX()] = bn1;
        boardArray[bb1.getY()][bb1.getX()] = bb1;
        boardArray[bq1.getY()][bq1.getX()] = bq1;
        boardArray[bk1.getY()][bk1.getX()] = bk1;
        boardArray[bb2.getY()][bb2.getX()] = bb2;
        boardArray[bn2.getY()][bn2.getX()] = bn2;
        boardArray[br2.getY()][br2.getX()] = br2;
        boardArray[wp1.getY()][wp1.getX()] = wp1;
        boardArray[wp2.getY()][wp2.getX()] = wp2;
        boardArray[wp3.getY()][wp3.getX()] = wp3;
        boardArray[wp4.getY()][wp4.getX()] = wp4;
        boardArray[wp5.getY()][wp5.getX()] = wp5;
        boardArray[wp6.getY()][wp6.getX()] = wp6;
        boardArray[wp7.getY()][wp7.getX()] = wp7;
        boardArray[wp8.getY()][wp8.getX()] = wp8;
        boardArray[wr1.getY()][wr1.getX()] = wr1;
        boardArray[wn1.getY()][wn1.getX()] = wn1;
        boardArray[wb1.getY()][wb1.getX()] = wb1;
        boardArray[wq1.getY()][wq1.getX()] = wq1;
        boardArray[wk1.getY()][wk1.getX()] = wk1;
        boardArray[wb2.getY()][wb2.getX()] = wb2;
        boardArray[wn2.getY()][wn2.getX()] = wn2;
        boardArray[wr2.getY()][wr2.getX()] = wr2;
//        boardArray[0][0] = null;
    }

    public void displayArray(){
        for(int i = 0; i < boardArray[1].length; i++){
            for(int j = 0; j < boardArray.length; j++){
                System.out.print(boardArray[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public boolean exists(int xCoord, int yCoord) {
        if (boardArray[yCoord][xCoord] != null) {
            return true;
        } else {
            return false;
        }
    }

    public GridPane updateBoard(GridPane gridpane, Piece piece){
        Image background = new Image("https://i.imgur.com/vnNyRP3.png");
        Image whitePawn = new Image("https://i.imgur.com/I15r48j.png");
        Image blackPawn = new Image("https://i.imgur.com/IR1asxl.png");
        Image whiteKnight = new Image("https://i.imgur.com/PYMOTu6.png");
        Image blackKnight = new Image("https://i.imgur.com/JtHhDdK.png");
        Image whiteRook = new Image("https://i.imgur.com/Jx5SEs8.png");
        Image blackRook = new Image("https://i.imgur.com/OPBhfr9.png");
        Image whiteBishop = new Image("https://i.imgur.com/rzBdMfr.png");
        Image blackBishop = new Image("https://i.imgur.com/brIfuCw.png");
        Image whiteQueen = new Image("https://i.imgur.com/P0StNH9.png");
        Image blackQueen = new Image("https://i.imgur.com/1iLiq2G.png");
        Image whiteKing = new Image("https://i.imgur.com/nWpexOt.png");
        Image blackKing = new Image("https://i.imgur.com/Pz2Xg9Y.png");
        gridpane.getChildren().removeAll();
//            System.out.println(piece.boardArray[6][0] instanceof PiecePawn);
        for(int y = 0; y < boardArray.length; y++){
            int x = 0;
            for (Piece i : boardArray[y]){
                System.out.println(i.);
                if(boardArray[y][x] instanceof PiecePawn && boardArray[y][x].isBlack){
                    gridpane.add(new ImageView(blackPawn), x, y, 1, 1);
                }else{
                    gridpane.add(new ImageView(whitePawn), x, y, 1, 1);
                }
                x++;
            }
        }
        return gridpane;
    }
}