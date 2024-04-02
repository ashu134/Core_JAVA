package com.ashu.INTFCH;

import java.util.List;

enum UtilityType {ELECTRICITY, FIBER_OPTICS, GAS, WATER}

public class UtilityLine implements Mappable {
    private String name;
    private UtilityType type;

    public UtilityLine(String name, UtilityType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return name + " (" + type + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String getMarker() {
        return switch (type) {
            case ELECTRICITY -> color.GREEN + " " + LineMarker.DASHED;
            case FIBER_OPTICS -> color.GREEN + " " + LineMarker.DOTTED;
            case GAS -> color.ORANGE + " " + LineMarker.SOLID;
            default -> color.BLACK + " " + LineMarker.SOLID;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name": "%s", "Utility": "%s" """.formatted(name, type);
    }
}
