package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.common.BinaryUtils;
import com.example.simulatingoperationsofaweddingplannerorganiser.common.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;


public class acceptRejectBookingController {
    @javafx.fxml.FXML
    private ComboBox<String> selectsBookingComboBox;
    @javafx.fxml.FXML
    private Label showMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<Booking, Integer> guestsTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking, Double> totalPriceTableColumn;
    @javafx.fxml.FXML
    private TableView<Booking> acceptRejectTableView;
    @javafx.fxml.FXML
    private TableColumn<Booking, Integer> bookingIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking, DatePicker> weddingDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Booking, String> clientNameTableColumn;

    private final String file = "bookings.bin";
    private ArrayList<Booking> bookingList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        selectsBookingComboBox.getItems().addAll("B001", "B002", "B003", "B004");

        bookingIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("bookingId"));
        clientNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("clientName"));
        weddingDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("weddingDate"));
        guestsTableColumn.setCellValueFactory(new PropertyValueFactory<>("guests"));
        totalPriceTableColumn.setCellValueFactory(new PropertyValueFactory<>("totalPrice"));

        bookingList = BinaryUtils.readObjects(file);

        if (bookingList.isEmpty()) {
            LocalDate date1 = LocalDate.parse("2026-09-15");
            LocalDate date2 = LocalDate.parse("2026-10-20");
            LocalDate date3 = LocalDate.parse("2026-11-05");
            LocalDate date4 = LocalDate.parse("2026-12-12");

            bookingList.add(new Booking(1001, 300, "Pending", "Paid", 45000.0, date1));
            bookingList.add(new Booking(1002, 500, "Pending", "Paid", 75000.0, date2));
            bookingList.add(new Booking(1003, 250, "Pending", "Paid", 35000.0, date3));
            bookingList.add(new Booking(1004, 400, "Pending", "Paid", 60000.0, date4));
            BinaryUtils.saveList(file, bookingList);

        }
        acceptRejectTableView.getItems().setAll(bookingList);

        selectsBookingComboBox.getItems().clear();
        for (Booking b : bookingList) {
            int id = b.getBookingId();
            String idText = String.valueOf(id);
            selectsBookingComboBox.getItems().add(idText);
        }
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
        String selectedIdStr = selectsBookingComboBox.getValue();


        if (selectedIdStr == null || selectedIdStr.isEmpty()) {
            showMessageLabel.setText("Invalid"); // Event-9
            return;
        }

        int selectedId = Integer.parseInt(selectedIdStr);


        for (Booking b : bookingList) {
            if (b.getBookingId() == selectedId) {

                b.setStatus("Confirmed");


                BinaryUtils.saveList(file, bookingList);
                acceptRejectTableView.getItems().setAll(bookingList);


                showMessageLabel.setText("Booking Accepted!");
                return;
            }
        }

        showMessageLabel.setText("Invalid"); // Event-9
    }


    @javafx.fxml.FXML
    public void handleAcceptOnAction(ActionEvent actionEvent) {
        String selectedIdStr = selectsBookingComboBox.getValue();

        if (selectedIdStr == null || selectedIdStr.isEmpty()) {
            showMessageLabel.setText("Invalid");
            return;
        }

        int selectedId = Integer.parseInt(selectedIdStr);

        for (Booking b : bookingList) {
            if (b.getBookingId() == selectedId) {
                b.setStatus("Confirmed");

                BinaryUtils.saveList(file, bookingList);
                acceptRejectTableView.getItems().setAll(bookingList);

                showMessageLabel.setText("Booking Accepted!");
                return;
            }
        }

        showMessageLabel.setText("Invalid");
    }
}



