package de.neuefische.mucjava231javafxdemo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

// Das ist neu -> Wir erweitern von javafx.application.Application
public class HelloWorldWithoutFxmlApplication extends Application {

    // Das ist neu -> Zusätzliche Startmethode
    @Override
    public void start(Stage stage) throws IOException {
        // Behälter oder "LEGO Baseplate" für die Kinder
        Group root = new Group();

        // Wir brauchen eine Scene, die einen root-Node im Konstruktor erhält
        Scene scene = new Scene(root, 460, 460, Color.web("#ff6169"));


        scene.setFill(Color.WHITE);

        Text helloWorldText = new Text("Hello World!");
        helloWorldText.setFont(new javafx.scene.text.Font(40));

        helloWorldText.translateXProperty().bind(scene.widthProperty().divide(2).subtract(helloWorldText.layoutBoundsProperty().get().getWidth() / 2));
        helloWorldText.translateYProperty().bind(scene.heightProperty().divide(2).add(helloWorldText.layoutBoundsProperty().get().getHeight() / 600));

        root.getChildren().add(helloWorldText);

        stage.setTitle("Hello without Fxml!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        // Das ist neu -> Startbefehl
        launch();
    }
}