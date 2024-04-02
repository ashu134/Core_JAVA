package com.ashu.ENUM;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        DaysOfWeek weekday = DaysOfWeek.TUES;
        System.out.println(weekday);
        System.out.printf("Name is %s, Ordinal Value = %d%n",
                weekday.name(), weekday.ordinal());
        for (int i = 0; i < 10; i++) {
            weekday = getrandonDays();
            System.out.printf("Day is %s, Ordinal Value = %d%n",
                    weekday.name(), weekday.ordinal());
        }
    }

    public static DaysOfWeek getrandonDays() {
        int randomInt = new Random().nextInt(7);
        var allDays = DaysOfWeek.values();
        return allDays[randomInt];

    }
}
