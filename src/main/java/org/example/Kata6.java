package org.example;

import java.util.Arrays;

public class Kata6 {
    public static double find_average(int[] array){
        return (array.length == 0) ? 0 : Arrays.stream(array).average().getAsDouble();
    }
}