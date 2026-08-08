package com.example.simulatingoperationsofaweddingplannerorganiser.maisha_2221906;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class MyProfileController {
    @FXML
    private ComboBox<String> roleComboBox;

    @FXML
    public void initialize() {

        roleComboBox.getItems().addAll(
                "Accountant",
                "Administrator"
        );

    }
}
