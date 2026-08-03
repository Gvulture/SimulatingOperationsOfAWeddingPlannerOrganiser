package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class myBookingsController
{
    @javafx.fxml.FXML
    private TableColumn<Booking,String> statusTableColumn;
    @javafx.fxml.FXML
    private Label showMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<Booking,Integer> guestsTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking,Double> totalPriceTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking,String> venueNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking,Integer> bookingIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking, DatePicker> weddingDateTableColumn;
    @javafx.fxml.FXML
    private TableView<Booking> myBookingsTableView;
    @javafx.fxml.FXML
    private ComboBox<String> selectBookingComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        selectBookingComboBox.getItems().addAll("BK-101","BK-102","BK-103","BK-104","BK-105");

        bookingIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("bookingId"));
        venueNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("venueName"));
        weddingDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("weddingDate"));
        guestsTableColumn.setCellValueFactory(new PropertyValueFactory<>("numOfGuests"));
        totalPriceTableColumn.setCellValueFactory(new PropertyValueFactory<>("totalPrice"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("bookingStatus"));
    }

    @javafx.fxml.FXML
    public void handleBackToDashboardOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleViewDetailsOnAction(ActionEvent actionEvent) {
    }
}