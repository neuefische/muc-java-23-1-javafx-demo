package de.neuefische.mucjava231javafxdemo.switchscenes;

import de.neuefische.mucjava231javafxdemo.model.Boat;
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

        // Wir holen uns die Stage indem wir
        // aus dem Event -> Das Auslösende Element (Button) -> Die Scene -> Die Stage
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }

    // Muss eine von außen verfügbare Methode sein, damit wir den Text setzen können
    public void setDisplayText(String text) {
        textToChange.setText(text);
    }

    public void setBoat(Boat boat) {
        textToChange.setText(boat.toString());
    }
}
