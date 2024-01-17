package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class Solution6Test {
    @Test
    public void validPins() {
        assertEquals(true, Solution6.validatePin("1234"));
        assertEquals(true, Solution6.validatePin("0000"));
        assertEquals(true, Solution6.validatePin("1111"));
        assertEquals(true, Solution6.validatePin("123456"));
        assertEquals(true, Solution6.validatePin("098765"));
        assertEquals(true, Solution6.validatePin("000000"));
        assertEquals(true, Solution6.validatePin("090909"));
    }

    @Test
    public void nonDigitCharacters() {
        assertEquals(false, Solution6.validatePin("a234"));
        assertEquals(false, Solution6.validatePin(".234"));
    }

    @Test
    public void invalidLengths() {
        assertEquals(false, Solution6.validatePin("1"));
        assertEquals(false, Solution6.validatePin("12"));
        assertEquals(false, Solution6.validatePin("123"));
        assertEquals(false, Solution6.validatePin("12345"));
        assertEquals(false, Solution6.validatePin("1234567"));
        assertEquals(false, Solution6.validatePin("-1234"));
        assertEquals(false, Solution6.validatePin("1.234"));
        assertEquals(false, Solution6.validatePin("00000000"));
    }
}
