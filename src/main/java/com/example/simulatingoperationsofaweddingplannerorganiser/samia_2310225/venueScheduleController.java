package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

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
    }

    @javafx.fxml.FXML
    public void handleBackToDashboardOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleViewDetailsOnAction(ActionEvent actionEvent) {
    }
}