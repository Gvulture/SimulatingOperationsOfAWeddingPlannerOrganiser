package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class bookedVendorsController
{
    @javafx.fxml.FXML
    private TableColumn<Venue,Integer> vendorIdTableColumn;
    @javafx.fxml.FXML
    private Label showMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<Venue, Double> priceTableColumn;
    @javafx.fxml.FXML
    private TableView<Venue> bookedVendorsTableView;
    @javafx.fxml.FXML
    private TableColumn<Venue, String> vendorNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Venue, String> serviceTypeTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> selectVendorsComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleBackToDashboardOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleViewDetailsOnAction(ActionEvent actionEvent) {
    }
}