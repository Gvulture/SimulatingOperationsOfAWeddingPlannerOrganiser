package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;


public class AssignVendorController
{
    @javafx.fxml.FXML
    private ComboBox<String> WeddingPlanComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> ServiceTypeComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> VendorComboBox;
    @javafx.fxml.FXML
    private TableView<AssignVendor> AssignVendorTV;
    @javafx.fxml.FXML
    private TableColumn<AssignVendor,String> VendorTC;
    @javafx.fxml.FXML
    private Label ConfermationLabel;
    @javafx.fxml.FXML
    private TableColumn<AssignVendor,String> ServiceTC;
    @javafx.fxml.FXML
    private TableColumn<AssignVendor,String> ServiceTypeTC;
    private ArrayList<AssignVendor> AssignVendorArraylist = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        ServiceTypeComboBox.getItems().addAll("Decoration","Photography","Food","Music","Transportation");

        VendorComboBox.getItems().addAll("Photographers","Videographers","Florists"," DJs or bands","Bakers","Hair and Makeup artists");

        WeddingPlanComboBox.getItems().addAll("Full-Service Planning","Partial Planning"," Custom Plan","Micro Wedding");

        VendorTC.setCellValueFactory(new PropertyValueFactory<>("vendor"));
        ServiceTypeTC.setCellValueFactory(new PropertyValueFactory<>("ServiceType"));

    }

    @javafx.fxml.FXML
    public void BackOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/WPDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void ClearOA() {
        AssignVendor av = new AssignVendor(
                WeddingPlanComboBox.getValue(),
                VendorComboBox.getValue(),
                ServiceTypeComboBox.getValue()
        );

        AssignVendorArraylist.add(av);
        AssignVendorTV.getItems().clear();
        AssignVendorTV.getItems().addAll(AssignVendorArraylist);




    }

    @javafx.fxml.FXML
    public void AssignOA(ActionEvent actionEvent) {
    }
}