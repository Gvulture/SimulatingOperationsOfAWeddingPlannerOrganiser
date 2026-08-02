package com.example.simulatingoperationsofaweddingplannerorganiser.common;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneSwitch {
        public static void setScene(ActionEvent actionEvent, Scene scene) {
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
    }

