import javafx.scene.control.Alert;
import javafx.scene.image.Image;

enum Player {
    black, white
}

public class Piece {

    public static Piece[][] boardArray = new Piece[8][8];
    private boolean isBlack;
    Player currPlayer;

    // empty constructor for initializing in Board class
    Piece() {
        currPlayer = Player.white;
    }

    Piece(boolean isBlack) {

        currPlayer = Player.white;
        this.isBlack = isBlack;

    }

    public static void init(){

        PiecePawn bp1 = new PiecePawn(0, 1, true, new Image("https://i.imgur.com/IR1asxl.png"));
        PiecePawn bp2 = new PiecePawn(1, 1, true, new Image("https://i.imgur.com/IR1asxl.png"));
        PiecePawn bp3 = new PiecePawn(2, 1, true, new Image("https://i.imgur.com/IR1asxl.png"));
        PiecePawn bp4 = new PiecePawn(3, 1, true, new Image("https://i.imgur.com/IR1asxl.png"));
        PiecePawn bp5 = new PiecePawn(4, 1, true, new Image("https://i.imgur.com/IR1asxl.png"));
        PiecePawn bp6 = new PiecePawn(5, 1, true, new Image("https://i.imgur.com/IR1asxl.png"));
        PiecePawn bp8 = new PiecePawn(7, 1, true, new Image("https://i.imgur.com/IR1asxl.png"));
        PiecePawn bp7 = new PiecePawn(6, 1, true, new Image("https://i.imgur.com/IR1asxl.png"));
        PieceRook br1 = new PieceRook(0, 0 , true, new Image("https://i.imgur.com/OPBhfr9.png"));
        PieceRook br2 = new PieceRook(7, 0 , true, new Image("https://i.imgur.com/OPBhfr9.png"));
        PieceKnight bn1 = new PieceKnight(1, 0, true, new Image("https://i.imgur.com/JtHhDdK.png"));
        PieceKnight bn2 = new PieceKnight(6, 0, true, new Image("https://i.imgur.com/JtHhDdK.png"));
        PieceBishop bb1 = new PieceBishop(2, 0, true, new Image("https://i.imgur.com/brIfuCw.png"));
        PieceBishop bb2 = new PieceBishop(5, 0, true, new Image("https://i.imgur.com/brIfuCw.png") );
        PieceQueen bq1 = new PieceQueen(3, 0, true, new Image("https://i.imgur.com/1iLiq2G.png"));
        PieceKing bk1 = new PieceKing(4, 0, true, new Image("https://i.imgur.com/Pz2Xg9Y.png"));
        PiecePawn wp1 = new PiecePawn(0, 6, false, new Image("https://i.imgur.com/I15r48j.png"));
        PiecePawn wp2 = new PiecePawn(1, 6, false, new Image("https://i.imgur.com/I15r48j.png"));
        PiecePawn wp3 = new PiecePawn(2, 6, false, new Image("https://i.imgur.com/I15r48j.png"));
        PiecePawn wp4 = new PiecePawn(3, 6, false, new Image("https://i.imgur.com/I15r48j.png"));
        PiecePawn wp5 = new PiecePawn(4, 6, false, new Image("https://i.imgur.com/I15r48j.png"));
        PiecePawn wp6 = new PiecePawn(5, 6, false, new Image("https://i.imgur.com/I15r48j.png"));
        PiecePawn wp7 = new PiecePawn(6, 6, false, new Image("https://i.imgur.com/I15r48j.png"));
        PiecePawn wp8 = new PiecePawn(7, 6, false, new Image("https://i.imgur.com/I15r48j.png"));
        PieceRook wr1 = new PieceRook(0, 7, false, new Image("https://i.imgur.com/Jx5SEs8.png"));
        PieceRook wr2 = new PieceRook(7, 7, false, new Image("https://i.imgur.com/Jx5SEs8.png"));
        PieceKnight wn1 = new PieceKnight(1, 7, false, new Image("https://i.imgur.com/PYMOTu6.png"));
        PieceKnight wn2 = new PieceKnight(6, 7 , false, new Image("https://i.imgur.com/PYMOTu6.png"));
        PieceBishop wb1 = new PieceBishop(2, 7, false, new Image("https://i.imgur.com/rzBdMfr.png"));
        PieceBishop wb2 = new PieceBishop(5, 7, false, new Image("https://i.imgur.com/rzBdMfr.png"));
        PieceQueen wq1 = new PieceQueen(3, 7, false, new Image("https://i.imgur.com/P0StNH9.png"));
        PieceKing wk1 = new PieceKing(4, 7, false, new Image("https://i.imgur.com/nWpexOt.png"));

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

        
    }

    public boolean isBlack() { return isBlack; }

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

    public String player(){
        if(currPlayer == Player.white ){
            return "White";
        }else if(currPlayer == Player.black ){
            return "Black";
        }
        return "";
    }

    public void makeMove(int currX, int currY, int prevX, int prevY){
        if(canMove(currX, currY, prevX, prevY)){
            boolean prevWhiteCheck = whiteCheck();
            boolean prevBlackCheck = blackCheck();
            System.out.println("moved played by: " + currPlayer);
            Piece future = boardArray[currY][currX];
            boardArray[currY][currX] = boardArray[prevY][prevX];
            boardArray[prevY][prevX] = null;
            // TODO: if after move, currPlayer is in check, undo move and throw error
            if(currPlayer == Player.white && whiteCheck()){
                System.out.println("undo white");
                boardArray[prevY][prevX] = boardArray[currY][currX];
                boardArray[currY][currX] = future;
                currPlayer = Player.black;

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Check");
                alert.setHeaderText(null);
                alert.setContentText("White is/will be in check.");

                alert.showAndWait();

            }
            if(currPlayer == Player.black && blackCheck()){
                System.out.println("undo black");
                boardArray[prevY][prevX] = boardArray[currY][currX];
                boardArray[currY][currX] = future;
                currPlayer = Player.white;

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Check");
                alert.setHeaderText(null);
                alert.setContentText("Black is/will be in check.");

                alert.showAndWait();

            }
            currPlayer = currPlayer == Player.white ? Player.black : Player.white;
            System.out.println(currPlayer);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Looks like you suck at chess. Try again.");

            alert.showAndWait();
        }
    }

    public boolean canMove(int currX, int currY, int prevX, int prevY){

        if ((currPlayer == Player.white) && (!(boardArray[prevY][prevX].isBlack))) {
            // white
            System.out.println("ran if");

            if (!((boardArray[currY][currX] != null && boardArray[currY][currX].isBlack() && boardArray[prevY][prevX].isBlack)
                    || (boardArray[currY][currX] != null && !(boardArray[currY][currX].isBlack()) && !(boardArray[prevY][prevX].isBlack)))) {

                if(boardArray[prevY][prevX] instanceof PiecePawn){
                    return ( ((PiecePawn) boardArray[prevY][prevX]).canMoveDiagonal(currX, currY, prevX, prevY) ||
                            ((PiecePawn) boardArray[prevY][prevX]).canMoveOneSpace(currX, currY, prevX, prevY) ||
                            ((PiecePawn) boardArray[prevY][prevX]).canMoveTwoSpaces(currX, currY, prevX, prevY) );
                }else if(boardArray[prevY][prevX] instanceof PieceKnight){
                    return ( ((PieceKnight) boardArray[prevY][prevX]).canMoveL(currX, currY, prevX, prevY) );
                }else if(boardArray[prevY][prevX] instanceof PieceBishop){
                    return ( ((PieceBishop) boardArray[prevY][prevX]).canMoveDiagonal(currX, currY, prevX, prevY) );
                }else if(boardArray[prevY][prevX] instanceof PieceRook){
                    return ( ((PieceRook) boardArray[prevY][prevX]).canMoveVertical(currX, currY, prevX, prevY) ||
                            ((PieceRook) boardArray[prevY][prevX]).canMoveHorizontal(currX, currY, prevX, prevY) );
                }else if(boardArray[prevY][prevX] instanceof PieceQueen){
                    return ( ((PieceQueen) boardArray[prevY][prevX]).canMoveVertical(currX, currY, prevX, prevY) ||
                            ((PieceQueen) boardArray[prevY][prevX]).canMoveHorizontal(currX, currY, prevX, prevY) ||
                            ((PieceQueen) boardArray[prevY][prevX]).canMoveDiagonal(currX, currY, prevX, prevY) );
                } else if(boardArray[prevY][prevX] instanceof PieceKing){
                    return ( ((PieceKing) boardArray[prevY][prevX]).canMoveVertical(currX, currY, prevX, prevY) ||
                            ((PieceKing) boardArray[prevY][prevX]).canMoveHorizontal(currX, currY, prevX, prevY) ||
                            ((PieceKing) boardArray[prevY][prevX]).canMoveDiagonal(currX, currY, prevX, prevY) );
                }
                return false;

            }
            return false;

        } else if ((currPlayer == Player.black) && ((boardArray[prevY][prevX].isBlack))) {
            // black
            System.out.println("ran else if");

            if (!((boardArray[currY][currX] != null && boardArray[currY][currX].isBlack() && boardArray[prevY][prevX].isBlack)
                    || (boardArray[currY][currX] != null && !(boardArray[currY][currX].isBlack()) && !(boardArray[prevY][prevX].isBlack))))  {

                if(boardArray[prevY][prevX] instanceof PiecePawn){
                    return ( ((PiecePawn) boardArray[prevY][prevX]).canMoveDiagonal(currX, currY, prevX, prevY) ||
                            ((PiecePawn) boardArray[prevY][prevX]).canMoveOneSpace(currX, currY, prevX, prevY) ||
                            ((PiecePawn) boardArray[prevY][prevX]).canMoveTwoSpaces(currX, currY, prevX, prevY) );
                }else if(boardArray[prevY][prevX] instanceof PieceKnight){
                    return ( ((PieceKnight) boardArray[prevY][prevX]).canMoveL(currX, currY, prevX, prevY) );
                }else if(boardArray[prevY][prevX] instanceof PieceBishop){
                    return ( ((PieceBishop) boardArray[prevY][prevX]).canMoveDiagonal(currX, currY, prevX, prevY) );
                }else if(boardArray[prevY][prevX] instanceof PieceRook){
                    return ( (PieceRook) boardArray[prevY][prevX]).canMoveVertical(currX, currY, prevX, prevY) ||
                            ((PieceRook) boardArray[prevY][prevX]).canMoveHorizontal(currX, currY, prevX, prevY);
                }else if(boardArray[prevY][prevX] instanceof PieceQueen){
                    return ( ((PieceQueen) boardArray[prevY][prevX]).canMoveVertical(currX, currY, prevX, prevY) ||
                            ((PieceQueen) boardArray[prevY][prevX]).canMoveHorizontal(currX, currY, prevX, prevY) ||
                            ((PieceQueen) boardArray[prevY][prevX]).canMoveDiagonal(currX, currY, prevX, prevY) );
                } else if(boardArray[prevY][prevX] instanceof  PieceKing) {
                    return ( ((PieceKing) boardArray[prevY][prevX]).canMoveVertical(currX, currY, prevX, prevY) ||
                            ((PieceKing) boardArray[prevY][prevX]).canMoveHorizontal(currX, currY, prevX, prevY) ||
                            ((PieceKing) boardArray[prevY][prevX]).canMoveDiagonal(currX, currY, prevX, prevY) );
                }
                return false;

            }
            return false;

        } else {
            System.out.println("ran else");
            return false;

        }

    }

    public boolean whiteCheck(){
        int kingX = -1;
        int kingY = -1;
        PieceKing whiteKing = new PieceKing(0,0,true, new Image("https://i.imgur.com/LXorSui.png"));
        for(int y = 0; y < boardArray.length; y++) {
            for (int x = 0; x < boardArray[1].length; x++) {
                //Find white king
                if (boardArray[y][x] instanceof PieceKing && !((PieceKing) boardArray[y][x]).isBlack()) {
                    kingX = x;
                    kingY = y;
                    whiteKing = (PieceKing) boardArray[y][x];
                }
            }
        }
        System.out.println("k: " + (whitePawnCheck(kingX, kingY, whiteKing, 1, 1) ||
                whiteRookCheck(kingX, kingY, whiteKing, 1, 1) ||
                whiteBishopCheck(kingX, kingY, whiteKing, 1, 1) ||
                whiteKnightCheck(kingX, kingY, whiteKing, 1, 1) ||
                whiteQueenCheck(kingX, kingY, whiteKing, 1, 1)));
            return (whitePawnCheck(kingX, kingY, whiteKing, 1, 1) ||
                    whiteRookCheck(kingX, kingY, whiteKing, 1, 1) ||
                    whiteBishopCheck(kingX, kingY, whiteKing, 1, 1) ||
                    whiteKnightCheck(kingX, kingY, whiteKing, 1, 1) ||
                    whiteQueenCheck(kingX, kingY, whiteKing, 1, 1));
        }
    private boolean whitePawnCheck(int kingX, int kingY, PieceKing whiteKing, int startX, int startY) {
        for (int y = 0; y < boardArray.length; y++) {
            for (int x = 0; x < boardArray[1].length; x++) {
                Piece arrayPiece = boardArray[y][x];
                if ((arrayPiece instanceof PiecePawn) && ((PiecePawn) arrayPiece).isBlack()) {
//                    System.out.println((x+1) + ", " + (y+1));
                    try {
                        if ((boardArray[y + 1][x + 1] == whiteKing)) {
                            return true;
                        }else if ((boardArray[y + 1][x - 1] == whiteKing)) {
                            return true;
                        }
                    }catch(ArrayIndexOutOfBoundsException e){}
                }
            }
        }
        return false;
    }
    private boolean whiteRookCheck(int kingX, int kingY, PieceKing whiteKing, int startX, int startY){
        for(int y = startY; y < boardArray.length; y++){
            for(int x = startX; x < boardArray[1].length; x++) {
                Piece arrayPiece = boardArray[y][x];
                if((arrayPiece instanceof PieceRook) && (((PieceRook) arrayPiece).isBlack())){
                    if(x == kingX){ //rook is in line vertically lined up w/ king
                        if(y < kingY) {
                            for (int a = y+1; a < kingY; a++){
                                if(boardArray[a][x] != null){
                                    return whiteRookCheck(kingX, kingY, whiteKing, x+1, y);
                                }
                            }
                        }else{
                            for (int a = kingY + 1; a < y; a++){
                                if(boardArray[a][x] != null){
                                    return whiteRookCheck(kingX, kingY, whiteKing, x+1, y);
                                }
                            }
                        }
                    }else if(y == kingY){ //rook is in line horizontally lined up w/ king
                        if(x < kingX) {
                            for (int a = x+1; a < kingX; a++){
                                if(boardArray[y][a] != null){
                                    return whiteRookCheck(kingX, kingY, whiteKing, x+1, y);
                                }
                            }
                        }else{
                            for (int a = kingX + 1; a < x; a++){
                                if(boardArray[y][a] != null){
                                    return whiteRookCheck(kingX, kingY, whiteKing, x+1, y);
                                }
                            }
                        }
                    }else{
                        return whiteRookCheck(kingX, kingY, whiteKing, x+1, y);
                    }
                    return true;
                }
            }
        }
        return false;
    }
    private boolean whiteBishopCheck(int kingX, int kingY, PieceKing whiteKing, int startX, int startY){
        for(int y = startY; y < boardArray.length; y++){
            for(int x = startX; x < boardArray[1].length; x++) {
                Piece arrayPiece = boardArray[y][x];
                if((arrayPiece instanceof PieceBishop) && (((PieceBishop) arrayPiece).isBlack())){
                    if(Math.abs(x - kingX) == (Math.abs(y - kingY))){ //bishop is horizontally lined up w/ king
                        if(y < kingY && x < kingX) {
                            for (int a = 1; a < Math.abs(y-kingY); a++){
                                if(boardArray[y+a][x+a] != null){
                                    return whiteBishopCheck(kingX, kingY, whiteKing, x+1, y);
                                }
                            }
                        }else if(y < kingY && x > kingX) {
                            for (int a = 1; a < Math.abs(y-kingY); a++){
                                if(boardArray[y+a][x-a] != null){
                                    return whiteBishopCheck(kingX, kingY, whiteKing, x+1, y);
                                }
                            }
                        }else if(y > kingY && x < kingX) {
                            for (int a = 1; a < Math.abs(y-kingY); a++){
                                if(boardArray[y-a][x+a] != null){
                                    return whiteBishopCheck(kingX, kingY, whiteKing, x+1, y);
                                }
                            }
                        }else if(y > kingY && x > kingX) {
                            for (int a = 1; a < Math.abs(y - kingY); a++) {
                                if (boardArray[y - a][x - a] != null) {
                                    return whiteBishopCheck(kingX, kingY, whiteKing, x+1, y);
                                }
                            }
                        }
                    }else{
                        return whiteBishopCheck(kingX, kingY, whiteKing, x+1, y);
                    }
                    return true;
                }
            }
        }
        return false;
    }
    private boolean whiteKnightCheck(int kingX, int kingY, PieceKing whiteKing, int startX, int startY){
        for(int y = startY; y < boardArray.length; y++){
            for(int x = startX; x < boardArray[1].length; x++) {
                Piece arrayPiece = boardArray[y][x];
                if((arrayPiece instanceof PieceKnight) && (((PieceKnight) arrayPiece).isBlack())){
                    if( x + 2 == kingX && y + 1 == kingY ||
                            x + 2 == kingX && y - 1 == kingY ||
                            x + 1 == kingX && y + 2 == kingY ||
                            x + 1 == kingX && y - 2 == kingY ||
                            x - 2 == kingX && y + 1 == kingY ||
                            x - 2 == kingX && y - 1 == kingY ||
                            x - 1 == kingX && y + 2 == kingY ||
                            x - 1 == kingX && y - 2 == kingY ){
                        return true;
                    }else{
                        return whiteKnightCheck(kingX, kingY, whiteKing, x+1, y);
                    }
                }
            }
        }
        return false;
    }
    private boolean whiteQueenCheck(int kingX, int kingY, PieceKing whiteKing, int startX, int startY){
        for(int y = kingY; y < boardArray.length; y++){
            for(int x = kingX; x < boardArray[1].length; x++) {
                Piece arrayPiece = boardArray[y][x];
//                System.out.println(x + ", " + y);
                if((arrayPiece instanceof PieceQueen) && (((PieceQueen) arrayPiece).isBlack())){
                    if(x == kingX){ //rook is in line vertically lined up w/ king
                        System.out.println("Same x");
                        if(y < kingY) {
                            for (int a = y+1; a < kingY; a++){
                                if(boardArray[a][x] != null){
                                    return whiteQueenCheck(kingX, kingY, whiteKing, x+1, y);
                                }
                            }
                        }else{
                            for (int a = kingY + 1; a < y; a++){
                                if(boardArray[a][x] != null){
                                    return whiteQueenCheck(kingX, kingY, whiteKing, x+1, y);
                                }
                            }
                        }
                    }else if(y == kingY){ //rook is in line horizontally lined up w/ king
                        System.out.println("Same y");
                        if(x < kingX) {
                            for (int a = x+1; a < kingX; a++){
                                if(boardArray[y][a] != null){
                                    return whiteQueenCheck(kingX, kingY, whiteKing, x+1, y);
                                }
                            }
                        }else{
                            for (int a = kingX + 1; a < x; a++){
                                if(boardArray[y][a] != null){
                                    return whiteQueenCheck(kingX, kingY, whiteKing, x+1, y);
                                }
                            }
                        }
                    }else{
                        if(Math.abs(x - kingX) == (Math.abs(y - kingY))){ //bishop is horizontally lined up w/ king
                            if(y < kingY && x < kingX) {
                                for (int a = 1; a < Math.abs(y-kingY); a++){
                                    if(boardArray[y+a][x+a] != null){
                                        return whiteQueenCheck(kingX, kingY, whiteKing, x+1, y);
                                    }
                                }
                            }else if(y < kingY && x > kingX) {
                                System.out.println("top right");
                                for (int a = 1; a < Math.abs(y-kingY); a++){
                                    if(boardArray[y+a][x-a] != null){
                                        return whiteQueenCheck(kingX, kingY, whiteKing, x+1, y);
                                    }
                                }
                            }else if(y > kingY && x < kingX) {
                                for (int a = 1; a < Math.abs(y-kingY); a++){
                                    if(boardArray[y-a][x+a] != null){
                                        return whiteQueenCheck(kingX, kingY, whiteKing, x+1, y);
                                    }
                                }
                            }else if(y > kingY && x > kingX) {
                                for (int a = 1; a < Math.abs(y - kingY); a++) {
                                    if (boardArray[y + a][x - a] != null) {
                                        return whiteQueenCheck(kingX, kingY, whiteKing, x+1, y);
                                    }
                                }
                            }
                        }else{
                            return whiteQueenCheck(kingX, kingY, whiteKing, x+1, y);
                        }
                    }
                    return true;
                }
//                System.out.println("finna Is queen for diags");

            }
        }
        return false;
    }

    private boolean blackPawnCheck(int kingX, int kingY, PieceKing blackKing, int startX, int startY) {
        for (int y = startY; y < boardArray.length; y++) {
            for (int x = startX; x < boardArray[1].length; x++) {
                Piece arrayPiece = boardArray[y][x];
                if ((arrayPiece instanceof PiecePawn) && !((PiecePawn) arrayPiece).isBlack()) {
//                    System.out.println((x+1) + ", " + (y+1));
                    try {
                        if ((boardArray[y - 1][x + 1] == blackKing)) {
                            return true;
                        }else if ((boardArray[y - 1][x - 1] == blackKing)) {
                            return true;
                        }
                    }catch(ArrayIndexOutOfBoundsException e){}
                }
            }
        }
        return false;
    }
    private boolean blackRookCheck(int kingX, int kingY, PieceKing blackKing, int startX, int startY){
        for (int y = startY; y < boardArray.length; y++) {
            for (int x = startX; x < boardArray[1].length; x++) {
                Piece arrayPiece = boardArray[y][x];
                if((arrayPiece instanceof PieceRook) && !(((PieceRook) arrayPiece).isBlack())){
                    if(x == kingX){ //rook is in line vertically lined up w/ king
                        System.out.println("Vertical Line Up: " + x + ", " + y);
                        if(y < kingY) {
                            for (int a = y+1; a < kingY; a++){
                                if(boardArray[a][x] != null){
                                    return blackRookCheck(kingX, kingY, blackKing, x+1, y);
                                }
                            }
                        }else{
                            for (int a = kingY + 1; a < y; a++){
                                if(boardArray[a][x] != null){
                                    return blackRookCheck(kingX, kingY, blackKing, x+1, y);
                                }
                            }
                        }
                    }else if(y == kingY){ //rook is in line horizontally lined up w/ king
                        System.out.println("Horizontal Line Up: " + x + ", " + y);
                        if(x < kingX) {
                            for (int a = x+1; a < kingX; a++){
                                if(boardArray[y][a] != null){
                                    return blackRookCheck(kingX, kingY, blackKing, x+1, y);
                                }
                            }
                        }else{
                            for (int a = kingX + 1; a < x; a++){
                                if(boardArray[y][a] != null){
                                    return blackRookCheck(kingX, kingY, blackKing, x+1, y);
                                }
                            }
                        }
                    }else{
                        return blackRookCheck(kingX, kingY, blackKing, x+1, y);
                    }
                    return true;
                }
            }
        }
        return false;
    }
    private boolean blackBishopCheck(int kingX, int kingY, PieceKing blackKing, int startX, int startY){
        for (int y = startY; y < boardArray.length; y++) {
            for (int x = startX; x < boardArray[1].length; x++) {
                Piece arrayPiece = boardArray[y][x];
                if((arrayPiece instanceof PieceBishop) && !(((PieceBishop) arrayPiece).isBlack())){
                    if(Math.abs(x - kingX) == (Math.abs(y - kingY))){ //bishop is horizontally lined up w/ king
                        if(y < kingY && x < kingX) {
                            for (int a = 1; a < Math.abs(y-kingY); a++){
                                if(boardArray[y+a][x+a] != null){
                                    return blackBishopCheck(kingX, kingY, blackKing, x+1, y);
                                }
                            }
                        }else if(y < kingY && x > kingX) {
                            for (int a = 1; a < Math.abs(y-kingY); a++){
                                if(boardArray[y+a][x-a] != null){
                                    return blackBishopCheck(kingX, kingY, blackKing, x+1, y);
                                }
                            }
                        }else if(y > kingY && x < kingX) {
                            for (int a = 1; a < Math.abs(y-kingY); a++){
                                if(boardArray[y-a][x+a] != null){
                                    return blackBishopCheck(kingX, kingY, blackKing, x+1, y);
                                }
                            }
                        }else if(y > kingY && x > kingX) {
                            System.out.println("greater x2");
                            for (int a = 1; a < Math.abs(y - kingY); a++) {
                                if (boardArray[y - a][x - a] != null) {
                                    return blackBishopCheck(kingX, kingY, blackKing, x+1, y);
                                }
                            }
                        }
                    }else{
                        return blackBishopCheck(kingX, kingY, blackKing, x+1, y);
                    }
                    return true;
                }
            }
        }
        return false;
    }
    private boolean blackKnightCheck(int kingX, int kingY, PieceKing blackKing, int startX, int startY){
        for (int y = startY; y < boardArray.length; y++) {
            for (int x = startX+1; x < boardArray[1].length; x++) {
                Piece arrayPiece = boardArray[y][x];
                if((arrayPiece instanceof PieceKnight) && !(((PieceKnight) arrayPiece).isBlack())){
                    if( x + 2 == kingX && y + 1 == kingY ||
                            x + 2 == kingX && y - 1 == kingY ||
                            x + 1 == kingX && y + 2 == kingY ||
                            x + 1 == kingX && y - 2 == kingY ||
                            x - 2 == kingX && y + 1 == kingY ||
                            x - 2 == kingX && y - 1 == kingY ||
                            x - 1 == kingX && y + 2 == kingY ||
                            x - 1 == kingX && y - 2 == kingY ){
                        return true;
                    }else{
                        return false;
                    }
                }
            }
        }
        return false;
    }
    private boolean blackQueenCheck(int kingX, int kingY, PieceKing blackKing, int startX, int startY){
        for (int y = startY; y < boardArray.length; y++) {
            for (int x = startX; x < boardArray[1].length; x++) {
                Piece arrayPiece = boardArray[y][x];
//                System.out.println(x + ", " + y);
                if((arrayPiece instanceof PieceQueen) && !(((PieceQueen) arrayPiece).isBlack())){
                    if(x == kingX){ //rook is in line vertically lined up w/ king
                        System.out.println("Same x");
                        if(y < kingY) {
                            for (int a = y+1; a < kingY; a++){
                                if(boardArray[a][x] != null){
                                    return false;
                                }
                            }
                        }else{
                            for (int a = kingY + 1; a < y; a++){
                                if(boardArray[a][x] != null){
                                    return false;
                                }
                            }
                        }
                    }else if(y == kingY){ //rook is in line horizontally lined up w/ king
                        System.out.println("Same y");
                        if(x < kingX) {
                            for (int a = x+1; a < kingX; a++){
                                if(boardArray[y][a] != null){
                                    return false;
                                }
                            }
                        }else{
                            for (int a = kingX + 1; a < x; a++){
                                if(boardArray[y][a] != null){
                                    return false;
                                }
                            }
                        }
                    }else{
                        if(Math.abs(x - kingX) == (Math.abs(y - kingY))){ //bishop is horizontally lined up w/ king
                            if(y < kingY && x < kingX) {
                                for (int a = 1; a < Math.abs(y-kingY); a++){
                                    if(boardArray[y+a][x+a] != null){
                                        return false;
                                    }
                                }
                            }else if(y < kingY && x > kingX) {
                                System.out.println("top right");
                                for (int a = 1; a < Math.abs(y-kingY); a++){
                                    if(boardArray[y+a][x-a] != null){
                                        return false;
                                    }
                                }
                            }else if(y > kingY && x < kingX) {
                                for (int a = 1; a < Math.abs(y-kingY); a++){
                                    if(boardArray[y-a][x+a] != null){
                                        return false;
                                    }
                                }
                            }else if(y > kingY && x > kingX) {
                                for (int a = 1; a < Math.abs(y - kingY); a++) {
                                    if (boardArray[y - a][x - a] != null) {
                                        return false;
                                    }
                                }
                            }
                        }else{
                            return false;
                        }
                    }
                    return true;
                }
//                System.out.println("finna Is queen for diags");

            }
        }
        return false;
    }
    public boolean blackCheck(){
        int kingX = -1;
        int kingY = -1;
        PieceKing blackKing = new PieceKing(0,0,true, new Image("https://i.imgur.com/LXorSui.png"));
        for(int y = 0; y < boardArray.length; y++) {
            for (int x = 0; x < boardArray[1].length; x++) {
                //Find black king (T'CHALLA FOREVER)
                if (boardArray[y][x] instanceof PieceKing && ((PieceKing) boardArray[y][x]).isBlack()) {
                    kingX = x;
                    kingY = y;
                    blackKing = (PieceKing) boardArray[y][x];
                    System.out.println("Black King: " + kingX + ", " + kingY);
                }
            }
        }
        boolean blackPawnCheck =  blackPawnCheck(kingX, kingY, blackKing, 0 ,0);
        boolean blackRookCheck = blackRookCheck(kingX, kingY, blackKing, 0 ,0);
        boolean blackBishopCheck = blackBishopCheck(kingX, kingY, blackKing, 0 ,0);
        boolean blackKnightCheck = blackKnightCheck(kingX, kingY, blackKing, 0 ,0);
        boolean blackQueenCheck = blackQueenCheck(kingX, kingY, blackKing, 0 ,0);

        System.out.println("k: " + (blackPawnCheck || blackRookCheck || blackBishopCheck || blackKnightCheck || blackQueenCheck));



        return (blackPawnCheck || blackRookCheck || blackBishopCheck || blackKnightCheck || blackQueenCheck);
    }
    public boolean blackCheckmate(){
        int kingX = -1;
        int kingY = -1;
        PieceKing blackKing = new PieceKing(0,0,true, new Image("https://i.imgur.com/LXorSui.png"));
        for(int y = 0; y < boardArray.length; y++) {
            for (int x = 0; x < boardArray[1].length; x++) {
                //Find black king (T'CHALLA FOREVER)
                if (boardArray[y][x] instanceof PieceKing && ((PieceKing) boardArray[y][x]).isBlack()) {
                    kingX = x;
                    kingY = y;
                    blackKing = (PieceKing) boardArray[y][x];
                    System.out.println("Black King: " + kingX + ", " + kingY);
                }
            }
        }
        int[] xArray = new int[]{0, 0, 1, 1, 1, -1, -1, -1};
        int[] yArray = new int[]{-1, 1, -1, 0, 1, -1, 0, 1};
        for(int x = 0; x < xArray.length; x++){
            try{
                System.out.println((kingX + xArray[x]) + ", " + (kingY + yArray[x]));
                Piece oldPiece = boardArray[kingY + yArray[x]][kingX + xArray[x]];
                if(oldPiece == null || !oldPiece.isBlack()){
                    boardArray[kingY][kingX] = null;
                    boardArray[kingY + yArray[x]][kingX + xArray[x]] = blackKing;
                    if(!blackCheck()){
                        boardArray[kingY][kingX] = blackKing;
                        boardArray[kingY + yArray[x]][kingX + xArray[x]] = oldPiece;
                        return false;
                    }
                    boardArray[kingY][kingX] = blackKing;
                    boardArray[kingY + yArray[x]][kingX + xArray[x]] = oldPiece;
                }else if(oldPiece.isBlack()){
                    return false;
                }
            }catch(IndexOutOfBoundsException e){}
        }
        return true;
    }

    public boolean whiteCheckmate(){
        int kingX = -1;
        int kingY = -1;
        PieceKing whiteKing = new PieceKing(0,0,true, new Image("https://i.imgur.com/LXorSui.png"));
        for(int y = 0; y < boardArray.length; y++) {
            for (int x = 0; x < boardArray[1].length; x++) {
                //Find black king (T'CHALLA FOREVER)
                if (boardArray[y][x] instanceof PieceKing && ((PieceKing) boardArray[y][x]).isBlack()) {
                    kingX = x;
                    kingY = y;
                    whiteKing = (PieceKing) boardArray[y][x];
                    System.out.println("White King: " + kingX + ", " + kingY);
                }
            }
        }
        int[] xArray = new int[]{0, 0, 1, 1, 1, -1, -1, -1};
        int[] yArray = new int[]{-1, 1, -1, 0, 1, -1, 0, 1};
        for(int x = 0; x < xArray.length; x++){
            try{
                System.out.println((kingX + xArray[x]) + ", " + (kingY + yArray[x]));
                Piece oldPiece = boardArray[kingY + yArray[x]][kingX + xArray[x]];
                if(oldPiece == null || oldPiece.isBlack()){
                    boardArray[kingY][kingX] = null;
                    boardArray[kingY + yArray[x]][kingX + xArray[x]] = whiteKing;
                    if(!blackCheck()){
                        boardArray[kingY][kingX] = whiteKing;
                        boardArray[kingY + yArray[x]][kingX + xArray[x]] = oldPiece;
                        return false;
                    }
                    boardArray[kingY][kingX] = whiteKing;
                    boardArray[kingY + yArray[x]][kingX + xArray[x]] = oldPiece;
                }else if(!oldPiece.isBlack()){
                    return false;
                }
            }catch(IndexOutOfBoundsException e){}
        }
        return true;
    }

    public void Kings(){
        int kingAlive = 0;
        for (int y = 0; y < boardArray.length-1; y++) {
            for (int x = 0; x < boardArray[1].length-1; y++) {
                if(boardArray[y][x] != null) {
                    if (boardArray[y][x] instanceof PieceKing) {
                        kingAlive++;
                    }
                }
            }
        }
        if(kingAlive < 2){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Game Over");
            alert.setHeaderText(null);
            alert.setContentText("King is dead | The Cake is a lie");

            alert.showAndWait();
        }
    }


}