package com.ashu.INTRF;

// only one interface Implemented
public class Truck implements trackable{
    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+"'s " +
                "cordinate tracked");
    }
}
