package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution8Test {
    @Test
    public void staticTests() {
        assertEquals("no one likes this", Solution8.whoLikesIt());
        assertEquals("Peter likes this", Solution8.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", Solution8.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", Solution8.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", Solution8.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}
