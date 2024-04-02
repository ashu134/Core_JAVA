package com.ashu.ARRY;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] newArray = new int[10];
        newArray[5] = 122;
        System.out.println(newArray[5]);
        String[] newstring = new String[10];
        newstring[3] = "Aashutosh";
        newstring[4] = "Kumar";
        System.out.println(newstring[3] + " " + newstring[4]);

        //Anonymnous Array
        int[] integer = {1, 2, 3, 4, 4, 5};
        String[] newwStr = {"Aashu", "Raj", "Pawan", "Amar"};
        System.out.println(newwStr.length);
        System.out.println(newwStr[1]);

        for (int i = 0; i < newwStr.length; i++) {
            System.out.println(newwStr[i]);
        }

        for (String element : newwStr) {
            System.out.println(element + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(newwStr));

        Object objectVariable = newArray;
        if (objectVariable instanceof int[]) {
            System.out.println("objectVariable is an int type array");
        }
        Object[] objectArrray = new Object[4];
        objectArrray[1] = "Aashu";
        objectArrray[2] = new StringBuilder("Hello");


    }


}


/*
Array is sequence of value of ame types

Declaration of  array
1. declare elements type of array
2. put Square bracket
3. then place the name of the Array
 Syntax
 int[] ArrayName= new int[20]

 Size Of an array will be fixed after creation
 Size cannot be changed of array
 only we can assign value to the elements


 Array Initializer

 String[] newStr= new String[]{1,2,3,4,5}
 here we specify thr value, We want the array to initialize to, in comma delimeiter list,in curly braces.

Enhanced For Loop;

for(declaration : collection){
        //Block of Statement
}
first Component Declaration Expression which includes types and variable name
this is usually a local variable with the same type as an element in the array

And the second component is the array or some other types of collection

* */