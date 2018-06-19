import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Board extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Click click = new Click();
        Piece piece = new Piece();
        piece.init();
        piece.displayArray();
        primaryStage.setTitle("New Chess Game by Jian Ya---- I mean Omar + Ashpan!");
        GridPane gridPane = updateBoard(piece);
        Scene scene = new Scene(gridPane, 480,480);
        primaryStage.setScene(scene);
        primaryStage.show();


        scene.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            int prevX = -1, prevY = -1;
            int currX = -1 , currY = -1;
            @Override
            public void handle(MouseEvent event) {
                int xCoord = (int) event.getSceneX()/60;
                int yCoord = (int) event.getSceneY()/60;
                click.onClick();
                if(click.getClicks() == 1 && piece.exists(xCoord, yCoord)) {
                    if (click.getClicks() == 1) {
                        prevX = xCoord;
                        prevY = yCoord;
                    }
                }else if(click.getClicks() == 1 && !piece.exists(xCoord, yCoord)){
                    click.setClick(0);
                }
                if (click.getClicks() == 2) {
                    currX = xCoord;
                    currY = yCoord;
                    System.out.println("Prev: " + prevX + ", " + prevY);
                    System.out.println("Curr: " + currX + ", " + currY);
                    piece.makeMove(currX, currY, prevX, prevY);
                     piece.displayArray();

                    updateBoard(gridPane, piece);
//                    piece.whiteCheck();
//                    piece.blackCheck();
//                    piece.Kings();
//                    currPlayer = currPlayer == Player.white ? Player.black : Player.white;
                    String whiteCheck = piece.whiteCheck() ? "Check on White" : "";
                    String blackCheck = piece.blackCheck() ? "Check on Black" : "";
                    primaryStage.setTitle(piece.player() + " | " + whiteCheck + blackCheck);
                    if(piece.blackCheckmate()){
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Check");
                        alert.setHeaderText(null);
                        alert.setContentText("Black in checkmate! White Wins!");
                        alert.showAndWait();
                    }
                    if(piece.whiteCheckmate()){
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Check");
                        alert.setHeaderText(null);
                        alert.setContentText("White in checkmate! Black Wins!");
                        alert.showAndWait();
                    }

                }



            }
        });
//        updateBoard(gridPane, piece);

    }



    private static GridPane updateBoard(GridPane gridpane, Piece piece){
        gridpane.getChildren().clear();
        Image background = new Image("https://i.imgur.com/vnNyRP3.png");
        Background bgImage = new Background(new BackgroundImage(background, null, null, null, null));
        gridpane.setBackground(bgImage);
        for(int y = 0; y < piece.boardArray.length; y++){
            for (int x = 0; x < piece.boardArray[0].length; x++){
                Piece currentPiece = piece.boardArray[y][x];
                if(Piece.boardArray[y][x] instanceof PiecePawn) {
                    gridpane.add(new ImageView(((PiecePawn) currentPiece).getImage()), x, y);
                }else if(Piece.boardArray[y][x] instanceof PieceRook) {
                    gridpane.add(new ImageView(((PieceRook) currentPiece).getImage()), x, y);
                }else if(Piece.boardArray[y][x] instanceof PieceKnight) {
                    gridpane.add(new ImageView(((PieceKnight) currentPiece).getImage()), x, y);
                }else if(Piece.boardArray[y][x] instanceof PieceBishop) {
                    gridpane.add(new ImageView(((PieceBishop) currentPiece).getImage()), x, y);
                }else if(Piece.boardArray[y][x] instanceof PieceQueen) {
                    gridpane.add(new ImageView(((PieceQueen) currentPiece).getImage()), x, y);
                }else if(Piece.boardArray[y][x] instanceof PieceKing) {
                    gridpane.add(new ImageView(((PieceKing) currentPiece).getImage()), x, y);
                }else if(Piece.boardArray[x][y] == null){
                    gridpane.add(new ImageView(new Image("https://i.imgur.com/LXorSui.png")), x, y);
                }

            }
        }
        return gridpane;
    }


    private static GridPane updateBoard(Piece piece){
        GridPane gridpane = new GridPane();
        gridpane.getChildren().removeAll();
        Image background = new Image("https://i.imgur.com/vnNyRP3.png");
        Background bgImage = new Background(new BackgroundImage(background, null, null, null, null));
        gridpane.setBackground(bgImage);
        for(int y = 0; y < piece.boardArray.length; y++){
            for (int x = 0; x < piece.boardArray[0].length; x++){
                Piece currentPiece = piece.boardArray[y][x];
                if(Piece.boardArray[y][x] instanceof PiecePawn) {
                    gridpane.add(new ImageView(((PiecePawn) currentPiece).getImage()), x, y);
                }else if(Piece.boardArray[y][x] instanceof PieceRook) {
                    gridpane.add(new ImageView(((PieceRook) currentPiece).getImage()), x, y);
                }else if(Piece.boardArray[y][x] instanceof PieceKnight) {
                    gridpane.add(new ImageView(((PieceKnight) currentPiece).getImage()), x, y);
                }else if(Piece.boardArray[y][x] instanceof PieceBishop) {
                    gridpane.add(new ImageView(((PieceBishop) currentPiece).getImage()), x, y);
                }else if(Piece.boardArray[y][x] instanceof PieceQueen) {
                    gridpane.add(new ImageView(((PieceQueen) currentPiece).getImage()), x, y);
                }else if(Piece.boardArray[y][x] instanceof PieceKing) {
                    gridpane.add(new ImageView(((PieceKing) currentPiece).getImage()), x, y);
                }else if(Piece.boardArray[x][y] == null){
                    gridpane.add(new ImageView(new Image("https://i.imgur.com/LXorSui.png")), x, y);

                }
            }
        }
        return gridpane;
    }
}

