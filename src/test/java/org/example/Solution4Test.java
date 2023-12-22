package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution4Test {
    @Test
    public void testSimpleString1() {
        assertEquals("Hello World", Solution4.removeExclamationMarks("Hello World!"));
    }
}
