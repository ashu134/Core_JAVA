package com.ashu.LAMDA;

public class Main {
    public static void main(String[] args) {
        //Normal way to implement Interface
        Normalclass lamdaclas= new Normalclass();
        lamdaclas.Series();
        lamdaclas.varient();


        //Anonymous way to implement interFace
        Moto moto= new Moto() {
            @Override
            public void Series() {
                System.out.println("Anonymous class: this verion is MOTOROLA Edge 40 series ");

            }

            @Override
            public void varient() {
                System.out.println("Anonymous Class: Color is VIVA MAGENTA ");
            }
        };
        moto.Series();
        moto.varient();

        // Lamda Expression
        Realme realme=new RelameImpl();
        //Step1= only valid for functional interface
        //Step2= create a object of interface like Realme relame=
        //Step3= () indicate No parameter
        //Step4 = with sign -> execute the other part of code
        Realme realme1= () -> System.out.println("Lambda Expression : This Model is 10 pro max");
        realme1.Model();


        Sum sum = (int a, int b, int c) -> {
                System.out.println("The input of this method is: "+ a +" "+b +" "+ c);
                return a+b+c;
            };
        System.out.println("Sum of the given number is : "+ sum.addition(3, 4,6));

    }

}
