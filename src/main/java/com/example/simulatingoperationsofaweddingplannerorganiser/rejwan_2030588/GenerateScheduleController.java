package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;

public class GenerateScheduleController
{
    @javafx.fxml.FXML
    private DatePicker SelectDateDatePicker;
    @javafx.fxml.FXML
    private TextArea ActivitiesTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> TimeComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        TimeComboBox.getItems().addAll("Ceremony Time","Reception Time");
    }

    @javafx.fxml.FXML
    public void GenerateOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/WPDashboard.fxml");
    }
}