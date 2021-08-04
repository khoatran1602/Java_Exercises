package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        GridPane pane = new GridPane();
        int count = 0;
        int size = 50;
        for (int i = 0; i < 8; i++) {
            count++;
            for (int j = 0; j < 8; j++) {
                Rectangle rectangle = new Rectangle(size, size, size, size);
                if (count % 2 == 0) {
                    rectangle.setFill(Color.WHITE);
                }
                pane.add(rectangle, j, i);
                count++;
            }
        }
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
