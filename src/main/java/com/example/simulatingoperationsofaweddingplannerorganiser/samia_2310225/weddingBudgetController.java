package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

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
    }

    @javafx.fxml.FXML
    public void handleBackToDashboardOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleAddExpenseOnAction(ActionEvent actionEvent) {
    }
}