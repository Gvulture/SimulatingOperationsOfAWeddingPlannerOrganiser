package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class VendorPaymentController
{
    @javafx.fxml.FXML
    private TableColumn PaymentMethodTC;
    @javafx.fxml.FXML
    private TableColumn VendorTC;
    @javafx.fxml.FXML
    private TextField AmountField;
    @javafx.fxml.FXML
    private TableColumn AmountTC;
    @javafx.fxml.FXML
    private ComboBox PaymentMethodComboBox;
    @javafx.fxml.FXML
    private ComboBox VendorComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/VendorDashboard.fxml");
    }
}