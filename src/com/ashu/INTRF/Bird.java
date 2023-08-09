package com.ashu.INTRF;


import java.util.List;

// Animal class extended and Both interfaces implemented
public class Bird extends Animal implements flightenabled,trackable{
    @Override
    public void move() {
        System.out.println("Flap Wings");
    }

    @Override
    public void takeoff() {
        System.out.println(getClass().getSimpleName()+" Took OFF");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName()+" is Landing");

    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+" is Flying ");

    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+"'s Co-ordinate tracked");

    }

  /*
  public static void flyFliers(List<flightenabled> fliers){
        for(var flier : fliers){
            flier.fly();
            System.out.println("Success");
        }
    }
    */
}
