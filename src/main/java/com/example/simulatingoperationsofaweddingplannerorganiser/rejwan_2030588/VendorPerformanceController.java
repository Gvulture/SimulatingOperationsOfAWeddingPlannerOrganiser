package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;

public class VendorPerformanceController
{
    @javafx.fxml.FXML
    private TableColumn VendorTC;
    @javafx.fxml.FXML
    private TableColumn RatingTC;
    @javafx.fxml.FXML
    private TableColumn CompletedJobsTC;
    @javafx.fxml.FXML
    private TableColumn IncomeTC;
    @javafx.fxml.FXML
    private ComboBox<String> VendorComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        VendorComboBox.getItems().addAll("Photographers","Videographers","Florists"," DJs or bands","Bakers","Hair and Makeup artists");
    }

    @javafx.fxml.FXML
    public void BackOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/VendorDashboard.fxml");
    }
}