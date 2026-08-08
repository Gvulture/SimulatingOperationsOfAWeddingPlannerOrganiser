package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

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
    private ArrayList<Expense> expenseList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        categoryComboBox.getItems().addAll("Venue", "Catering", "Photography", "Decoration", "Attire", "Others");

        categoryTableColumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        amountTableColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        descriptionTableColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
    }

    @javafx.fxml.FXML
    public void handleBackToDashboardOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent, "/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/clientDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void handleAddExpenseOnAction(ActionEvent actionEvent) {

            double totalBudget = 500000;
            double totalSpent = 0;

            String category = categoryComboBox.getValue();
            String description = descriptionTextField.getText();
            String amountStr = amountTextField.getText();

            if (category == null || description.isEmpty() || amountStr.isEmpty()) {
                showMessageLabel.setText("Please fill all fields!");
                return;
            }

            double amount = Double.parseDouble(amountStr);

            int id = expenseList.size() + 1;
            Expense newExpense = new Expense(id, category, amount);
            expenseList.add(newExpense);

            for (Expense e : expenseList) {
                totalSpent += e.getAmount();
            }
            double remaining = totalBudget - totalSpent;

            weddingBudgetTableView.setItems(FXCollections.observableArrayList(expenseList));
            totalBudgetTextField.setText(totalBudget + "BDT" );
            totalSpentTextField.setText(totalSpent + "BDT" );
            remainingBalanceTextField.setText(remaining + " BDT");

            showMessageLabel.setText("Expense Added!");
            descriptionTextField.clear();
            amountTextField.clear();
        }
}