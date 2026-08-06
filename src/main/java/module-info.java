module com.example.simulatingoperationsofaweddingplannerorganiser {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires com.example.simulatingoperationsofaweddingplannerorganiser;


    opens com.example.simulatingoperationsofaweddingplannerorganiser to javafx.fxml;
    exports com.example.simulatingoperationsofaweddingplannerorganiser;

    opens com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588 to javafx.fxml;
    exports com.example.simulatingoperationsofaweddingplannerorganiser.rejwan_2030588;
    opens com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225 to javafx.fxml;
    exports com.example.simulatingoperationsofaweddingplannerorganiser.samia_2310225;
    opens com.example.simulatingoperationsofaweddingplannerorganiser.Jhalok_2411777 to javafx.fxml;
    exports com.example.simulatingoperationsofaweddingplannerorganiser.Jhalok_2411777;
    exports com.example.simulatingoperationsofaweddingplannerorganiser.Jhalok_2411777.NonUser;
    opens com.example.simulatingoperationsofaweddingplannerorganiser.Jhalok_2411777.NonUser to javafx.fxml;
    exports com.example.simulatingoperationsofaweddingplannerorganiser.Jhalok_2411777.User;
    opens com.example.simulatingoperationsofaweddingplannerorganiser.Jhalok_2411777.User to javafx.fxml;
}