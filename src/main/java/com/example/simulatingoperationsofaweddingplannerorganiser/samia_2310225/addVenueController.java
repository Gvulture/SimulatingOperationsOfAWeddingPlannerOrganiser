package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.common.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class addVenueController {

    @FXML private TextField venueNameTextField;
    @FXML private TextField capacityTextField;
    @FXML private Label showMessageLabel;
    @FXML private TextField pricePerDayTextField;
    @FXML private ComboBox<String> locationComboBox;
    @FXML private TextArea facilitiesTextArea;

    @FXML
    public void initialize() {
        locationComboBox.getItems().addAll("Dhaka", "Chittagong", "Sylhet", "Rajshahi", "Khulna");
    }

    @FXML
    public void handleAddVenueOnAction(ActionEvent actionEvent) {

        String venueName = venueNameTextField.getText().trim();
        String location = locationComboBox.getValue();
        String capacityStr = capacityTextField.getText().trim();
        String priceStr = pricePerDayTextField.getText().trim();


        try {
            if (venueName.isEmpty()) {
                showMessageLabel.setText("Invalid");
                return;
            }

            if (location == null || location.isEmpty()) {
                showMessageLabel.setText("Invalid");
                return;
            }

            int capacity = Integer.parseInt(capacityStr);
            if (capacity <= 0) {
                showMessageLabel.setText("Invalid");
                return;
            }

            double price = Double.parseDouble(priceStr);
            if (price <= 0) {
                showMessageLabel.setText("Invalid");
                return;
            }

            showMessageLabel.setText("Venue added successfully!");
            venueNameTextField.clear();
            capacityTextField.clear();
            pricePerDayTextField.clear();
            facilitiesTextArea.clear();

        } catch (Exception e) {
            showMessageLabel.setText("Invalid");
        }
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
}