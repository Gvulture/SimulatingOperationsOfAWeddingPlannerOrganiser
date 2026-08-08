package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class AssignTaskController
{
    @javafx.fxml.FXML
    private DatePicker DeadlineDatePicker;
    @javafx.fxml.FXML
    private TableColumn TaskNameTC;
    @javafx.fxml.FXML
    private TableColumn DepartmentTC;
    @javafx.fxml.FXML
    private TableColumn EmployeeTC;
    @javafx.fxml.FXML
    private ComboBox<String> DepartmentComboBox;
    @javafx.fxml.FXML
    private TextField EmployeeTextField;
    @javafx.fxml.FXML
    private TextField TaskNameTextField;
    @javafx.fxml.FXML
    private TableColumn DeadlineTC;
    @javafx.fxml.FXML
    private TableView AssignTaskTV;

    @javafx.fxml.FXML
    public void initialize() {

        DepartmentComboBox.getItems().addAll("Decoration","Photography","Food");
    }

    @javafx.fxml.FXML
    public void BackOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/WPDashboard.fxml");
    }
}