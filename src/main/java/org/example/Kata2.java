package org.example;

import java.util.Scanner;

public class Kata2 {

    public static int squareSum(int[] n) {
        //Your Code
        int sum = 0;
        for (int num : n) {
            sum += num * num;
        }
        return sum;

    }

    public static void HandleInsertingInputAndOutput(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by space: ");
        String input = scanner.nextLine();
        String[] numberStrings = input.split(" ");
        int[] numbers = new int[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i]);
        }
        System.out.println(squareSum(numbers));
    }
}
