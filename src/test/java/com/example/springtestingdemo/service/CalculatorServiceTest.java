package com.example.springtestingdemo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    @DisplayName("Should add two numbers correctly")
    void testAdd() {
        int result = calculatorService.add(5, 3);
        assertEquals(8, result, "Addition result should be 8");
    }

    @Test
    @DisplayName("Should throw exception when dividing by zero")
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class,
                () -> calculatorService.divide(10, 0),
                "Expected divide by zero to throw exception");
    }

    @Test
    @DisplayName("Should divide two numbers correctly")
    void testDivide() {
        int result = calculatorService.divide(10, 2);
        assertEquals(5, result, "Division result should be 5");
    }
}
