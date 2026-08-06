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

public class viewBookingRequestsController
{
    @javafx.fxml.FXML
    private TableColumn<Booking,String> statusTableColumn;
    @javafx.fxml.FXML
    private Label showMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<Booking, Double> totalPriceTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking,Integer> numOfGuestsTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking,Integer> bookingIdTableColumn;
    @javafx.fxml.FXML
    private TableView<Booking> viewBookingsTableView;
    @javafx.fxml.FXML
    private TableColumn<Booking, LocalDate> weddingDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking,String> clientNameTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> selectBookingComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        selectBookingComboBox.getItems().addAll("B001", "B002", "B003", "B004", "B005");

        clientNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("clientName"));
        bookingIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("bookingId"));
        weddingDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("weddingDate"));
        numOfGuestsTableColumn.setCellValueFactory(new PropertyValueFactory<>("numOfGuests"));
        totalPriceTableColumn.setCellValueFactory(new PropertyValueFactory<>("totalPrice"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

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