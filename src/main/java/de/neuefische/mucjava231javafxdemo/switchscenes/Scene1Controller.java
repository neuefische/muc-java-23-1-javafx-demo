package de.neuefische.mucjava231javafxdemo.switchscenes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene1Controller {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Text textToChange;

    @FXML
    public void switchToScene2(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
        root = loader.load();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }

    public void setDisplayText(String text) {
        textToChange.setText(text);
    }
}
