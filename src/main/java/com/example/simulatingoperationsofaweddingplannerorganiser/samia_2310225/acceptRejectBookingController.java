package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.common.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class acceptRejectBookingController
{
    @javafx.fxml.FXML
    private ComboBox <String>selectsBookingComboBox;
    @javafx.fxml.FXML
    private Label showMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<Booking,Integer> guestsTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking,Double> totalPriceTableColumn;
    @javafx.fxml.FXML
    private TableView<Booking> acceptRejectTableView;
    @javafx.fxml.FXML
    private TableColumn<Booking, Integer> bookingIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking, DatePicker> weddingDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking,String> clientNameTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
                 selectsBookingComboBox.getItems().addAll("B001","B002","B003","B004");

                 bookingIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("bookingId"));
                 clientNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("clientName"));
                 weddingDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("weddingDate"));
                 guestsTableColumn.setCellValueFactory(new PropertyValueFactory<>("guests"));
                 totalPriceTableColumn.setCellValueFactory(new PropertyValueFactory<>("totalPrice"));

    }

    @javafx.fxml.FXML
    public void handleBackToDashboardOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/venueManagerDashboard.fxml"));
            Scene scene = new Scene(loader.load());
            SceneSwitch.setScene(actionEvent, scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void handleRejectOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleAcceptOnAction(ActionEvent actionEvent) {
    }
}