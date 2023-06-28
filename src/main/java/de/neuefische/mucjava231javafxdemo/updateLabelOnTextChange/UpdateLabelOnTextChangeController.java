package de.neuefische.mucjava231javafxdemo.updateLabelOnTextChange;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class UpdateLabelOnTextChangeController {
    @FXML
    private Label label;

    @FXML
    private TextField textField;

    public void initialize() {
        // Funktioniert auch, erlaubt allerdings kein "manuelles Verändern" des Labels via setText
//        label.textProperty().bind(textField.textProperty());
        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            label.setText(newValue);
        });
    }

    @FXML
    protected void onHelloButtonClick() {
        label.setText("asdasdasd");
    }
}
