package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class UpdateVendorController
{
    @javafx.fxml.FXML
    private TextField PriceTextField;
    @javafx.fxml.FXML
    private TableColumn VendorTC;
    @javafx.fxml.FXML
    private TableColumn PhoneTC;
    @javafx.fxml.FXML
    private TableColumn PriceTC;
    @javafx.fxml.FXML
    private TextField PhoneTextField;
    @javafx.fxml.FXML
    private ComboBox<String> VendorComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        VendorComboBox.getItems().addAll("Photographers","Videographers","Florists","DJs or bands","Bakers","Hair and Makeup artists");
    }

    @javafx.fxml.FXML
    public void BackOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/VendorDashboard.fxml");
    }
}