package edu.secourse;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void testAddition() {

        // checks if 2 + 3 equals 5
        double result = Calculator.add(2, 3);

        assertEquals(5, result);
    }
    @Test
    void testMultiplication() {

        // checks if 3 times 4 equals 12
        double result = Calculator.multiply(3, 4);

        assertEquals(12, result);
    }
}
