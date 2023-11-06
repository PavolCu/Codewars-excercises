package org.example;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        int count = 0;
        if (arrayOfSheeps != null) {
            for (Boolean sheep : arrayOfSheeps) {
                // Check for null and if sheep is present
                if (sheep != null && sheep) {
                    count++;
                }
            }
        }
        return count;
    }
}