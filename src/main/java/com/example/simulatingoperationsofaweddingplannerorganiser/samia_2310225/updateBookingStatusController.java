package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.common.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class updateBookingStatusController
{
    @javafx.fxml.FXML
    private Label showMessageLabel;
    @javafx.fxml.FXML
    private ComboBox<String> newStatusComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> selectBookingComboBox;
    private ArrayList<Booking> bookingList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        newStatusComboBox.getItems().addAll("Confirmed", "Cancelled", "Completed");
        selectBookingComboBox.getItems().addAll("B001", "B002", "B003", "B004");

        bookingList.add(new Booking(101, 350, "Pending", " Rahim", 150000.0, LocalDate.now()));
        bookingList.add(new Booking(102, 500, "Pending", "Karim", 220000.0, LocalDate.now()));
        bookingList.add(new Booking(103, 200, "Pending", "Jabir", 95000.0, LocalDate.now()));

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
    public void handleUpdateBookingStatusOnAction(ActionEvent actionEvent) {

        String selectedBookingId = selectBookingComboBox.getValue();
        String selectedNewStatus = newStatusComboBox.getValue();

        if (selectedBookingId == null || selectedNewStatus == null) {
            showMessageLabel.setText("Invalid");
            return;
        }

        for (Booking b : bookingList) {
            String currentId = "B" + b.getBookingId();

            if (currentId.equals(selectedBookingId)) {
                b.setStatus(selectedNewStatus);
                showMessageLabel.setText("Booking status updated successfully!");
                return;
            }
        }
        showMessageLabel.setText("Invalid");
    }
}