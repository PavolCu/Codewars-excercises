package org.example;

import java.util.Scanner;

public class Solution {

    public static void HandleInsertingInputAndOutput(String[] args) {
        System.out.println("Enter a year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int result = century(year);
        System.out.println(year + " --> " + result);

    }

    public static int century(int year) {
        // your code goes here
        if(year %100==0){
            return year/100;
        }
        else{
            return year/100 +1;
        }
    }
}
