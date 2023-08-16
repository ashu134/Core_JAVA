package com.ashu.GENRC;

public class Main {
    public static void main(String[] args) {
        var natioalPark= new Park[]{
                new Park("Gir", "44.443, -98.332"),
                new Park("Ranthambhor", "66.444, 77.222"),
                new Park("Bandipura", "22.3334, 99.9998")
        };
        Layer<Park> parkLayer = new Layer<>(natioalPark);
        parkLayer.renderlayer();

        var indRiver = new River[]{
                new River("Ganga", "77.223, 88.33","67.998, 776.99"),
                new River("Yamuna","22.444, 83.7636","78.721, 99.977")
        };
        Layer<River> riverLayer= new Layer<>(indRiver);
        riverLayer.addElements(
                new River("Kaveri","33.533, 98.234","325.234, 89.55"),
                new River("Krishna","88.3874, 733.989","76.723, 94.99")
        );
        riverLayer.renderlayer();

    }
}
