package org.example.static_enums;

import java.util.Objects;

public class Car {
    public static String objectName = "Cars";

    private String name;
    private int maxSpeed;
    private String color;

    public Car(String name, int speed, String color) {
        this.name = name;
        this.maxSpeed = speed;
        this.color = color;
    }

    public static Car createNissan() {
        return new Car("Nissan", 0, "");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj ||
                (obj != null && obj.getClass() == getClass()
                && ((Car) obj).getName().equals(name)
                && ((Car) obj).getColor().equals(color));
    }

    @Override
    public String toString() {
        return name + " " + color + ", max speed: " + maxSpeed;
    }
}
