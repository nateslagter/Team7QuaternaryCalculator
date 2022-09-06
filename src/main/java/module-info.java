module com.example.team7quaternarycalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.team7quaternarycalculator to javafx.fxml;
    exports com.example.team7quaternarycalculator;
}