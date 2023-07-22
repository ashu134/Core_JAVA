package com.ashu.CHLG1;

public class Ceiling {
    private int height;
    private int printedColor;

    public Ceiling(int height,int printedColor){
        this.height=height;
        this.printedColor=printedColor;
    }
    public int getHeight(){
        return height;
    }
    public int getPaintedColor(){
        return printedColor;
    }
}
