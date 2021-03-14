package com.example.calculatorss;

import com.example.calculatorss.controller.ComputerController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class CalculatorssApplicationTests {


    ComputerController controller = new ComputerController();

    @Test
    void squareRootTruePositive() {
        double expected = 100.0;
        double actual = controller.getRoot(10000);
        assertEquals(expected, actual);
    }

    @Test
    void squareRootTrueNegative() {
        double expected = 9.0;
        double actual = controller.getRoot(16);
        assertNotEquals(expected, actual);
    }

    @Test
    void factorialTruePositive() {
        double expected = 720;
        double actual = controller.getFact(6);
        assertEquals(expected, actual);
    }

    @Test
    void factorialTrueNegative() {
        double expected = 10;
        double actual = controller.getFact(3);
        assertNotEquals(expected, actual);
    }

    @Test
    void logTruePositive() {
        double expected = 1.7917594692;
        double actual = controller.getLn(6);
        assertEquals(expected, actual);
    }

    @Test
    void logTrueNegative() {
        double expected = 10.0;
        double actual = controller.getLn(4);
        assertNotEquals(expected, actual);
    }

    @Test
    void powTruePositive() {
        double expected = 32;
        double actual = controller.getPow(2, 5);
        assertEquals(expected, actual);
    }

    @Test
    void powTrueNegative() {
        double expected = 18;
        double actual = controller.getPow(3, 3);
        assertNotEquals(expected, actual);
    }


}