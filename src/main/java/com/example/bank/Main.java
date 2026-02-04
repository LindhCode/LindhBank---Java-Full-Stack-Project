package com.example.bank;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Objects;


public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        //Group root = new Group();
        Scene scene = new Scene(root, Color.GRAY);
        Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/LindhBank.png")));

        //stage.setWidth(900);
        //stage.setHeight(600);
        stage.setResizable(false);
        //stage.setFullScreen(true);
        //stage.setFullScreenExitHint("Tryck på esc för att lämna full-screen-läge");
        //stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("esc"));

        // Ritade objekt
        Text username = new Text("Username");
        username.setX(300);
        username.setY(150);
        username.setFont(Font.font("Calibri", 20));
        username.setFill(Color.WHITE);


        // Linjer
        Line lineUName = new Line();
        lineUName.setStartX(300);
        lineUName.setEndX(600);
        lineUName.setStartY(155);
        lineUName.setEndY(155);
        // lineUName.setStrokeWidth(5);
        // lineUName.setRotate(45);
        lineUName.setStroke(Color.WHITE);

        //root.getChildren().add(username);
        //root.getChildren().add(lineUName);
        stage.getIcons().add(icon);
        stage.setTitle("Lindh Bank");
        stage.setScene(scene);
        stage.show();

    }
}
