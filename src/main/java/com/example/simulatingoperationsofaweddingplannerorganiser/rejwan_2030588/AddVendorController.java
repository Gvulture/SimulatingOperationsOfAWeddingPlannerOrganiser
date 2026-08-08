package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

import com.example.simulatingoperationsofaweddingplannerorganiser.Jhalok_2411777.PhotoGalleryAfterTheEvent_Controller;
import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Alert;

import java.util.ArrayList;



public class AddVendorController
{
    ArrayList<AddVendor> lst = new ArrayList<>();

    @javafx.fxml.FXML
    private TextField PriceTextField;
    @javafx.fxml.FXML
    private TableColumn<Integer,AddVendor> PrinceTC;
    @javafx.fxml.FXML
    private TableColumn<Integer,AddVendor> PhoneTC;
    @javafx.fxml.FXML
    private TextField PhoneTextField;
    @javafx.fxml.FXML
    private TableColumn<String,AddVendor> VendorNameTC;
    @javafx.fxml.FXML
    private TableColumn<String,AddVendor> ServiceTypeTC;
    @javafx.fxml.FXML
    private ComboBox<String> ServiceTypeComboBox;
    @javafx.fxml.FXML
    private TextField VendorNameTextField;
    @javafx.fxml.FXML
    private TableView<AddVendor> AddVendorTV;
    @javafx.fxml.FXML
    private Label MessageLabel;

    @javafx.fxml.FXML
    public void initialize() {

        ServiceTypeComboBox.getItems().addAll("Decoration","Photography","Food","Music");
        VendorNameTC.setCellValueFactory(new PropertyValueFactory<>("VendorName"));
        ServiceTypeTC.setCellValueFactory(new PropertyValueFactory<>("ServiceType"));
        PrinceTC.setCellValueFactory(new PropertyValueFactory<>("Price"));
        PhoneTC.setCellValueFactory(new PropertyValueFactory<>("Phone"));

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
        AddVendorTV.getItems().addAll(lst);
    }

    @javafx.fxml.FXML
    public void ConformButtonOA(ActionEvent actionEvent) {
        String VendorName = VendorNameTextField.getText();
        int Phone = Integer.parseInt(PhoneTextField.getText());
        int Price = Integer.parseInt(PriceTextField.getText());
        String ServiceType = ServiceTypeComboBox.getValue();


        AddVendor a = new AddVendor(VendorName,Phone,Price);
        MessageLabel.setText("Vendor conformed");

        PhoneTextField.clear();
        VendorNameTextField.clear();
        PriceTextField.clear();
    }
}