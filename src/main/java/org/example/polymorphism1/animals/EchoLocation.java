package org.example.polymorphism1.animals;

public interface EchoLocation {
    default void echo() {
        System.out.println("Yyyuuuuu-yyuyuu");
    }
}
