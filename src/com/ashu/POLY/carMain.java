package com.ashu.POLY;

import java.util.stream.StreamSupport;

public class carMain {
    public static void main(String[] args) {
       /*Car car=new Car("Mahindra Thar 2022 model");
        //car.runEngine();
        runRace(car);*/

        Car newcar=new GasPoweredCar("Mahindra SUV", 100,7);
        runRace(newcar);

        Car Tesla= new ElectricCar("2022 red model 3",500,75);
        runRace(Tesla);
        Car frrrihybrid= new HybridCar("ferrari 2023 232XN",1100,6,100);
        runRace(frrrihybrid);
    }

    public static void runRace(Car car){
        car.StartEngine();
        car.drive();

    }

}
