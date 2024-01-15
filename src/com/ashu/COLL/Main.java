package com.ashu.COLL;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] str= {"Aashu","Raj","Monu","Amar","Pawan"};
        list.addAll(List.of(str));
        System.out.println(list);
        list.addAll(Arrays.asList("Rima","Sima","Hardik"));
        System.out.println(list);
        System.out.println("Aashu is present in the list? "+list.contains("Aashu"));
        list.removeIf(s -> s.charAt(0)=='R');
        System.out.println(list);
        List<String> secondArr = new ArrayList<>(list.size());
        //Collections.copy(secondArr,list); //We cannot use the Collection.copy iif size is differ
        //System.out.println(secondArr);
        List<String> cp=List.copyOf(list); // We can use List.copyOf
        System.out.println(cp);

    }
}
