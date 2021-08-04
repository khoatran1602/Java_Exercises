package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Collections;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        HBox hBox1 = new HBox();
        getCard(hBox1);
        HBox hBox2 = new HBox();
        Button btnDeal = new Button();
        Button btnExit = new Button();
        btnDeal.setText("Deal");
        btnExit.setText("Exit");
        btnDeal.setPrefSize(100, 20);
        btnExit.setPrefSize(100, 20);
        hBox2.setAlignment(Pos.CENTER);
        hBox2.setSpacing(500);
        btnDeal.setOnMouseClicked(mouseEvent -> getCard(hBox1));
        btnExit.setOnMouseClicked(mouseEvent -> stage.close());
        hBox2.getChildren().addAll(btnDeal, btnExit);
        VBox vBox = new VBox();
        vBox.getChildren().addAll(hBox1, hBox2);
        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.show();
    }

    public void getCard(HBox hBox) {
        hBox.getChildren().clear();
        VBox vBox = new VBox();
        ArrayList<Integer> cards = new ArrayList<>();
        for (int i = 1; i <= 52; i++) {
            cards.add(i);
        }
        int sum = 0;
        Collections.shuffle(cards);
        for (int i = 0; i < 3; i++) {
            sum = sum + cards.get(i);
            hBox.getChildren().add(new ImageView(new Image("/image/cards/" + cards.get(i) + ".png")));
        }
        Text text = new Text();
        text.setText(sum + " points");
        text.setTextAlignment(TextAlignment.CENTER);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().add(text);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
