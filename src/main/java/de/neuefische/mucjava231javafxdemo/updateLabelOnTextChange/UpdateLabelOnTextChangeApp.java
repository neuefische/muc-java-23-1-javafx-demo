package de.neuefische.mucjava231javafxdemo.updateLabelOnTextChange;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class UpdateLabelOnTextChangeApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(UpdateLabelOnTextChangeApp.class.getResource("/de/neuefische/mucjava231javafxdemo/updateLabelOnTextChange/updateLabelOnTextChange.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}