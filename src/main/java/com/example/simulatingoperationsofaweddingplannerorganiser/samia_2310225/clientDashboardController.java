package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import com.example.simulatingoperationsofaweddingplannerorganiser.common.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public class clientDashboardController {
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleUpdateWeddingDetailsOnAction(ActionEvent actionEvent)  throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("updateWeddingDetails.fxml"));
        Scene scene = new Scene(loader.load());
        SceneSwitch.setScene(actionEvent, scene);
    }

    @javafx.fxml.FXML
    public void handleWeddingBudgetOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("weddingBudget.fxml"));
        Scene scene = new Scene(loader.load());
        SceneSwitch.setScene(actionEvent, scene);
    }

    @javafx.fxml.FXML
    public void handleWeddingCheckListOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("weddingChecklist.fxml"));
        Scene scene = new Scene(loader.load());
        SceneSwitch.setScene(actionEvent, scene);
    }

    @javafx.fxml.FXML
    public void handleBookVenueOnAction(ActionEvent actionEvent) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("bookVenue.fxml"));
        Scene scene = new Scene(loader.load());
        SceneSwitch.setScene(actionEvent, scene);
    }

    @javafx.fxml.FXML
    public void handleSendInvitationOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sendInvitation.fxml"));
        Scene scene = new Scene(loader.load());
        SceneSwitch.setScene(actionEvent, scene);
    }

    @javafx.fxml.FXML
    public void handleMyBookingsOnAction(ActionEvent actionEvent) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("myBookings.fxml"));
        Scene scene = new Scene(loader.load());
        SceneSwitch.setScene(actionEvent, scene);
    }

    @javafx.fxml.FXML
    public void handleBookedVendorsOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("bookedVendors.fxml"));
        Scene scene = new Scene(loader.load());
        SceneSwitch.setScene(actionEvent, scene);

    }

    @javafx.fxml.FXML
    public void handleViewVenuesOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("viewVenues.fxml"));
        Scene scene = new Scene(loader.load());
        SceneSwitch.setScene(actionEvent, scene);
    }


    @javafx.fxml.FXML
    public void handleLogOutOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(loader.load());
        SceneSwitch.setScene(actionEvent, scene);

    }
}
