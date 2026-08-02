package com.example.simulatingoperationsofaweddingplannerorganiser;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class PasswordChangeController
{
    private ActionEvent event;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backToLoginOnClick(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(event,"Login.fxml");
    }
}