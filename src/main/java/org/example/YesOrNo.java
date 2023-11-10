package org.example;
import java.util.Scanner;

public class YesOrNo {
    public static String boolToWord(boolean b){
        return b ? "Yes" : "No";
    }
    public static void HandleInsertBooleanValue(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a boolean value: ");
        boolean b = scanner.nextBoolean();
        String result = boolToWord(b);
        System.out.println(result);
    }

}
