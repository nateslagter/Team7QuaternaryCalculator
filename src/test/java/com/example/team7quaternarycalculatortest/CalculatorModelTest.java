package com.example.team7quaternarycalculatortest;

import com.example.team7quaternarycalculator.CalculatorModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorModelTest {

    CalculatorModel calculatorModel = new CalculatorModel();

    @Test
    public void TestBase4ToBase10()
    {
        String convertedNum = calculatorModel.convertBaseTenToFour("10");

        Assertions.assertEquals("22", convertedNum);
    }

    @Test
    public void TestBase10ToBase4()
    {
        String convertedNum = calculatorModel.convertBaseFourToTen("321032");

        Assertions.assertEquals("3662",convertedNum);
    }
}
