package TheNewICS4UR.Summative;


import javafx.scene.image.Image; // Using Image for the individual chess pieces
import javafx.scene.image.ImageView; // Using the ImageView to create the images that will appear on the chess board

public abstract class Piece { // The piece is an abstract class as it defines the generic way of how a chess pieces is created
    private boolean hasMoved = false; // This boolean is to determine whether the chess piece has moved
    private Image pieceImage;  // This is the image of the particular chess piece
    private String chessPieceName; // This is the chess piece name
    private boolean isBlack; // This boolean is to differentiate between the White and Black chess pieces

    public Piece(boolean isBlack, String chessPieceName) {
        // The constructor of the Piece will take in the chess piece name along with whether it's Black or White
        this.chessPieceName = chessPieceName;
        this.isBlack = isBlack;

        if (isBlack) {
            // If the chess piece is Black, then it will locate the image for the particular Black chess piece
            try { // If the chess piece can't be found
                pieceImage = new Image("file:" + "C:\\OurData\\OurCurrent\\School Work\\Grade 12\\Computer Science\\Projects\\TheNewICS4UR\\Summative\\Chess\\" + chessPieceName + "B.png");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            try { // Exception handling in the event that the image is not found
                // If the chess piece is (Not Black)/(White), then it will locate the image for the particular White chess piece
                pieceImage = new Image("file:" + "C:\\OurData\\OurCurrent\\School Work\\Grade 12\\Computer Science\\Projects\\TheNewICS4UR\\Summative\\Chess\\" + chessPieceName + "W.png");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public ImageView getImage() {
        // This function will return the image of the chess piece
        ImageView imgViewPiece = new ImageView(pieceImage);
        // This will set the defined width and height of the chess piece
        imgViewPiece.setFitWidth(50);
        imgViewPiece.setFitHeight(50);
        return imgViewPiece;
    }

    public String getChessPieceName() {
        // This function will return the name of the chess piece
        return chessPieceName;
    }

    public void setHasMoved(boolean moved) {
        // This function will set True or False whether the chess piece has moved
        hasMoved = moved;
    }

    public boolean hasMoved() {
        // This function will return the status of True or False whether the chess piece has moved or not
        return hasMoved;
    }

    public boolean isBlack() {
        // This function will return True or False whether the chess piece is Black or White
        return isBlack;
    }

}
