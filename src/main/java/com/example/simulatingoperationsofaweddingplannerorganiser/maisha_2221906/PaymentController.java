package com.example.simulatingoperationsofaweddingplannerorganiser.maisha_2221906;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class PaymentController {

    @FXML
    private ComboBox<String> paymentMethodComboBox;

    @FXML
    public void initialize() {

        paymentMethodComboBox.getItems().addAll(
                "Cash",
                "Bank Transfer",
                "Credit Card",
                "Debit Card",
                "Mobile Banking"
        );
    }
}
