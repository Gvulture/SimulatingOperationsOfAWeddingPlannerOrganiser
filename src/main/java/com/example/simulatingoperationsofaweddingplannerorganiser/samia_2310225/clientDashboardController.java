package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class clientDashboardController {

    @FXML
    public void initialize() {
    }

    @FXML
    public void handleUpdateWeddingDetailsOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent, "/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/updateWeddingDetails.fxml");
    }

    @FXML
    public void handleWeddingBudgetOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent, "/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/weddingBudget.fxml");
    }

    @FXML
    public void handleWeddingCheckListOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent, "/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/weddingChecklist.fxml");
    }

    @FXML
    public void handleBookVenueOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent, "/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/bookVenue.fxml");
    }

    @FXML
    public void handleSendInvitationOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent, "/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/sendInvitation.fxml");
    }

    @FXML
    public void handleMyBookingsOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent, "/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/myBookings.fxml");
    }

    @FXML
    public void handleBookedVendorsOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent, "/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/bookedVendors.fxml");
    }

    @FXML
    public void handleViewVenuesOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent, "/com/example/simulatingoperationsofaweddingplannerorganiser/samia_2310225/viewVenues.fxml");
    }

    @FXML
    public void handleLogOutOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchTo(actionEvent, "/com/example/simulatingoperationsofaweddingplannerorganiser/Login.fxml");
    }
}
