package org.maslov.beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class AdvancedCalculatorTest {

    AdvancedCalculator ac = new AdvancedCalculator();
    @Test
    void sum() {
        Assertions.assertEquals(2, ac.sum(1, 1));
    }

    @Test
    void diff() {
        Assertions.assertEquals(0, ac.diff(1, 1));
    }

    @Test
    void div() {
        Assertions.assertEquals(100, ac.div(100, 1));
    }

    @Test
    void mult() {
        Assertions.assertEquals(25, ac.mult(5, 5));
    }

    @Test
    void getException() {
        Exception exception = Assertions.assertThrows(RuntimeException.class, () -> {
            int result = ac.sum(Integer.MAX_VALUE, 1);
        });
        String expected = "Overflow";
        String actual = exception.getMessage();
        Assertions.assertTrue(actual.contains(expected));
    }
}