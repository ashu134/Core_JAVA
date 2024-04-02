package com.ashu.COLLECTION.Challange;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Itrator {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        Iterator itr = arrayList.iterator();
        while (itr.hasNext()) {
            Integer itr1 = (Integer) itr.next();
            if (itr1 % 2 == 0) {
                System.out.println(itr1);
            } else {
                itr.remove();
            }

        }
        System.out.println(arrayList);

        //ListIterator

        LinkedList linkedList = new LinkedList();
        linkedList.add("Aashu");
        linkedList.add("Raj");
        linkedList.add("Monu");
        linkedList.add("Pawan");
        System.out.println(linkedList);
        ListIterator linkitr = linkedList.listIterator();
        while (linkitr.hasNext()) {
            String str = (String) linkitr.next();
            if (str.equals("Raj")) {
                linkitr.remove();
                System.out.println("At remove : " + linkedList);
            }
            if (str.equals("Aashu")) {
                linkitr.add("Ranjan");
                System.out.println("At Add : " + linkedList);
            }
            if (str.equals("Pawan")) {
                linkitr.set("pankaj");
                System.out.println("At Set : " + linkedList);
            }
            System.out.println(linkedList);
        }

    }
}
