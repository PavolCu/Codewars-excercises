package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class Solution2Test {
    @Test
    public void testSomething() {
        assertEquals(16, Solution2.areaOrPerimeter(4 , 4));
        assertEquals(32, Solution2.areaOrPerimeter(6 , 10));
    }
}
