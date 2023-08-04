package com.ashu.ABST;

public class Dog extends Animal{
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed=="slow"){
            System.out.println(getExplicitType()+" Walking");
        }else {
            System.out.println(getExplicitType()+ " Running");
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
