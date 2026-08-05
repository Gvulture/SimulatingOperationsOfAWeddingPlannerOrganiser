package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.common.BinaryUtils;
import com.example.simulatingoperationsofaweddingplannerorganiser.common.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class myBookingsController {
    @javafx.fxml.FXML
    private TableColumn<Booking, String> statusTableColumn;
    @javafx.fxml.FXML
    private Label showMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<Booking, Integer> guestsTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking, Double> totalPriceTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking, String> venueNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking, Integer> bookingIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking, DatePicker> weddingDateTableColumn;
    @javafx.fxml.FXML
    private TableView<Booking> myBookingsTableView;
    @javafx.fxml.FXML
    private ComboBox<String> selectBookingComboBox;

    private final String fileName = "bookings.bin";
    private ArrayList<Booking> bookingList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        selectBookingComboBox.getItems().addAll("BK-101", "BK-102", "BK-103", "BK-104", "BK-105");

        bookingIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("bookingId"));
        venueNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("venueName"));
        weddingDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("weddingDate"));
        guestsTableColumn.setCellValueFactory(new PropertyValueFactory<>("numOfGuests"));
        totalPriceTableColumn.setCellValueFactory(new PropertyValueFactory<>("totalPrice"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("bookingStatus"));

        bookingList = BinaryUtils.readObjects(fileName);


        if (bookingList == null || bookingList.isEmpty()) {
            bookingList = new ArrayList<>();

            LocalDate date1 = LocalDate.parse("2026-09-15");
            LocalDate date2 = LocalDate.parse("2026-10-20");

            bookingList.add(new Booking(101, 300, "Confirmed", "Paid", 45000.0, date1));
            bookingList.add(new Booking(102, 500, "Pending", "Unpaid", 75000.0, date2));

            BinaryUtils.saveList(fileName, bookingList);
        }

        if (bookingList == null || bookingList.isEmpty()) {
            bookingList = new ArrayList<>();

            LocalDate date1 = LocalDate.parse("2026-09-15");
            LocalDate date2 = LocalDate.parse("2026-10-20");

            bookingList.add(new Booking(101, 300, "Confirmed", "Paid", 45000.0, date1));
            bookingList.add(new Booking(102, 500, "Pending", "Unpaid", 75000.0, date2));

            BinaryUtils.saveList(fileName, bookingList);
        }
    }


    @javafx.fxml.FXML
    public void handleBackToDashboardOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/clientDashboard.fxml"));
            Scene scene = new Scene(loader.load());
            SceneSwitch.setScene(actionEvent, scene);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @javafx.fxml.FXML
    public void handleViewDetailsOnAction(ActionEvent actionEvent) {
        String selectedIdStr = selectBookingComboBox.getValue();

        if (selectedIdStr == null || selectedIdStr.isEmpty()) {
            showMessageLabel.setText("Please select a Booking ID first!");
            return;
        }

        int selectedId = Integer.parseInt(selectedIdStr);

        for (Booking b : bookingList) {
            if (b.getBookingId() == selectedId) {
                showMessageLabel.setText("Status: " + b.getBookingStatus() + " | Price: " + b.getTotalPrice());
                return;
            }
        }

        showMessageLabel.setText("Invalid Booking Selection!");
    }
}

