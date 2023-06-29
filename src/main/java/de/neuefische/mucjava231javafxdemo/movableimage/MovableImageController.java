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
    private Scene scene;
    private double moveValue = 50;


    public void initialize(Scene scene) {
        System.out.println("MovableImageController initialized");
        this.scene = scene;
        scene.setOnKeyPressed(this::handleKeyPressEvent);
    }

    void handleKeyPressEvent(KeyEvent keyEvent) {
        switch (keyEvent.getCode()) {
            case UP:
            case W:
                if (imageView.getTranslateY() - moveValue >= 0 - imageView.getLayoutY()) {
                    animateMovementOfImageView(imageView.getX(), imageView.getY() - moveValue);
                }
                break;
            case LEFT:
            case A:
                if (imageView.getTranslateX() - moveValue >= 0 - imageView.getLayoutX()) {
                    animateMovementOfImageView(imageView.getX() - moveValue, imageView.getY());
                }
                break;
            case DOWN:
            case S:
                if (imageView.getTranslateY() + moveValue + imageView.getFitHeight() <= scene.getHeight() - imageView.getLayoutY()) {
                    animateMovementOfImageView(imageView.getX(), imageView.getY() + moveValue);
                }
                break;
            case RIGHT:
            case D:
                if (imageView.getTranslateX() + moveValue + imageView.getFitWidth() <= scene.getWidth() - imageView.getLayoutX()) {
                    animateMovementOfImageView(imageView.getX() + moveValue, imageView.getY());
                }
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
