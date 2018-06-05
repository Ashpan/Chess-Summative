package TheNewICS4UR.Summative;


public class Board {
    public TheNewICS4UR.Summative.Piece[][] chessBoard; // A 2D Array which will store all the locations of the chess pieces and it will store the actual chess pieces

    public Board(int row, int column) {
        // The constructor of the Board class will create the 2D array (Board) based on the number of rows and columns
        chessBoard = new TheNewICS4UR.Summative.Piece[row][column];
    }

    public void addPiece(TheNewICS4UR.Summative.Piece chessPiece, int row, int column) {
        // This function will add a specific chess piece to a specific row and column
        chessBoard[row][column] = chessPiece;

    }


    public TheNewICS4UR.Summative.Piece getPiece(int row, int column) {
        // This function will return a chess piece based on the row and column
        return chessBoard[row][column];
    }


}
