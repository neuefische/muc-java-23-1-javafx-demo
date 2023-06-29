package de.neuefische.mucjava231javafxdemo.basicHelloWorld;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField textField;

    @FXML
    void onHelloButtonClick() {
        welcomeText.setText("Hallo lieber und sehr aktiver, hellhöriger Kurs :D");
    }

    @FXML
    void onPrintTextClick() {
        System.out.println("Text is: " + textField.getText());
    }
}