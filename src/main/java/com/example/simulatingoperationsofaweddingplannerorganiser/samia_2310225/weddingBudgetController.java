package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class weddingBudgetController
{
    @javafx.fxml.FXML
    private TableColumn<Expense,Double> amountTableColumn;
    @javafx.fxml.FXML
    private Label showMessageLabel;
    @javafx.fxml.FXML
    private ComboBox<String> categoryComboBox;
    @javafx.fxml.FXML
    private Label remainingBalanceTextField;
    @javafx.fxml.FXML
    private Label totalSpentTextField;
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private Label totalBudgetTextField;
    @javafx.fxml.FXML
    private TableView<Expense> weddingBudgetTableView;
    @javafx.fxml.FXML
    private TableColumn<Expense,String> descriptionTableColumn;
    @javafx.fxml.FXML
    private TextField descriptionTextField;
    @javafx.fxml.FXML
    private TableColumn<Expense,String> categoryTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        categoryComboBox.getItems().addAll("Venue", "Catering", "Photography", "Decoration", "Attire", "Others");

        categoryTableColumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        amountTableColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        descriptionTableColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
    }

    @javafx.fxml.FXML
    public void handleBackToDashboardOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleAddExpenseOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent, "/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/clientDashboard.fxml");

    }
}