package de.neuefische.mucjava231javafxdemo.keyPressEvent;

import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;

public class KeyPressEventController {


    public void initialize(Scene scene) {
        System.out.println("MovableImageController initialized");
        // Das ist eine Lambda Funktion
        // Wir lassen handleKeyPressEvent die Events verarbeiten die per Tastatur eingegeben werden

        scene.setOnKeyPressed(this::handleKeyPressEvent);
    }

    // Auf Pfeiltasten reagieren
    /*
    * Bei Reaktion auf ButtonClick -> Ne Methode zugeordnet, die ausgeführt wird
    *
    * */
    public void handleKeyPressEvent(KeyEvent keyEvent) {
        switch (keyEvent.getCode()) {
            case Q:
                System.out.println("Q gedrückt");
                break;
            case DIGIT1:
                System.out.println("1 gedrückt");
                break;
            case PERIOD:
                System.out.println(". gedrückt");
                break;
            default:
                System.out.println(
                        "Text: " + keyEvent.getText() + " Code zum Text:" + keyEvent.getCode());
                break;
        }
    }
}

