package com.ashu.CHLG1;

public class Lamp {
    private String style;
    private boolean battery;
    private int globeRating;

    public Lamp(String style,boolean battery,int globeRating){
        this.style=style;
        this.battery=battery;
        this.globeRating=globeRating;
    }
    public static void turnOn(){
        System.out.println("the lamp is being turned on");
    }
    public boolean getStyle(){
        return battery;
    }
    public int getGlobRating(){
        return globeRating;
    }
}
