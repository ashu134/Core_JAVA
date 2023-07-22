package com.ashu.CHLG1;

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private static Bed bed;
    private Lamp lamp;

    public Bedroom(String name,Wall wall1,Wall wall2,Wall wall3,Wall wall4,
                   Ceiling celling,Bed bed,Lamp lamp){
        this.name=name;
        wall1=new Wall("West");
        wall2=new Wall("East");
        wall3=new Wall("South");
        wall4=new Wall("North");
        celling=new Ceiling(12,55);
        bed= new Bed("Modern", 4, 3, 2, 1);
        lamp=new Lamp("Classic", false, 75);
    }
    public Lamp getLamp(){
       return lamp;
    }
    public static void makeBed(){
        bed.make();
    }
}
