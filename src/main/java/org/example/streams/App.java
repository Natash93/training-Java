package org.example.streams;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Elephant");
        list.add("Tiger");
        list.add("Lion");
        list.add("Giraffe");
        list.add("Whale");
        list.add("Dolphin");

        System.out.println("Names lengths: " + list.stream().map(a -> a.length()).toList());
        System.out.println("Sorted desc: " +
                list.stream().sorted((o1, o2) -> o2.compareTo(o1)).toList()
        );
        System.out.println("Names lengths: " + list.stream().filter(a -> a.length() > 4).toList());

        System.out.println("With names bigger than 5: " + list.stream().filter( a -> a.length() > 5).count());

        list.stream()
                .map(a -> a.toLowerCase())
                .sorted((o1, o2) -> o1.compareTo(o2))
                .forEach(a -> System.out.println(a));
    }
}
