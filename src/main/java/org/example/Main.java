package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Boolean[] arrayOfSheeps = {
                true,  true,  true,  false,
                true,  true,  true,  true,
                true,  false, true,  false,
                true,  false, false, true,
                true,  true,  true,  true,
                false, false, true,  true
        };

        int numberOfSheep = counter.countSheeps(arrayOfSheeps);
        System.out.println("The number of present sheep is: " + numberOfSheep);

        // For the DNA strand
        Scanner scanner = new Scanner(System.in);


        String dnaStrand = scanner.nextLine();
        String complement = DnaStrand.makeComplement(dnaStrand);

        System.out.println("The complement of " + dnaStrand + " is " + complement);
    }
}