package com.ashu.INTRF;

public class Main {
    public static void main(String[] args) {


    Bird bird = new Bird();
    Animal animal = bird;
    flightenabled flier = bird;
    trackable track = bird;

    animal.move();
    flier.fly();
    flier.land();
    bird.track();
    flier.takeoff();

    }
}
