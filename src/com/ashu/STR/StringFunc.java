package com.ashu.STR;

import java.util.*;

import static java.util.Collections.reverse;

public class StringFunc {
    public static void main(String[] args) {
//        String name= "Aashutosh";
//        System.out.println(concatStr(name, "Kumar"));
//        //check if Any Word present in the String
//        String s1= "A";
//        if("Aashutosh".contains("A")){
//            System.out.println("Yes A is present");
//        }
        String myname = "Aashutosh";
        System.out.println(myname.length());
        String[] name = myname.split("");
        System.out.println(name.toString());
        for (String z : name) {
            System.out.print(z + " ");
        }
        System.out.println();
        String temp = "";
        String revName = "";
        for (int i = 0; i < name.length; i++) {
            revName = name[i] + revName;
        }
        for (String z : revName.split("")) {
            System.out.print(z + " ");
        }
        System.out.println();
        Scanner scan = new Scanner(System.in);
        String s = "He is a very very good boy, isn't he?";//scan.nextLine();
        String a = s.replace(",", "");
        String[] splits = a.split("[!,?._'@ ]");
        //splits = Arrays.asList(splits).stream().filter(str -> !str.isEmpty()).collect(java.util.stream.Collectors.toList()).toArray(new String[0]);

        System.out.println(splits.length);
//        for(String z : splits)
//        {
//            System.out.println(z);
//        }
//        scan.close();
    }

    public static String concatStr(String str1, String str2) {
        String str = str1.concat(" ");
        str = str.concat(str2);
        return str;
    }

    public static String getDetails() {
        return "My name is Ashu";
    }
}
