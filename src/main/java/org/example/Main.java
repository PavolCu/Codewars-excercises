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
        System.out.println("Enter a DNA strand: ");

        String dnaStrand = scanner.nextLine();
        String complement = DnaStrand.makeComplement(dnaStrand);

        System.out.println("The complement of " + dnaStrand + " is " + complement);

        // For the RemoveChars
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        String removed = RemoveChars.remove(str);

        System.out.println("The string " + str + " with the first and last characters removed is " + removed);

        // For the CenturyFromYear
        Solution.HandleInsertingInputAndOutput(args);


    }
}