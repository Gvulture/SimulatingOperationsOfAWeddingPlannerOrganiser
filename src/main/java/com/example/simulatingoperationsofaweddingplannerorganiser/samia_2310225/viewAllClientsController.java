package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.common.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
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
        selectClientComboBox.getItems().addAll("C001", "C002", "C003", "C004", "C005");

        clientNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("clientName"));
        clientIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("clientId"));
        emailTableColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        phoneNumberTableColumn.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        weddingDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("weddingDate"));
        bookingStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("bookingStatus"));

    }

    @javafx.fxml.FXML
    public void handleBackToDashboardOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/venueManagerDashboard.fxml"));
            Scene scene = new Scene(loader.load());
            SceneSwitch.setScene(actionEvent, scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void handleViewDetailsOnAction(ActionEvent actionEvent) {
    }
}