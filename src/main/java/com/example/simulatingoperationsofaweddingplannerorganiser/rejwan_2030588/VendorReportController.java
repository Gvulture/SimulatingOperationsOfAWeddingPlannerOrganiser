package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;

public class VendorReportController
{
    @javafx.fxml.FXML
    private TableColumn EndDateTC;
    @javafx.fxml.FXML
    private TableColumn ReportTC;
    @javafx.fxml.FXML
    private TableColumn StartDateTC;
    @javafx.fxml.FXML
    private DatePicker StartDateDatePicker;
    @javafx.fxml.FXML
    private ComboBox ReportTypeComboBox;
    @javafx.fxml.FXML
    private DatePicker EndDateDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/WPDashboard.fxml");

    }
}