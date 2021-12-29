package com.kodilla.basic_assertion;

import com.kodilla.basic_assertion.Calculator;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(18, sumResult);
    }

    @Test
    public void testSubtractDouble() {
        Calculator calculator = new Calculator();
        assertEquals(3.2, calculator.subtractNumber(12.2,9.0), 0.01);
        assertEquals(-16.0, calculator.subtractNumber(-7.0,9.0), 0.01);
        assertEquals(0.0, calculator.subtractNumber(12.23,12.23), 0.01);
        assertEquals(24.1, calculator.subtractNumber(12.05,-12.05), 0.01);
        assertEquals(-1.29, calculator.subtractNumber(-3.5,-2.2), 0.05);
    }

    @Test
    public void testSquareDouble(){
        Calculator calculator = new Calculator();
        assertEquals(9.0,calculator.squareNumber(3.0));
        assertEquals(0.0,calculator.squareNumber(0.0));
        assertEquals(1.0,calculator.squareNumber(1.0));
        assertEquals(49.0,calculator.squareNumber(-7.0));
        assertEquals(50.41,calculator.squareNumber(-7.1),0.01);
        assertEquals(1031.77148944,calculator.squareNumber(32.1212),0.00000001);
    }
}
