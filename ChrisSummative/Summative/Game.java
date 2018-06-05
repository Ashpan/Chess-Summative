/*
Game: Basic Chess
Name: Chris Lim
Date: Jan 22nd, 2018
Teacher: Mr. Le
References: At the bottom of this document

For 2 players - All Ages

*Important Notes*
* In-order to move pieces, you must click, drag, then release to where you want the piece to go to
* There's a small modification to the game: When the king is checked, you're not allowed to block.
* The game is over when the top of the game will either say "Black/White King Checked and the King can't move anywhere"
* When a pawn gets to the other side, it won't change to any other piece (Ex. Pawn won't turn into Queen)


Objective: To force the opponent into Checkmate. Checkmate is achieved when the opponent’s King is in a position where it cannot move without
being captured. A Player may also concede the game in defeat at any time if victory is deemed impossible.

Game Play: Light always moves first, and then the players alternate taking turns. Only one piece may be moved each turn.
All other pieces move only along unblocked spaces.
You may not move a piece to a square that is already occupied by your own pieces.
But you can capture your opponent’s piece that stands on a square where one of your pieces has
the ability to move to.
Simply remove the enemy piece from the board and put your own piece in its place.

Pieces Movement:
    The Queen: The Queen is the most powerful piece.
    She can move any direction
    (diagonally, horizontally, or vertically), any number
    of spaces, if her path is not blocked by a piece.

    The Bishop: The Bishop can move any number of squares
    diagonally if it’s path isn’t blocked. Note: If the bishop is on a
    light square, they can only travel on light squares. At set up,
    you can see that is one bishop on a dark square and one on
    a light square.

    The Knight: The Knight hops directly from the square
    it is currently on to a new one. The knight CAN jump
    over other pieces between its old and new position. Think of
    the knight's movement as an “L.” It moves two squares
    vertically or horizontally and then makes a right angle turn
    for one more square. The knight always lands on a square
    opposite in the color from the old one.

    The King: The King can move one square in any
    direction.
    The king may never move into check, which means
    onto a space that can allow the opponent to attack him.

    The Rook: The Rook is the second most powerful piece.
    The rook can move any number of squares horizontally or
    vertically if the path is not blocked by another piece.

    The Pawn: The Pawn moves straight ahead, never in
    reverse, but it captures pieces on a diagonal space.
    It moves one square at a time, but on its first move,
    it can move one or two spaces.
 */
package TheNewICS4UR.Summative;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;


public class Game extends Application {
    private boolean isBlackTurn = false; // The boolean that will determine if it's white or black's turn
    private TheNewICS4UR.Summative.Board logicBoard = new TheNewICS4UR.Summative.Board(8, 8); // This sets the board size which will then later be used to check for patterns in the chess board (Internally)
    private TheNewICS4UR.Summative.ImageBoard chessImageBoard = new TheNewICS4UR.Summative.ImageBoard(8, 8); // This creates an imageboard that holds the chess piece images which can be accessed later(Internally)
    private GridPane grid = new GridPane(); // The GridPane was chosen to created a checkered pattern for the chess board layout
    private Scene scene = new Scene(grid, 400, 400); // A 400px by 400px gameboard
    private int originalXPos; // The original X mouse position before the piece is moved
    private int originalYPos; // The original Y mouse position before the piece is moved
    private int translatedXPos; // The translated X mouse position to where the piece would like to be moved
    private int translatedYPos; // The translated Y mouse position to where the piece would like to be moved
    private Stage mainStage; // The mainStage holds the scene of the game which is then displayed
    private String musicFile = "C:\\OurData\\OurCurrent\\School Work\\Grade 12\\Computer Science\\Projects\\TheNewICS4UR\\Summative\\Sounds\\chessSound.mp3"; // The location of where the music file is stored
    private Media chessSound = new Media(new File(musicFile).toURI().toString()); // Setting the music file to a Media Object
    private MediaPlayer playMedia = new MediaPlayer(chessSound); // Using the Media Player Object to play the File (Media)(The Sound)
    private boolean kingChecked = false; // The boolean to determine whether the king is checked or not


    @Override
    public void start(Stage mainStage) {
        this.mainStage = mainStage; // Setting the class variable mainStage which is accessed later in the program
        createCheckeredBoard(); // Runs the checkerboard function
        listeners(); // Runs the listeners to check for mouse clicks/events
        defaultChessPosition(); // Setting the default chess positions
        mainStage.getIcons().add(new Image("file:" + "C:\\Users\\Chris\\Desktop\\workspace\\CompSci_Chris\\src\\TheNewICS4UR\\Summative\\Chess\\PawnB.png")); // Setting the icon of the application
        mainStage.sizeToScene(); // Resizing the main stage to the size of the gameBoard
        mainStage.setResizable(false); // Ensuring the user can't resize the game
        mainStage.setTitle("Chess! - White Turn"); // The head/title of the application
        mainStage.setScene(scene); // Setting the scene on the stage
        mainStage.show(); // Making the scene and it's components visible to the user when the program runs

    }

    public boolean isKingCheck(int translatedX, int translatedY) {
        // This function will check whether the king is in a checked position by using the translatedX and translatedY values to determine the king's check status
        final int resetX = translatedX; // This variable will reset
        TheNewICS4UR.Summative.Piece chessPiece = logicBoard.chessBoard[translatedY][translatedX];
        // Rewrite
        try {
            // Checking the chess piece to the chess color turn
            if (chessPiece.isBlack() != isBlackTurn) {
                // A switch statement based on the chess piece name to check whether the piece will check the king
                switch (chessPiece.getChessPieceName()) {
                    case "Pawn":
                        // This case will check if the Pawn is Black checks the King
                        if (translatedY - 1 >= 0 && translatedX + 1 < 8 && isBlackTurn && ((logicBoard.chessBoard[translatedY - 1][translatedX + 1] != null))) {
                            if (logicBoard.chessBoard[translatedY - 1][translatedX + 1].getChessPieceName().equals("King") && logicBoard.chessBoard[translatedY - 1][translatedX + 1].isBlack() == isBlackTurn) {
                                System.out.println("Checked");
                                return true;
                            }
                        }
                        // This case will check if the Pawn is Black checks the King
                        if (translatedY - 1 >= 0 && translatedX - 1 >= 0 && isBlackTurn && logicBoard.chessBoard[translatedY - 1][translatedX - 1] != null) {
                            if (logicBoard.chessBoard[translatedY - 1][translatedX - 1].getChessPieceName().equals("King") && logicBoard.chessBoard[translatedY - 1][translatedX - 1].isBlack() == isBlackTurn) {
                                System.out.println("Checked");
                                return true;
                            }
                        }
                        // This case will check if the Pawn is White checks the King
                        if (translatedY + 1 < 8 && translatedX - 1 >= 0 && !isBlackTurn && (logicBoard.chessBoard[translatedY + 1][translatedX - 1] != null)) {
                            if ((logicBoard.chessBoard[translatedY + 1][translatedX - 1].getChessPieceName().equals("King") && logicBoard.chessBoard[translatedY + 1][translatedX - 1].isBlack() == isBlackTurn)) {
                                System.out.println("Checked");
                                return true;
                            }
                        }
                        // This case will check if the Pawn is White checks the King
                        if (translatedY + 1 < 8 && translatedX + 1 < 8 && !isBlackTurn && (logicBoard.chessBoard[translatedY + 1][translatedX + 1] != null)) {
                            if ((logicBoard.chessBoard[translatedY + 1][translatedX + 1].getChessPieceName().equals("King")) && logicBoard.chessBoard[translatedY + 1][translatedX + 1].isBlack() == isBlackTurn) {
                                System.out.println("Checked");
                                return true;
                            }
                        }
                        break;
                    case "Knight":
                        // This case will check if the Knight checks the King in all possible directions it can move in
                        if (translatedX - 1 >= 0 && translatedY - 2 >= 0 && logicBoard.chessBoard[translatedY - 2][translatedX - 1] != null) {
                            if (logicBoard.chessBoard[translatedY - 2][translatedX - 1].getChessPieceName().equals("King") && logicBoard.chessBoard[translatedY - 2][translatedX - 1].isBlack() == isBlackTurn) {
                                System.out.println("Checked");
                                return true;
                            }
                        }
                        // This case will check if the Knight checks the King in all possible directions it can move in
                        if (translatedY - 2 >= 0 && translatedX + 1 < 8 && logicBoard.chessBoard[translatedY - 2][translatedX + 1] != null) {
                            if (logicBoard.chessBoard[translatedY - 2][translatedX + 1].getChessPieceName().equals("King") && logicBoard.chessBoard[translatedY - 2][translatedX + 1].isBlack() == isBlackTurn) {
                                System.out.println("Checked");
                                return true;
                            }
                        }
                        // This case will check if the Knight checks the King in all possible directions it can move in
                        if (translatedY - 1 >= 0 && translatedX + 2 < 8 && logicBoard.chessBoard[translatedY - 1][translatedX + 2] != null) {
                            if (logicBoard.chessBoard[translatedY - 1][translatedX + 2].getChessPieceName().equals("King") && logicBoard.chessBoard[translatedY - 1][translatedX + 2].isBlack() == isBlackTurn) {
                                System.out.println("Checked");
                                return true;
                            }
                        }
                        // This case will check if the Knight checks the King in all possible directions it can move in
                        if (translatedY - 1 >= 0 && translatedX - 2 >= 0 && logicBoard.chessBoard[translatedY - 1][translatedX - 2] != null) {
                            if (logicBoard.chessBoard[translatedY - 1][translatedX - 2].getChessPieceName().equals("King") && logicBoard.chessBoard[translatedY - 1][translatedX - 2].isBlack() == isBlackTurn) {
                                System.out.println("Checked");
                                return true;
                            }
                        }
                        if (translatedY + 1 < 8 && translatedX + 2 < 8 && logicBoard.chessBoard[translatedY + 1][translatedX + 2] != null) {
                            if (logicBoard.chessBoard[translatedY + 1][translatedX + 2].getChessPieceName().equals("King") && logicBoard.chessBoard[translatedY + 1][translatedX + 2].isBlack() == isBlackTurn) {
                                System.out.println("Checked");
                                return true;
                            }
                        }
                        // This case will check if the Knight checks the King in all possible directions it can move in
                        if (translatedY + 1 < 8 && translatedX - 2 >= 0 && logicBoard.chessBoard[translatedY + 1][translatedX - 2] != null) {
                            if (logicBoard.chessBoard[translatedY + 1][translatedX - 2].getChessPieceName().equals("King") && logicBoard.chessBoard[translatedY + 1][translatedX - 2].isBlack() == isBlackTurn) {
                                System.out.println("Checked");
                                return true;
                            }
                        }
                        // This case will check if the Knight checks the King in all possible directions it can move in
                        if (translatedY + 2 < 8 && translatedX - 1 >= 0 && logicBoard.chessBoard[translatedY + 2][translatedX - 1] != null) {
                            if (logicBoard.chessBoard[translatedY + 2][translatedX - 1].getChessPieceName().equals("King") && logicBoard.chessBoard[translatedY + 2][translatedX - 1].isBlack() == isBlackTurn) {
                                System.out.println("Checked");
                                return true;
                            }
                        }
                        // This case will check if the Knight checks the King in all possible directions it can move in
                        if (translatedY + 2 < 8 && translatedX + 1 < 8 && logicBoard.chessBoard[translatedY + 2][translatedX + 1] != null) {
                            if (logicBoard.chessBoard[translatedY + 2][translatedX + 1].getChessPieceName().equals("King") && logicBoard.chessBoard[translatedY + 2][translatedX + 1].isBlack() == isBlackTurn) {
                                System.out.println("Checked");
                                return true;
                            }
                        }
                        break;
                    case "Queen":
                        //This case will check if the Queen checks the King in all possible directions it can move in
                        for (int row = translatedY - 1; row >= 0; row--) { // Checking for if king is up
                            if (logicBoard.chessBoard[row][translatedX] != null) {
                                if ((logicBoard.chessBoard[row][translatedX].isBlack() == isBlackTurn) && logicBoard.chessBoard[row][translatedX].getChessPieceName().equals("King")) {
                                    System.out.println("Checked");
                                    return true;
                                }
                                break;
                            }
                        }
                        //This case will check if the Queen checks the King in all possible directions it can move in
                        for (int row = translatedY + 1; row < 8; row++) { // Checking for if king is down
                            if (logicBoard.chessBoard[row][translatedX] != null) {
                                if ((logicBoard.chessBoard[row][translatedX].isBlack() == isBlackTurn) && logicBoard.chessBoard[row][translatedX].getChessPieceName().equals("King")) {
                                    System.out.println("Checked");
                                    return true;
                                }
                                break;
                            }
                        }
                        //This case will check if the Queen checks the King in all possible directions it can move in
                        for (int column = translatedX - 1; column >= 0; column--) { // Checking for if king is to the left
                            if (logicBoard.chessBoard[translatedY][column] != null) {
                                if ((logicBoard.chessBoard[translatedY][column].isBlack() == isBlackTurn) && logicBoard.chessBoard[translatedY][column].getChessPieceName().equals("King")) {
                                    System.out.println("Checked");
                                    return true;
                                }
                                break;
                            }
                        }
                        //This case will check if the Queen checks the King in all possible directions it can move in
                        for (int column = translatedX + 1; column < 8; column++) { // Checking for if king is to the right
                            if (logicBoard.chessBoard[translatedY][column] != null) {
                                if ((logicBoard.chessBoard[translatedY][column].isBlack() == isBlackTurn) && logicBoard.chessBoard[translatedY][column].getChessPieceName().equals("King")) {
                                    System.out.println("Checked");
                                    return true;
                                }
                                break;
                            }
                        }
                        //This case will check if the Queen checks the King in all possible directions it can move in
                        for (int row = translatedY - 1; row >= 0; row--) { // North East
                            if (translatedX + 1 < 8 && logicBoard.chessBoard[row][translatedX += 1] != null) {
                                if (logicBoard.chessBoard[row][translatedX].getChessPieceName().equals("King") && logicBoard.chessBoard[row][translatedX].isBlack() == isBlackTurn) {
                                    System.out.println("Checked");
                                    return true;
                                }
                                break;
                            }
                        }
                        translatedX = resetX; // Resetting translatedX to check for the next possible case
                        //This case will check if the Queen checks the King in all possible directions it can move in
                        for (int row = translatedY - 1; row >= 0; row--) { // North West
                            if (translatedX - 1 >= 0 && logicBoard.chessBoard[row][translatedX -= 1] != null) {
                                if (logicBoard.chessBoard[row][translatedX].getChessPieceName().equals("King") && logicBoard.chessBoard[row][translatedX].isBlack() == isBlackTurn) {
                                    System.out.println("Checked");
                                    return true;
                                }
                                break;
                            }
                        }
                        translatedX = resetX;// Resetting translatedX to check for the next possible case
                        //This case will check if the Queen checks the King in all possible directions it can move in
                        for (int row = translatedY + 1; row < 8; row++) { // South East
                            if (translatedX + 1 < 8 && logicBoard.chessBoard[row][translatedX += 1] != null) {
                                if (logicBoard.chessBoard[row][translatedX].getChessPieceName().equals("King") && logicBoard.chessBoard[row][translatedX].isBlack() == isBlackTurn) {
                                    System.out.println("Checked");
                                    return true;
                                }
                                break;
                            }
                        }
                        translatedX = resetX;// Resetting translatedX to check for the next possible case
                        //This case will check if the Queen checks the King in all possible directions it can move in
                        for (int row = translatedY + 1; row < 8; row++) { // South West
                            if (translatedX - 1 >= 0 && logicBoard.chessBoard[row][translatedX -= 1] != null) {
                                if (logicBoard.chessBoard[row][translatedX].getChessPieceName().equals("King") && logicBoard.chessBoard[row][translatedX].isBlack() == isBlackTurn) {
                                    System.out.println("Checked");
                                    return true;
                                }
                                break;
                            }

                        }
                        break;
                    case "Rook":
                        // This case will check if the Rook checks the King in all possible directions it can move in
                        for (int row = translatedY - 1; row >= 0; row--) { // Checking for if king is up
                            if (logicBoard.chessBoard[row][translatedX] != null) {
                                if ((logicBoard.chessBoard[row][translatedX].isBlack() == isBlackTurn) && logicBoard.chessBoard[row][translatedX].getChessPieceName().equals("King")) {
                                    System.out.println("Checked");
                                    return true;
                                }
                                break;
                            }
                        }
                        // This case will check if the Rook checks the King in all possible directions it can move in
                        for (int row = translatedY + 1; row < 8; row++) { // Checking for if king is down
                            if (logicBoard.chessBoard[row][translatedX] != null) {
                                if ((logicBoard.chessBoard[row][translatedX].isBlack() == isBlackTurn) && logicBoard.chessBoard[row][translatedX].getChessPieceName().equals("King")) {
                                    System.out.println("Checked");
                                    return true;
                                }
                                break;
                            }
                        }
                        // This case will check if the Rook checks the King in all possible directions it can move in
                        for (int column = translatedX - 1; column >= 0; column--) { // Checking for if king is to the left
                            if (logicBoard.chessBoard[translatedY][column] != null) {
                                if ((logicBoard.chessBoard[translatedY][column].isBlack() == isBlackTurn) && logicBoard.chessBoard[translatedY][column].getChessPieceName().equals("King")) {
                                    System.out.println("Checked");
                                    return true;
                                }
                                break;
                            }
                        }
                        // This case will check if the Rook checks the King in all possible directions it can move in
                        for (int column = translatedX + 1; column < 8; column++) { // Checking for if king is to the right
                            if (logicBoard.chessBoard[translatedY][column] != null) {
                                if ((logicBoard.chessBoard[translatedY][column].isBlack() == isBlackTurn) && logicBoard.chessBoard[translatedY][column].getChessPieceName().equals("King")) {
                                    System.out.println("Checked");
                                    return true;
                                }
                                break;
                            }
                        }
                        break;
                    case "Bishop":
                        // This case will check if the Bishop checks the King in all possible directions it can move in
                        for (int row = translatedY - 1; row >= 0; row--) { // North East
                            if (translatedX + 1 < 8 && logicBoard.chessBoard[row][translatedX += 1] != null) {
                                if (logicBoard.chessBoard[row][translatedX].getChessPieceName().equals("King") && logicBoard.chessBoard[row][translatedX].isBlack() == isBlackTurn) {
                                    System.out.println("Checked");
                                    return true;
                                }
                                break;
                            }
                        }
                        translatedX = resetX;// Resetting translatedX to check for the next possible case
                        // This case will check if the Bishop checks the King in all possible directions it can move in
                        for (int row = translatedY - 1; row >= 0; row--) { // North West
                            if (translatedX - 1 >= 0 && logicBoard.chessBoard[row][translatedX -= 1] != null) {
                                if (logicBoard.chessBoard[row][translatedX].getChessPieceName().equals("King") && logicBoard.chessBoard[row][translatedX].isBlack() == isBlackTurn) {
                                    System.out.println("Checked");
                                    return true;
                                }
                                break;
                            }
                        }
                        translatedX = resetX;// Resetting translatedX to check for the next possible case
                        // This case will check if the Bishop checks the King in all possible directions it can move in
                        for (int row = translatedY + 1; row < 8; row++) { // South East
                            if (translatedX + 1 < 8 && logicBoard.chessBoard[row][translatedX += 1] != null) {
                                if (logicBoard.chessBoard[row][translatedX].getChessPieceName().equals("King") && logicBoard.chessBoard[row][translatedX].isBlack() == isBlackTurn) {
                                    System.out.println("Checked");
                                    return true;
                                }
                                break;
                            }
                        }
                        translatedX = resetX;// Resetting translatedX to check for the next possible case
                        // This case will check if the Bishop checks the King in all possible directions it can move in
                        for (int row = translatedY + 1; row < 8; row++) { // South West
                            if (translatedX - 1 >= 0 && logicBoard.chessBoard[row][translatedX -= 1] != null) {
                                if (logicBoard.chessBoard[row][translatedX].getChessPieceName().equals("King") && logicBoard.chessBoard[row][translatedX].isBlack() == isBlackTurn) {
                                    System.out.println("Checked");
                                    return true;
                                }
                                break;
                            }

                        }
                        break;
                }
            }
        }catch(NullPointerException e){ // Case for a non valid piece (Null)
            System.out.println(e.getMessage());
        }
        return false;
    }

    private void listeners() { // A listener function to handle with mouse events
        try {
            // A mouse listener when the mouse is pressed on the chess board
            grid.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouse) {
                    System.out.println(Math.round(mouse.getSceneX()) / 50 + "," + Math.round(mouse.getSceneY()) / 50);
                    originalXPos = (int) (Math.round(mouse.getSceneX()) / 50); // On the click, getting the original position of the mouse XCoord
                    originalYPos = (int) (Math.round(mouse.getSceneY()) / 50); // On the click, getting the original position of the mouse YCoord
                }
            });
            // A mouse listener when the mouse is released on the chess board
            grid.addEventFilter(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouse) {
                    System.out.println(Math.round(mouse.getSceneX()) / 50 + "," + Math.round(mouse.getSceneY()) / 50);
                    translatedXPos = (int) (Math.round(mouse.getSceneX()) / 50); // On the release, getting the translated position of the mouse XCoord
                    translatedYPos = (int) (Math.round(mouse.getSceneY()) / 50); // On the release, getting the translated position of the mouse YCoord
                    onClick(originalXPos, originalYPos, translatedXPos, translatedYPos); // This function will be called after the mouse is released sending the original coordinates of the chess piece and the translated coordinates
                }
            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void createCheckeredBoard() {
        // Creating the checkered pattern for the game of chess
        for (int row = 0; row <= 7; row++) {
            for (int column = 0; column <= 7; column++) {
                if (row % 2 != 0) {
                    if (column % 2 == 0) {
                        // Checking for different patterns when creating the board to ensure that it's an alternating pattern
                        grid.add(new Rectangle(50, 50, Color.SANDYBROWN), row, column); // Creating rectangles with a width and height of 50 to create square shaped tiles
                    } else {
                        grid.add(new Rectangle(50, 50, Color.WHITESMOKE), row, column);
                    }
                } else {
                    if (column % 2 == 0) {
                        grid.add(new Rectangle(50, 50, Color.WHITESMOKE), row, column);
                    } else {
                        grid.add(new Rectangle(50, 50, Color.SANDYBROWN), row, column);

                    }
                }
            }
        }
    }

    public void setIsBlackTurn(boolean isBlackTurn) {
        // This function will set whether it is Black or Whites Turn
        this.isBlackTurn = isBlackTurn;
    }

    private void onClick(int originalMouseX, int originalMouseY, int translatedMouseX, int translatedMouseY) {
        // This function will handle the cases when the mouse was pressed and released
        boolean isValidMove = false;
        TheNewICS4UR.Summative.Piece chessPiece = logicBoard.getPiece(originalMouseY, originalMouseX); // Obtaining the chess piece on the gameboard
        // Case checking if the piece is able to move from one position to another
        if (!kingChecked) { // Checking if the king was checked before continuing with the chess piece movement
            try {
                switch (chessPiece.getChessPieceName()) { // A switch case based on the chess piece name
                    case "Pawn":
                        if (chessPiece.isBlack() == isBlackTurn) { // Checking whether it's White or Black's turn
                            boolean singleSpaceMove = ((TheNewICS4UR.Summative.Pawn) chessPiece).canMoveSingleSpace(originalMouseX, originalMouseY, translatedMouseX, translatedMouseY, isBlackTurn, chessImageBoard.imgBoard);
                            boolean diagonalSingleMove = ((TheNewICS4UR.Summative.Pawn) chessPiece).canMoveDiagonal(originalMouseX, originalMouseY, translatedMouseX, translatedMouseY, isBlackTurn, chessImageBoard.imgBoard, logicBoard.chessBoard);
                            // This will determine whether the Pawn needs to take a piece off the board and replace it
                            if (diagonalSingleMove && (!logicBoard.chessBoard[translatedMouseY][translatedMouseX].getChessPieceName().equals("King"))) {
                                grid.getChildren().remove(chessImageBoard.getPiece(translatedMouseY, translatedMouseX));
                                isValidMove = true;
                            }
                            if (singleSpaceMove) {
                                isValidMove = true;
                            }
                        }

                        break;
                    case "Rook":
                        if (chessPiece.isBlack() == isBlackTurn) { // Checking whether it's White or Black's turn
                            // Checking if the Rook can move in that certain direction
                            if (((TheNewICS4UR.Summative.Rook) chessPiece).canMoveVertical(originalMouseX, originalMouseY, translatedMouseX, translatedMouseY, logicBoard.chessBoard)) {
                                try {
                                    // This will determine whether the Rook will take a piece off the board and replace it
                                    if ((logicBoard.chessBoard[originalMouseY][originalMouseX]).isBlack() && !((logicBoard.chessBoard[translatedMouseY][translatedMouseX]).isBlack()) || !((logicBoard.chessBoard[originalMouseY][originalMouseX]).isBlack()) && ((logicBoard.chessBoard[translatedMouseY][translatedMouseX]).isBlack()) && (logicBoard.chessBoard[translatedMouseY][translatedMouseX]).getChessPieceName() != "King") {
                                        grid.getChildren().remove(chessImageBoard.getPiece(translatedMouseY, translatedMouseX));
                                        chessImageBoard.imgBoard[translatedMouseY][translatedMouseX] = null;
                                    }
                                } catch (NullPointerException e) {
                                    System.out.println(e.getMessage());
                                }
                                // If the Rook isn't taking any other piece off the board and the place that it's going is an empty spot, then it will be a valid move
                                if (chessImageBoard.imgBoard[translatedMouseY][translatedMouseX] == null) {
                                    isValidMove = true;
                                }
                            }
                        }
                        break;
                    case "Knight":
                        if (chessPiece.isBlack() == isBlackTurn) { // Checking whether it's White or Black's turn
                            // Checking if the Knight can move in that certain direction
                            if (((TheNewICS4UR.Summative.Knight) chessPiece).canMoveInLShape(originalMouseX, originalMouseY, translatedMouseX, translatedMouseY    )) {
                                try {
                                    // This will determine whether the Knight will take a piece off the board and replace it
                                    if ((logicBoard.chessBoard[originalMouseY][originalMouseX]).isBlack() && !((logicBoard.chessBoard[translatedMouseY][translatedMouseX]).isBlack()) || !((logicBoard.chessBoard[originalMouseY][originalMouseX]).isBlack()) && ((logicBoard.chessBoard[translatedMouseY][translatedMouseX]).isBlack()) && (!logicBoard.chessBoard[translatedMouseY][translatedMouseX].getChessPieceName().equals("King"))) {
                                        grid.getChildren().remove(chessImageBoard.getPiece(translatedMouseY, translatedMouseX));
                                        chessImageBoard.imgBoard[translatedMouseY][translatedMouseX] = null;
                                    }
                                } catch (NullPointerException e) {
                                    System.out.println(e.getMessage());
                                }
                                // If the Knight isn't taking any other piece off the board and the place that it's going is an empty spot, then it will be a valid move
                                if (chessImageBoard.imgBoard[translatedMouseY][translatedMouseX] == null) {
                                    isValidMove = true;
                                }
                            }
                        }
                        break;
                    case "Bishop":
                        if (chessPiece.isBlack() == isBlackTurn) { // Checking whether it's White or Black's turn
                            // Checking if the Bishop can move in that certain direction
                            if (((TheNewICS4UR.Summative.Bishop) chessPiece).canMoveDiagonal(originalMouseX, originalMouseY, translatedMouseX, translatedMouseY, logicBoard.chessBoard)) {
                                try {
                                    // This will determine whether the Bishop will take a piece off the board and replace it
                                    if ((logicBoard.chessBoard[originalMouseY][originalMouseX]).isBlack() && !((logicBoard.chessBoard[translatedMouseY][translatedMouseX]).isBlack()) || !((logicBoard.chessBoard[originalMouseY][originalMouseX]).isBlack()) && ((logicBoard.chessBoard[translatedMouseY][translatedMouseX]).isBlack()) && (logicBoard.chessBoard[translatedMouseY][translatedMouseX]).getChessPieceName() != "King") {
                                        grid.getChildren().remove(chessImageBoard.getPiece(translatedMouseY, translatedMouseX));
                                        chessImageBoard.imgBoard[translatedMouseY][translatedMouseX] = null;
                                    }
                                } catch (NullPointerException e) {
                                    System.out.println(e.getMessage());
                                }
                                // If the Bishop isn't taking any other piece off the board and the place that it's going is an empty spot, then it will be a valid move
                                if (chessImageBoard.imgBoard[translatedMouseY][translatedMouseX] == null) {
                                    isValidMove = true;
                                }
                            }
                        }
                        break;
                    case "King":
                        if (chessPiece.isBlack() == isBlackTurn) { // Checking whether it's White or Black's turn
                            // Checking if the King can move in that certain direction
                            if (((TheNewICS4UR.Summative.King) chessPiece).canMove(originalMouseX, originalMouseY, translatedMouseX, translatedMouseY, logicBoard.chessBoard)) {
                                {
                                    TheNewICS4UR.Summative.Piece originalPiece = logicBoard.chessBoard[originalMouseY][originalMouseX]; // Checking if the king can move in that position, if not then these will be kept as constants to revert the temporary change
                                    TheNewICS4UR.Summative.Piece translatedPiece = logicBoard.chessBoard[translatedMouseY][translatedMouseX]; // Checking if the king can move in that position, if not then these will be kept as constants to revert temporary change
                                    logicBoard.chessBoard[translatedMouseY][translatedMouseX] = logicBoard.chessBoard[originalMouseY][originalMouseX];
                                    logicBoard.chessBoard[originalMouseY][originalMouseX] = null;
                                    if (checkKingIsChecked()) { // If the King cant move in that position, then it will revert the temporary change that was made
                                        logicBoard.chessBoard[translatedMouseY][translatedMouseX] = translatedPiece;
                                        logicBoard.chessBoard[originalMouseY][originalMouseX] = originalPiece;
                                        break;
                                    }else {
                                        logicBoard.chessBoard[translatedMouseY][translatedMouseX] = translatedPiece;
                                        logicBoard.chessBoard[originalMouseY][originalMouseX] = originalPiece;
                                    }
                                    try {
                                        // This will determine whether the King will take a piece off the board and replace it
                                        if ((logicBoard.chessBoard[originalMouseY][originalMouseX]).isBlack() && !((logicBoard.chessBoard[translatedMouseY][translatedMouseX]).isBlack()) || !((logicBoard.chessBoard[originalMouseY][originalMouseX]).isBlack()) && ((logicBoard.chessBoard[translatedMouseY][translatedMouseX]).isBlack()) && (logicBoard.chessBoard[translatedMouseY][translatedMouseX]).getChessPieceName() != "King") {
                                            grid.getChildren().remove(chessImageBoard.getPiece(translatedMouseY, translatedMouseX));
                                            chessImageBoard.imgBoard[translatedMouseY][translatedMouseX] = null;
                                        }
                                    } catch (NullPointerException e) {
                                        System.out.println(e.getMessage());
                                    }
                                    // If the King isn't taking any other piece off the board and the place that it's going is an empty spot, then it will be a valid move
                                    if (chessImageBoard.imgBoard[translatedMouseY][translatedMouseX] == null) {
                                        isValidMove = true;
                                    }
                                }
                            }
                        }
                        break;
                    case "Queen":
                        if (chessPiece.isBlack() == isBlackTurn) { // Checking whether it's White or Black's turn
                            // Checking if the Queen can move in that certain direction
                            if (((TheNewICS4UR.Summative.Queen) chessPiece).canMoveVertical(originalMouseX, originalMouseY, translatedMouseX, translatedMouseY, logicBoard.chessBoard) || ((TheNewICS4UR.Summative.Queen) chessPiece).canMoveDiagonal(originalMouseX, originalMouseY, translatedMouseX, translatedMouseY, logicBoard.chessBoard)) {
                                {
                                    try {
                                        // This will determine whether the Queen will take a piece off the board and replace it
                                        if ((logicBoard.chessBoard[originalMouseY][originalMouseX]).isBlack() && !((logicBoard.chessBoard[translatedMouseY][translatedMouseX]).isBlack()) || !((logicBoard.chessBoard[originalMouseY][originalMouseX]).isBlack()) && ((logicBoard.chessBoard[translatedMouseY][translatedMouseX]).isBlack()) && (!logicBoard.chessBoard[translatedMouseY][translatedMouseX].getChessPieceName().equals("King"))) {
                                            grid.getChildren().remove(chessImageBoard.getPiece(translatedMouseY, translatedMouseX));
                                            chessImageBoard.imgBoard[translatedMouseY][translatedMouseX] = null;
                                        }
                                    } catch (NullPointerException e) {
                                        System.out.println(e.getMessage());
                                    }
                                    // If the Queen isn't taking any other piece off the board and the place that it's going is an empty spot, then it will be a valid move
                                    if (chessImageBoard.imgBoard[translatedMouseY][translatedMouseX] == null) {
                                        isValidMove = true;
                                    }
                                }
                            }
                        }
                        break;
                }
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
        } else { // If the king is checked, then this part of the if statement will run and will execute with the King movements
            try {
                if ((chessPiece).isBlack() == isBlackTurn) { // Checking whether it's White or Black's turn
                    // Checking if the King can move in that certain direction
                    if (((TheNewICS4UR.Summative.King) chessPiece).canMove(originalMouseX, originalMouseY, translatedMouseX, translatedMouseY, logicBoard.chessBoard)) {
                        {
                            TheNewICS4UR.Summative.Piece originalPiece = logicBoard.chessBoard[originalMouseY][originalMouseX]; // Checking if the king can move in that position, if not then these will be kept as constants to revert the temporary change
                            TheNewICS4UR.Summative.Piece translatedPiece = logicBoard.chessBoard[translatedMouseY][translatedMouseX]; // Checking if the king can move in that position, if not then these will be kept as constants to revert temporary change
                            logicBoard.chessBoard[translatedMouseY][translatedMouseX] = logicBoard.chessBoard[originalMouseY][originalMouseX];
                            logicBoard.chessBoard[originalMouseY][originalMouseX] = null;
                            if (!checkKingIsChecked()) { // If the king cant move in that position, then it will revert the temporary change that was made
                                kingChecked = false;
                            }
                            logicBoard.chessBoard[translatedMouseY][translatedMouseX] = translatedPiece; // Reverting the temporary changes made
                            logicBoard.chessBoard[originalMouseY][originalMouseX] = originalPiece; // Reverting the temporary changes made
                            try {
                                // This will determine whether the King will take a piece off the board and replace it
                                if ((logicBoard.chessBoard[originalMouseY][originalMouseX]).isBlack() && !((logicBoard.chessBoard[translatedMouseY][translatedMouseX]).isBlack()) || !((logicBoard.chessBoard[originalMouseY][originalMouseX]).isBlack()) && ((logicBoard.chessBoard[translatedMouseY][translatedMouseX]).isBlack()) && (logicBoard.chessBoard[translatedMouseY][translatedMouseX]).getChessPieceName() != "King") {
                                    grid.getChildren().remove(chessImageBoard.getPiece(translatedMouseY, translatedMouseX));
                                    chessImageBoard.imgBoard[translatedMouseY][translatedMouseX] = null;
                                }
                            } catch (NullPointerException e) {
                                System.out.println(e.getMessage());
                            }
                            // If the King isn't taking any other piece off the board and the place that it's going is an empty spot, then it will be a valid move
                            if (chessImageBoard.imgBoard[translatedMouseY][translatedMouseX] == null) {
                                isValidMove = true;
                            }
                        }
                    }
                }
            } catch (ClassCastException e) { // Catching exceptions in the event that another piece is trying to be played when the King can only be moved
                System.out.println("Only King Can Move");
            } catch (NullPointerException e) { // When a non valid chess piece is used then the error will be printed
                System.out.println(e.getMessage());
            }
        }
        if (isValidMove) { // The if statement will run when the move from the chess piece is deemed valid
            grid.getChildren().remove(chessImageBoard.getPiece(originalMouseY, originalMouseX)); // Removing the piece from it's original position
            grid.add(chessImageBoard.getPiece(originalMouseY, originalMouseX), translatedMouseX, translatedMouseY); // Adding the piece to its new position
            chessImageBoard.imgBoard[translatedMouseY][translatedMouseX] = chessImageBoard.imgBoard[originalMouseY][originalMouseX]; // Changing the image board with the new images in their new locations
            chessImageBoard.imgBoard[originalMouseY][originalMouseX] = null; // Setting the old location as null
            logicBoard.chessBoard[translatedMouseY][translatedMouseX] = logicBoard.chessBoard[originalMouseY][originalMouseX]; // Changing the game board with their new chess piece locations
            logicBoard.chessBoard[originalMouseY][originalMouseX] = null; // Setting the old location as null
            setIsBlackTurn(false); // Changing the turn for the other player to go
            if (chessPiece.isBlack() == isBlackTurn) {
                setIsBlackTurn(true);
            }
            playMedia.play(); // Playing the sound which indicates that a chess piece moved
            playMedia.seek(Duration.ZERO); // Resetting the sound back to 0 seconds
            kingChecked = isKingCheck(translatedMouseX, translatedMouseY); // This will set whether the king is checked after a chess piece has moved

        }
        // This if statement will occur to switch whether it is Black or White's turn
        if (isBlackTurn) {
            if (kingChecked) {
                mainStage.setTitle("Chess! - Black King Checked"); // This title will be set if the Black King is checked
            } else {
                mainStage.setTitle("Chess! - Black Turn"); // The head/title of the application

            }
        } else {
            if (kingChecked) {
                mainStage.setTitle("Chess! - White King Checked"); // This title will be set if the White King is checked
            } else {
                mainStage.setTitle("Chess! - White Turn"); // The head/title of the application
            }
        }
    }


    public boolean checkKingIsChecked() {
        // This function will run through every single piece of the opposing color to check whether the King is in a checked state or not
        for (int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                if (logicBoard.chessBoard[row][column] != null) {
                    if (logicBoard.chessBoard[row][column].isBlack() == !isBlackTurn) {
                        if (isKingCheck(column, row)) {
                            return true; // Returning true if the king is checked
                        }
                    }
                }
            }
        }
        return false;
    }

    private void defaultChessPosition() {
        // Setting the default chess positions of the pieces when the game starts
        for (int i = 0; i <= 7; i++) {
            logicBoard.addPiece(new TheNewICS4UR.Summative.Pawn(false), 6, i); // Added the Pawn to the game board board (internal calculations)
            logicBoard.addPiece(new TheNewICS4UR.Summative.Pawn(true), 1, i); // Added the Pawn to the game board board (internal calculations)
            // Added white and black pawn pieces to the chess image board which is then displayed on the chess board
            chessImageBoard.addPiece(((logicBoard.getPiece(6, i)).getImage()), 6, i);
            chessImageBoard.addPiece(((logicBoard.getPiece(1, i)).getImage()), 1, i);
            grid.add((chessImageBoard.getPiece(6, i)), i, 6);
            grid.add((chessImageBoard.getPiece(1, i)), i, 1);
        }

        for (int i = 0; i <= 7; i += 7) {
            logicBoard.addPiece(new TheNewICS4UR.Summative.Rook(false), 7, i); // Added the Rook to the game board board (internal calculations)
            logicBoard.addPiece(new TheNewICS4UR.Summative.Rook(true), 0, i); // Added the Rook to the game board board (internal calculations)
            // Added white and black rook pieces to the chess image board which is then displayed on the chess board
            chessImageBoard.addPiece(((logicBoard.getPiece(7, i)).getImage()), 7, i);
            chessImageBoard.addPiece(((logicBoard.getPiece(0, i)).getImage()), 0, i);
            grid.add((chessImageBoard.getPiece(7, i)), i, 7);
            grid.add((chessImageBoard.getPiece(0, i)), i, 0);
        }
        for (int i = 1; i <= 6; i += 5) {
            logicBoard.addPiece(new TheNewICS4UR.Summative.Knight(false), 7, i); // Added the Knight to the game board board (internal calculations)
            logicBoard.addPiece(new TheNewICS4UR.Summative.Knight(true), 0, i); // Added the Knight to the game board board (internal calculations)
            // Added white and black knight pieces to the chess image board which is then displayed on the chess board
            chessImageBoard.addPiece(((logicBoard.getPiece(7, i)).getImage()), 7, i);
            chessImageBoard.addPiece(((logicBoard.getPiece(0, i)).getImage()), 0, i);
            grid.add((chessImageBoard.getPiece(7, i)), i, 7);
            grid.add((chessImageBoard.getPiece(0, i)), i, 0);
        }
        for (int i = 2; i <= 5; i += 3) {
            logicBoard.addPiece(new TheNewICS4UR.Summative.Bishop(false), 7, i); // Added the Bishop to the game board board (internal calculations)
            logicBoard.addPiece(new TheNewICS4UR.Summative.Bishop(true), 0, i); // Added the Bishop to the game board board (internal calculations)
            // Added white and black bishop pieces to the chess image board which is then displayed on the chess board
            chessImageBoard.addPiece(((logicBoard.getPiece(7, i)).getImage()), 7, i);
            chessImageBoard.addPiece(((logicBoard.getPiece(0, i)).getImage()), 0, i);
            grid.add((chessImageBoard.getPiece(7, i)), i, 7);
            grid.add((chessImageBoard.getPiece(0, i)), i, 0);
        }
        logicBoard.addPiece(new TheNewICS4UR.Summative.King(false), 7, 4); // Added the King to the game board board (internal calculations)
        logicBoard.addPiece(new TheNewICS4UR.Summative.King(true), 0, 4); // Added the King to the game board board (internal calculations)
        // Added white and black King pieces to the chess image board which is then displayed on the chess board
        chessImageBoard.addPiece(((logicBoard.getPiece(7, 4)).getImage()), 7, 4);
        chessImageBoard.addPiece(((logicBoard.getPiece(0, 4)).getImage()), 0, 4);
        grid.add((chessImageBoard.getPiece(7, 4)), 4, 7);
        grid.add((chessImageBoard.getPiece(0, 4)), 4, 0);


        logicBoard.addPiece(new TheNewICS4UR.Summative.Queen(false, TheNewICS4UR.Summative.Queen.NAME), 7, 3); // Added the Queen to the game board board (internal calculations)
        logicBoard.addPiece(new TheNewICS4UR.Summative.Queen(true, TheNewICS4UR.Summative.Queen.NAME), 0, 3); // Added the Queen to the game board board (internal calculations)
        // Added white and black Queen pieces to the chess image board which is then displayed on the chess board
        chessImageBoard.addPiece(((logicBoard.getPiece(7, 3)).getImage()), 7, 3);
        chessImageBoard.addPiece(((logicBoard.getPiece(0, 3)).getImage()), 0, 3);
        grid.add((chessImageBoard.getPiece(7, 3)), 3, 7);
        grid.add((chessImageBoard.getPiece(0, 3)), 3, 0);

    }

    public static void main(String[] args) {
        launch(args); // The launch function will internally call the start function to start the program
    }
}

/*
References:
    Game Instructions: https://endlessgames.com/wp-content/uploads/instructions/Chess_Checkers_Instructions.pdf
    Ideas/Inspiration/Help: https://github.com/Stevoisiak/JavaFX-Online-Chess
 */