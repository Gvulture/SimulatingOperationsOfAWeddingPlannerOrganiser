package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.common.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class acceptRejectBookingController {

    @FXML private ComboBox<String> selectsBookingComboBox;
    @FXML private Label showMessageLabel;
    @FXML private TableColumn<Booking, Integer> guestsTableColumn;
    @FXML private TableColumn<Booking, Double> totalPriceTableColumn;
    @FXML private TableView<Booking> acceptRejectTableView;
    @FXML private TableColumn<Booking, Integer> bookingIdTableColumn;
    @FXML private TableColumn<Booking, LocalDate> weddingDateTableColumn;
    @FXML private TableColumn<Booking, String> clientNameTableColumn;

    private ArrayList<Booking> bookingList = new ArrayList<>();

    @FXML
    public void initialize() {
        bookingIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("bookingId"));
        clientNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("clientName"));
        weddingDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("weddingDate"));
        guestsTableColumn.setCellValueFactory(new PropertyValueFactory<>("guests"));
        totalPriceTableColumn.setCellValueFactory(new PropertyValueFactory<>("totalPrice"));


        bookingList.clear();

        LocalDate date1 = LocalDate.parse("2026-09-15");
        LocalDate date2 = LocalDate.parse("2026-10-20");
        LocalDate date3 = LocalDate.parse("2026-11-05");
        LocalDate date4 = LocalDate.parse("2026-12-12");

        bookingList.add(new Booking(1001, 300, "Pending", "Paid", 45000.0, date1));
        bookingList.add(new Booking(1002, 500, "Pending", "Paid", 75000.0, date2));
        bookingList.add(new Booking(1003, 250, "Pending", "Paid", 35000.0, date3));
        bookingList.add(new Booking(1004, 400, "Pending", "Paid", 60000.0, date4));

        acceptRejectTableView.getItems().setAll(bookingList);

        selectsBookingComboBox.getItems().clear();
        for (Booking b : bookingList) {
            selectsBookingComboBox.getItems().add(String.valueOf(b.getBookingId()));
        }

        showMessageLabel.setText("");
    }

    @FXML
    public void handleBackToDashboardOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/venueManagerDashboard.fxml"));
            Scene scene = new Scene(loader.load());
            SceneSwitch.setScene(actionEvent, scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void handleAcceptOnAction(ActionEvent actionEvent) {
        String selectedIdStr = selectsBookingComboBox.getValue();

        if (selectedIdStr == null || selectedIdStr.isEmpty()) {
            showMessageLabel.setText("Invalid Selection!");
            return;
        }

        int selectedId = Integer.parseInt(selectedIdStr);

        for (Booking b : bookingList) {
            if (b.getBookingId() == selectedId) {
                b.setStatus("Confirmed");

                acceptRejectTableView.getItems().setAll(bookingList);
                showMessageLabel.setText("Booking Accepted!");
                return;
            }
        }

        showMessageLabel.setText("Invalid Selection!");
    }

    @FXML
    public void handleRejectOnAction(ActionEvent actionEvent) {
        String selectedIdStr = selectsBookingComboBox.getValue();

        if (selectedIdStr == null || selectedIdStr.isEmpty()) {
            showMessageLabel.setText("Invalid Selection!");
            return;
        }

        int selectedId = Integer.parseInt(selectedIdStr);

        for (Booking b : bookingList) {
            if (b.getBookingId() == selectedId) {
                b.setStatus("Rejected");

                acceptRejectTableView.getItems().setAll(bookingList);
                showMessageLabel.setText("Booking Rejected!");
                return;
            }
        }

        showMessageLabel.setText("Invalid Selection!");
    }
}



