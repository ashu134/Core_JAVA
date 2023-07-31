package com.ashu.ABST;

public class Dog extends Animal{
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed=="slow"){
            System.out.println(type+" Walking");
        }else {
            System.out.println(type+ " Running");
        }
    }
    @Override
    public void makeNoise() {
        if (type=="Wolf"){
            System.out.printf("Howling!");

        }else {
            System.out.printf("Woof!");
        }
    }
}
