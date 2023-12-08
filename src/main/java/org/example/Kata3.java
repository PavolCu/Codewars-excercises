package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kata3 {
    public static Object[] removeEveryOther(Object[] arr) {
        // happy coding
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                list.add(arr[i]);
            }
        }
        return list.toArray();
    }

    public static void HandleInsertingInputAndOutput(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements  of the array separated by space: ");
        String input = scanner.nextLine();
        String[] arr = input.split(" ");
        Object[] result = removeEveryOther(arr);
        System.out.println("Array after removing every other element: ");
        for (Object object : result) {
            System.out.print(object + " ");
        }
    }
}
