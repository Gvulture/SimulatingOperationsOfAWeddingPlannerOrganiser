package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class bookVenueController
{
    @javafx.fxml.FXML
    private Label showMessageLabel;
    @javafx.fxml.FXML
    private DatePicker weddingDateDatePicker;
    @javafx.fxml.FXML
    private TableColumn<Venue,String> loactionTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Venue,Double> pricePerDayTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> selectWeddingVenueComboBox;
    @javafx.fxml.FXML
    private TableView<Venue> bookVenueTableView;
    @javafx.fxml.FXML
    private TableColumn<Venue, String> venueNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Venue,Integer> capacityTableColumn;
    @javafx.fxml.FXML
    private TextField numOfGuestsTextField;

    @javafx.fxml.FXML
    public void initialize() {
        selectWeddingVenueComboBox.getItems().addAll("Grand Palace Hall", "Rose Garden", "Sunset Banquet", "Royal Convention Center");

        venueNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("venueName"));
        loactionTableColumn.setCellValueFactory(new PropertyValueFactory<>("location"));
        pricePerDayTableColumn.setCellValueFactory(new PropertyValueFactory<>("pricePerDay"));
        capacityTableColumn.setCellValueFactory(new PropertyValueFactory<>("capacity"));
    }

    @javafx.fxml.FXML
    public void handleBackToDashboardOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleBookNowOnAction(ActionEvent actionEvent) {
    }
}