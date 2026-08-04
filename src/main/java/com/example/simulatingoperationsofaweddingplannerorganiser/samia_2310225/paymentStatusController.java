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

public class paymentStatusController
{
    @javafx.fxml.FXML
    private TableView<Booking> paymentStatusTableView;
    @javafx.fxml.FXML
    private Label showMessageLabel;
    @javafx.fxml.FXML
    private ComboBox<String> selectBookingsComboBox;
    @javafx.fxml.FXML
    private TableColumn<Booking,String> paymentStatusTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking,Double> totalAmountTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking,Double> amountPaidTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking,Integer> bookingIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking,Double> amountDueTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking,String> clientNameTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        selectBookingsComboBox.getItems().addAll("B001", "B002", "B003", "B004");

        bookingIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("bookingId"));
        clientNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("clientName"));
        paymentStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("paymentStatus"));
        totalAmountTableColumn.setCellValueFactory(new PropertyValueFactory<>("totalAmount"));
        amountPaidTableColumn.setCellValueFactory(new PropertyValueFactory<>("amountPaid"));
        amountDueTableColumn.setCellValueFactory(new PropertyValueFactory<>("amountDue"));
    }

    @javafx.fxml.FXML
    public void handleBackToDashboardOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("venueManagerDashboard.fxml"));
            Scene scene = new Scene(loader.load());
            SceneSwitch.setScene(actionEvent, scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void handleViewDetailsOnAction(ActionEvent actionEvent) {
    }
}