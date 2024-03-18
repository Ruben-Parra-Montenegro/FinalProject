import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;

public class MainScene {

    @FXML
    private Button OpenFile;

    @FXML
    private Button NewFile;

    /*
     * @FXML
     * void NewFileClicked(ActionEvent event) {
     * // Create a new workbook
     * Workbook workbook = new XSSFWorkbook();
     * 
     * // Create a new sheet in the workbook
     * workbook.createSheet("New Sheet");
     * 
     * // Prompt the user to enter a file name
     * TextInputDialog dialog = new TextInputDialog("workbook");
     * dialog.setTitle("New Excel File");
     * dialog.setHeaderText("Enter the name for the new Excel file:");
     * dialog.setContentText("Name:");
     * 
     * Optional<String> result = dialog.showAndWait();
     * result.ifPresent(name -> {
     * // Use the entered name to create the file
     * File file = new File(name + ".xlsx");
     * try (FileOutputStream out = new FileOutputStream(file)) {
     * workbook.write(out);
     * } catch (IOException e) {
     * e.printStackTrace();
     * } finally {
     * try {
     * if (workbook != null) {
     * workbook.close();
     * }
     * } catch (IOException e) {
     * e.printStackTrace();
     * }
     * }
     * });
     * }
     */
    @FXML
    void NewFileClicked(ActionEvent event) {
        // Create a new workbook
        Workbook workbook = new XSSFWorkbook();

        // Create a new sheet in the workbook
        Sheet sheet = workbook.createSheet("New Sheet");

        // Create a row and put some cells in it. Rows are 0 based.
        Row row = sheet.createRow(0);

        // Header
        String[] headers = new String[] {
                "Date", "Exercise1", "Exercise2", "Exercise3", "Exercise4", "Exercise5", "Exercise6",
                "Set1", "Set2", "Set3", "Set4", "Set5", "Set6",
                "Rep1", "Rep2", "Rep3", "Rep4", "Rep5", "Rep6",
                "Weight1", "Weight2", "Weight3", "Weight4", "Weight5", "Weight6",
                "CardioType", "Cardio time"
        };

        // Create cells
        for (int i = 0; i < headers.length; i++) {
            Cell cell = row.createCell(i);
            cell.setCellValue(headers[i]);
        }

        // Prompt the user to enter a file name
        TextInputDialog dialog = new TextInputDialog("workbook");
        dialog.setTitle("New Excel File");
        dialog.setHeaderText("Enter the name for the new Excel file:");
        dialog.setContentText("Name:");

        Optional<String> result = dialog.showAndWait();
        result.ifPresent(name -> {
            // Use the entered name to create the file
            File file = new File(name + ".xlsx");
            try (FileOutputStream out = new FileOutputStream(file)) {
                workbook.write(out);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (workbook != null) {
                        workbook.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @FXML
    void OpenFIleClicked(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Excel Files", "*.xls", "*.xlsx"));

        Stage stage = (Stage) OpenFile.getScene().getWindow();
        File selectedFile = fileChooser.showOpenDialog(stage);

        if (selectedFile != null) {
            String filePath = selectedFile.getPath();
            System.out.println("Selected File: " + filePath);

            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("DataEntry.fxml"));
                Parent root = loader.load();
                Scene scene = new Scene(root);
                stage.setScene(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}