package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrassHopper2Test {
    @Test
    public void test1() {
        assertEquals(1,
                GrassHopper2.summation(1));
    }
    @Test
    public void test2() {
        assertEquals(36,
                GrassHopper2.summation(8));
    }
}
