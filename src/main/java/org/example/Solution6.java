package org.example;

public class Solution6 {
// Your code here...
    public static boolean validatePin(String pin) {
        return pin.matches("^\\d{4}(\\d{2})?$");
}

}
