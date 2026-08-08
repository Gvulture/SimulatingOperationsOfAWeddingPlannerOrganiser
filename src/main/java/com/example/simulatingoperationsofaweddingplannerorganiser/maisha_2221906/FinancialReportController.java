package com.example.simulatingoperationsofaweddingplannerorganiser.maisha_2221906;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class FinancialReportController {
    @FXML
    private ComboBox<String> cmbReportType;

    @FXML
    private TextArea statusornotificatinTextarea;

    @FXML
    public void initialize() {

        cmbReportType.getItems().addAll(
                "Income Report",
                "Expense Report",
                "Payment Report",
                "Outstanding Balance Report",
                "Budget Report",
                "Financial Summary"
        );

        statusornotificatinTextarea.setText("Ready to generate report.");
    }
}
