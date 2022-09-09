package com.example.team7quaternarycalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalculatorController {

    //work on resetting the questions when the solution is showing, right now if you
    //type it just adds to operand 2, it should clear the operator and set operandPresent
    //and solutionPresent to false

    public CalculatorModel calculatorModel = new CalculatorModel();
    public Label outputBox;
    public boolean operatorPresent = false;
    public boolean solutionPresent = false;
    public String operand1 = "";
    public String operand2 = "";
    public String operator;
    public String solution;
    public String convertedString = "";

    public boolean converted = false;

    protected void printDiog() {
        System.out.println("Operand 1: " + operand1);
        System.out.println("Operand 2: " + operand2);
        System.out.println("Operator: " + operator);
        System.out.println("Solution: " + solution);
        System.out.println("SolutionPresent: " + solutionPresent);
        System.out.println("Converted: " + converted);
    }

    protected void updateOutputBox() {
        if (converted) {
            outputBox.setText(convertedString);
        } else if (!operatorPresent && !solutionPresent) {
            outputBox.setText(operand1);
        } else if (solutionPresent) {
            outputBox.setText(solution);
        } else {
            outputBox.setText(operand2);
        }
    }

    @FXML
    protected void clearBoard() {
        operand1 = "";
        operand2 = "";
        operator = "";
        operatorPresent = false;
        solutionPresent = false;
        updateOutputBox();
        printDiog();
    }

    @FXML
    protected void handleZeroButton() {
        converted = false;
        if (solutionPresent) {
            clearBoard();
        }
        if (!operatorPresent) {
            operand1 += "0";
        } else {
            operand2 += "0";
        }
        updateOutputBox();
        printDiog();
    }

    @FXML
    protected void handleOneButton() {
        converted = false;
        if (solutionPresent) {
            clearBoard();
        }
        if (!operatorPresent) {
            operand1 += "1";
        } else {
            operand2 += "1";
        }
        updateOutputBox();
        printDiog();
    }

    @FXML
    protected void handleTwoButton() {
        converted = false;
        if (solutionPresent) {
            clearBoard();
        }
        if (!operatorPresent) {
            operand1 += "2";
        } else {
            operand2 += "2";
        }
        updateOutputBox();
        printDiog();
    }

    @FXML
    protected void handleThreeButton() {
        converted = false;
        if (solutionPresent) {
            clearBoard();
        }
        if (!operatorPresent) {
            operand1 += "3";
        } else {
            operand2 += "3";
        }
        updateOutputBox();
        printDiog();
    }

    @FXML
    protected void setOperatorPlus() {
        converted = false;
        if (operand1.equals("") || solutionPresent) {
            return;
        }
        operator = "+";
        operatorPresent = true;
        updateOutputBox();
        printDiog();
    }

    @FXML
    protected void setOperatorMinus() {
        converted = false;
        if (operand1.equals("") || solutionPresent) {
            return;
        }
        operator = "-";
        operatorPresent = true;
        updateOutputBox();
        printDiog();
    }

    @FXML
    protected void setOperatorTimes() {
        converted = false;
        if (operand1.equals("") || solutionPresent) {
            return;
        }
        operator = "*";
        operatorPresent = true;
        updateOutputBox();
        printDiog();
    }

    @FXML
    protected void setOperatorDivide() {
        converted = false;
        if (operand1.equals("") || solutionPresent) {
            return;
        }
        operator = "/";
        operatorPresent = true;
        updateOutputBox();
        printDiog();
    }

    @FXML
    protected void square() {
        converted = false;
        if (solutionPresent || operatorPresent) {
            return;
        }
        solution = calculatorModel.square(operand1);
        solutionPresent = true;
        updateOutputBox();
    }

    @FXML
    protected void root() {
        converted = false;
        if (solutionPresent || operatorPresent) {
            return;
        }
        solution = calculatorModel.root(operand1);
        solutionPresent = true;
        updateOutputBox();
        printDiog();
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
        printDiog();
    }

    @FXML
    protected void convert() {
        if (converted) {
            converted = false;
            convertedString = "";
        } else {
            if (!operand1.equals("") && !solutionPresent) {
                convertedString = calculatorModel.convertBaseFourToTen(operand1);
                converted = true;
            } else if (!solutionPresent) {
                convertedString = calculatorModel.convertBaseFourToTen(operand2);
                converted = true;
            } else {
                convertedString = calculatorModel.convertBaseFourToTen(solution);
                converted = true;
            }
        }
        updateOutputBox();
    }
}