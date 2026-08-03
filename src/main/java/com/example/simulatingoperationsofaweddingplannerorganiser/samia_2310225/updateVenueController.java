package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
        selectVenueComboBox.getItems().addAll("Dhaka", "Chittagong", "Sylhet", "Rajshahi", "Khulna", "Barishal");
    }

    @javafx.fxml.FXML
    public void handleBackToDashboardOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleSaveChangesOnAction(ActionEvent actionEvent) {
    }
}