package org.example.static_enums;

public enum DayOfWeek {
    MONDAY(1, "Понедельник"),
    TUESDAY(2, "Вторник"),
    WEDNESDAY(3, "Среда"),
    THURSDAY(4, "Четверг"),
    FRIDAY(5, "Пятница"),
    SATURDAY(6, "Суббота"),
    SUNDAY(7, "Воскресенье");

    public final int order;
    public final String translation;

    DayOfWeek(int order, String translation) {
        this.order = order;
        this.translation = translation;
    }
}
