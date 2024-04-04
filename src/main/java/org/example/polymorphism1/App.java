package org.example.polymorphism1;

import org.example.polymorphism1.animals.Dolphin;
import org.example.polymorphism1.animals.Giraffe;

public class App {
    public static void main(String[] args) {
        Giraffe giraffe = new Giraffe();
        Dolphin dolphin = new Dolphin();

        System.out.println("Giraffe has " + giraffe.getLegsNumber() + " legs");
        System.out.println("Can dolphins breathe water? " + (dolphin.canBreatheWater() ? "Yes!" : "Nope"));
        dolphin.echo();
    }
}
