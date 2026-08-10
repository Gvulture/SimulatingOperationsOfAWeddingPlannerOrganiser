package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class VendorPaymentController
{
    @javafx.fxml.FXML
    private TableColumn<VendorPayment,String> PaymentMethodTC;
    @javafx.fxml.FXML
    private TableColumn<VendorPayment,String> VendorTC;
    @javafx.fxml.FXML
    private TableColumn<VendorPayment,String> AmountTC;
    @javafx.fxml.FXML
    private ComboBox<String> PaymentMethodComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> VendorComboBox;
    @javafx.fxml.FXML
    private TableView<VendorPayment> VendorPaymentTV;
    @javafx.fxml.FXML
    private TextField AmountTextField;
    private ArrayList<VendorPayment> VendorPaymentArrayList = new ArrayList<>() ;

    @javafx.fxml.FXML
    public void initialize() {
        VendorComboBox.getItems().addAll("Photographers","Videographers","Florists","DJs or bands","Bakers","Hair and Makeup artists");
        PaymentMethodComboBox.getItems().addAll("Cash","Bank","Bkash");
        PaymentMethodTC.setCellValueFactory( new PropertyValueFactory<>("paymentMethod"));
        VendorTC.setCellValueFactory( new PropertyValueFactory<>("vendor"));
        AmountTC.setCellValueFactory( new PropertyValueFactory<>("amount"));
    }

    @javafx.fxml.FXML
    public void BackOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/VendorDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void PayOA() {
        VendorPayment vp = new VendorPayment(
                VendorComboBox.getValue(),
                AmountTextField.getText(),
                VendorComboBox.getValue()

        );
        VendorPaymentArrayList.add(vp);
        VendorPaymentTV.getItems().clear();
        VendorPaymentTV.getItems().addAll(VendorPaymentArrayList);
    }
}