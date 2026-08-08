package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class CreateWeddingplancontoller
{
    @javafx.fxml.FXML
    private ComboBox<String> ThemeCombobox;
    @javafx.fxml.FXML
    private TextField BudgetTextField;
    @javafx.fxml.FXML
    private TextField ClientNameTextField;
    @javafx.fxml.FXML
    private DatePicker WeddingDateDatePicker;

    @javafx.fxml.FXML
    public void initialize() {

        ThemeCombobox.getItems().addAll("Classic","Modern","Royal","Beach","Garden");
    }

    @javafx.fxml.FXML
    public void ResetOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SaveOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BacktoWPDashbordOnClick(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/WPDashboard.fxml");
    }
}