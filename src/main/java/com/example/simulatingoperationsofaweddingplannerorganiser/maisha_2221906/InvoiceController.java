package com.example.simulatingoperationsofaweddingplannerorganiser.maisha_2221906;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class InvoiceController {

    @FXML
    private ComboBox<String> paymentStatusComboBox;

    @FXML
    public void initialize() {
        paymentStatusComboBox.getItems().addAll(
                "Pending",
                "Paid",
                "Partially Paid",
                "Overdue"
        );
    }
}
