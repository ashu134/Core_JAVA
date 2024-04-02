package com.ashu.COLLECTION.Challange;

import java.util.Comparator;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        //Only Homogeneous Elements Allowed
        TreeSet t = new TreeSet();
        t.add("Aashu");
        t.add("Raj");
        t.add("Rahul");
        t.add("sonu");
        //t.add(null);
        System.out.println(t);
        // by using --> new MyComparator() we can revert the order of string
        TreeSet treeSet = new TreeSet(new MyComparator());
        //treeSet.add(null); //Null not allowed even as the first element from java 1.7 version
        //When we are using BufferString then
        // if we are depending on default natural sorting order compulsory object should be
        // homogeneous and comparable otherwise we will get runtime Exception of ClassCast Exception

        // if We are defining our own sorting by comparator then objects need not be comparable
        treeSet.add(new StringBuffer("A"));
        treeSet.add(new StringBuffer("B"));
        treeSet.add(new StringBuffer("R"));
        treeSet.add(new StringBuffer("K"));
        treeSet.add(new StringBuffer("Q"));
        System.out.println(treeSet);
        TreeSet treeSet1 = new TreeSet(new MyComparator());
        treeSet1.add("Aashu");
        treeSet1.add("Raju");
        treeSet1.add("Monu");
        treeSet1.add("Amar");
        treeSet1.add("Dinesh");
        System.out.println(treeSet);
        int x = 100;
        int y = 110;
        //int z= x.comapreTo(y);
        String s1 = "Aashu";
        String s2 = "Raju";
        // System.out.println("s1".compareTo("s99"));


        TreeSet treeSet2 = new TreeSet();
        treeSet2.add("Ashu");
        treeSet2.add("Raj");
        treeSet2.add(new StringBuffer("Aashutosh"));
        System.out.println(treeSet2);
    }
}

class MyComparator implements Comparator { //this class used to compare two String and return string
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }
}
