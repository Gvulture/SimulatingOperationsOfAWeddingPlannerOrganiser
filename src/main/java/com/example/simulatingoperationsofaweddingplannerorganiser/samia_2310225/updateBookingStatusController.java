package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class updateBookingStatusController
{
    @javafx.fxml.FXML
    private Label showMessageLabel;
    @javafx.fxml.FXML
    private ComboBox<String> newStatusComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> selectBookingComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        newStatusComboBox.getItems().addAll("Confirmed", "Cancelled", "Completed");
        selectBookingComboBox.getItems().addAll("B001", "B002", "B003", "B004");
    }

    @javafx.fxml.FXML
    public void handleBackToDashboardOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleUpdateBookingStatusOnAction(ActionEvent actionEvent) {
    }
}