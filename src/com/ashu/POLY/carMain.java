package com.ashu.POLY;

import java.util.stream.StreamSupport;

public class carMain {
    public static void main(String[] args) {
        Car car=new Car("Mahindra Thar 2022 model");
        //car.runEngine();
        runRace(car);

        Car newcar=new GasPoweredCar("Mahindra SUV", 100,7);
        runRace(newcar);
    }

    public static void runRace(Car car){
        //car.StartEngine();
        car.drive();
        
    }

}
