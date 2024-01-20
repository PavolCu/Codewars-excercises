package org.example;

import java.util.Scanner;

public class Kata10 {
    public static int[] digitize(long n) {
        String str = Long.toString(n);
        int[] result = new int[str.length()];
        int index = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            result[index] = Character.getNumericValue(str.charAt(i));
            index++;
        }
        return result;
    }
}
