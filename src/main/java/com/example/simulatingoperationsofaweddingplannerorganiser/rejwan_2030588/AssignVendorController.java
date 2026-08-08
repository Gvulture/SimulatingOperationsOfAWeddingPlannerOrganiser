package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;

public class AssignVendorController
{
    @javafx.fxml.FXML
    private ComboBox WeddingPlanComboBox;
    @javafx.fxml.FXML
    private ComboBox ServiceTypeComboBox;
    @javafx.fxml.FXML
    private ComboBox VendorComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/WPDashboard.fxml");
    }
}