package org.example;
import java.util.List;

interface Kata8 {
    static List<Object> filterList(List<Object> list) {
        return list.stream().filter(Integer.class::isInstance).toList();
    }
}
