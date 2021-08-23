Main class
package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("sample.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
Controller class
package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    private Circle circle;


    public void left() {
        circle.setCenterX(circle.getCenterX() - 20);
    }

    public void right() {
        circle.setCenterX(circle.getCenterX() + 20);
    }

    public void up() {
        circle.setCenterY(circle.getCenterY() - 20);
    }

    public void down() {
        circle.setCenterY( circle.getCenterY() + 20);
    }
}
