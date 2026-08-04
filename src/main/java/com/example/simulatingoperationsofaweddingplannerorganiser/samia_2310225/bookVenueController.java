package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.common.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class bookVenueController
{
    @javafx.fxml.FXML
    private Label showMessageLabel;
    @javafx.fxml.FXML
    private DatePicker weddingDateDatePicker;
    @javafx.fxml.FXML
    private TableColumn<Venue,String> loactionTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Venue,Double> pricePerDayTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> selectWeddingVenueComboBox;
    @javafx.fxml.FXML
    private TableView<Venue> bookVenueTableView;
    @javafx.fxml.FXML
    private TableColumn<Venue, String> venueNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Venue,Integer> capacityTableColumn;
    @javafx.fxml.FXML
    private TextField numOfGuestsTextField;

    @javafx.fxml.FXML
    public void initialize() {
        selectWeddingVenueComboBox.getItems().addAll("Grand Palace Hall", "Rose Garden", "Sunset Banquet", "Royal Convention Center");

        venueNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("venueName"));
        loactionTableColumn.setCellValueFactory(new PropertyValueFactory<>("location"));
        pricePerDayTableColumn.setCellValueFactory(new PropertyValueFactory<>("pricePerDay"));
        capacityTableColumn.setCellValueFactory(new PropertyValueFactory<>("capacity"));
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
    }


