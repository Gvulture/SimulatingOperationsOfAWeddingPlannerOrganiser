package com.example.simulatingoperationsofaweddingplannerorganiser.maisha_2221906;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class UserManagementController {

    @FXML
    private TextField txtUserId;
    @FXML
    private TextField txtFullName;
    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtPhone;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private PasswordField txtConfirmPassword;
    @FXML
    private ComboBox<String> comboRole;
    @FXML
    private ComboBox<String> comboStatus;

    @FXML
    private ComboBox<String> comboDataType;
    @FXML
    private TextField txtVendorName;
    @FXML
    private TextArea txtDescription;


    @FXML
    private Button btnAdd;
    @FXML
    private Button btnUpdate;
    @FXML
    private Button btnDelete;
    @FXML
    private Button btnSearch;
    @FXML
    private Button btnAssignRole;
    @FXML
    private Button btnReset;
    @FXML
    private Button btnCancel;


    @FXML
    private TableView<?> userListTable;
    @FXML
    private TableView<?> systemDataListTable;


    @FXML
    public void initialize() {

        comboRole.getItems().addAll("Admin", "Manager", "User");
        comboStatus.getItems().addAll("Active", "Inactive");
        comboDataType.getItems().addAll("Type A", "Type B");


        btnAdd.setOnAction(event -> handleAddAction());
        btnReset.setOnAction(event -> ResetAction());
    }

    private void handleAddAction() {
        String username = txtUsername.getText();
    }

    private void ResetAction() {

        txtUserId.clear();
        txtFullName.clear();
        txtUsername.clear();
        txtEmail.clear();
        txtPhone.clear();
        txtPassword.clear();
        txtConfirmPassword.clear();
        txtVendorName.clear();
        txtDescription.clear();


        comboRole.getSelectionModel().clearSelection();
        comboStatus.getSelectionModel().clearSelection();
        comboDataType.getSelectionModel().clearSelection();
    }
}
