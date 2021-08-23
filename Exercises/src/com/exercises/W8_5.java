package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Pane root = new Pane();
        Circle circle = new Circle(100, 60, 50);
        circle.setFill(Color.RED);
        circle.setStroke(Color.BLACK);
        root.getChildren().add(circle);
        root.setOnMouseMoved(e -> {
            root.getChildren().clear();
            Text text = new Text(e.getX(), e.getY(), "Mouse point is " +
                    (circle.contains(e.getX(), e.getY()) ? "inside" : "outside"));
            root.getChildren().addAll(circle, text);
        });
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
