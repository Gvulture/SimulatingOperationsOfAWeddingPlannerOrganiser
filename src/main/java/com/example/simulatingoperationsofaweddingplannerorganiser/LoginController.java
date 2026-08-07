package com.example.simulatingoperationsofaweddingplannerorganiser;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField idTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private Label displaysErrorLabel;
    @FXML
    private ComboBox<String> roleComboBox;

    @FXML
    public void initialize() {
        ObservableList<String> roles = FXCollections.observableArrayList(
                "Wedding Planner", "Vendor Manager", "Photographer", "Guest", "Client", "Venue Manager", "Accountant", "Administrator"
        );
        roleComboBox.setItems(roles);
        displaysErrorLabel.setVisible(false);
    }

    @FXML
    public void handleForgotIDPasswordOnClick(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent, "ForgotIDPassword.fxml");
    }

    @FXML
    public void handleLoginOnClick(ActionEvent actionEvent) {
        String id = idTextField.getText();
        String password = passwordTextField.getText();
        String selectedRole = roleComboBox.getValue(); // toString() সরিয়ে দেওয়া হয়েছে NullPointer এড়াতে

        if (selectedRole == null || id.isEmpty() || password.isEmpty()) {
            displaysErrorLabel.setText("Fill all the fields and select a role");
            displaysErrorLabel.setVisible(true);
            return;
        }

        switch (selectedRole) {
            case "Wedding Planner":
                SceneSwitcher.switchTo(actionEvent, "rejwan_2030588/WPDashboard.fxml");
                break;

            case "Vendor Manager":
                SceneSwitcher.switchTo(actionEvent, "rejwan_2030588/VendorDashboard.fxml");
                break;

            case "Photographer":
                SceneSwitcher.switchTo(actionEvent, "Jhalok_2411777/Photographer_Dashboard_view.fxml");
                break;

            case "Guest":
                SceneSwitcher.switchTo(actionEvent, "Jhalok_2411777/Guest_Dashboard.fxml");
                break;

            case "Client":
                SceneSwitcher.switchTo(actionEvent, "/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/clientDashboard.fxml");
                break;

            case "Venue Manager":
                SceneSwitcher.switchTo(actionEvent, "/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/venueManagerDashboard.fxml");
                break;

            case "Accountant":
                SceneSwitcher.switchTo(actionEvent,"maisha_2221906/AccountantDashboard.fxml");
                break;

            case "Administrator":
                SceneSwitcher.switchTo(actionEvent,"maisha_2221906/AdministratorDashboard.fxml");
                break;

            default:
                displaysErrorLabel.setText("Dashboard not found for this user");
                displaysErrorLabel.setVisible(true);
                break;
        }
    }
}