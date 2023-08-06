package com.ashu.INTRF;

import com.ashu.ARRY.Arraylist;
import com.ashu.ARRY.Linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


    Bird bird = new Bird();
    Animal animal = bird;
    flightenabled flier = bird;
    trackable track = bird;

    /*
    animal.move();
    flier.fly();
    flier.land();
    bird.track();
    flier.takeoff();
    */
     inflight(flier);
     Jet jet = new Jet();
     inflight(jet);
     Truck truck = new Truck();
     truck.track();

     //ArrayList<flightenabled> fliers = new ArrayList<>();
        LinkedList<flightenabled> fliers = new LinkedList<>();
     fliers.add(bird);
     triggerFliers(fliers);
     flyFliers(fliers);
        //bird.flyFliers(fliers);
     landFliers(fliers);

     List<flightenabled> betterFliers = new LinkedList<>();
     betterFliers.add(bird);
        triggerFliers(betterFliers);
        //flyFliers(betterFliers);
        landFliers(betterFliers);

    }
    private static void inflight(flightenabled flier){
        flier.takeoff();
        flier.fly();
        if(flier instanceof trackable track){
            track.track();
        }
        flier.land();
    }

    private  static void triggerFliers(List<flightenabled> fliers){
        for(var flier : fliers){
            flier.takeoff();
        }
    }
    private  static void landFliers(List<flightenabled> fliers){
        for(var flier : fliers){
            flier.land();
        }
    }
    private  static void flyFliers(List<flightenabled> fliers){
        for(var flier : fliers){
            flier.fly();
        }
    }
}
