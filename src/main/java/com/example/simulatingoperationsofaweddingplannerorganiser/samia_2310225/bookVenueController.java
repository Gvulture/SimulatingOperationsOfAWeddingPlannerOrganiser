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

public class bookVenueController {

    @FXML private Label showMessageLabel;
    @FXML private DatePicker weddingDateDatePicker;
    @FXML private TableColumn<Venue, String> loactionTableColumn;
    @FXML private TableColumn<Venue, Double> pricePerDayTableColumn;
    @FXML private ComboBox<String> selectWeddingVenueComboBox;
    @FXML private TableView<Venue> bookVenueTableView;
    @FXML private TableColumn<Venue, String> venueNameTableColumn;
    @FXML private TableColumn<Venue, Integer> capacityTableColumn;
    @FXML private TextField numOfGuestsTextField;

    private ArrayList<Venue> venueList = new ArrayList<>();

    @FXML
    public void initialize() {
        try {
            venueNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("venueName"));
            loactionTableColumn.setCellValueFactory(new PropertyValueFactory<>("location"));
            pricePerDayTableColumn.setCellValueFactory(new PropertyValueFactory<>("pricePerDay"));
            capacityTableColumn.setCellValueFactory(new PropertyValueFactory<>("capacity"));


            venueList.clear();
            venueList.add(new Venue(101, 500, "Grand Palace", "Dhaka", "Available", 50000.0));
            venueList.add(new Venue(102, 300, "Royal Hall", "Dhaka", "Available", 35000.0));
            venueList.add(new Venue(103, 800, "Ocean Breeze", "Chittagong", "Booked", 75000.0));
            venueList.add(new Venue(104, 400, "Green Garden", "Sylhet", "Available", 40000.0));
            venueList.add(new Venue(105, 1000, "City Convention", "Dhaka", "Available", 120000.0));

            bookVenueTableView.getItems().setAll(venueList);
            selectWeddingVenueComboBox.getItems().clear();
            for (Venue v : venueList) {
                selectWeddingVenueComboBox.getItems().add(v.getVenueName());
            }

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
        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Could not load dashboard!");
            alert.showAndWait();
        }
    }

    @FXML
    public void handleBookNowOnAction(ActionEvent actionEvent) {
        try {
            String selectedVenueName = selectWeddingVenueComboBox.getValue();
            LocalDate weddingDate = weddingDateDatePicker.getValue();
            String guest = numOfGuestsTextField.getText().trim();


            if (selectedVenueName == null || weddingDate == null || guest.isEmpty()) {
                showMessageLabel.setText("Verification Fail");
                return;
            }

            int guestCount;
            try {
                guestCount = Integer.parseInt(guest);
            } catch (NumberFormatException e) {
                showMessageLabel.setText("Verification Fail");
                return;
            }

            Venue selectedVenue = null;
            for (Venue v : venueList) {
                if (v.getVenueName().equalsIgnoreCase(selectedVenueName)) {
                    selectedVenue = v;
                    break;
                }
            }

            if (selectedVenue == null) {
                showMessageLabel.setText("Verification Fail");
                return;
            }

            if (guestCount <= 0 || guestCount > selectedVenue.getCapacity()) {
                showMessageLabel.setText("Verification Fail");
                return;
            }

            double totalPrice = selectedVenue.getPricePerDay();
            String summary = "Venue Name: " + selectedVenue.getVenueName() + "\n"
                    + "Wedding Date: " + weddingDate + "\n"
                    + "Number of Guests: " + guestCount + "\n"
                    + "Total Price: " + totalPrice + " BDT";

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText(summary);
            alert.showAndWait();

            showMessageLabel.setText("Booking confirmed successfully!");

        } catch (Exception e) {
            showMessageLabel.setText("Verification Fail");
        }
    }
}

