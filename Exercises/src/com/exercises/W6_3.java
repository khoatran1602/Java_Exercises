package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage stage) {
        CategoryAxis x = new CategoryAxis();
        NumberAxis y = new NumberAxis();
        BarChart<String, Number> barChart = new BarChart<String, Number>(x, y);
        XYChart.Series<String, Number> data = new XYChart.Series<String, Number>();
        data.getData().add(new XYChart.Data<>("Project", 20));
        data.getData().add(new XYChart.Data<>("Quiz", 10));
        data.getData().add(new XYChart.Data<>("Midterm", 30));
        data.getData().add(new XYChart.Data<>("Final", 40));
        barChart.getData().add(data);
        Scene scene = new Scene(barChart);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
