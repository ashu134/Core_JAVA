package com.ashu.ARRY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrlist2 {
    public static void main(String[] args) {
        String[] arrStr = {"Apple", "Mango", "banana"};
        List<String> list = List.of(arrStr);
        //list.add("guava");  //Cannot Do because this is immutable Collection
        System.out.println(list);

        ArrayList<String> Arr1 = new ArrayList<>(list);
        Arr1.add("Grapes"); // Allowed Because this is Mutable Array
        System.out.println(Arr1);

        ArrayList<String> newString = new ArrayList<>(
                List.of("Musturd", "mango"));
        System.out.println(newString);
//this method will add Arr1 and newString because they both are mutable Arrraylist
        Arr1.addAll(newString);
        System.out.println(Arr1);

        System.out.println("First Item:= " + Arr1.get(0));
        if (Arr1.contains("Mango")) {
            System.out.println("Arr1 Contains Mango");
        }
        System.out.println("Index of Mango: " + Arr1.indexOf("Mango"));

        Arr1.remove("Apple");
        System.out.println(Arr1);
        Arr1.retainAll(List.of("mango", "Apple"));
        System.out.println(Arr1);
    }
}
