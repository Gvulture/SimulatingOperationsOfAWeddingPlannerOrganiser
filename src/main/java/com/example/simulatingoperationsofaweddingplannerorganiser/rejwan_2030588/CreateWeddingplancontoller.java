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
    private ArrayList<CreateWeddingPlan> CreateWeddingPlanArrayList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        ThemeCombobox.getItems().addAll("Classic","Modern","Royal","Beach","Garden");

        BudgetTC.setCellValueFactory(new PropertyValueFactory<>("budget"));
        ClientNameTC.setCellValueFactory(new PropertyValueFactory<>("clientName"));
        WeddingDateTC.setCellValueFactory(new PropertyValueFactory<>("weddingDate"));
        ThemeTC.setCellValueFactory(new PropertyValueFactory<>("theme"));

    }

    @javafx.fxml.FXML
    public void ResetOnClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SaveOnClick() {
        CreateWeddingPlan cwp =new CreateWeddingPlan(
                BudgetTextField.getText(),
                ClientNameTextField.getText(),
                WeddingDateDatePicker.getValue(),
                ThemeCombobox.getValue()
        );
        CreateWeddingPlanArrayList.add(cwp);
        CreateWeddingPlanTV.getItems().clear();
        CreateWeddingPlanTV.getItems().addAll(CreateWeddingPlanArrayList);
    }

    @javafx.fxml.FXML
    public void BacktoWPDashbordOnClick(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent,"rejwan_2030588/WPDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void OkOA(ActionEvent actionEvent) {
        String clientName = ClientNameTextField.getText();
        int budget = Integer.parseInt(BudgetTextField.getText());
        String theme = ThemeCombobox.getValue();

        CreateWeddingPlan C = new CreateWeddingPlan(clientName, budget);
        MessegeLable.setText("Plan conformed");

        ClientNameTextField.clear();
        BudgetTextField.clear();
    }
}