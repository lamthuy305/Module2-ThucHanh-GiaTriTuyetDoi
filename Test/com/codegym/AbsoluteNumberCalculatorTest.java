package com.codegym;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbsoluteNumberCalculatorTest {
    @Test
    @DisplayName("test input 0")
    public void testWithInput0(){
        int inputNumber = 0;
        int expected = 0;
        int actual = AbsoluteNumberCalculator.findAbsolute(inputNumber);
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("test input 1")
    public void testWithInput1(){
        int inputNumber = 1;
        int expected = 1;
        int actual = AbsoluteNumberCalculator.findAbsolute(inputNumber);
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("test input -1")
    public void testWithInputNegative1(){
        int inputNumber = -1;
        int expected = 1;
        int actual = AbsoluteNumberCalculator.findAbsolute(inputNumber);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("test input -100")
    public void testWithInputNegativeOneHundred(){
        int inputNumber = -100;
        int expected = 100;
        int actual = AbsoluteNumberCalculator.findAbsolute(inputNumber);
        assertEquals(expected, actual);
    }
}
