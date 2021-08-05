package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Text title = new Text();
        title.setText("Traffic Light");
        title.setTextAlignment(TextAlignment.CENTER);
        title.setFill(Color.RED);
        title.setStyle("-fx-font-size: 40px");
        HBox hBox = new HBox();
        Button btnNext = new Button();
        btnNext.setText("Next");
        Button btnExit = new Button();
        btnExit.setText("Exit");
        hBox.getChildren().addAll(btnNext, btnExit);
        hBox.setSpacing(100);
        hBox.setAlignment(Pos.CENTER);
        StackPane stackPane = new StackPane();
        Rectangle rectangle = new Rectangle(60, 60, 100, 260);
        Circle circle1 = new Circle(60, 60, 30);
        Circle circle2 = new Circle(90, 90, 30);
        Circle circle3 = new Circle(120, 120, 30);
        circle1.setFill(Color.RED);
        circle2.setFill(Color.GRAY);
        circle3.setFill(Color.GRAY);
        circle1.setStroke(Color.WHITE);
        circle2.setStroke(Color.WHITE);
        circle3.setStroke(Color.WHITE);
        VBox traffic = new VBox(40);
        traffic.setPadding(new Insets(50, 50, 50, 220));
        traffic.getChildren().addAll(circle1, circle2, circle3);
        stackPane.getChildren().addAll(rectangle, traffic);
        btnNext.setOnMouseClicked(mouseEvent -> {
            if (circle1.getFill() == Color.RED) {
                circle1.setFill(Color.GRAY);
                circle2.setFill(Color.YELLOW);
                circle3.setFill(Color.GRAY);
            } else if (circle2.getFill() == Color.YELLOW) {
                circle1.setFill(Color.GRAY);
                circle2.setFill(Color.GRAY);
                circle3.setFill(Color.GREEN);
            } else {
                circle1.setFill(Color.RED);
                circle2.setFill(Color.GRAY);
                circle3.setFill(Color.GRAY);
            }
        });
        btnExit.setOnMouseClicked(mouseEvent -> {
            stage.close();
        });
        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.getChildren().addAll(title, stackPane, hBox);
        Scene scene = new Scene(vBox, 500, 500);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
