package com.example;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.io.File;
import java.util.*;
import java.net.MalformedURLException;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.layout.*;

///Alejandro Quezada
///Feb 25 2024
///Module 10 Assignment

public class App extends Application {

    int totalNum = 52;
    int showCards = 4;
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
        for (int i = 0; i < showCards; i++) {
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
            imageView.setFitWidth(300);
            imageView.setFitHeight(450);
            root.getChildren().add(imageView);
        }

        VBox end = new VBox();
        Button reset = new Button("Reset It");
       // reset.setDisable(true);
        //reset.setDisable(false);
        //reset.setVisible(false);
        reset.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                refreshCards(primaryStage);
            }
        });

        end.getChildren().addAll(root, reset);
        end.setAlignment(Pos.CENTER);

        Scene scene = new Scene(end);
        primaryStage.setScene(scene);
        primaryStage.setTitle("4 Random cards & refresh");
        primaryStage.show();
    }

    private void refreshCards(Stage primaryStage) {
        Collections.shuffle(cardNum);
        cardpic.clear();
        for(int i = 0; i < showCards; i++) {
            int index = cardNum.get(i);
            String cardPath = location + File.separator + index + fName;
            try {
                Image cardImage = new Image(new File(cardPath).toURI().toURL().toString());
                cardpic.add(cardImage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        VBox root = (VBox) ((Scene) primaryStage.getScene()).getRoot();
        root.getChildren().clear();
        HBox hroot = new HBox();
        for (Image cardImage : cardpic) {
            ImageView imageView = new ImageView(cardImage);
            imageView.setFitWidth(300);
            imageView.setFitHeight(450);
            hroot.getChildren().add(imageView);
        }

        Button reset = new Button("Reset It");
        VBox end = new VBox();
        reset.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                refreshCards(primaryStage);
            }
        });

        end.getChildren().addAll(hroot, reset);
        end.setAlignment(Pos.CENTER);
        Scene scene = new Scene(end);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
