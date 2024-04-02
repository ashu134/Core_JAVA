package com.ashu.COLLECTION.Challange;

import java.io.Closeable;
import java.io.Serializable;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        for (int i = 0; i < 100; i = i + 9) {
            arraylist.add(i);

        }
        System.out.println(arraylist);
        for (int y = 0; y < arraylist.size(); y++) {
            if (arraylist.contains(arraylist.get(y))) {
                System.out.println("Word %s present at place  %02d".formatted(9 * y, arraylist.indexOf(9 * y) + 1));
            }
        }
        LinkedList linkedList1 = new LinkedList();
        ArrayList arrayList1 = new ArrayList();
        System.out.println(arrayList1 instanceof Serializable); //True
        System.out.println(arrayList1 instanceof Cloneable);    //True
        System.out.println(linkedList1 instanceof Serializable);//True
        System.out.println(linkedList1 instanceof Closeable);   //False
    }
}
