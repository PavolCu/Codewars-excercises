package org.example;
import java.util.stream.IntStream;
import java.util.Arrays;
public class Sequence {
    public static int[] reverse(int n){
        //your code
        return IntStream.rangeClosed(1, n).map(i -> n - i + 1).toArray();
    }
}
