package de.neuefische.mucjava231javafxdemo.switchscenes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SwitchScenesApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SwitchScenesApp.class.getResource("/de/neuefische/mucjava231javafxdemo/switchscenes/scene1.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 600, 400);

        stage.resizableProperty().set(false);
        stage.setTitle("SwitchScenesApp!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}