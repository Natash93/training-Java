package org.example.static_enums;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Nissan", 180, "Green");
        Car car2 = new Car("Renault", 180, "Green");
        Car car4 = new Car("Nissan", 200, "Green");

        System.out.println(car1 + " = " + car2 + " : " + car1.equals(car2));
        System.out.println(car1 + " = " + car4 + " : " + car1.equals(car4));
        System.out.println("Hashes: " + car1.hashCode() + " = " + car2.hashCode());
        System.out.println("Hashes: " + car1.hashCode() + " = " + car4.hashCode());

        System.out.println(Car.createNissan());
        System.out.println(Car.objectName);

        System.out.println("Day of week: ");
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.print(day.order + ". " + day.translation);
            if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
                System.out.println(" выходной");
            } else System.out.println();
        }
    }
}
