package org.example;

import java.util.stream.IntStream;

public class Kata7 {
    public static long[] powersOfTwo(int n){

        //TODO: Have fun
        return IntStream.rangeClosed(0, n)
                .mapToLong(i -> i == 0 ? 1 : (long) Math.pow(2, i))
                .toArray();
    }
}