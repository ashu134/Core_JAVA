package com.ashu.INTFCH;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();
        mappables.add(new Building("Sydny TownHall", UsageType.GOVERMENT));
        mappables.add(new Building("Opera house", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Central Hall", UsageType.SPORTS));

        mappables.add(new UtilityLine("Olympus campus", UtilityType.FIBER_OPTICS));
        mappables.add(new UtilityLine("college Street", UtilityType.ELECTRICITY));
        for (var m : mappables) {
            Mappable.mapIt(m);
        }
    }
}
