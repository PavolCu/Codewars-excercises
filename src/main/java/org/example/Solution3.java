package org.example;

public class Solution3 {
    static int stray(int[] numbers) {
        int xor = 0;
        for (int number : numbers) {
            xor ^= number;
        }
        return xor;
    }
}
