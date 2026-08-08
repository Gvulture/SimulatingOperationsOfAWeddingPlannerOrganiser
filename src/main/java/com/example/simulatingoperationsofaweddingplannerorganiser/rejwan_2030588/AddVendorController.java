package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class AddVendorController
{
    @javafx.fxml.FXML
    private TextField PriceTextField;
    @javafx.fxml.FXML
    private TableColumn PrinceTC;
    @javafx.fxml.FXML
    private TableColumn PhoneTC;
    @javafx.fxml.FXML
    private TextField PhoneTextField;
    @javafx.fxml.FXML
    private TableColumn VendorNameTC;
    @javafx.fxml.FXML
    private TableColumn ServiceTypeTC;
    @javafx.fxml.FXML
    private ComboBox<String> ServiceTypeComboBox;
    @javafx.fxml.FXML
    private TextField VendorNameTextField;

    @javafx.fxml.FXML
    public void initialize() {

        ServiceTypeComboBox.getItems().addAll("Decoration","Photography","Food","Music");
    }

    @javafx.fxml.FXML
    public void backButtonOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/VendorDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void restButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveButtonOA(ActionEvent actionEvent) {
    }
}