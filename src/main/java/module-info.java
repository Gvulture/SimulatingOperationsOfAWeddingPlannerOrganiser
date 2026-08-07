module com.example.simulatingoperationsofaweddingplannerorganiser {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;



    opens com.example.simulatingoperationsofaweddingplannerorganiser to javafx.fxml;
    exports com.example.simulatingoperationsofaweddingplannerorganiser;

    opens com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588 to javafx.fxml;
    exports com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;
    opens com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225 to javafx.fxml;
    exports com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;
    opens com.example.simulatingoperationsofaweddingplannerorganiser.Jhalok_2411777 to javafx.fxml;
    exports com.example.simulatingoperationsofaweddingplannerorganiser.Jhalok_2411777;
    opens com.example.simulatingoperationsofaweddingplannerorganiser.maisha_2221906 to javafx.fxml;
    exports com.example.simulatingoperationsofaweddingplannerorganiser.maisha_2221906;
}