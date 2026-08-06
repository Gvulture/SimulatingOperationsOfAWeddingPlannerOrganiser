package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.common.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class weddingChecklistController {

    @FXML private TableView<WeddingCheckList> weddingChecklistTableView;
    @FXML private TableColumn<WeddingCheckList, String> taskNameTableColumn;
    @FXML private TableColumn<WeddingCheckList, LocalDate> deadlineTableColumn;
    @FXML private TableColumn<WeddingCheckList, String> statusTableColumn;

    @FXML private ComboBox<String> selectTaskComboBox;
    @FXML private Label showMessageLabel;

    private ArrayList<WeddingCheckList> taskList = new ArrayList<>();

    @FXML
    public void initialize() {
        try {
            taskNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("taskName"));
            deadlineTableColumn.setCellValueFactory(new PropertyValueFactory<>("deadline"));
            statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));


            taskList.clear();
            LocalDate date1 = LocalDate.parse("2026-08-20");
            LocalDate date2 = LocalDate.parse("2026-09-01");
            LocalDate date3 = LocalDate.parse("2026-09-15");

            taskList.add(new WeddingCheckList(101, "Book Photographer", "Pending", date1));
            taskList.add(new WeddingCheckList(102, "Confirm Catering Menu", "Pending", date2));
            taskList.add(new WeddingCheckList(103, "Send Invitations", "Pending", date3));

            weddingChecklistTableView.getItems().setAll(taskList);

            selectTaskComboBox.getItems().clear();
            for (WeddingCheckList t : taskList) {
                selectTaskComboBox.getItems().add(t.getTaskName());
            }

            showMessageLabel.setText("");
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Error loading checklist data!");
            alert.showAndWait();
        }
    }

    @FXML
    public void handleMarkAsDoneOnAction(ActionEvent actionEvent) {
        try {
            if (taskList == null || taskList.isEmpty()) {
                showMessageLabel.setText("No tasks Found!");

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("No tasks Found!");
                alert.showAndWait();
                return;
            }

            String selectedTaskName = selectTaskComboBox.getValue();

            if (selectedTaskName == null || selectedTaskName.isEmpty()) {
                showMessageLabel.setText("Please select a task first!");

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("Please select a task first!");
                alert.showAndWait();
                return;
            }

            for (WeddingCheckList t : taskList) {
                if (t.getTaskName().equals(selectedTaskName)) {
                    if (t.getStatus().equals("Done")) {
                        showMessageLabel.setText("Task is already completed!");

                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setContentText("Task is already completed!");
                        alert.showAndWait();
                    } else {
                        t.setStatus("Done");
                        weddingChecklistTableView.getItems().setAll(taskList);

                        showMessageLabel.setText("Task marked as completed!");

                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setContentText("Task marked as completed!");
                        alert.showAndWait();
                    }
                    return;
                }
            }

            showMessageLabel.setText("Task not found!");

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Task not found!");
            alert.showAndWait();

        } catch (Exception e) {
            showMessageLabel.setText("Error updating task!");

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Error updating task!");
            alert.showAndWait();
        }
    }

    @FXML
    public void handleBackToDashboard(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/clientDashboard.fxml"));
            Scene scene = new Scene(loader.load());
            SceneSwitch.setScene(actionEvent, scene);
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Could not load dashboard!");
            alert.showAndWait();
        }
    }
}