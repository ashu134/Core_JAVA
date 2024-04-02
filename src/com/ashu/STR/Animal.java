package com.ashu.STR;

public class Animal {
    protected String name;
    protected String sound;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " Says " + sound);
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
        System.out.println(name);
    }
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
        sound = "Mew";
    }
}