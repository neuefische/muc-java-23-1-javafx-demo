package de.neuefische.mucjava231javafxdemo.basicHelloWorld;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    void onPrintTextClick() {
        System.out.println("Text is: "+ welcomeText.getText());
    }
}