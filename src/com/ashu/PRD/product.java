package com.ashu.PRD;

import javax.swing.*;
import java.sql.SQLOutput;

public class product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}

class Monitor extends product {
    private int size;
    private String resoution;

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer, int size, String resoution) {
        super(model, manufacturer);
        this.size = size;
        this.resoution = resoution;
    }

    public void drawPixelAt(int x, int y, String Color) {
        System.out.println(String.format(
                "Drawing pixel at %d %d in color %s ", x, y, Color
        ));
    }
}

class Motherboard extends product {
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("System " + programName + " Is now Loadng ");
    }
}

class Computercase extends product {
    private String powerSupply;

    public Computercase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Computercase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }
}