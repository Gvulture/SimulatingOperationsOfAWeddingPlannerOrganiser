package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.common.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class sendInvitationController
{
    @javafx.fxml.FXML
    private TextField phoneNumberTextField;
    @javafx.fxml.FXML
    private TextField guestNameTextField;
    @javafx.fxml.FXML
    private Label showMessageLabel;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField tableNumberTextField;
    private ArrayList<String> invitedGuestsList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        showMessageLabel.setText("");
    }

    @javafx.fxml.FXML
    public void handleBackToDashboardOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/clientDashboard.fxml"));
            Scene scene = new Scene(loader.load());
            SceneSwitch.setScene(actionEvent, scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void handleSendInvitationOnAction(ActionEvent actionEvent) {

        try {
            String name = guestNameTextField.getText();
            String phone = phoneNumberTextField.getText();
            String email = emailTextField.getText();


            if (name.isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Invalid");
                alert.showAndWait();
                return;
            }


            if (email.isEmpty() && phone.isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Invalid");
                alert.showAndWait();
                return;
            }


            showMessageLabel.setText("Invitation sent successfully!");
            guestNameTextField.clear();
            phoneNumberTextField.clear();
            emailTextField.clear();
            tableNumberTextField.clear();

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Invalid");
            alert.showAndWait();
        }
    }

}
