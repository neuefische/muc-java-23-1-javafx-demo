package de.neuefische.mucjava231javafxdemo.movableimage;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.util.Duration;

public class MovableImageController {

    @FXML
    private ImageView imageView;

    public void initialize(Scene scene) {
        System.out.println("MovableImageController initialized");
        scene.setOnKeyPressed(this::handleKeyPressEvent);
    }

    void handleKeyPressEvent(KeyEvent keyEvent) {
        switch (keyEvent.getCode()) {
            case W:
                animateMovementOfImageView(imageView.getX(), imageView.getY() - 10);
                break;
            case A:
                animateMovementOfImageView(imageView.getX() - 10, imageView.getY());
                break;
            case S:
                animateMovementOfImageView(imageView.getX(), imageView.getY() + 10);
                break;
            case D:
                animateMovementOfImageView(imageView.getX() + 10, imageView.getY());
                break;
            case DIGIT1:
                System.out.println("1 gedrückt");
                break;
            case PERIOD:
                System.out.println(". gedrückt");
                break;
            default:
                System.out.println(keyEvent.getText() + keyEvent.getCode());
                break;
        }
    }

    private void animateMovementOfImageView(double targetX, double targetY) {
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(imageView);

        translate.setDuration(Duration.millis(200));
        translate.setByX(targetX);
        translate.setByY(targetY);

        translate.play();
    }
}
