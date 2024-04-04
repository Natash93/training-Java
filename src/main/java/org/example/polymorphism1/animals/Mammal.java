package org.example.polymorphism1.animals;

abstract public class Mammal implements Abilities {
    public abstract String getName();

    @Override
    public boolean canBreatheWater() {
        return false;
    }

    @Override
    public boolean canFeedMilk() {
        return true;
    }
}
