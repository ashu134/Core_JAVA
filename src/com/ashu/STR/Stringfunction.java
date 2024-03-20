package com.ashu.STR;

public class Stringfunction {
    public static void main(String[] args) {
        String dogName = "John";
        String catName = "mike";

        Dog dog = new Dog(dogName);
        Cat cat = new Cat(catName);

        dog.makeSound();
        cat.makeSound();

    }
}
