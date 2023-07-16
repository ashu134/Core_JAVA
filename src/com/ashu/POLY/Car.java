package com.ashu.POLY;

import java.sql.SQLOutput;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }
    public void StartEngine(){
        System.out.println("Car -> StartEngine");
    }
    public void drive(){
        System.out.println("Car-> Drive type is "+ getClass().getSimpleName());
        runEngine();
    }
    protected void runEngine(){
        System.out.println("Car  -> runEngine");

    }

}
class GasPoweredCar extends Car{
    private double avgKmPerLit;
    private int cylinders=6;
    public GasPoweredCar(String description,double avgKmPerLit,int cylinders){
        super(description);
        this.avgKmPerLit=avgKmPerLit;
        this.cylinders=cylinders;
    }

    public GasPoweredCar(String description) {
        super(description);
    }

    @Override
    public void StartEngine() {
        System.out.printf("Gas-> All %d Engines Started,Ready !%n ",cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> Uses exceed the Average: %.2f %n", avgKmPerLit);
    }
}
