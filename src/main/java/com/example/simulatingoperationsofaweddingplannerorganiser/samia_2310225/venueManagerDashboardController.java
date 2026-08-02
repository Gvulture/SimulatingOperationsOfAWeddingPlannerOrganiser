package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.common.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public class venueManagerDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleUpdateBookingStatusOnAction(ActionEvent actionEvent) throws IOException  {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("updateBookingStatus.fxml"));
            Scene scene = new Scene(loader.load());
            SceneSwitch.setScene(actionEvent, scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void handleViewAllClientsOnAction(ActionEvent actionEvent) throws IOException  {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("viewAllClients.fxml"));
            Scene scene = new Scene(loader.load());
            SceneSwitch.setScene(actionEvent, scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void handleViewScheduleOnAction(ActionEvent actionEvent)  throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("venueSchedule.fxml"));
            Scene scene = new Scene(loader.load());
            SceneSwitch.setScene(actionEvent, scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void handleUpdateVenueOnAction(ActionEvent actionEvent) throws IOException  {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("updateVenue.fxml"));
            Scene scene = new Scene(loader.load());
            SceneSwitch.setScene(actionEvent, scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void handleAddNewVenueOnAction(ActionEvent actionEvent)  throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("addVenue.fxml"));
            Scene scene = new Scene(loader.load());
            SceneSwitch.setScene(actionEvent, scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void handlePaymentStatusOnAction(ActionEvent actionEvent)  throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("paymentStatus.fxml"));
            Scene scene = new Scene(loader.load());
            SceneSwitch.setScene(actionEvent, scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void handleAcceptRejectOnAction(ActionEvent actionEvent) throws IOException  {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("acceptRejectBooking.fxml"));
            Scene scene = new Scene(loader.load());
            SceneSwitch.setScene(actionEvent, scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void handleLogOutOnAction(ActionEvent actionEvent)  throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
            Scene scene = new Scene(loader.load());
            SceneSwitch.setScene(actionEvent, scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void handleViewBookingRequestOnAction(ActionEvent actionEvent) throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("viewBookingRequests.fxml"));
            Scene scene = new Scene(loader.load());
            SceneSwitch.setScene(actionEvent, scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}