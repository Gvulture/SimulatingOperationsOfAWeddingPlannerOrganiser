package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class updateWeddingDetailsController
{
    @javafx.fxml.FXML
    private Label showMessageLabel;
    @javafx.fxml.FXML
    private DatePicker weddingDateDatePicker;
    @javafx.fxml.FXML
    private TextField numberOfGuestsTextField;
    @javafx.fxml.FXML
    private TextField weddingThemeTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleBackToDashboardOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent, "/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/clientDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void handleSaveOnAction(ActionEvent actionEvent) {
        try {
            LocalDate weddingDate = weddingDateDatePicker.getValue();
            String weddingTheme = weddingThemeTextField.getText();
            String guestsText = numberOfGuestsTextField.getText();


            if (weddingDate == null) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Invalid");
                alert.showAndWait();
                return;
            }

            if (weddingTheme.isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Invalid");
                alert.showAndWait();
                return;
            }


            int numberOfGuests = Integer.parseInt(guestsText);
            if (numberOfGuests <= 0) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Invalid");
                alert.showAndWait();
                return;
            }


            showMessageLabel.setText("Wedding details updated successfully!");

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Invalid");
            alert.showAndWait();
           }
        }
    }