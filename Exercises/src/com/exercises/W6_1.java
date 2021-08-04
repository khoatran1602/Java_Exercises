package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        GridPane gridPane = new GridPane();
        ImageView imageView = new ImageView(new Image("/image/31JXQ9BG02L._AC_UL600_SR600,600_.jpg"));
        ImageView imageView1 = new ImageView(new Image("/image/Flag-Nepal.jpg"));
        ImageView imageView2 = new ImageView(new Image("/image/Flag-Republic-of-Georgia.jpg"));
        ImageView imageView3 = new ImageView(new Image("/image/main-qimg-eca9422258a0cdc30d6ca97a7e6fe52e.png"));
        gridPane.getChildren().addAll(imageView, imageView1, imageView2, imageView3);
        GridPane.setConstraints(imageView, 0, 0);
        GridPane.setConstraints(imageView1, 0, 1);
        GridPane.setConstraints(imageView2, 1, 0);
        GridPane.setConstraints(imageView3, 1, 1);
        Scene scene = new Scene(gridPane, 400, 400);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
