package com.ashu.LAMDA;

public class Normalclass implements Moto{

    @Override
    public void Series() {
        try
        {
            int data=50/0; //may throw exception
        }
        //handling the exception
        catch(ArithmeticException e)
        {
            System.out.println(e+ this.getClass().getSimpleName());
        }
        System.out.println("this verion is MOTOROLA Edge 40 series ");
    }

    @Override
    public void varient() {
        System.out.println("Color is VIVA MAGENTA ");
    }
}
