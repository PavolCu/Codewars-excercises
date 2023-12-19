package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata6Test {
    private static final double DELTA = 1e-15;

    @Test
    public void testSomething() {
        assertEquals(1, Kata6.find_average(new int[]{1,1,1}), DELTA);
        assertEquals(2, Kata6.find_average(new int[]{1, 2, 3}), DELTA);
    }
}