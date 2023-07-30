package com.ashu.ABST;

public class Fish extends Animal{
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed=="Slow"){
            System.out.println(type+" lazily swimming");
        }else {
            System.out.println(type+ " darting frantically");
        }

    }

    @Override
    public void makeNoise() {
        if (type=="Goldfish"){
            System.out.printf("Swish! ");

        }else {
            System.out.printf("Splash! ");
        }
    }
}
