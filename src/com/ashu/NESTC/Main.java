package com.ashu.NESTC;

public class Main {
    public static void main(String[] args) {
        Meal regulrMeal = new Meal();
        System.out.println(regulrMeal);

        Meal UsregularMeal = new Meal(0.72);
        System.out.println(UsregularMeal);
    }
}
