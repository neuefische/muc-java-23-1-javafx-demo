package de.neuefische.mucjava231javafxdemo.listview;

import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.Arrays;

public class ListViewController {

    @FXML
    private ListView<String> listView;
    @FXML
    private Button addButton;
    @FXML
    private TextField textField;
    @FXML
    private Text text;

    public void initialize() {
        listView.getItems().addAll(Arrays.asList("Paramore", "Sum 41", "Green Day", "Linkin Park"));

        listView.getSelectionModel().selectedItemProperty().addListener(
                (observableValue, s, t1) -> text.setText(listView.getSelectionModel().getSelectedItem())
        );

        textField.addEventHandler(EventType.ROOT, event -> {
            addButton.setDisable(textField.getText().isEmpty());
        });
    }

    @FXML
    void addItemToList() {
        listView.getItems().add(textField.getText());
    }
}
