package com.ashu.GENRC;

import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappable> {
    private List<T> layerElements;

    public Layer(T[] layerElements) {
        this.layerElements = new ArrayList<>(List.of(layerElements));
    }

    public void addElements(T... elements) {
        layerElements.addAll(List.of(elements));
    }

    public void renderlayer() {
        for (T element : layerElements) {
            element.render();
        }
    }
}
