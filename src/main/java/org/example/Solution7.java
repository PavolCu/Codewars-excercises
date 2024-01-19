package org.example;

import java.util.HashMap;
import java.util.Map;

public class Solution7 {
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(numbers[i])) {
                return new int[] { map.get(numbers[i]), i };
            }
            map.put(complement, i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
