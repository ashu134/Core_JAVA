package com.ashu.INTFCH;


enum Geometry {LINE, POINT, POLYGON}

enum color {BLACK, GREEN, BLUE, ORANGE, RED}

enum PointMarker {CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE}

enum LineMarker {DASHED, DOTTED, SOLID}

public interface Mappable {
    String JSON_PROPERTY = """
            "Properties": {%s}""";

    String getLabel();

    Geometry getShape();

    String getMarker();

    default String toJSON() {
        return """
                "Type": "%s", "label": "%s", "Marker": "%s" """
                .formatted(getShape(), getLabel(), getMarker());
    }

    static void mapIt(Mappable mappable) {
        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }
}
