package com.example.simulatingoperationsofaweddingplannerorganiser.maisha_2221906;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class ServiceCategoryController {

        @FXML
        private ComboBox<String> serviceTypeComboBox;

        @FXML
        private ComboBox<String> statusComboBox;

        @FXML
        public void initialize() {

            serviceTypeComboBox.getItems().addAll(
                    "Catering",
                    "Decoration",
                    "Photography",
                    "Venue",
                    "Music",
                    "Transportation"
            );

            statusComboBox.getItems().addAll(
                    "Active",
                    "Inactive"
            );
        }
    }

