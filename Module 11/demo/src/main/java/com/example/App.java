package com.example;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.util.*;
import java.net.MalformedURLException;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

import java.io.*;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage primaryStage) throws IOException {

        primaryStage.setTitle("RadioBtns, AQ");
        ToggleGroup grp = new ToggleGroup();
        RadioButton cBtn = new RadioButton("Circle");
        RadioButton rBtn = new RadioButton("Rectangle");
        RadioButton eBtn = new RadioButton("Ellipse");
        TilePane tilePane = new TilePane();
        cBtn.setToggleGroup(grp);
        rBtn.setToggleGroup(grp);
        eBtn.setToggleGroup(grp);

        if (cBtn.isSelected()) {
            Circle circle = new Circle();
        }
        else if (rBtn.isSelected()) {
            Rectangle rectangle = new Rectangle();
        }
        else if (eBtn.isSelected()) {
            Ellipse ellipse = new Ellipse();
        }

        tilePane.getChildren().addAll(cBtn, rBtn, eBtn);
        tilePane.setAlignment(Pos.BOTTOM_CENTER);

        HBox hb1 = new HBox();
        Scene scene = new Scene(tilePane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}