package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeNegativeTest {
    @Test
    public void test1() {
        assertEquals(-42, Kata9.makeNegative(42));
    }
}
