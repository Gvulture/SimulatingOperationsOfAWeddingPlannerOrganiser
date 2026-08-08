package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class WPDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void GrerateScheduleOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/GenerateSchedule.fxml");
    }

    @javafx.fxml.FXML
    public void ManageGuestOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/ManageGuest.fxml");
    }

    @javafx.fxml.FXML
    public void CreateWeddingPlanOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/CreateWeddingPlan.fxml");
    }

    @javafx.fxml.FXML
    public void AssignTaskOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/AssignTask.fxml");
    }

    @javafx.fxml.FXML
    public void CompletedWeddingOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/CompletedWeddingPlan.fxml");
    }

    @javafx.fxml.FXML
    public void LogoutOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"Login.fxml");
    }

    @javafx.fxml.FXML
    public void GenerateScheduleOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/GenerateSchedule.fxml");
    }

    @FXML
    public void ViewReportOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/ViewReport.fxml");
    }

    @FXML
    public void BudgetOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/Budget.fxml");
    }

    @FXML
    public void AssignVendorOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/AssignVendor.fxml");
    }
}