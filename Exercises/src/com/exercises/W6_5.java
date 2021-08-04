package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.crypto.spec.OAEPParameterSpec;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();
        Circle circle1 = new Circle(10 + Math.random() * 200, 10 + Math.random() * 200, 20);
        circle1.setFill(Color.WHITE);
        circle1.setStroke(Color.BLACK);
        Circle circle2 = new Circle(10 + Math.random() * 200, 10 + Math.random() * 200, 20);
        circle2.setFill(Color.WHITE);
        circle2.setStroke(Color.BLACK);
        Text text1 = new Text(circle1.getCenterX(), circle1.getCenterY(), "1");
        Text text2 = new Text(circle2.getCenterX(), circle2.getCenterY(), "2");
        Line line =  new Line(circle1.getCenterX(), circle1.getCenterY(), circle2.getCenterX(), circle2.getCenterY());
        pane.getChildren().addAll(line, circle1, circle2, text1, text2);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
