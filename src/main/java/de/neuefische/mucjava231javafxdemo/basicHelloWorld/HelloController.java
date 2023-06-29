package de.neuefische.mucjava231javafxdemo.basicHelloWorld;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField textField;

    // Vorgehen:
    // Wenn TextField eine "neue Nachricht/ Update hat" -> Update im Label reflektieren
    // Wo füge ich das jetzt ein? -> Soll am Anfang des Objektes erstellt werden
    // initialize wird zu Beginn der Erstellung, wenn das FXML fertig geladen hat, ausgeführt
    public void initialize() {
        System.out.println("Hallo i bims der HelloController!");

        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("Text changed from " + oldValue + " to " + newValue);

            welcomeText.setText(newValue);
        });

        // Was ist der Vorteil von Bindings?
        // Wenn sich der Text im TextField ändert, wird der Text im Label automatisch aktualisiert -> Es geht nicht anders!
//        welcomeText.textProperty().bind(textField.textProperty());
    }

    @FXML
    void onHelloButtonClick() {
        welcomeText.setText("Hallo lieber und sehr aktiver, hellhöriger Kurs :D");
    }

    @FXML
    void onPrintTextClick() {
        System.out.println("Text is: " + textField.getText());
    }
}