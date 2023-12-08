package org.example;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

// TODO: Replace examples and use TDD by writing your own tests

public class Kata3Test {
       @Test
         public void basicTests() {
           assertArrayEquals(new Object[]{"Hello", "Hello Again"}, Kata3.removeEveryOther(new Object[]{"Hello", "Goodbye", "Hello Again"}));
           assertArrayEquals(new Object[]{new Object[]{1, 2}}, Kata3.removeEveryOther(new Object[]{new Object[]{1, 2}}));
           assertArrayEquals(new Object[]{1, 3, 5, 7, 9}, Kata3.removeEveryOther(new Object[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
           assertArrayEquals(new Object[]{"Goodbye"}, Kata3.removeEveryOther(new Object[]{"Goodbye"}));
           assertArrayEquals(new Object[]{}, Kata3.removeEveryOther(new Object[]{}));
       }
}
