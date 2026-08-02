package com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.time.LocalDate;

public class weddingChecklistController
{
    @javafx.fxml.FXML
    private TableColumn<WeddingCheckList,String> statusTableColumn;
    @javafx.fxml.FXML
    private Label showMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<WeddingCheckList, LocalDate> deadlineTableColumn;
    @javafx.fxml.FXML
    private TableColumn<WeddingCheckList,String> taskNameTableColumn;
    @javafx.fxml.FXML
    private TableView<WeddingCheckList> weddingChecklistTableView;
    @javafx.fxml.FXML
    private ComboBox<String> selectTaskComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleMarkAsDoneOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleBackToDashboard(ActionEvent actionEvent) {
    }
}