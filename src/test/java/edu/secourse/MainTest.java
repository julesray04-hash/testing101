package edu.secourse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void testAddition() {

        // checks if 2 + 3 equals 5
        int result = 2 + 3;

        assertEquals(5, result);
    }

    @Test
    void testSubtraction() {

        // checks if 5 - 3 equals 2
        int result = 5 - 3;

        assertEquals(2, result);
    }

}