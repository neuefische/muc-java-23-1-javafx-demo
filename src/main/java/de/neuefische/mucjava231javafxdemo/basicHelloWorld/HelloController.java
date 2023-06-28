package de.neuefische.mucjava231javafxdemo.basicHelloWorld;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    TextField textField;

    @FXML
    void onHelloButtonClick() {
        welcomeText.setText("Hallo lieber, aber schon müder Kurs :D");
    }

    @FXML
    void onPrintTextClick() {
        textField.getText();
        System.out.println("Text is: " + welcomeText.getText());
    }
}