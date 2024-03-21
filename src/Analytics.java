import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.ScatterChart;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.chart.XYChart;

public class Analytics implements Initializable {

    ObservableList<String> ExerciseList = FXCollections.observableArrayList("Please pick Exercise", "Back Extentions",
            "Lu Raises",
            "Front Squat", "Back Squat", "Push Press", "Shoulder Press", "Snatch Pulls", "Snatch", "Clean and Jerk",
            "Clean Pulls", "Jerk", "Deadlift",
            "Squat", "Bench Press", "Pull Up", "Barbell Rows", "Cable Rows", "Lat Pulldowns", "Dumbell Curls",
            "Tricep Pull downs", "Sit ups", "Hip Adductor", "Hip Abductor", "Leg Press", "Leg Curl", "Leg Extension",
            "Other", "None");
    ObservableList<String> CardioList = FXCollections.observableArrayList("Please pick Exercise", "Running", "Cycling",
            "Rowing",
            "Other", "None");

    @SuppressWarnings("unchecked")
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ChooseExercise.setValue("Please pick Exercise");
        ChooseExercise.setItems(ExerciseList);
        ChooseCardio.setValue("Please pick Exercise");
        ChooseCardio.setItems(CardioList);
        XYChart.Series series = new XYChart.Series();
        series.getData().add(new XYChart.Data("1", 2));
        series.getData().add(new XYChart.Data("2", 3));
        series.getData().add(new XYChart.Data("3", 4));
        series.getData().add(new XYChart.Data("4", 5));
        series.getData().add(new XYChart.Data("5", 6));
        series.getData().add(new XYChart.Data("6", 7));
        series.getData().add(new XYChart.Data("7", 8));
        series.getData().add(new XYChart.Data("8", 9));
        ScatterChartW.getData().add(series);

    }

    @SuppressWarnings("rawtypes")
    @FXML
    private ChoiceBox ChooseExercise;

    @SuppressWarnings("rawtypes")
    @FXML
    private ChoiceBox ChooseCardio;

    @FXML
    private Button ClearData;

    @FXML
    private Button LoadData;

    @FXML
    private Button MainMenu;

    @FXML
    private ScatterChart<?, ?> ScatterChartR;

    @FXML
    private ScatterChart<?, ?> ScatterChartW;

    @FXML
    private ScatterChart<?, ?> ScatterChartC;

}
