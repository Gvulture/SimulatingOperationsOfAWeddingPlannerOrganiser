package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class viewVenuesController
{
    @javafx.fxml.FXML
    private TableColumn<Venue,String> statusTableColumn;
    @javafx.fxml.FXML
    private TextField capacityTextField;
    @javafx.fxml.FXML
    private TableView<Venue> viewVenuesTableView;
    @javafx.fxml.FXML
    private TableColumn<Venue, Double> pricePerDayTableColumn;
    @javafx.fxml.FXML
    private TextField minPriceTextField;
    @javafx.fxml.FXML
    private TableColumn<Venue, String> venueNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Venue,String> locationTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Venue, Integer> capacityTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> locationComboBox;
    @javafx.fxml.FXML
    private Label statusShowingLabel;
    @javafx.fxml.FXML
    private TextField maxPriceTextField;

    @javafx.fxml.FXML
    public void initialize() {
        locationComboBox.getItems().addAll("Dhaka", "Chittagong", "Sylhet", "Rajshahi", "Khulna", "Barishal");

        venueNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("venueName"));
        locationTableColumn.setCellValueFactory(new PropertyValueFactory<>("location"));
        capacityTableColumn.setCellValueFactory(new PropertyValueFactory<>("capacity"));
        pricePerDayTableColumn.setCellValueFactory(new PropertyValueFactory<>("pricePerDay"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void handleSearchVenueOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleBackToDashboardOnAction(ActionEvent actionEvent) {
    }
}