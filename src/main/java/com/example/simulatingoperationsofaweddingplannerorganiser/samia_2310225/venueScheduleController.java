package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.common.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class venueScheduleController
{
    @javafx.fxml.FXML
    private TableColumn<Booking,String> statusTableColumn;
    @javafx.fxml.FXML
    private Label showMessageLabel;
    @javafx.fxml.FXML
    private ComboBox<String> selectDateComboBox;
    @javafx.fxml.FXML
    private TableColumn<Booking, DatePicker> dateTableColumn;
    @javafx.fxml.FXML
    private TableView<Booking> venueScheduleTableView;
    @javafx.fxml.FXML
    private TableColumn<Booking, String> clientNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking, DatePicker> timeSlotTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        selectDateComboBox.getItems().addAll("2026-08-10", "2026-08-15", "2026-08-20", "2026-08-25","2026-08-12");

        clientNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("clientName"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        timeSlotTableColumn.setCellValueFactory(new PropertyValueFactory<>("timeSlot"));
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