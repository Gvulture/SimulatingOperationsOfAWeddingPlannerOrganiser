package com.example.simulatingoperationsofaweddingplannerorganiser.maisha_2221906;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class IssueManagementController {
    @FXML
    private ComboBox<String> issueCategoryComboBox;

    @FXML
    private ComboBox<String> priorityComboBox;

    @FXML
    private ComboBox<String> issueStatusComboBox;


    @FXML
    public void initialize() {


        issueCategoryComboBox.getItems().addAll(
                "Technical",
                "Database",
                "Security",
                "User Account",
                "Payment",
                "Other"
        );


        priorityComboBox.getItems().addAll(
                "Low",
                "Medium",
                "High",
                "Critical"
        );


        issueStatusComboBox.getItems().addAll(
                "Open",
                "In Progress",
                "Resolved",
                "Closed"
        );


        issueStatusComboBox.setValue("Open");
    }
}
