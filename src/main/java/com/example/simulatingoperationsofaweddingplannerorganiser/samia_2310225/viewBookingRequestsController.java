package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.time.LocalDate;

public class viewBookingRequestsController
{
    @javafx.fxml.FXML
    private TableColumn<Booking,String> statusTableColumn;
    @javafx.fxml.FXML
    private Label showMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<Booking, Double> totalPriceTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking,Integer> numOfGuestsTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking,Integer> bookingIdTableColumn;
    @javafx.fxml.FXML
    private TableView<Booking> viewBookingsTableView;
    @javafx.fxml.FXML
    private TableColumn<Booking, LocalDate> weddingDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking,String> clientNameTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> selectBookingComboBox;

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