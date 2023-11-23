package org.example;

import java.util.Scanner;

public class Kata {
    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        }
        if (p1.equals("rock") && p2.equals("scissors")) {
            return "Player 1 won!";
        }
        if (p1.equals("scissors") && p2.equals("paper")) {
            return "Player 1 won!";
        }
        if (p1.equals("paper") && p2.equals("rock")) {
            return "Player 1 won!";
        }
        return "Player 2 won!";
    }
    public static void HandleInsertingInputAndOutput(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p1 = scanner.nextLine();
        String p2 = scanner.nextLine();
        String str = rps(p1, p2);
        System.out.println(str);
    }
}
