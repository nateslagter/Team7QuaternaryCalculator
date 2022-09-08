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
        return convertBaseTenToFour(Integer.toString(result));
    }

    public String subtract(String inputOne, String inputTwo){
        int operandOne = Integer.parseInt(convertBaseFourToTen(inputOne));
        int operandTwo = Integer.parseInt(convertBaseFourToTen(inputTwo));
        int result = operandOne - operandTwo;
        return convertBaseTenToFour(Integer.toString(result));
    }

    public String multiply(String inputOne, String inputTwo){
        int operandOne = Integer.parseInt(convertBaseFourToTen(inputOne));
        int operandTwo = Integer.parseInt(convertBaseFourToTen(inputTwo));
        int result = operandOne * operandTwo;
        return convertBaseTenToFour(Integer.toString(result));
    }

    public String divide(String inputOne, String inputTwo){
        int operandOne = Integer.parseInt(convertBaseFourToTen(inputOne));
        int operandTwo = Integer.parseInt(convertBaseFourToTen(inputTwo));
        int result = operandOne / operandTwo;
        return convertBaseTenToFour(Integer.toString(result));
    }

    public String square(String inputOne){
        int operandOne = Integer.parseInt(convertBaseFourToTen(inputOne));
        int result = operandOne * operandOne;
        return convertBaseTenToFour(Integer.toString(result));
    }

    public String root(String inputOne){
        int operandOne = Integer.parseInt(convertBaseFourToTen(inputOne));
        double result = Math.sqrt(operandOne);
        return convertBaseTenToFour(Integer.toString((int)(result)));
    }
}
