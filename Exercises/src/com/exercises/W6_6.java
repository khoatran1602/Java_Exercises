package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();
        Line line = new Line(Math.random() * 200, Math.random() * 200, Math.random() * 200, Math.random() * 200);
        double set45 = (line.getStartX() > line.getEndX()) ? 1.57 / 2 : -1.57 * 1.5;
        double artan = (line.getStartY() - line.getEndY()) / (line.getStartX() - line.getEndX());
        Line line1 = new Line(line.getEndX(), line.getEndY(),
                    (line.getEndX() + Math.cos(artan - set45) * 15),
                    (line.getEndY() + Math.sin(artan - set45) * 15));
        Line line2 = new Line(line.getEndX(), line.getEndY(),
                    (line.getEndX() + Math.cos(artan + set45) * 15),
                    (line.getEndY() + Math.sin(artan + set45) * 15));
        pane.getChildren().addAll(line, line2, line1);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
