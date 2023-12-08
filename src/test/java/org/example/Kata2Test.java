package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Kata2Test {
    @Test
    public void testBasic()
    {
        assertEquals(9, Kata2.squareSum(new int[] {1,2,2}));
        assertEquals(5, Kata2.squareSum(new int[] {1,2}));
        assertEquals(50, Kata2.squareSum(new int[] {5,-3,4}));
        assertEquals(0, Kata2.squareSum(new int[] {}));
    }
}