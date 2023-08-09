package com.ashu.INTFCH;

import javax.swing.*;
import java.awt.*;
import java.util.Collection;

enum UsageType{ENTERTAINMENT,GOVERMENT,RESIDENTIAL,SPORTS}
public class Building implements Mappable{
    private String name;
    private UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name+ " ("+ usage +")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getMarker() {
        return switch (usage){
            case ENTERTAINMENT -> color.GREEN +" "+PointMarker.TRIANGLE;
            case GOVERMENT -> Color.RED+" "+PointMarker.STAR;
            case RESIDENTIAL -> color.BLUE+" "+PointMarker.SQUARE;
            case SPORTS -> color.ORANGE+" "+ PointMarker.PUSH_PIN;
            default -> color.BLACK+" "+PointMarker.CIRCLE;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name": "%s", "usage": "%s" """.formatted(name,usage);
    }
}
