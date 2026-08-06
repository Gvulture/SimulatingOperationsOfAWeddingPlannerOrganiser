package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.common.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;

public class paymentStatusController {
    @javafx.fxml.FXML
    private TableView<PaymentRecord> paymentStatusTableView;
    @javafx.fxml.FXML
    private Label showMessageLabel;
    @javafx.fxml.FXML
    private ComboBox<String> selectBookingsComboBox;
    @javafx.fxml.FXML
    private TableColumn<PaymentRecord, String> paymentStatusTableColumn;
    @javafx.fxml.FXML
    private TableColumn<PaymentRecord, Double> totalAmountTableColumn;
    @javafx.fxml.FXML
    private TableColumn<PaymentRecord, Double> amountPaidTableColumn;
    @javafx.fxml.FXML
    private TableColumn<PaymentRecord, Integer> bookingIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<PaymentRecord, Double> amountDueTableColumn;
    @javafx.fxml.FXML
    private TableColumn<PaymentRecord, String> clientNameTableColumn;

    private ArrayList<PaymentRecord> paymentList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        selectBookingsComboBox.getItems().addAll("B001", "B002", "B003", "B004");

        bookingIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("bookingId"));
        clientNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("clientName"));
        paymentStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("paymentStatus"));
        totalAmountTableColumn.setCellValueFactory(new PropertyValueFactory<>("totalAmount"));
        amountPaidTableColumn.setCellValueFactory(new PropertyValueFactory<>("amountPaid"));
        amountDueTableColumn.setCellValueFactory(new PropertyValueFactory<>("amountDue"));

        paymentList.add(new PaymentRecord("B001", "Rahim", 150000.0, 100000.0, 50000.0, "Partial"));
        paymentList.add(new PaymentRecord("B002", "Sultana", 220000.0, 220000.0, 0.0, "Paid"));
        paymentList.add(new PaymentRecord("B003", "Karim", 95000.0, 30000.0, 65000.0, "Partial"));

        paymentStatusTableView.getItems().clear();
        paymentStatusTableView.getItems().addAll(paymentList);
        showMessageLabel.setText("");
    }

    @javafx.fxml.FXML
    public void handleBackToDashboardOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/venueManagerDashboard.fxml"));
            Scene scene = new Scene(loader.load());
            SceneSwitch.setScene(actionEvent, scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void handleViewDetailsOnAction(ActionEvent actionEvent) {
        if (paymentList.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("No payment records found!");
            alert.showAndWait();
            return;
        }

        String selectedBookingId = selectBookingsComboBox.getValue();

        if (selectedBookingId == null) {
            showMessageLabel.setText("Please select a booking ID first!");
            return;
        }

        for (PaymentRecord p : paymentList) {
            if (p.getBookingId().equals(selectedBookingId)) {
                showMessageLabel.setText("Client: " + p.getClientName() +
                        "Total: " + p.getTotalAmount() +
                        "Paid: " + p.getAmountPaid() +
                        "Due: " + p.getAmountDue() +
                        "Status: " + p.getPaymentStatus());
                return;
            }
        }
    }
}