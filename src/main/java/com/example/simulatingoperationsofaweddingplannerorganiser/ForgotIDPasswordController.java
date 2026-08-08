package com.example.simulatingoperationsofaweddingplannerorganiser;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;

public class ForgotIDPasswordController
{
    @javafx.fxml.FXML
    private TextField newPasswordVerifyTextField;
    @javafx.fxml.FXML
    private Label newPasswordVerifyErrorLabel;
    @javafx.fxml.FXML
    private TextField emailVerifyTextField;
    private ActionEvent event;

    @javafx.fxml.FXML
    public void initialize() { newPasswordVerifyErrorLabel.setVisible(false);
    }

    @javafx.fxml.FXML
    public void backToLoginOnClick(ActionEvent actionEvent) {

        SceneSwitcher.switchTo(actionEvent,"Login.fxml");
    }

    @javafx.fxml.FXML
    public void requestsOTPOnClick(ActionEvent actionEvent) {
        String email = emailVerifyTextField.getText();
        String newPassword = newPasswordVerifyTextField.getText();

        if (email.isEmpty() || newPassword.isEmpty()) {
            newPasswordVerifyErrorLabel.setText("Please fill in both fields");

        }
        else if (!isAlphanumeric(newPassword)){
            newPasswordVerifyErrorLabel.setText("Passwords must be comnination of alphanumeric");
            newPasswordVerifyErrorLabel.setVisible(true);
        }
        else {
            newPasswordVerifyErrorLabel.setVisible(false);

            SceneSwitcher.switchTo(event,"OTPScreen.fxml");
        }
    }

    private boolean isAlphanumeric(String string){ return string.matches(("^[a-zA-Z0-9_-]*$"));}

}