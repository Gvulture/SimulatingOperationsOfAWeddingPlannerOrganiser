package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class acceptRejectBookingController
{
    @javafx.fxml.FXML
    private ComboBox <String>selectsBookingComboBox;
    @javafx.fxml.FXML
    private Label showMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<Booking,Integer> guestsTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking,Double> totalPriceTableColumn;
    @javafx.fxml.FXML
    private TableView<Booking> acceptRejectTableView;
    @javafx.fxml.FXML
    private TableColumn<Booking, Integer> bookingIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking, DatePicker> weddingDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking,String> clientNameTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleBackToDashboardOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleRejectOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleAcceptOnAction(ActionEvent actionEvent) {
    }
}