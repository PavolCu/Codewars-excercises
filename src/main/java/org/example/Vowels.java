package org.example;

import java.util.Scanner;

public class Vowels {
    public static int getCount(String string) {
        int vowelsCount = 0;
        for (char c: string.toCharArray()) {
            if (c == 'a'  || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
    public static void HandleInsertingInputAndOutput(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        int vowelsCount = getCount(str);
        System.out.println( vowelsCount);
    }
}
