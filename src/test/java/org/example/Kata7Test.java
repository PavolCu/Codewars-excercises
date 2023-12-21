package org.example;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Kata7Test {
    @Test
    public void testSomething() {
        assertArrayEquals(new long[]{1}, Kata7.powersOfTwo(0));
        assertArrayEquals(new long[]{1,2}, Kata7.powersOfTwo(1));
        assertArrayEquals(new long[]{1,2,4,8,16}, Kata7.powersOfTwo(4));
    }
}

