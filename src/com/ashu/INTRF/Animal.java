package com.ashu.INTRF;

//If two interface contains same method name with different return
// types then we cannot implement u=in same class
enum FlightStages implements trackable {
    Grounded, Launch, Cruise, Data_collection;

    @Override
    public void track() {
        if (this != Grounded) {
            System.out.println("Monitoring " + this);
        }
    }
}

record dragnFly(String name, String type) implements flightenabled {

    @Override
    public void move() {

    }

    @Override
    public void takeoff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

class satellite implements OrbitEarth {

    @Override
    public void achieveOrbit() {
        System.out.println("orbit Achieved");
    }

    @Override
    public void move() {

    }

    @Override
    public void takeoff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

interface OrbitEarth extends flightenabled {
    void achieveOrbit();
}

// Two Interfaces flightenalbed and trackable
interface flightenabled {
    void move();

    void takeoff();

    void land();

    void fly();
};

interface trackable {
    void track();
}

public abstract class Animal {

    public abstract void move();

}
