package org.example.polymorphism1.animals;

public class Giraffe extends Mammal implements Appearance {
    @Override
    public String getName() {
        return "Giraffe";
    }

    @Override
    public boolean canSwim() {
        return true;
    }

    @Override
    public boolean canWalk() {
        return true;
    }

    @Override
    public String getCover() {
        return "short fur";
    }

    @Override
    public int getLegsNumber() {
        return 4;
    }

    @Override
    public boolean hasTail() {
        return true;
    }

    @Override
    public boolean hasSpots() {
        return true;
    }
}
