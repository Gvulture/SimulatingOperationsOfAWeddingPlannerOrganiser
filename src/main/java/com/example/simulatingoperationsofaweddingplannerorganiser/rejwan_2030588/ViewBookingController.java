package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;

public class ViewBookingController
{
    @javafx.fxml.FXML
    private TableColumn ClientTC;
    @javafx.fxml.FXML
    private TableColumn StatusTC;
    @javafx.fxml.FXML
    private TableColumn BookingIDTC;
    @javafx.fxml.FXML
    private TableColumn DateTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/VendorDashboard.fxml");
    }
}