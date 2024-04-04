package org.example.polymorphism1.animals;

public class Dolphin extends Mammal implements Appearance, EchoLocation {
    @Override
    public String getName() {
        return "Dolphin";
    }

    @Override
    public boolean canBreatheWater() {
        return true;
    }

    @Override
    public boolean canSwim() {
        return true;
    }

    @Override
    public boolean canWalk() {
        return false;
    }

    @Override
    public String getCover() {
        return "skin";
    }

    @Override
    public int getLegsNumber() {
        return 0;
    }

    @Override
    public boolean hasTail() {
        return false;
    }

    @Override
    public boolean hasSpots() {
        return false;
    }
}
