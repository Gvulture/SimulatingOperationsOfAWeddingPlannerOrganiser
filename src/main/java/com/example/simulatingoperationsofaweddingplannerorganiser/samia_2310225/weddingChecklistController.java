package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.common.BinaryUtils;
import com.example.simulatingoperationsofaweddingplannerorganiser.common.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class weddingChecklistController {

    @FXML private TableView<WeddingCheckList> weddingChecklistTableView;
    @FXML private TableColumn<WeddingCheckList, String> taskNameTableColumn;
    @FXML private TableColumn<WeddingCheckList, LocalDate> deadlineTableColumn;
    @FXML private TableColumn<WeddingCheckList, String> statusTableColumn;

    @FXML private ComboBox<String> selectTaskComboBox;
    @FXML private Label showMessageLabel;

    private final String fileName = "checklist.bin";
    private ArrayList<WeddingCheckList> taskList = new ArrayList<>();

    @FXML
    public void initialize() {
        taskNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("taskName"));
        deadlineTableColumn.setCellValueFactory(new PropertyValueFactory<>("deadline"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        ArrayList<WeddingCheckList> loadedList = BinaryUtils.readObjects(fileName);
        if (loadedList != null && !loadedList.isEmpty()) {
            taskList = loadedList;
        }

        if (taskList.isEmpty()) {
            LocalDate date1 = LocalDate.parse("2026-08-20");
            LocalDate date2 = LocalDate.parse("2026-09-01");
            LocalDate date3 = LocalDate.parse("2026-09-15");

            taskList.add(new WeddingCheckList(101,"Book Photographer", "Pending", date1));
            taskList.add(new WeddingCheckList(102,"Confirm Catering Menu", "Pending", date2));
            taskList.add(new WeddingCheckList(103,"Send Invitations", "Pending", date3));

            BinaryUtils.saveList(fileName, (ArrayList) taskList);
        }

        if (taskList.isEmpty()) {
            showMessageLabel.setText("No tasks Found!");
        } else {
            weddingChecklistTableView.getItems().setAll(taskList);
            showMessageLabel.setText("");

            selectTaskComboBox.getItems().clear();
            for (WeddingCheckList t : taskList) {
                selectTaskComboBox.getItems().add(t.getTaskName());
            }
        }
    }

    @FXML
    public void handleMarkAsDoneOnAction(ActionEvent actionEvent) {
        if (taskList == null || taskList.isEmpty()) {
            showMessageLabel.setText("No tasks Found!");
            return;
        }

        String selectedTaskName = selectTaskComboBox.getValue();

        if (selectedTaskName == null || selectedTaskName.isEmpty()) {
            showMessageLabel.setText("Please select a task first!");
            return;
        }

        for (WeddingCheckList t : taskList) {
            if (t.getTaskName().equals(selectedTaskName)) {
                if (t.getStatus().equals("Done")) {
                    showMessageLabel.setText("Task is already completed!");
                } else {
                    t.setStatus("Done");
                    BinaryUtils.saveList(fileName, (ArrayList) taskList);

                    weddingChecklistTableView.getItems().setAll(taskList);
                    showMessageLabel.setText("Task marked as completed!");
                }
                return;
            }
        }

        showMessageLabel.setText("Task not found!");
    }

    @FXML
    public void handleBackToDashboard(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/clientDashboard.fxml"));
            Scene scene = new Scene(loader.load());
            SceneSwitch.setScene(actionEvent, scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}