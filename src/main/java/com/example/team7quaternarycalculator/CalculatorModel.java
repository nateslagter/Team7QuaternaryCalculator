package com.example.team7quaternarycalculator;

public class CalculatorModel {
    public String convertBaseTenToFour(String baseTenInt){
        return Integer.toString(Integer.parseInt(baseTenInt, 10), 4);
    }

    public String convertBaseFourToTen(String baseFourInt){
        return Integer.toString(Integer.parseInt(baseFourInt, 4), 10);
    }

    public String add(String inputOne, String inputTwo){
        int operandOne = Integer.parseInt(convertBaseFourToTen(inputOne));
        int operandTwo = Integer.parseInt(convertBaseFourToTen(inputTwo));
        int result = operandOne + operandTwo;
        String resultString = convertBaseTenToFour(Integer.toString(result));
        return resultString;
    }

    public String subtract(String inputOne, String inputTwo){
        int operandOne = Integer.parseInt(convertBaseFourToTen(inputOne));
        int operandTwo = Integer.parseInt(convertBaseFourToTen(inputTwo));
        int result = operandOne - operandTwo;
        String resultString = convertBaseTenToFour(Integer.toString(result));
        return resultString;
    }

    public String multiply(String inputOne, String inputTwo){
        int operandOne = Integer.parseInt(convertBaseFourToTen(inputOne));
        int operandTwo = Integer.parseInt(convertBaseFourToTen(inputTwo));
        int result = operandOne * operandTwo;
        String resultString = convertBaseTenToFour(Integer.toString(result));
        return resultString;
    }

    public String divide(String inputOne, String inputTwo){
        int operandOne = Integer.parseInt(convertBaseFourToTen(inputOne));
        int operandTwo = Integer.parseInt(convertBaseFourToTen(inputTwo));
        int result = operandOne / operandTwo;
        String resultString = convertBaseTenToFour(Integer.toString(result));
        return resultString;
    }

    public String square(String inputOne){
        int operandOne = Integer.parseInt(convertBaseFourToTen(inputOne));
        int result = operandOne * operandOne;
        String resultString = convertBaseTenToFour(Integer.toString(result));
        return resultString;
    }

    public String root(String inputOne){
        int operandOne = Integer.parseInt(convertBaseFourToTen(inputOne));
        double result = Math.sqrt(operandOne);
        String resultString = convertBaseTenToFour(Integer.toString((int)(result)));
        return resultString;
    }
}
