package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BudgetController
{
    @javafx.fxml.FXML
    private TextField ExpenseTextfield;
    @javafx.fxml.FXML
    private TableColumn RemainingTableColumn;
    @javafx.fxml.FXML
    private TextField BudgetTextField;
    @javafx.fxml.FXML
    private TextArea DescriptionTextArea;
    @javafx.fxml.FXML
    private TableColumn ExpenseTableColumn;
    @javafx.fxml.FXML
    private TableColumn BudgetTableColumn;
    @javafx.fxml.FXML
    private TableView BudgetTV;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackOA(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/WPDashboard.fxml");
    }
}