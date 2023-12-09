package com.ashu.COLLECTION.Challange;

import com.ashu.ARRY.Array;

import java.util.*;

public class HashtableTest {
    public static void main(String[] args) {
        Hashtable hashtable= new Hashtable();
        hashtable.put(100,"Aashutosh");
        hashtable.put(101,"Amar");
        hashtable.put(102,"Raj");
        hashtable.put(103,"Dinesh");
        System.out.println(hashtable);
        System.out.println(hashtable.keys() +" "+ hashtable.values());
        ArrayList arrayList=new ArrayList<>();
        //arrayList.addAll((Collection) hashtable.keys());
        //System.out.println(arrayList);

    }
}
