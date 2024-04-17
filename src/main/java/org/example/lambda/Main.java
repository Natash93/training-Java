package org.example.lambda;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> inputs = new ArrayList<>();

        for (int i = 0; i < 3; i++) readLine((line) -> inputs.add(line));

        System.out.println("What you have written: " + inputs);
    }

    private static void readLine(InputConsumer<String> consumer) {
        System.out.println("Enter some text: ");
        Scanner sc = new Scanner(System.in);
        consumer.consume(sc.nextLine());
    }
}
