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

public class venueScheduleController {

    @FXML private TableColumn<VenueSchedule, String> clientNameTableColumn;
    @FXML private TableColumn<VenueSchedule, LocalDate> dateTableColumn;
    @FXML private TableColumn<VenueSchedule, String> timeSlotTableColumn;
    @FXML private TableColumn<VenueSchedule, String> statusTableColumn;

    @FXML private TableView<VenueSchedule> venueScheduleTableView;
    @FXML private ComboBox<String> selectDateComboBox;
    @FXML private Label showMessageLabel;

    private ArrayList<VenueSchedule> scheduleList = new ArrayList<>();

    @FXML
    public void initialize() {
        clientNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("clientName"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        timeSlotTableColumn.setCellValueFactory(new PropertyValueFactory<>("timeSlot"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        selectDateComboBox.getItems().addAll("2026-08-10", "2026-08-15", "2026-08-20", "2026-08-25", "2026-08-12");

        LocalDate date1 = LocalDate.parse("2026-08-10");
        LocalDate date2 = LocalDate.parse("2026-08-15");
        LocalDate date3 = LocalDate.parse("2026-08-20");

        scheduleList.add(new VenueSchedule("Samia", date1, "10:00 AM - 04:00 PM", "Booked"));
        scheduleList.add(new VenueSchedule("Sultana", date2, "06:00 PM - 11:00 PM", "Pending"));
        scheduleList.add(new VenueSchedule("Tithi", date3, "10:00 AM - 04:00 PM", "Booked"));


        venueScheduleTableView.getItems().clear();
        venueScheduleTableView.getItems().addAll(scheduleList);
        showMessageLabel.setText("");
    }

    @FXML
    public void handleViewDetailsOnAction(ActionEvent actionEvent) {
        String selectedDate = selectDateComboBox.getValue();

        if (selectedDate == null) {
            showMessageLabel.setText("Please select a date first!");
            return;
        }

        for (VenueSchedule s : scheduleList) {
            if (s.getDate().toString().equals(selectedDate)) {
                showMessageLabel.setText("Client " + s.getClientName() +
                        "Date: " + s.getDate() +
                        "Time Slot: " + s.getTimeSlot() +
                        "Status: " + s.getStatus());
                return;
            }
        }
        showMessageLabel.setText("No bookings found!");
    }

    @FXML
    public void handleBackToDashboardOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent, "/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/venueManagerDashboard.fxml");

    }
}