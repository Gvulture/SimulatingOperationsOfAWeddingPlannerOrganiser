package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class venueManagerDashboardController {

    @FXML
    public void initialize() {
    }

    @FXML
    public void handleUpdateBookingStatusOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent, "/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/updateBookingStatus.fxml");
    }

    @FXML
    public void handleViewAllClientsOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent, "/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/viewAllClients.fxml");
    }

    @FXML
    public void handleViewScheduleOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent, "/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/venueSchedule.fxml");
    }

    @FXML
    public void handleUpdateVenueOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent, "/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/updateVenue.fxml");
    }

    @FXML
    public void handleAddNewVenueOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent, "/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/addVenue.fxml");
    }

    @FXML
    public void handlePaymentStatusOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent, "/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/paymentStatus.fxml");
    }

    @FXML
    public void handleAcceptRejectOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent, "/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/acceptRejectBooking.fxml");
    }

    @FXML
    public void handleViewBookingRequestOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent, "/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/viewBookingRequests.fxml");
    }

    @FXML
    public void handleLogOutOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent, "/com/example/simulatingoperationsofaweddingplannerorganiser/Login.fxml");
    }
}