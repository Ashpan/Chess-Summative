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

        ImageView bPawn1 = new ImageView(blackPawn);
        ImageView bPawn2 = new ImageView(blackPawn);
        ImageView bPawn3 = new ImageView(blackPawn);
        ImageView bPawn4 = new ImageView(blackPawn);
        ImageView bPawn5 = new ImageView(blackPawn);
        ImageView bPawn6 = new ImageView(blackPawn);
        ImageView bPawn7 = new ImageView(blackPawn);
        ImageView bPawn8 = new ImageView(blackPawn);
        ImageView bKnight1 = new ImageView(blackKnight);
        ImageView bRook1 = new ImageView(blackRook);
        ImageView bBishop1 = new ImageView(blackBishop);
        ImageView bQueen = new ImageView(blackQueen);
        ImageView bKing = new ImageView(blackKing);
        ImageView bKnight2 = new ImageView(blackKnight);
        ImageView bRook2 = new ImageView(blackRook);
        ImageView bBishop2 = new ImageView(blackBishop);

        GridPane gridPane = new GridPane();
        gridPane.add(bRook1, 0, 0, 1, 1);
        gridPane.add(bKnight1, 1, 0, 1, 1);
        gridPane.add(bBishop1, 2, 0, 1, 1);
        gridPane.add(bQueen, 3, 0, 1, 1);
        gridPane.add(bKing, 4, 0, 1, 1);
        gridPane.add(bBishop2, 5, 0, 1, 1);
        gridPane.add(bKnight2, 6, 0, 1, 1);
        gridPane.add(bRook2, 7, 0, 1, 1);
        gridPane.add(bPawn1, 0, 1, 1, 1);
        gridPane.add(bPawn2, 1, 1, 1, 1);
        gridPane.add(bPawn3, 2, 1, 1, 1);
        gridPane.add(bPawn4, 3, 1, 1, 1);
        gridPane.add(bPawn5, 4, 1, 1, 1);
        gridPane.add(bPawn6, 5, 1, 1, 1);
        gridPane.add(bPawn7, 6, 1, 1, 1);
        gridPane.add(bPawn8, 7, 1, 1, 1);

        gridPane.add(wRook1, 0, 12, 1, 1);
        gridPane.add(wKnight1, 1, 12, 1, 1);
        gridPane.add(wBishop1, 2, 12, 1, 1);
        gridPane.add(wQueen, 3, 12, 1, 1);
        gridPane.add(wKing, 4, 12, 1, 1);
        gridPane.add(wBishop2, 5, 12, 1, 1);
        gridPane.add(wKnight2, 6, 12, 1, 1);
        gridPane.add(wRook2, 7, 12, 1, 1);
        gridPane.add(wPawn1, 0, 13, 1, 1);
        gridPane.add(wPawn2, 1, 13, 1, 1);
        gridPane.add(wPawn3, 2, 13, 1, 1);
        gridPane.add(wPawn4, 3, 13, 1, 1);
        gridPane.add(wPawn5, 4, 13, 1, 1);
        gridPane.add(wPawn6, 5, 13, 1, 1);
        gridPane.add(wPawn7, 6, 13, 1, 1);
        gridPane.add(wPawn8, 7, 13, 1, 1);



        Scene scene = new Scene(gridPane, 480,480);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}

