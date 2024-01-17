package org.example;

public class Solution5 {
    public static String camelCase(String input) {
        return input.replaceAll("(?=[A-Z])", " ").trim();
    }
}
