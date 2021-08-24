package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        Circle circle1 = new Circle(50, 50, 20);
        Circle circle2 = new Circle(130, 80, 20);
        setProperties(circle1);
        setProperties(circle2);
        root.getChildren().addAll(getLine(circle1, circle2), circle1, circle2, getText(circle1, circle2));
        root.setOnMouseDragged(e -> {
            if (circle1.contains(e.getX(), e.getY())) {
                root.getChildren().clear();
                circle1.setCenterX(e.getX());
                circle1.setCenterY(e.getY());
                root.getChildren().addAll(getLine(circle1, circle2), circle1, circle2, getText(circle1, circle2));
            } else if (circle2.contains(e.getX(), e.getY())) {
                root.getChildren().clear();
                circle2.setCenterX(e.getX());
                circle2.setCenterY(e.getY());
                root.getChildren().addAll(getLine(circle1, circle2), circle1, circle2, getText(circle1, circle2));
            }
        });
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    private void setProperties(Circle circle) {
        circle.setFill(Color.RED);
        circle.setStroke(Color.BLACK);
    }

    private String distance(Circle cirlce1, Circle circle2) {
        double distance = Math.sqrt(Math.pow(circle2.getCenterX() - cirlce1.getCenterX(), 2) +
                Math.pow(circle2.getCenterY() - cirlce1.getCenterY(), 2));
        return String.format("%.0f", distance);
    }

    private Line getLine(Circle circle1, Circle circle2) {
        return new Line(circle1.getCenterX(), circle1.getCenterY(), circle2.getCenterX(), circle2.getCenterY());
    }

    private Text getText(Circle circle1, Circle circle2) {
        return new Text((circle1.getCenterX() + circle2.getCenterX()) / 2,
        (circle1.getCenterY() + circle2.getCenterY()) / 2, distance(circle1, circle2));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
