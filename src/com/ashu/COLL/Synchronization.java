package com.ashu.COLL;

import com.ashu.ARRY.Array;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Synchronization {
    public static void main(String[] args) {
        List<String> names= Collections.synchronizedList(new ArrayList<>());
        names.addAll(Arrays.asList("java","Python","Ruby","c#"));
        //Add or remove do not requires any Explicit synchronization
        //but fetch the VALUE Requires explicit synchronization
        synchronized (names) {
            Iterator<String> It = names.iterator();
            while (It.hasNext()){
                System.out.println(It.next());
            }

        }

        //2. copyOnWriteArrayList for making thread safe
        CopyOnWriteArrayList<String> copylist = new CopyOnWriteArrayList<>();
        copylist.addAll(names);
        Iterator<String> techLang= copylist.iterator();
        while (techLang.hasNext()){
            System.out.println(techLang.next());
        }



        //Removing Duplicates from Array
        ArrayList<Integer> integers= new ArrayList<>(Arrays.asList(1,3,5,3,5,3,5,6,5,2,3,4,5,6,7,8,9,0,3,4,4,5,6,9,78,8));
        //1. LinkedHashSet
        LinkedHashSet<Integer> linkedHashSet= new LinkedHashSet<>();
        linkedHashSet.addAll(integers);
        System.out.println(linkedHashSet);

        //2. threough Stream
        List<Integer> stream= integers.stream().distinct().collect(Collectors.toList());
        stream.forEach(System.out::print);

        //3. HashSet
        HashSet<Integer> hashSet= new HashSet<>();
        hashSet.addAll(integers);
        System.out.println(hashSet);
    }
}
