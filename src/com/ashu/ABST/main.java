package com.ashu.ABST;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        // Animal animal = new Animal("Animal","Big",100);
        Dog dog = new Dog("Wolf", "Big", 100);
        //dog.makeNoise();
        //doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepard", "big", 100));
        animals.add(new Fish("whale", "big", 300));
        animals.add(new Fish("CuttleFish", "small", 10));
        for (Animal animal : animals) {
            doAnimalStuff(animal);
        }

    }

    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("Slow");

    }
}
