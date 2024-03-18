import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class DataEntry {

    ObservableList<String> ExerciseList = FXCollections.observableArrayList("Please pick Exercise", "Back Extentions",
            "Lu Raises",
            "Front Squat", "Back Squat", "Push Press", "Shoulder Press", "Snatch Pulls", "Snatch", "Clean and Jerk",
            "Clean Pulls", "Jerk", "Deadlift",
            "Squat", "Bench Press", "Pull Up", "Barbell Rows", "Cable Rows", "Lat Pulldowns", "Dumbell Curls",
            "Tricep Pull downs", "Sit ups", "Hip Adductor", "Hip Abductor", "Leg Press", "Leg Curl", "Leg Extension",
            "Other", "None");
    ObservableList<String> CardioList = FXCollections.observableArrayList("Running", "Cycling", "Rowing",
            "Please pick Exercise", "Other", "None");

    @FXML
    private void initialize() {
        E1.setValue("Please pick Exercise");
        E1.setItems(ExerciseList);
        E2.setValue("Please pick Exercise");
        E2.setItems(ExerciseList);
        E3.setValue("Please pick Exercise");
        E3.setItems(ExerciseList);
        E4.setValue("Please pick Exercise");
        E4.setItems(ExerciseList);
        E5.setValue("Please pick Exercise");
        E5.setItems(ExerciseList);
        E6.setValue("Please pick Exercise");
        E6.setItems(ExerciseList);
        Cardiotype.setValue("Please pick Exercise");
        Cardiotype.setItems(ExerciseList);

    }

    @FXML
    private Button Analytics;

    @FXML
    private TextField CardioTime;

    @FXML
    private ChoiceBox Cardiotype;

    @FXML
    private DatePicker DateInput;

    @FXML
    private ChoiceBox E1;

    @FXML
    private TextField E1S1W;

    @FXML
    private TextField E1S2W;

    @FXML
    private TextField E1S3W;

    @FXML
    private TextField E1S4W;

    @FXML
    private TextField E1S5W;

    @FXML
    private TextField E1S6W;

    @FXML
    private ChoiceBox E2;

    @FXML
    private TextField E2S1W;

    @FXML
    private TextField E2S2W;

    @FXML
    private TextField E2S3W;

    @FXML
    private TextField E2S4W;

    @FXML
    private TextField E2S5W;

    @FXML
    private TextField E2S6W;

    @FXML
    private ChoiceBox E3;

    @FXML
    private TextField E3S1W;

    @FXML
    private TextField E3S2W;

    @FXML
    private TextField E3S3W;

    @FXML
    private TextField E3S4W;

    @FXML
    private TextField E3S5W;

    @FXML
    private TextField E3S6W;

    @FXML
    private ChoiceBox E4;

    @FXML
    private TextField E4S1W;

    @FXML
    private TextField E4S2W;

    @FXML
    private TextField E4S3W;

    @FXML
    private TextField E4S4W;

    @FXML
    private TextField E4S5W;

    @FXML
    private TextField E4S6W;

    @FXML
    private ChoiceBox E5;

    @FXML
    private TextField E5S1W;

    @FXML
    private TextField E5S2W;

    @FXML
    private TextField E5S3W;

    @FXML
    private TextField E5S4W;

    @FXML
    private TextField E5S5W;

    @FXML
    private TextField E5S6W;

    @FXML
    private ChoiceBox E6;

    @FXML
    private TextField E6S1W;

    @FXML
    private TextField E6S2W;

    @FXML
    private TextField E6S3W;

    @FXML
    private TextField E6S4W;

    @FXML
    private TextField E6S5W;

    @FXML
    private TextField E6S6W;

    @FXML
    private TextField Rep1input;

    @FXML
    private TextField Rep2input;

    @FXML
    private TextField Rep3input;

    @FXML
    private TextField Rep4input;

    @FXML
    private TextField Rep5input;

    @FXML
    private TextField Rep6input;

    @FXML
    private Button SavetoFile;

    @FXML
    private TextField Set1input;

    @FXML
    private TextField Set2input;

    @FXML
    private TextField Set3input;

    @FXML
    private TextField Set4input;

    @FXML
    private TextField Set5input;

    @FXML
    private TextField Set6input;

    @FXML
    void AnalyticsClicked(ActionEvent event) {

    }

    @FXML
    void SavetoFileClicked(ActionEvent event) {

    }

}
