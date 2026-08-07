package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;
import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class viewAllClientsController {

    @FXML private Label showMessageLabel;
    @FXML private ComboBox<String> selectClientComboBox;

    @FXML private TableView<Client> viewAllClientsTableView;
    @FXML private TableColumn<Client, Integer> clientIdTableColumn;
    @FXML private TableColumn<Client, String> clientNameTableColumn;
    @FXML private TableColumn<Client, String> emailTableColumn;
    @FXML private TableColumn<Client, Integer> phoneNumberTableColumn;
    @FXML private TableColumn<Client, LocalDate> weddingDateTableColumn;
    @FXML private TableColumn<Client, String> bookingStatusTableColumn;

    private ArrayList<Client> clientList = new ArrayList<>();

    @FXML
    public void initialize() {

        clientIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        clientNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        emailTableColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        phoneNumberTableColumn.setCellValueFactory(new PropertyValueFactory<>("contact"));
        weddingDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("weddingDate"));
        bookingStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("bookingStatus"));

        selectClientComboBox.getItems().clear();
        selectClientComboBox.getItems().addAll("101", "102", "103");


        clientList.add(new Client(101, "A Rahim", "Client", 1711111111, "rahim@gmail.com", "1234", LocalDate.parse("2026-11-15"), "Confirmed"));
        clientList.add(new Client(102, "Sultana Begum", "Client", 1822222222, "sultana@gmail.com", "1234", LocalDate.parse("2026-12-01"), "Pending"));
        clientList.add(new Client(103, "Tanvir Hossain", "Client", 1933333333, "tanvir@gmail.com", "1234", LocalDate.parse("2026-12-20"), "Confirmed"));

        viewAllClientsTableView.getItems().clear();
        viewAllClientsTableView.getItems().addAll(clientList);
        showMessageLabel.setText("");
    }

    @FXML
    public void handleViewDetailsOnAction(ActionEvent actionEvent) {
        if (clientList.isEmpty()) {
            showMessageLabel.setText("No clients registered yet!");
            return;
        }

        String selectedClientId = selectClientComboBox.getValue();

        if (selectedClientId == null) {
            showMessageLabel.setText("Please select a client ID first!");
            return;
        }

        int selectedId = Integer.parseInt(selectedClientId);

        for (Client c : clientList) {
            if (c.getId() == selectedId) {
                showMessageLabel.setText("Client: " + c.getName() +
                        " Email: " + c.getEmail() +
                        " Phone: " + c.getContact() +
                        " Date: " + c.getWeddingDate() +
                        " Status: " + c.getBookingStatus());
                return;
            }
        }

        showMessageLabel.setText("No clients registered yet!");
    }

    @FXML
    public void handleBackToDashboardOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent, "/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/venueManagerDashboard.fxml");


    }
}