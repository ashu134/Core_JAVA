package com.ashu.OOPS;

public class Car {
    private String make = "tata";
    private String model = "NEXON";
    private String colour = "Black";
    private int doors = 4;
    private boolean convertible = true;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getDoors() {

        return doors;
    }

    public boolean isConvertible() {

        return convertible;
    }

    public void setMake(String make) {
        if (make == null) make = "unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "new holland", "mahindra", "tata" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }

        }

    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {
        System.out.println(doors + "-Doors " +
                colour + " " +
                make + " " +
                model + " " +
                (convertible ? "convertible" : ""));
    }
}
