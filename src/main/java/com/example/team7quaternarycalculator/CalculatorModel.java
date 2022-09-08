package com.example.team7quaternarycalculator;

public class CalculatorModel {
    public String convertBaseTenToFour(String baseTenInt){
        return Integer.toString(Integer.parseInt(baseTenInt, 10), 4);
    }
    public String convertBaseFourToTen(String baseFourInt){
        return Integer.toString(Integer.parseInt(baseFourInt, 4), 10);
    }
}
