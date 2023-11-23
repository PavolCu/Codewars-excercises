package org.example;

public class BooleanToString {
    public static String convert(boolean b){
        return b ? "true" : "false";
    }
    public static void HandleInsertingInputAndOutput(String[] args) {
        boolean b = true;
        String str = convert(b);
        System.out.println(str);
    }
}
