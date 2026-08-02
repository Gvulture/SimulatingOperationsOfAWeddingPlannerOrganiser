package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.time.LocalDate;

public class viewAllClientsController
{
    @javafx.fxml.FXML
    private Label showMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<Client, String> emailTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> selectClientComboBox;
    @javafx.fxml.FXML
    private TableColumn<Client,String> phoneNumberTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Client, Integer> clientIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Client, LocalDate> weddingDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Client,String> bookingStatusTableColumn;
    @javafx.fxml.FXML
    private TableView<Client> viewAllClientsTableView;
    @javafx.fxml.FXML
    private TableColumn<Client,String> clientNameTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleBackToDashboardOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleViewDetailsOnAction(ActionEvent actionEvent) {
    }
}