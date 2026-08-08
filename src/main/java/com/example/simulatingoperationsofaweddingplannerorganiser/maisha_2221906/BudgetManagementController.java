package com.example.simulatingoperationsofaweddingplannerorganiser.maisha_2221906;


import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class BudgetManagementController {
    @FXML
    private TextField txtRemainingBudget;

    @FXML
    private TextField txtBudgetStatus;

    @FXML
    public void initialize() {
        txtRemainingBudget.setText("0.00");
        txtBudgetStatus.setText("Not Verified");

    }

}
