package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.event.ActionEvent;

public class VendorDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void VendorPerformanceOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/VendorPerformance.fxml");
    }

    @javafx.fxml.FXML
    public void AvailabilityOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/VendorAvailability.fxml");
    }

    @javafx.fxml.FXML
    public void AddVendorOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/AddVendor.fxml");
    }

    @javafx.fxml.FXML
    public void UpdateVendorOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/UpdateVendor.fxml");
    }

    @javafx.fxml.FXML
    public void ViewBookingOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/ViewBookings.fxml");
    }

    @javafx.fxml.FXML
    public void ApproveBookingOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/ApproveBooking.fxml");
    }

    @javafx.fxml.FXML
    public void VendorPaymentOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/VendorPayment.fxml");
    }

    @javafx.fxml.FXML
    public void GenerateReportOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/ViewReports.fxml");
    }

    @javafx.fxml.FXML
    public void LogoutOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Login.fxml");
    }
}