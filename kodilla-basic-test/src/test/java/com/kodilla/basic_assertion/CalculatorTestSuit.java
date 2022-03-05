package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTestSuit {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        Assertions.assertEquals(13, sumResult);
    }
    @Test
    public void testSubstract() {
        Calculator calculator2 = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator2.subtract(a, b);
        Assertions.assertEquals(-3, subtractResult);
    }
    @Test
    public void testSquaredNegative () {
        Calculator calculator3 = new Calculator();
        int a = -5;
        int squaredResult = (int) calculator3.squared(a);
        Assertions.assertEquals(25, squaredResult);
        Assertions.assertEquals(0,0,0.01);
    }
    @Test
    public void testSquaredZero() {
        Calculator calculator4 = new Calculator();
        int a = 0;
        int squaredResult = (int) calculator4.squared(a);
        Assertions.assertEquals(0, squaredResult);
        Assertions.assertEquals(0,0,0.01);
    }
    @Test
    public void testSquaredPositive() {
        Calculator calculator5 = new Calculator ();
        int a = 5;
        int squaredResultPositive = (int) calculator5.squared(a);
        Assertions.assertEquals (25, squaredResultPositive);
        Assertions.assertEquals(0,0,0.01);
    }
}
