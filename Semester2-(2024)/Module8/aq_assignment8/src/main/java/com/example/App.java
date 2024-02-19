package com.example;
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.io.File;
import java.util.*;

public class App extends Application {

    int totalNum = 52;
    int NUM_DISPLAY_CARDS = 4;
    String location = "Semester2-(2024)\\Module8\\cards"; ///This is where the location where my cards pngs are at.
    String fName = ".png";

    private List<Integer> cardNum;
    private List<Image> cardpic;

    @Override
    public void start(Stage primaryStage) {
        cardNum = new ArrayList<>();
        for (int i = 1; i <= totalNum; i++) {
            cardNum.add(i);
        }
        Collections.shuffle(cardNum);

        cardpic = new ArrayList<>();
        for (int i = 0; i < NUM_DISPLAY_CARDS; i++) {
            int cardIndex = cardNum.get(i);
            String cardPath = location + File.separator + cardIndex + fName;
            try {
                Image cardImage = new Image(new File(cardPath).toURI().toURL().toString());
                cardpic.add(cardImage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        HBox root = new HBox();
        for (Image cardImage : cardpic) {
            ImageView imageView = new ImageView(cardImage);
            imageView.setFitWidth(150);
            imageView.setFitHeight(200);
            root.getChildren().add(imageView);
        }

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("4 Random cards");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
