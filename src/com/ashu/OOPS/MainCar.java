package com.ashu.OOPS;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("TATA");
        System.out.println("MAKE= "+ car.getMake());
        car.describeCar();
    }
}
