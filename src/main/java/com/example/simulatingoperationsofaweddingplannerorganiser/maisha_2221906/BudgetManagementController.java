package com.example.simulatingoperationsofaweddingplannerorganiser.maisha_2221906;


import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class BudgetManagementController {
    @FXML
    private ComboBox<String> cmbBudgetCategory;

    @FXML
    private ComboBox<String> cmbExpenseCategory;

    @FXML
    public void initialize() {

        cmbBudgetCategory.getItems().addAll(
                "Catering",
                "Decoration",
                "Photography",
                "Venue",
                "Music",
                "Transport",
                "Other"
        );

        cmbExpenseCategory.getItems().addAll(
                "Catering",
                "Decoration",
                "Photography",
                "Venue",
                "Music",
                "Transport",
                "Other"
        );
    }

}
