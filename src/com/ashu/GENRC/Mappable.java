package com.ashu.GENRC;

import java.util.Arrays;

public interface Mappable {
    void render();

    static double[] stringtoLocation(String location) {
        var splits = location.split(", ");
        double lat = Double.valueOf(splits[0]);
        double lng = Double.valueOf(splits[1]);
        return new double[]{lat, lng};
    }
}

abstract class Point implements Mappable {
    private double[] location = new double[2];

    public Point(String location) {
        this.location = Mappable.stringtoLocation(location);
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as Point (" + location() + ")");

    }

    private String location() {
        return Arrays.toString(location);
    }
}

abstract class Line implements Mappable {
    private double[][] locations;

    public Line(String... locations) {
        this.locations = new double[locations.length][];
        int index = 0;
        for (var l : locations) {
            this.locations[index++] = Mappable.stringtoLocation(l);
        }
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as Line (" + locations() + ")");
    }

    private String locations() {
        return Arrays.deepToString(locations);
    }

}