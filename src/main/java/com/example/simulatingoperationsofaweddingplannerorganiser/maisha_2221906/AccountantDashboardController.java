package com.example.simulatingoperationsofaweddingplannerorganiser.maisha_2221906;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AccountantDashboardController {
    @javafx.fxml.FXML
    public void initialize() {
    }
    @FXML
    private void openTransactions(ActionEvent event) {
        switchScene(event, "Transaction.fxml");
    }

    @FXML
    private void openInvoices(ActionEvent event) {
        switchScene(event, "Invoice.fxml");
    }

    @FXML
    private void openPayments(ActionEvent event) {
        switchScene(event, "Payment.fxml");
    }

    @FXML
    private void openBudgetManagement(ActionEvent event) {
        switchScene(event, "BudgetManagement.fxml");
    }

    @FXML
    private void openFinancialReports(ActionEvent event) {
        switchScene(event, "FinancialReports.fxml");
    }

    @FXML
    private void openProfile(ActionEvent event) {
        switchScene(event, "Profile.fxml");
    }

    @FXML
    private void logout(ActionEvent event) {
        switchScene(event, "Login.fxml");
    }

    private void switchScene(ActionEvent event, String fxmlFile) {

        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource(
                            "/maisha_2221906/" + fxmlFile
                    )
            );

            Scene scene = new Scene(loader.load());

            Stage stage = (Stage) ((Node) event.getSource())
                    .getScene()
                    .getWindow();

            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
