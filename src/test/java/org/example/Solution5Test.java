package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution5Test {
    @Test
    public void tests() {
        assertEquals( "Incorrect", "camel Casing", Solution5.camelCase("camelCasing"));
        assertEquals( "Incorrect", "camel Casing Test", Solution5.camelCase("camelCasingTest"));
        assertEquals( "Incorrect", "camelcasingtest", Solution5.camelCase("camelcasingtest"));
    }
}

