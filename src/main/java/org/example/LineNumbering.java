package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        return IntStream.rangeClosed(1, lines.size())
                .mapToObj(i -> i + ": " + lines.get(i - 1))
                .collect(Collectors.toList());
    }


    public  List<String> handleForInput() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter lines of text in the format [\"string1\", \"string2\", \"string3\"]: ");
        String input = scanner.nextLine();
        String [] array = input.substring(1, input.length() - 1).split("\", \"");
        for(int i = 0; i <array.length; i++) {
            array[i] = array[i].replace("\"", "");
        }

        return Arrays.asList(array);
    }
}