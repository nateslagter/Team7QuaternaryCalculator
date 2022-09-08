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

    @Test
    public void TestAddition()
    {
        String result = calculatorModel.add("2203","3302");

        Assertions.assertEquals("12111",result);
    }

    @Test
    public void TestSubtraction()
    {
        String result = calculatorModel.subtract("3201010","3001");

        Assertions.assertEquals("3132003",result);
    }

    @Test
    public void TestDivision()
    {
        String result = calculatorModel.divide("1210","121");

        Assertions.assertEquals("10",result);
    }

    @Test
    public void TestMultiplication()
    {
        String result = calculatorModel.multiply("10","121");

        Assertions.assertEquals("1210",result);
    }

    @Test
    public void TestSquare()
    {
        String result = calculatorModel.square("222");

        Assertions.assertEquals("123210", result);
    }

    @Test
    public void TestSquareRoot()
    {
        String result = calculatorModel.root("1321");

        Assertions.assertEquals("23", result);
    }
}