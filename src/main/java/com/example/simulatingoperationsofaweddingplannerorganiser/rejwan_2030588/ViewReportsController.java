package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;

public class ViewReportsController
{
    @javafx.fxml.FXML
    private ComboBox<String> ReportTyperComboBox;
    @javafx.fxml.FXML
    private TableView ViewReportsTV;

    @javafx.fxml.FXML
    public void initialize() {
        ReportTyperComboBox.getItems().addAll("Budget","Guest","Vendor","Wedding");
    }

    @javafx.fxml.FXML
    public void BackOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/VendorDashboard.fxml");
    }
}