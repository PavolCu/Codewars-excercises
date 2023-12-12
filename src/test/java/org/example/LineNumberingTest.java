package org.example;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class LineNumberingTest {
    @Test
    public void basicTests() {
        assertIterableEquals(Arrays.asList(), LineNumbering.number(Arrays.asList()));
        assertIterableEquals(Arrays.asList("1: a", "2: b", "3: c"), LineNumbering.number(Arrays.asList("a", "b", "c")));
        assertIterableEquals(Arrays.asList("1: ", "2: ", "3: ", "4: ", "5: "), LineNumbering.number(Arrays.asList("", "", "", "", "")));
    }

    private void assertIterableEquals(List<Object> list, List<String> number) {

    }
}
