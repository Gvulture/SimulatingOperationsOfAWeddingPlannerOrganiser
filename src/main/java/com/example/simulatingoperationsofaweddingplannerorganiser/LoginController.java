package com.example.simulatingoperationsofaweddingplannerorganiser;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.fxml.FXML;

public class LoginController
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TextField passwordTextField;
    @javafx.fxml.FXML
    private Label displaysErrorLabel;
    @javafx.fxml.FXML
    private ComboBox<String> roleComboBox;
    private ActionEvent event;

    @javafx.fxml.FXML
    public void initialize() {
        ObservableList<String> roles = FXCollections.observableArrayList(
                "Wedding Planner" , "Vendor Manager" , " Photographer" , "Guest" , "Client" , "Venue Manager" , "Accountant" , "Administrator"

        );
        roleComboBox.setItems(roles);
        displaysErrorLabel.setVisible(false);

    }

    @javafx.fxml.FXML
    public void handleForgotIDPasswordOnClick(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(event, "ForgotIDPassword.fxml");
    }

    @javafx.fxml.FXML
    public void handleLoginOnClick(ActionEvent actionEvent) {
        String id = idTextField.getText();
        String password = passwordTextField.getText();
        String selectedRole = roleComboBox.getValue().toString();

        if (selectedRole == null || id.isEmpty() || password.isEmpty())  {
            displaysErrorLabel.setText("Fill all the field and select a role");
            displaysErrorLabel.setVisible(true);
            return;
        }

        switch (selectedRole) {
            case "Wedding Planner":
                SceneSwitcher.switchTo(event,"rejwan_2030588/WPDashboard.fxml");
                break;

            case "Vendor Manager":
                SceneSwitcher.switchTo(event,"rejwan_2030588/VendorDashboard.fxml");
                break;

            case "Photographer":
                SceneSwitcher.switchTo(event,"Jhalok_2411777/Photographer_Dashboard_view.fxml");
                break;

            case "Guest":
                SceneSwitcher.switchTo(event,"Jhalok_2411777/Guest_Dashboard.fxml");
                break;

            case "Client":
                SceneSwitcher.switchTo(event,"samia_2310225/clientDashboard.fxml");
                break;

            case "Venue Manager":
                SceneSwitcher.switchTo(event,"samia_2310225/venueManagerDashboard.fxml");
                break;



            default:
                displaysErrorLabel.setText("Dashboard not found for this user");
                displaysErrorLabel.setVisible(true);
        }

    }
}