package org.example;

import java.util.stream.IntStream;

public class GrassHopper2 {
    public static int summation(int n) {

        return IntStream.rangeClosed(1, n).sum();

    }
}
