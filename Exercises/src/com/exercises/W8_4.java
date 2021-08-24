package sample;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    private Circle circle;

    @FXML
    private Pane layout;


    public void left() {
        circle.setCenterX(circle.getCenterX() > circle.getRadius() ?
                circle.getCenterX() - 20 : circle.getCenterX());
        circle.setCenterY(circle.getCenterY());
    }

    public void right() {
        circle.setCenterX(circle.getCenterX() < layout.getPrefWidth()  - circle.getRadius() ?
                circle.getCenterX() + 20 : circle.getCenterX());
        circle.setCenterY(circle.getCenterY());
    }

    public void up() {
        circle.setCenterY(circle.getCenterY() > circle.getRadius() ?
                circle.getCenterY() - 20 : circle.getCenterY());
        circle.setCenterX(circle.getCenterX());
    }

    public void down() {
        circle.setCenterY(circle.getCenterY() < layout.getPrefHeight() - circle.getRadius() ?
                circle.getCenterY() + 20 : circle.getCenterY());
        circle.setCenterX(circle.getCenterX());
    }
}
