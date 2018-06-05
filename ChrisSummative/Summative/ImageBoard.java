package TheNewICS4UR.Summative;
// *Note*
// This differs from the Board class as the Board class class holds the actual chess piece object and as for the ImageBoard it holds the Images of the chess piece
// The reason this was created is because when the Chess piece returns the image, it creates a new instance of an image which differs from the actual chess piece object
import javafx.scene.image.ImageView; // Using the ImageViews which are held in a 2D array

public class ImageBoard {
    public ImageView[][] imgBoard; // A 2D Array which will store all the locations of the chess pieces along with the chess piece images

    public ImageBoard(int row, int column) {
        // The constructor of the ImageBoard class will create the 2D array (ImageBoard) based on the number of rows and columns
        imgBoard = new ImageView[row][column];
    }

    public void addPiece(ImageView chessPiece, int row, int column) {
        // This function will add a chess piece to the specific row and column in the 2D array
        imgBoard[row][column] = chessPiece;
    }


    public ImageView getPiece(int row, int column) {
        // This returns a chess piece on the 2D array based on the row and column
        return imgBoard[row][column];
    }
}


