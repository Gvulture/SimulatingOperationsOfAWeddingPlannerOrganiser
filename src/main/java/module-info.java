module com.example.simulatingoperationsofaweddingplannerorganiser {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simulatingoperationsofaweddingplannerorganiser to javafx.fxml;
    exports com.example.simulatingoperationsofaweddingplannerorganiser;
}