package com.kovanlabs.intern.week.task.day19Junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivisionMethodTest {

    private final DivisionMethod calculator = new DivisionMethod();

    // ✅ Test normal case
    @Test
    void normalDivisionShouldWork() {
        int result = calculator.divide(20, 4);

        assertEquals(5, result,
                "20 divided by 4 should be 5");
    }

    // ✅ Test negative numbers
    @Test
    void divisionWithNegativeNumbers() {
        int result = calculator.divide(-10, 2);

        assertEquals(-5, result,
                "Negative division should work correctly");
    }

    // ✅ Edge case: divide by zero
    @Test
    void divideByZeroShouldThrowException() {

        ArithmeticException exception =
                assertThrows(ArithmeticException.class, () -> {
                    calculator.divide(10, 0);
                });

        assertEquals("/ by zero", exception.getMessage(),
                "Exception message should be '/ by zero'");
    }
}