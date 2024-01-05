package org.example;
import java.util.ArrayList;
import java.util.List;

public class Kata8 {
    public static List<Object> filterList(final List<Object> list) {
        List<Object> filteredList = new ArrayList<>();
        for (Object obj : list) {
            if (obj instanceof Integer) {
                filteredList.add(obj);
            }
        }
        return filteredList;
    }
}