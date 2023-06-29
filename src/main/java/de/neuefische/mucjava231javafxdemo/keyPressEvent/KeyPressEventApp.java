package de.neuefische.mucjava231javafxdemo.keyPressEvent;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class KeyPressEventApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(KeyPressEventApp.class.getResource("/de/neuefische/mucjava231javafxdemo/keyPressEvent/keyPressEvent.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);

        // Wir brauchen den KeyPressEventController
        KeyPressEventController keyPressEventController = fxmlLoader.getController();
        keyPressEventController.initialize(scene);

        stage.resizableProperty().set(false);
        stage.setTitle("KeyPressEventApp!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
