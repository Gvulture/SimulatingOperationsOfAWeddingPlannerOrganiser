package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;

public class AssignVendorController
{
    @javafx.fxml.FXML
    private ComboBox<String> WeddingPlanComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> ServiceTypeComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> VendorComboBox;

    @javafx.fxml.FXML
    public void initialize() {

        ServiceTypeComboBox.getItems().addAll("Decoration","Photography","Food","Music","Transportation");

        VendorComboBox.getItems().addAll("Photographers","Videographers","Florists"," DJs or bands","Bakers","Hair and Makeup artists");

        WeddingPlanComboBox.getItems().addAll("Full-Service Planning","Partial Planning"," Custom Plan","Micro Wedding");
    }

    @javafx.fxml.FXML
    public void BackOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/WPDashboard.fxml");
    }
}