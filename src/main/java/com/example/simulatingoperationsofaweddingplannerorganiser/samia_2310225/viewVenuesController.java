package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.common.BinaryUtils;
import com.example.simulatingoperationsofaweddingplannerorganiser.common.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;

public class viewVenuesController {

    private final String file = "venues.bin";

    @javafx.fxml.FXML
    private TableColumn<Venue, String> statusTableColumn;
    @javafx.fxml.FXML
    private TextField capacityTextField;
    @javafx.fxml.FXML
    private TableView<Venue> viewVenuesTableView;
    @javafx.fxml.FXML
    private TableColumn<Venue, Double> pricePerDayTableColumn;
    @javafx.fxml.FXML
    private TextField minPriceTextField;
    @javafx.fxml.FXML
    private TableColumn<Venue, String> venueNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Venue, String> locationTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Venue, Integer> capacityTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> locationComboBox;
    @javafx.fxml.FXML
    private TextField maxPriceTextField;

    private ArrayList<Venue> venueList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        locationComboBox.getItems().addAll("All", "Dhaka", "Chittagong", "Sylhet");
        locationComboBox.setValue("All");

        venueNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("venueName"));
        locationTableColumn.setCellValueFactory(new PropertyValueFactory<>("location"));
        capacityTableColumn.setCellValueFactory(new PropertyValueFactory<>("capacity"));
        pricePerDayTableColumn.setCellValueFactory(new PropertyValueFactory<>("pricePerDay"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));


        venueList = BinaryUtils.readObjects(file);


        if (venueList.isEmpty()) {
            venueList.add(new Venue(101, 500, "Grand Palace", "Dhaka", "Available", 50000.0));
            venueList.add(new Venue(102, 300, "Royal Hall", "Dhaka", "Available", 35000.0));
            venueList.add(new Venue(103, 800, "Ocean Breeze", "Chittagong", "Booked", 75000.0));
            venueList.add(new Venue(104, 400, "Green Garden", "Sylhet", "Available", 40000.0));
            venueList.add(new Venue(105, 1000, "City Convention", "Dhaka", "Available", 120000.0));

            BinaryUtils.saveList(file, venueList);
        }


        viewVenuesTableView.getItems().setAll(venueList);
    }

    @javafx.fxml.FXML
    public void handleSearchVenueOnAction(ActionEvent actionEvent) {
        String selectedLocation = locationComboBox.getValue();
        String capacity = capacityTextField.getText().trim();
        String minPrice = minPriceTextField.getText().trim();
        String maxPrice = maxPriceTextField.getText().trim();


        venueList = BinaryUtils.readObjects(file);
        ArrayList<Venue> resultList = new ArrayList<>();

        for (Venue venue : venueList) {
            if (selectedLocation != null && !selectedLocation.equals("All")) {
                if (!venue.getLocation().equals(selectedLocation)) {
                    continue;
                }
            }
            if (!capacity.isEmpty()) {
                try {
                    if (venue.getCapacity() < Integer.parseInt(capacity)) {
                        continue;
                    }
                } catch (Exception e) {}
            }

            if (!minPrice.isEmpty()) {
                try {
                    if (venue.getPricePerDay() < Double.parseDouble(minPrice)) {
                        continue;
                    }
                } catch (Exception e) {}
            }
            if (!maxPrice.isEmpty()) {
                try {
                    if (venue.getPricePerDay() > Double.parseDouble(maxPrice)) {
                        continue;
                    }
                } catch (Exception e) {}
            }
            resultList.add(venue);
        }

        viewVenuesTableView.getItems().setAll(resultList);

        if (resultList.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("No Results");
            alert.setHeaderText(null);
            alert.setContentText("No venues found matching your criteria!");
            alert.showAndWait();
        }
    }


        @javafx.fxml.FXML
        public void handleBackToDashboardOnAction (ActionEvent actionEvent){
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/clientDashboard.fxml"));
                Scene scene = new Scene(loader.load());
                SceneSwitch.setScene(actionEvent, scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }