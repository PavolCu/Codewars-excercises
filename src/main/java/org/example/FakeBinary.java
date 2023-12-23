package org.example;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        StringBuilder binary = new StringBuilder();
        for (char digit : numberString.toCharArray()) {
            binary.append(digit < '5' ? '0' : '1');
        }
        return binary.toString();
    }
}
