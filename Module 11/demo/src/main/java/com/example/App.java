package com.example;
import javafx.application.*;
import javafx.beans.Observable;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.paint.*;
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
 * JavaFX App 3/3/24 AQ Module 11
 */
public class App extends Application {
    ToggleGroup grp = new ToggleGroup();
    RadioButton cBtn = new RadioButton("Circle");
    RadioButton rBtn = new RadioButton("Rectangle");
    RadioButton eBtn = new RadioButton("Ellipse");
    StackPane shape = new StackPane();
    Label label = new Label("Pick a shape");
    CheckBox fillCheckBox = new CheckBox("Random Color");

    @Override
    public void start(Stage primaryStage) throws IOException {
        shape.setPrefSize(300, 300);
        primaryStage.setTitle("RadioBtns, AQ");
        HBox hBox = new HBox(10, cBtn, rBtn, eBtn, fillCheckBox);
        hBox.setAlignment(Pos.BOTTOM_CENTER);

        cBtn.setToggleGroup(grp);
        rBtn.setToggleGroup(grp);
        eBtn.setToggleGroup(grp);

        StackPane sp = new StackPane(shape, hBox);

        cBtn.setOnAction(event -> Circle());
        rBtn.setOnAction(event -> Rectangle());
        eBtn.setOnAction(event -> Ellipse());
        fillCheckBox.setOnAction(event -> ckBox());

        Scene scene = new Scene(sp, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void Circle() {
        shape.getChildren().clear();
        Circle circle = new Circle();
        circle.setCenterX(409.0f);
        circle.setCenterY(200.0f);
        circle.setRadius(100.0f);
        circle.setStroke(Color.BLACK);
        if (fillCheckBox.isSelected()) {
            circle.setFill(random());
        }
        shape.getChildren().add(circle);
    }

    public void Rectangle() {
        shape.getChildren().clear();
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(222);
        rectangle.setHeight(100);
        rectangle.setStroke(Color.BLACK);
        if (fillCheckBox.isSelected()) {
            rectangle.setFill(random());
        }
        shape.getChildren().add(rectangle);
    }

    public void Ellipse() {
        shape.getChildren().clear();
        Ellipse ellipse = new Ellipse(300, 200);
        ellipse.setStroke(Color.BLACK);
        if (fillCheckBox.isSelected()) {
            ellipse.setFill(random());
        }
        shape.getChildren().add(ellipse);
    }

    public void ckBox() {
        if (cBtn.isSelected()) {
            Circle();
        } else if (rBtn.isSelected()) {
            Rectangle();
        } else if (eBtn.isSelected()) {
            Ellipse();
        }
    }

    public Color random() {
        Random random = new Random();
        return Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }

    public static void main(String[] args) {
        launch(args);
    }

}