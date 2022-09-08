package com.example.team7quaternarycalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    public Label outputBox;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}