package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class GenerateScheduleController
{
    @javafx.fxml.FXML
    private DatePicker SelectDateDatePicker;
    @javafx.fxml.FXML
    private TextArea ActivitiesTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> TimeComboBox;
    @javafx.fxml.FXML
    private TableView<GenerateSchedule> GenerateSheduleTV;
    @javafx.fxml.FXML
    private TableColumn<GenerateSchedule,String> ActivityTC;
    @javafx.fxml.FXML
    private TableColumn<GenerateSchedule, LocalDate> SelectDateTC;
    @javafx.fxml.FXML
    private TableColumn<GenerateSchedule,String> TimeTc;

    private ArrayList<GenerateSchedule> GenerateSchedukeArrayList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        TimeComboBox.getItems().addAll("Ceremony Time","Reception Time");

        ActivityTC.setCellValueFactory( new PropertyValueFactory<>("activity"));
        SelectDateTC.setCellValueFactory( new PropertyValueFactory<>("selectDate"));
        TimeTc.setCellValueFactory( new PropertyValueFactory<>("time"));
    }

    @javafx.fxml.FXML
    public void GenerateOnClick() {
        GenerateSchedule gs = new GenerateSchedule(
                ActivitiesTextArea.getText(),
                SelectDateDatePicker.getValue(),
                TimeComboBox.getValue()
        );
        GenerateSchedukeArrayList.add(gs);
        GenerateSheduleTV.getItems().clear();
        GenerateSheduleTV.getItems().addAll(GenerateSchedukeArrayList);

    }

    @javafx.fxml.FXML
    public void BackOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/WPDashboard.fxml");
    }
}