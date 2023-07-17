package com.ashu.POLY;

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

class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int BatterySize=6;
    public ElectricCar(String description, double avgKmPerCharge, int BatterySize){
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.BatterySize=BatterySize;
    }
    public ElectricCar(String description) {
        super(description);
    }

    @Override
    public void StartEngine() {
        System.out.printf("BEV-> Switch %d kwh battery on, Ready %n ",BatterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Bev -> Uses under the Average: %.2f %n", avgKmPerCharge);
    }
}

class HybridCar extends Car{
    private double avgKmPerLit;
    private int cylinders;
    private int batterySize=6;
    public HybridCar(String description,double avgKmPerLit,int cylinders,int batterySize){
        super(description);
        this.avgKmPerLit=avgKmPerLit;
        this.batterySize=batterySize;
        this.cylinders=cylinders;
    }

    public HybridCar(String description) {
        super(description);
    }

    @Override
    public void StartEngine() {
        System.out.printf("Hybrid-> %d cylinders Fired up %n ",cylinders);
        System.out.printf("Hybrid-> %d Battery on,ready !%n ",batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> Uses bellow the Average: %.2f %n", avgKmPerLit);
    }
}