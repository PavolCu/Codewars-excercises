package org.example;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int i = 1; i < args.length; i++) {
            min = Math.min(args[i], min);
        }
        return min;
    }
}


/*public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        return IntStream.of(args).min().getAsInt();
    }
}*/