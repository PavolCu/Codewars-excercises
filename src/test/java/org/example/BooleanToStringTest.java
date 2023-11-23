package org.example;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooleanToStringTest {
    @Test public void testTrue() {
        assertEquals("true", BooleanToString.convert(true));
    }
    @Test public void testFalse() {
        assertEquals("false", BooleanToString.convert(false));
    }
}
