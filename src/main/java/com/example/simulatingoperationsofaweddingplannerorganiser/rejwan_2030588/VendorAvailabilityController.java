package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;

public class VendorAvailabilityController
{
    @javafx.fxml.FXML
    private TableColumn VendorTC;
    @javafx.fxml.FXML
    private TableColumn AvailableTC;
    @javafx.fxml.FXML
    private DatePicker WeddingDateDatePicker;
    @javafx.fxml.FXML
    private TableColumn UnavailableTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/VendorDashboard.fxml");
    }
}