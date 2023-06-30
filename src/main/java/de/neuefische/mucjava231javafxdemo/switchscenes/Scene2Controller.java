package de.neuefische.mucjava231javafxdemo.switchscenes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene2Controller {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    TextField inputField;

    @FXML
    public void switchToScene1(ActionEvent event) throws IOException {
        /*
            Achtung! Stolpergefahr!
            FXMLLoader loader = FXMLLoader.load(getClass().getResource("scene1.fxml"));
                                ^Es muss eine NEUE FXMLLoader INSTANZ mit new erstellt werden!
                                Ansonsten kommt eine Casting-Exception

                                Caused by: java.lang.ClassCastException: class javafx.scene.control.TabPane cannot be cast to class javafx.fxml.FXMLLoader (javafx.scene.control.TabPane is in module javafx.controls@19 of loader 'app'; javafx.fxml.FXMLLoader is in module javafx.fxml@19 of loader 'app')
          */
        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene1.fxml"));
        root = loader.load();

        Scene1Controller scene1Controller = loader.getController();
        scene1Controller.setDisplayText(inputField.getText());


        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }
}
