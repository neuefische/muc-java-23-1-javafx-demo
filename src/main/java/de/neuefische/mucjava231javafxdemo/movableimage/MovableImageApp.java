package de.neuefische.mucjava231javafxdemo.movableimage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MovableImageApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MovableImageApp.class.getResource("/de/neuefische/mucjava231javafxdemo/movableimage/movableimage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);

        // Reihenfolge ist wichtig! Zuerst fxmlLoader.load() aufrufen bevor der Controller verfügbar ist!
        MovableImageController movableImageController = fxmlLoader.getController();
        movableImageController.initialize(scene);

        stage.resizableProperty().set(false);
        stage.setTitle("MovableImage-Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
