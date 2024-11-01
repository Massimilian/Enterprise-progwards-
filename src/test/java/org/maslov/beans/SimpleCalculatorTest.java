package org.maslov.beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {
    SimpleCalculator sc = new SimpleCalculator();
    @Test
    void sum() {
        Assertions.assertEquals(2, sc.sum(1, 1));
    }

    @Test
    void diff() {
        Assertions.assertEquals(0, sc.diff(1, 1));
    }

    @Test
    void div() {
        Assertions.assertEquals(100, sc.div(100, 1));
    }

    @Test
    void mult() {
        Assertions.assertEquals(25, sc.mult(5, 5));
    }

    @Test
    void getIncorrectValue() {
        int result = sc.sum(Integer.MAX_VALUE, 1);
        Assertions.assertFalse(result > Integer.MAX_VALUE);
    }
}
