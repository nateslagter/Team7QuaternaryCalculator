package com.example.team7quaternarycalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalculatorController {

    public CalculatorModel calculatorModel = new CalculatorModel();
    public Label outputBox;
    public boolean operatorPresent = false;
    public boolean solutionPresent = false;
    public String operand1 = "";
    public String operand2 = "";
    public String operator;
    public String solution;
    public String convertedString = "";
    public String output = "";
    public boolean converted = false;

    protected void updateOutputBox() {
        if (converted) {
            output = convertedString;
            outputBox.setText(output);
        } else if (!operatorPresent && !solutionPresent) {
            output = operand1;
            outputBox.setText(output);
        } else if (solutionPresent) {
            output = solution;
            outputBox.setText(output);
        } else {
            output = operand2;
            outputBox.setText(output);
        }
    }

    @FXML
    protected void clearBoard() {
        operand1 = "";
        operand2 = "";
        operator = "";
        output = "";
        operatorPresent = false;
        solutionPresent = false;
        converted = false;
        updateOutputBox();
    }

    protected void handleNumberButton(String number){
        converted = false;
        if (solutionPresent) {
            clearBoard();
        }
        if (!operatorPresent) {
            operand1 += number;
        } else {
            operand2 += number;
        }
        updateOutputBox();
    }

    protected void handleOperation(String targetOperator){
        converted = false;
        output = "";
        if (operand1.equals("") || solutionPresent) {
            return;
        }
        operator = targetOperator;
        operatorPresent = true;
        updateOutputBox();
    }

    protected void handleSingleOperation(String operation){
        converted = false;
        if (solutionPresent || operatorPresent) {
            return;
        }
        if(operation.equals("root")){
            solution = calculatorModel.root(operand1);
        } else if(operation.equals("square")){
            solution = calculatorModel.square(operand1);
        }
        solutionPresent = true;
        updateOutputBox();
    }

    @FXML
    protected void solve() {
        converted = false;
        if (operand1.equals("") || operand2.equals("") || !operatorPresent) {
            return;
        }
        switch (operator) {
            case "+" -> {
                solution = calculatorModel.add(operand1, operand2);
                solutionPresent = true;
                updateOutputBox();
            }
            case "-" -> {
                solution = calculatorModel.subtract(operand1, operand2);
                solutionPresent = true;
                updateOutputBox();
            }
            case "*" -> {
                solution = calculatorModel.multiply(operand1, operand2);
                solutionPresent = true;
                updateOutputBox();
            }
            case "/" -> {
                solution = calculatorModel.divide(operand1, operand2);
                solutionPresent = true;
                updateOutputBox();
            }
        }
    }

    @FXML
    protected void convert() {
        if (converted || output.equals("")) {
            converted = false;
            convertedString = "";
        } else {
            if (!operand2.equals("") && !solutionPresent){
                convertedString = calculatorModel.convertBaseFourToTen(operand2);
                converted = true;
            }
            else if (!operand1.equals("") && !solutionPresent) {
                convertedString = calculatorModel.convertBaseFourToTen(operand1);
                converted = true;
            } else {
                convertedString = calculatorModel.convertBaseFourToTen(solution);
                converted = true;
            }
        }
        updateOutputBox();
    }

    @FXML
    protected void handleZeroButton() {
        handleNumberButton("0");
    }

    @FXML
    protected void handleOneButton() {
        handleNumberButton("1");
    }

    @FXML
    protected void handleTwoButton() {
        handleNumberButton("2");
    }

    @FXML
    protected void handleThreeButton() {
        handleNumberButton("3");
    }

    @FXML
    protected void setOperatorPlus() {
        handleOperation("+");
    }

    @FXML
    protected void setOperatorMinus() {
        handleOperation("-");
    }

    @FXML
    protected void setOperatorTimes() {
        handleOperation("*");
    }

    @FXML
    protected void setOperatorDivide() {
        handleOperation("/");
    }

    @FXML
    protected void square() {
        handleSingleOperation("square");
    }

    @FXML
    protected void root() {
        handleSingleOperation("root");
    }
}