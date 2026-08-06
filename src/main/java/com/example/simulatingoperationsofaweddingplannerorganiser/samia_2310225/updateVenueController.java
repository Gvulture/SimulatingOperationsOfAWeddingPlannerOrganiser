package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.common.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class updateVenueController
{
    @javafx.fxml.FXML
    private Label showMessageLabel;
    @javafx.fxml.FXML
    private TextField venueNameTextField;
    @javafx.fxml.FXML
    private TextField capacityTextField;
    @javafx.fxml.FXML
    private ComboBox<String> selectVenueComboBox;
    @javafx.fxml.FXML
    private TextField pricePerDayTextField;
    @javafx.fxml.FXML
    private ComboBox<String> locationComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        selectVenueComboBox.getItems().addAll("Grand Palace Hall","Ocean View Convention","Royal Garden Centre");
        locationComboBox.getItems().addAll("Dhaka","Chittagong","Sylhet","Rajshahi","Khulna");
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
    public void handleSaveChangesOnAction(ActionEvent actionEvent) {
        String selectedVenue = selectVenueComboBox.getValue();
        String venueName = venueNameTextField.getText().trim();
        String location = locationComboBox.getValue();
        String capacityStr = capacityTextField.getText().trim();
        String priceStr = pricePerDayTextField.getText().trim();

        try {
            if (selectedVenue == null || venueName.isEmpty() || location == null) {
                showMessageLabel.setText("Invalid");
                return;
            }

            int capacity = Integer.parseInt(capacityStr);
            double price = Double.parseDouble(priceStr);

            if (capacity <= 0 || price <= 0) {
                showMessageLabel.setText("Invalid");
                return;
            }

            showMessageLabel.setText("Venue updated successfully!");

        } catch (Exception e) {
            showMessageLabel.setText("Invalid");
        }
    }
}