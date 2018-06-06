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
        ImageView wPawn1 = new ImageView(whitePawn);
        ImageView wPawn2 = new ImageView(whitePawn);
        ImageView wPawn3 = new ImageView(whitePawn);
        ImageView wPawn4 = new ImageView(whitePawn);
        ImageView wPawn5 = new ImageView(whitePawn);
        ImageView wPawn6 = new ImageView(whitePawn);
        ImageView wPawn7 = new ImageView(whitePawn);
        ImageView wPawn8 = new ImageView(whitePawn);
        ImageView wKnight1 = new ImageView(whiteKnight);
        ImageView wRook1 = new ImageView(whiteRook);
        ImageView wBishop1 = new ImageView(whiteBishop);
        ImageView wQueen = new ImageView(whiteQueen);
        ImageView wKing = new ImageView(whiteKing);
        ImageView wKnight2 = new ImageView(whiteKnight);
        ImageView wRook2 = new ImageView(whiteRook);
        ImageView wBishop2 = new ImageView(whiteBishop);

        ImageView bPawn1 = new ImageView(whitePawn);
        ImageView bPawn2 = new ImageView(whitePawn);
        ImageView bPawn3 = new ImageView(whitePawn);
        ImageView bPawn4 = new ImageView(whitePawn);
        ImageView bPawn5 = new ImageView(whitePawn);
        ImageView bPawn6 = new ImageView(whitePawn);
        ImageView bPawn7 = new ImageView(whitePawn);
        ImageView bPawn8 = new ImageView(whitePawn);
        ImageView bKnight1 = new ImageView(whiteKnight);
        ImageView bRook1 = new ImageView(whiteRook);
        ImageView bBishop1 = new ImageView(whiteBishop);
        ImageView bQueen = new ImageView(whiteQueen);
        ImageView bKing = new ImageView(whiteKing);
        ImageView bKnight2 = new ImageView(whiteKnight);
        ImageView bRook2 = new ImageView(whiteRook);
        ImageView bBishop2 = new ImageView(whiteBishop);

        GridPane gridPane = new GridPane();
        gridPane.add(wPawn1, 0, 0, 1, 1);
        gridPane.add(wRook1, 0, 0, 1, 1);
        gridPane.add(wKnight1, 1, 0, 1, 1);
        gridPane.add(wBishop1, 2, 0, 1, 1);
        gridPane.add(wQueen, 3, 0, 1, 1);
        gridPane.add(wKing, 4, 0, 1, 1);
        gridPane.add(wBishop2, 5, 0, 1, 1);
        gridPane.add(wKnight2, 6, 0, 1, 1);
        gridPane.add(wRook2, 7, 0, 1, 1);

        gridPane.add(bPawn1, 0, 1, 1, 1);
        gridPane.add(bPawn2, 1, 1, 1, 1);
        gridPane.add(bPawn3, 2, 1, 1, 1);
        gridPane.add(bPawn4, 3, 1, 1, 1);
        gridPane.add(bPawn5, 4, 1, 1, 1);
        gridPane.add(bPawn6, 5, 1, 1, 1);
        gridPane.add(bPawn7, 6, 1, 1, 1);
        gridPane.add(bPawn8, 7, 1, 1, 1);
        // gridPane.add(wRook2, 8, 1, 1, 1);

        Scene scene = new Scene(gridPane, 480,480);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}

