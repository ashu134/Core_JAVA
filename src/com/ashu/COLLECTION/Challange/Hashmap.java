package com.ashu.COLLECTION.Challange;

import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("Aashutosh", "Bangalore");
        hm.put("Raj", "Noida");
        hm.put("Ranjan", "Noida");
        hm.put("Pawan", "Ranchi");
        hm.put("Monu", "Jamhor");
        System.out.println(hm);
        System.out.println(hm.put("Aashutosh", "Delhi")); //This will return Old value
        Set s = hm.keySet();
        System.out.println(s); //All key is the output
        Collection c = hm.values();
        System.out.println(c); //Get all value in collection

        Set s1 = hm.entrySet();
        System.out.println(s1);


        Iterator itr = s1.iterator();
        while (itr.hasNext()) {
            Map.Entry m1 = (Map.Entry) itr.next();
            System.out.println(m1.getKey() + " : " + m1.getValue());
        }

    }
}
