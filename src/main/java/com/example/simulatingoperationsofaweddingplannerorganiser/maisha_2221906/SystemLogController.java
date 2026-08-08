package com.example.simulatingoperationsofaweddingplannerorganiser.maisha_2221906;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class SystemLogController {
    @FXML
    private ComboBox<String> activityTypeComboBox;

    @FXML
    private ComboBox<String> userRoleComboBox;

    @FXML
    public void initialize() {

        activityTypeComboBox.getItems().addAll(
                "Login",
                "Logout",
                "Create",
                "Update",
                "Delete",
                "View"
        );

        userRoleComboBox.getItems().addAll(
                "Admin",
                "Accountant",
                "Planner"
        );
    }
}
