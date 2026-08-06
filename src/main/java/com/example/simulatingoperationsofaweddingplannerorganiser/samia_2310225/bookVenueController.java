package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.common.BinaryUtils;
import com.example.simulatingoperationsofaweddingplannerorganiser.common.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

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

    private final String file = "venues.bin";
    private ArrayList<Venue> venueList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        selectWeddingVenueComboBox.getItems().addAll("Grand Palace Hall", "Rose Garden", "Sunset Banquet", "Royal Convention Center");

        venueNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("venueName"));
        loactionTableColumn.setCellValueFactory(new PropertyValueFactory<>("location"));
        pricePerDayTableColumn.setCellValueFactory(new PropertyValueFactory<>("pricePerDay"));
        capacityTableColumn.setCellValueFactory(new PropertyValueFactory<>("capacity"));

        venueList = BinaryUtils.readObjects(file);


        if (venueList.isEmpty()) {
            venueList.add(new Venue(101, 500, "Grand Palace", "Dhaka", "Available", 50000.0));
            venueList.add(new Venue(102, 300, "Royal Hall", "Dhaka", "Available", 35000.0));
            venueList.add(new Venue(103, 800, "Ocean Breeze", "Chittagong", "Booked", 75000.0));
            venueList.add(new Venue(104, 400, "Green Garden", "Sylhet", "Available", 40000.0));
            venueList.add(new Venue(105, 1000, "City Convention", "Dhaka", "Available", 120000.0));

            BinaryUtils.saveList(file, venueList);
        }
        bookVenueTableView.getItems().setAll(venueList);


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

    @FXML
    public void handleBookNowOnAction(ActionEvent actionEvent) {
        String selectedVenueName = selectWeddingVenueComboBox.getValue();
        LocalDate weddingDate = weddingDateDatePicker.getValue();
        String guest = numOfGuestsTextField.getText().trim();

        // Event-6 Verification: ফাঁকা ইনপুট চেক
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
        alert.setTitle("Booking Summary");
        alert.setContentText(summary);
        alert.showAndWait();
        showMessageLabel.setText("Booking confirmed successfully!");

    }
}


