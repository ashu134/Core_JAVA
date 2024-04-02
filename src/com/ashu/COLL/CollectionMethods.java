package com.ashu.COLL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionMethods {
    public static void main(String[] args) {
        ArrayList<String> Bestfriends = new ArrayList<>();
        Bestfriends.addAll(Arrays.asList("Aashutosh", "Pawan", "Rnjan", "Amar", "Monu"));
        System.out.println("bestFriends: " + Bestfriends);

        ArrayList<String> justFriends = new ArrayList<>(Arrays.asList("Kumar", "Raksha", "Prience", "Vikash", "Aashutosh"));
        System.out.println("JustFriends: " + justFriends);
        ArrayList<String> allFriends = new ArrayList<>();
        allFriends.addAll(Bestfriends);
        allFriends.addAll(justFriends);
        System.out.println("All Friends: " + allFriends);
        System.out.println(allFriends.indexOf(("Aashutosh")));
        System.out.println(allFriends.lastIndexOf(("Aashutosh")));
        allFriends.remove(1);
        System.out.println(allFriends);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 55, 4, 56, 67, 45, 23, 44, 55, 66, 78, 99));
        numbers.removeIf(num -> num % 2 == 0);
        System.out.println(numbers);
        numbers.removeIf(num -> num % 2 != 0);
        System.out.println(numbers);


        //Arraylist Comparison

        ArrayList<String> str = new ArrayList<>(Arrays.asList("B", "A", "C", "D", "E"));
        ArrayList<String> str1 = new ArrayList<>(Arrays.asList("B", "A", "C", "D", "E"));
        ArrayList<String> str2 = new ArrayList<>(Arrays.asList("B", "A", "C", "D", "F"));
        Collections.sort(str);
        Collections.sort(str1);
        Collections.sort(str2);
        System.out.println(str.equals(str1));
        System.out.println(str.equals(str2));

        //Findout Additional Elements -- Orders doesn't matter
        ArrayList<String> letter1 = new ArrayList<>(Arrays.asList("B", "A", "C", "D", "E"));
        ArrayList<String> letter2 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "F"));
//        letter2.removeAll(letter1);
//        System.out.println(letter2);

        //Findout the missing Elements
//        letter1.removeAll(letter2);
//        System.out.println(letter1);

        //find-out common Elements
        ArrayList<String> lang1 = new ArrayList<>(Arrays.asList("Java", "Python", "C#", "Ruby", "Rust"));
        ArrayList<String> lang2 = new ArrayList<>(Arrays.asList("Java", "Python", "C", "conda", "lamda"));
        lang1.retainAll(lang2);
        System.out.println(lang1);


        List<Integer> list = new ArrayList<>();
        list.add(1);
        if (list.contains(1)) {
            System.out.println("Containg this Number");
        }


    }
}
