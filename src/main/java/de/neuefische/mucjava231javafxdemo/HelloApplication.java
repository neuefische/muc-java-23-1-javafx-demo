package de.neuefische.mucjava231javafxdemo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

// Das ist neu -> Wir erweitern von javafx.application.Application
public class HelloApplication extends Application {

    // Das ist neu -> Zusätzliche Startmethode
    @Override
    public void start(Stage stage) throws IOException {
        // Behälter oder "LEGO Baseplate" für die Kinder
        Group root = new Group();

        // Wir brauchen eine Scene
        Scene scene = new Scene(root, 460, 460, Color.web("#ff6169"));
        scene.setFill(Color.WHITE);

        stage.setTitle("Hello without Fxml!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        // Das ist neu -> Startbefehl
        launch();
    }
}