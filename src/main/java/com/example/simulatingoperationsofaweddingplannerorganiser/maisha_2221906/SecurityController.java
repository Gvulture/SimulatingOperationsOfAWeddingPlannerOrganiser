package com.example.simulatingoperationsofaweddingplannerorganiser.maisha_2221906;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class SecurityController {
    @FXML
    private ComboBox<String> userRoleComboBox;

    @FXML
    private ComboBox<String> accountStatusComboBox;

    @FXML
    public void initialize() {

        // User Role options
        userRoleComboBox.getItems().addAll(
                "Admin",
                "Accountant",
                "Planner"
        );

        // Account Status options
        accountStatusComboBox.getItems().addAll(
                "Active",
                "Locked",
                "Inactive"
        );
    }
}
