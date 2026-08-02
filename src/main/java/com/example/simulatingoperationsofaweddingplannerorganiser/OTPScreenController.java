package com.example.simulatingoperationsofaweddingplannerorganiser;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;

public class OTPScreenController
{
    @javafx.fxml.FXML
    private TextField enterOTPTextField;
    private ActionEvent event;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void verifiesOTPOnClick(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(event,"ForgotIDPassword.fxml");
    }

    @javafx.fxml.FXML
    public void backToForgotIDPasswordOnClick(ActionEvent actionEvent) {

        SceneSwitcher.switchTo(event,"PasswordChanged.fxml");
    }
}