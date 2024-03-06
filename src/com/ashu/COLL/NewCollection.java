package com.ashu.COLL;

import java.util.*;

public class NewCollection {
   // Test[] t;
    public static void main(String[] args) {
        //Declare class object as Array collection
        Test t[]= new Test[2];
        t[0]=new Test("Aashutosh",25);
        t[1]=new Test("Kumar",25);
        System.out.println(t[0].name+ " Age: "+ t[0].age);
        ArrayList<Test> obj = new ArrayList<>();
        obj.addAll(Arrays.asList(new Test("Raj",25),
                                new Test("Ranjan",25),
                new Test("Aashutosh",25)));
        //System.out.println("1-- " + obj.get(0).name);
        obj.stream().forEach(name ->System.out.println(name.name+" "+name.age));
        System.out.println("With ArrayList --------");
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(10,12,12,12,4,15,16));
        System.out.println(intList);
        ArrayList<Integer> ints = new ArrayList<>();
        ints.addAll(Arrays.asList(100,300,102,888));
        Collections.sort(ints);
        //print by for each loop
        for (var i :ints){
            System.out.println(i);
        }
        System.out.println("by stream and lambda----------");
        //print with stream and lamba
        ints.stream().forEach(i -> System.out.println(i));

        System.out.println("With Iterator --------");
        //With Iterator
        Iterator<Integer> it = ints.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
