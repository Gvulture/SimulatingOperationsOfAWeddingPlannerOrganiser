package com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;

import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Properties;

public class CreateWeddingplancontoller
{
    ArrayList<CreateWeddingPlan> lst = new ArrayList<>();
    @javafx.fxml.FXML
    private ComboBox<String> ThemeCombobox;
    @javafx.fxml.FXML
    private TextField BudgetTextField;
    @javafx.fxml.FXML
    private TextField ClientNameTextField;
    @javafx.fxml.FXML
    private DatePicker WeddingDateDatePicker;
    @javafx.fxml.FXML
    private TableColumn<Integer,CreateWeddingPlan> BudgetTC;
    @javafx.fxml.FXML
    private TableView<CreateWeddingPlan> CreateWeddingPlanTV;
    @javafx.fxml.FXML
    private TableColumn<String,CreateWeddingPlan> ClientNameTC;
    @javafx.fxml.FXML
    private TableColumn ThemeTC;
    @javafx.fxml.FXML
    private TableColumn<LocalDate,CreateWeddingPlan> WeddingDateTC;
    @javafx.fxml.FXML
    private Label MessegeLable;

    @javafx.fxml.FXML
    public void initialize() {

        ThemeCombobox.getItems().addAll("Classic","Modern","Royal","Beach","Garden");

        BudgetTC.setCellValueFactory(new PropertyValueFactory<>("Budget"));
        ClientNameTC.setCellValueFactory(new PropertyValueFactory<>("ClientName"));
        WeddingDateTC.setCellValueFactory(new PropertyValueFactory<>("WeddingDate"));

    }

    @javafx.fxml.FXML
    public void ResetOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SaveOnClick(ActionEvent actionEvent) {
        CreateWeddingPlanTV.getItems().addAll(lst);
    }

    @javafx.fxml.FXML
    public void BacktoWPDashbordOnClick(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/WPDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void OkOA(ActionEvent actionEvent) {
        String ClientName = ClientNameTextField.getText();
        int Budget = Integer.parseInt(BudgetTextField.getText());
        String Theme = ThemeCombobox.getValue();

        CreateWeddingPlan C = new CreateWeddingPlan(ClientName, Budget);
        MessegeLable.setText("Plan conformed");

        ClientNameTextField.clear();
        BudgetTextField.clear();
    }
}