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

public class bookedVendorsController
{
    @javafx.fxml.FXML
    private TableColumn<Venue,Integer> vendorIdTableColumn;
    @javafx.fxml.FXML
    private Label showMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<Venue, Double> priceTableColumn;
    @javafx.fxml.FXML
    private TableView<Venue> bookedVendorsTableView;
    @javafx.fxml.FXML
    private TableColumn<Venue, String> vendorNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Venue, String> serviceTypeTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> selectVendorsComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        selectVendorsComboBox.getItems().addAll("VND-201","VND-202","VND-203","VND-204");

        vendorIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("vendorId"));
        vendorNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("vendorName"));
        serviceTypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("serviceType"));
        priceTableColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        
    }

    @javafx.fxml.FXML
    public void handleBackToDashboardOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/clientDashboard.fxml"));
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