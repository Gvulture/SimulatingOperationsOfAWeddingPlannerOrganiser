package com.example.simulatingoperationsofaweddingplannerorganiser.maisha_2221906;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class SystemReportController {
    @FXML
    private ComboBox<String> reportTypeComboBox;

    @FXML
    private ComboBox<String> userRoleComboBox;

    @FXML
    private ComboBox<String> reportStatusComboBox;

    @FXML
    public void initialize() {

        reportTypeComboBox.getItems().addAll(
                "User Report",
                "Activity Report",
                "System Report",
                "Financial Report"
        );

        userRoleComboBox.getItems().addAll(
                "Admin",
                "Accountant",
                "Planner"
        );

        reportStatusComboBox.getItems().addAll(
                "Generated",
                "Pending",
                "Failed"
        );
    }
}
