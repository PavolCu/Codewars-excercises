package org.example;

import java.util.Scanner;

public class SumArray {
    //Write a function that takes an array of numbers and returns the sum of the numbers. The numbers can be negative or non-integer. If the array does not contain any numbers then you should return 0.
    public static void HandleInsertingInputAndOutput(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of numbers separated by a space: ");

        String[] numbers = scanner.nextLine().split(" ");
        double[] numbersAsDoubles = new double[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            numbersAsDoubles[i] = Double.parseDouble(numbers[i]);
        }

        double sum = sum(numbersAsDoubles);
        System.out.println("The sum of the numbers is: " + sum);
    }

    public static double sum(double[] numbers) {
        return java.util.Arrays.stream(numbers).sum();
    }
}