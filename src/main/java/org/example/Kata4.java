package org.example;

import java.util.Scanner;

public class Kata4 {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        // Your code here!
        return mpg * fuelLeft >= distanceToPump;
    }

    public static void HandleInsertingInputAndOutput(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the distance to the pump: ");
        double distanceToPump = scanner.nextDouble();

        System.out.println("Enter the mpg: ");
        double mpg = scanner.nextDouble();

        System.out.println("Enter the fuel left: ");
        double fuelLeft = scanner.nextDouble();

        boolean canReachPump = zeroFuel(distanceToPump, mpg, fuelLeft);
        System.out.println("Can reach the pump? " + (canReachPump ? "Yes" : "No"));
    }
}
