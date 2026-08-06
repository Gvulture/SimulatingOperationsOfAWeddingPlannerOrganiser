package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.common.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class myBookingsController {

    @FXML private TableColumn<Booking, String> statusTableColumn;
    @FXML private Label showMessageLabel;
    @FXML private TableColumn<Booking, Integer> guestsTableColumn;
    @FXML private TableColumn<Booking, Double> totalPriceTableColumn;
    @FXML private TableColumn<Booking, String> venueNameTableColumn;
    @FXML private TableColumn<Booking, Integer> bookingIdTableColumn;
    @FXML private TableColumn<Booking, LocalDate> weddingDateTableColumn;
    @FXML private TableView<Booking> myBookingsTableView;
    @FXML private ComboBox<String> selectBookingComboBox;

    private ArrayList<Booking> bookingList = new ArrayList<>();

    @FXML
    public void initialize() {
        try {
            selectBookingComboBox.getItems().clear();
            selectBookingComboBox.getItems().addAll("101", "102", "103");

            bookingIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("bookingId"));
            venueNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("venueName"));
            weddingDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("weddingDate"));
            guestsTableColumn.setCellValueFactory(new PropertyValueFactory<>("numOfGuests"));
            totalPriceTableColumn.setCellValueFactory(new PropertyValueFactory<>("totalAmount"));
            statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

            bookingList.clear();
            bookingList.add(new Booking(101, 300, "Confirmed", "Samia", 45000.0, LocalDate.parse("2026-09-15")));
            bookingList.add(new Booking(102, 500, "Pending", "Tasmim", 75000.0, LocalDate.parse("2026-10-20")));
            bookingList.add(new Booking(103, 250, "Confirmed", "Tithi", 35000.0, LocalDate.parse("2026-11-05")));

            myBookingsTableView.getItems().clear();
            myBookingsTableView.getItems().addAll(bookingList);

            showMessageLabel.setText("");
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Error loading data!");
            alert.showAndWait();
        }
    }

    @FXML
    public void handleBackToDashboardOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/clientDashboard.fxml"));
            Scene scene = new Scene(loader.load());
            SceneSwitch.setScene(actionEvent, scene);
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Could not load dashboard!");
            alert.showAndWait();
        }
    }

    @FXML
    public void handleViewDetailsOnAction(ActionEvent actionEvent) {
        String selectedIdStr = selectBookingComboBox.getValue();

        if (selectedIdStr == null) {
            showMessageLabel.setText("Please select a Booking ID first!");

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Please select a Booking ID first!");
            alert.showAndWait();
            return;
        }

        try {
            int selectedId = Integer.parseInt(selectedIdStr);

            for (Booking b : bookingList) {
                if (b.getBookingId() == selectedId) {
                    String details = "Booking ID " + b.getBookingId() + " Selected Successfully!";

                    showMessageLabel.setText(details);

                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setContentText(details);
                    alert.showAndWait();
                    return;
                }
            }

            showMessageLabel.setText("Invalid Booking Selection!");

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Invalid Booking Selection!");
            alert.showAndWait();

        } catch (Exception e) {
            showMessageLabel.setText("Error processing selection!");

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Error processing selection!");
            alert.showAndWait();
        }
    }
}