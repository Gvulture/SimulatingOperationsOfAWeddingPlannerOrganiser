package com.example.simulatingoperationsofaweddingplannerorganiser.maisha_2221906;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class TransactionController {


        @FXML
        private TextField transactionIdTextField;

        @FXML
        private TextField weddingIdTextField;

        @FXML
        private TextField vendorIdTextField;

        @FXML
        private TextField amountTextField;

        @FXML
        private ComboBox<String> paymentMethodComboBox;

        @FXML
        private DatePicker transactionDatePicker;

        @FXML
        private TextArea descriptionTextArea;

        @FXML
        private TableView<?> transactionTableView;

        @FXML
        private TableColumn<?, ?> transactionIdTableColumn;

        @FXML
        private TableColumn<?, ?> weddingIdTableColumn;

        @FXML
        private TableColumn<?, ?> vendorTableColumn;

        @FXML
        private TableColumn<?, ?> amountTableColumn;

        @FXML
        private TableColumn<?, ?> paymentMethodTableColumn;

        @FXML
        private TableColumn<?, ?> dateTableColumn;

        @FXML
        private TableColumn<?, ?> statusTableColumn;


        @FXML
        public void initialize(URL url, ResourceBundle resourceBundle) {

            paymentMethodComboBox.setItems(
                    FXCollections.observableArrayList(
                            "Cash",
                            "Bank Transfer",
                            "Credit Card",
                            "Mobile Banking"
                    )
            );


            paymentMethodComboBox.setValue("Cash");


            transactionDatePicker.setValue(LocalDate.now());

            transactionIdTextField.clear();
            weddingIdTextField.clear();
            vendorIdTextField.clear();
            amountTextField.clear();
            descriptionTextArea.clear();


            transactionTableView.setPlaceholder(
                    new Label("No transactions available")
            );
        }
    }

