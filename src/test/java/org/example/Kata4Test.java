package org.example;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;



public class Kata4Test {
    @Test
    public void testSomething() {
        assertTrue(Kata4.zeroFuel(50, 25, 2));
        assertFalse(Kata4.zeroFuel(100, 50, 1));
    }
}
