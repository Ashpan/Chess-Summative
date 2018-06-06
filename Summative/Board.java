import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Board extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("GridPane Experiment");

        Image whitePawn = new Image("https://i.imgur.com/rzBdMfr.png");
        Image blackPawn = new Image("https://i.imgur.com/brIfuCw.png");
        Image whiteKnight = new Image("https://i.imgur.com/PYMOTu6.png");
        Image blackKnight = new Image("https://i.imgur.com/JtHhDdK.png");
        Image whiteRook = new Image("https://i.imgur.com/Jx5SEs8.png");
        Image blackRook = new Image("https://i.imgur.com/OPBhfr9.png");
        Image whiteBishop = new Image("https://i.imgur.com/I15r48j.png");
        Image blackBishop = new Image("https://i.imgur.com/IR1asxl.png");
        Image whiteQueen = new Image("https://i.imgur.com/P0StNH9.png");
        Image blackQueen = new Image("https://i.imgur.com/1iLiq2G.png");
        Image whiteKing = new Image("https://i.imgur.com/nWpexOt.png");
        Image blackKing = new Image("https://i.imgur.com/Pz2Xg9Y.png");
        ImageView wPawn = new ImageView(whitePawn);
        ImageView wKnight = new ImageView(whiteKnight);
        ImageView wRook = new ImageView(whiteRook);
        ImageView wBishop = new ImageView(whiteBishop);
        ImageView wQueen = new ImageView(whiteQueen);
        ImageView wKing = new ImageView(whiteKing);

        GridPane gridPane = new GridPane();
        gridPane.add(wPawn, 0, 0, 1, 1);
        gridPane.add(wRook, 0, 0, 1, 1);
        gridPane.add(wKnight, 1, 0, 1, 1);
        gridPane.add(wBishop, 2, 0, 1, 1);
        gridPane.add(wQueen, 3, 0, 1, 1);
        gridPane.add(wKing, 4, 0, 1, 1);
        gridPane.add(wBishop, 5, 0, 1, 1);
        gridPane.add(wKnight, 6, 0, 1, 1);
        gridPane.add(wRook, 7, 0, 1, 1);
        Scene scene = new Scene(gridPane, 480,480);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}

