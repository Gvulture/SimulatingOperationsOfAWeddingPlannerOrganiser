package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.common.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class bookedVendorsController {

    @FXML private TableView<Vendor> bookedVendorsTableView;
    @FXML private TableColumn<Vendor, Integer> vendorIdTableColumn;
    @FXML private TableColumn<Vendor, String> vendorNameTableColumn;
    @FXML private TableColumn<Vendor, String> serviceTypeTableColumn;
    @FXML private TableColumn<Vendor, Double> priceTableColumn;

    @FXML private ComboBox<String> selectVendorsComboBox;
    @FXML private Label showMessageLabel;

    private ArrayList<Vendor> vendorList = new ArrayList<>();

    @FXML
    public void initialize() {
        try {
            vendorIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("vendorId"));
            vendorNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("vendorName"));
            serviceTypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("serviceType"));
            priceTableColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

            vendorList.clear();
            vendorList.add(new Vendor(201, "Dream Photography", "Photography", 45000.0));
            vendorList.add(new Vendor(202, "Royal Catering", "Catering", 120000.0));
            vendorList.add(new Vendor(203, "Grand Venue Hall", "Venue", 250000.0));

            selectVendorsComboBox.getItems().clear();
            for (Vendor v : vendorList) {
                selectVendorsComboBox.getItems().add("VND-" + v.getVendorId());
            }

            bookedVendorsTableView.getItems().setAll(vendorList);
            showMessageLabel.setText("");
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Error loading vendor data!");
            alert.showAndWait();
        }
    }

    @FXML
    public void handleBackToDashboardOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/clientDashboard.fxml"));
            Scene scene = new Scene(loader.load());
            SceneSwitch.setScene(actionEvent, scene);
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Could not load dashboard!");
            alert.showAndWait();
        }
    }

    @FXML
    public void handleViewDetailsOnAction(ActionEvent actionEvent) {
        try {
            if (vendorList.isEmpty()) {
                showMessageLabel.setText("No vendors booked yet!");

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("No vendors booked yet!");
                alert.showAndWait();
                return;
            }

            String selectedVendorId = selectVendorsComboBox.getValue();

            if (selectedVendorId == null) {
                showMessageLabel.setText("Please select a vendor first!");

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("Please select a vendor first!");
                alert.showAndWait();
                return;
            }

            for (Vendor v : vendorList) {
                String currentId = "VND-" + v.getVendorId();

                if (currentId.equals(selectedVendorId)) {
                    String details = "ID: " + v.getVendorId() +
                            " Name: " + v.getVendorName() +
                            " Type: " + v.getServiceType() +
                            " Price: " + v.getPrice();

                    showMessageLabel.setText(details);

                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setContentText(details);
                    alert.showAndWait();
                    return;
                }
            }
        } catch (Exception e) {
            showMessageLabel.setText("No vendors booked yet!");

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("No vendors booked yet!");
            alert.showAndWait();
        }
    }
}