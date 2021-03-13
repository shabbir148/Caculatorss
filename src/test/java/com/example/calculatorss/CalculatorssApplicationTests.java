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
        double expected = 10.0;
        double actual = controller.getRoot(100);
        assertEquals(expected, actual);
    }

    @Test
    void squareRootTrueNegative() {
        double expected = 10.0;
        double actual = controller.getRoot(25);
        assertNotEquals(expected, actual);
    }

    @Test
    void factorialTruePositive() {
        double expected = 120;
        double actual = controller.getFact(5);
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
        double expected = 1.6094379124341003;
        double actual = controller.getLn(5);
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
        double expected = 16;
        double actual = controller.getPow(2, 4);
        assertEquals(expected, actual);
    }

    @Test
    void powTrueNegative() {
        double expected = 15;
        double actual = controller.getPow(3, 2);
        assertNotEquals(expected, actual);
    }


}