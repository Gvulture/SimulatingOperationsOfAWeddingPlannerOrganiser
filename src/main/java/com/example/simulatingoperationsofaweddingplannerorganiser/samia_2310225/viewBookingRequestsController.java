package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.common.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

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
    private ArrayList<Booking> bookingList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        selectBookingComboBox.getItems().addAll("B001", "B002", "B003", "B004", "B005");

        clientNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("clientName"));
        bookingIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("bookingId"));
        weddingDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("weddingDate"));
        numOfGuestsTableColumn.setCellValueFactory(new PropertyValueFactory<>("numOfGuests"));
        totalPriceTableColumn.setCellValueFactory(new PropertyValueFactory<>("totalPrice"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        LocalDate date1 = LocalDate.parse("2026-11-15");
        LocalDate date2 = LocalDate.parse("2026-12-01");
        LocalDate date3 = LocalDate.parse("2026-12-20");

        bookingList.add(new Booking(101, 350, "Pending", "Samia", 150000.0, date1));
        bookingList.add(new Booking(102, 500, "Approved", "Tasmim", 220000.0, date2));
        bookingList.add(new Booking(103, 200, "Pending", "Tithi", 95000.0, date3));

        selectBookingComboBox.getItems().clear();
        for (Booking b : bookingList) {
            selectBookingComboBox.getItems().add("B" + b.getBookingId());
        }

        viewBookingsTableView.getItems().setAll(bookingList);
        showMessageLabel.setText("");

    }

    @javafx.fxml.FXML
    public void handleBackToDashboardOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/venueManagerDashboard.fxml"));
            Scene scene = new Scene(loader.load());
            SceneSwitch.setScene(actionEvent, scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void handleViewDetailsOnAction(ActionEvent actionEvent) {
        if (bookingList.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("No booking requests found!");
            alert.showAndWait();
            return;
        }

        String selectedBookingId = selectBookingComboBox.getValue();

        if (selectedBookingId == null) {
            showMessageLabel.setText("Please select a booking ID first!");
            return;
        }

        for (Booking b : bookingList) {
            String currentId = "B" + b.getBookingId();

            if (currentId.equals(selectedBookingId)) {
                showMessageLabel.setText("Client: " + b.getClientName() +
                        "Date: " + b.getWeddingDate() +
                        "Guests: " + b.getNumberOfGuests() +
                        "Total: " + b.getTotalPrice() +
                        "Status: " + b.status());
                return;
            }
        }
    }
}