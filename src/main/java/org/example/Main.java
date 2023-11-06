package org.example;


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
    }
}