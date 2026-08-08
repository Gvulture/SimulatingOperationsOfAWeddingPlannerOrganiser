package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
    private ComboBox<String> PaymentMethodComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> VendorComboBox;
    @javafx.fxml.FXML
    private TableView VendorPaymentTV;

    @javafx.fxml.FXML
    public void initialize() {
        VendorComboBox.getItems().addAll("Photographers","Videographers","Florists","DJs or bands","Bakers","Hair and Makeup artists");
        PaymentMethodComboBox.getItems().addAll("Cash","Bank","Bkash");
    }

    @javafx.fxml.FXML
    public void BackOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/VendorDashboard.fxml");
    }
}