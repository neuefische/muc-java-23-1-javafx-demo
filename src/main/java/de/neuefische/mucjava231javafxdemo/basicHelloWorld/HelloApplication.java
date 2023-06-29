package de.neuefische.mucjava231javafxdemo.basicHelloWorld;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        // Das ist neu -> Wir laden die FXML-Datei.
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(
                "/de/neuefische/mucjava231javafxdemo/basicHelloWorld/hello-view.fxml"));

        // Das ist neu -> Wir erstellen eine Scene mit dem root-Node aus der FXML-Datei.
        // Wir bauen die GUI im SceneBuilder und importieren die Szene hier.
        // Scene hat die gleiche Breite und Höhe wie der Top-Container FXML-Datei.
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);

        // Das ist alles gleich!
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}