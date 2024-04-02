package com.ashu.COLL;

import java.security.Key;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class HASMAPCONCEPT {
    public static void main(String[] args) {
        //No order no indexing
        // key-value pair
        //we can Add multiple values as Null but not the key only one key can be null
        //hashmap is not synchronised/ not thread SAFE
        HashMap<String, String> hmap = new HashMap<>();
        HashMap<Integer, String> IntStrMap = new HashMap<>();
        HashMap<Integer, String> IntStrMap1 = new HashMap<>();
        HashMap<Integer, String> IntStrMap2 = new HashMap<>();
        hmap.put("Name", "Aashutosh");
        hmap.put("Age", "25");
        hmap.put("city", "Aurangabad");
        hmap.put("State", "Bihar");
        hmap.put("Country", "India");
        System.out.println(hmap);

        //Iterator: Over the set (Pair) > using the Entry key
        Iterator<Map.Entry<String, String>> k = hmap.entrySet().iterator();
        while (k.hasNext()) {
            Map.Entry<String, String> entry = k.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        //using key set
        Iterator<String> it = hmap.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = hmap.get(key);
            System.out.println(key + "=" + value);
        }
        IntStrMap.put(001, "Aashutosh");
        IntStrMap.put(002, "Amar");
        IntStrMap.put(003, "Dinesh");

        IntStrMap1.put(001, "Aashutosh");
        IntStrMap1.put(002, "Amar");
        IntStrMap1.put(003, "Raj");

        IntStrMap2.put(001, "Aashutosh");
        IntStrMap2.put(002, "Amar");
        IntStrMap2.put(003, "Dinesh");
        System.out.println(IntStrMap);

        //convert Hashmap to synchronized hashmap
        //thread safe
        //multiple null keys and values allowed

        Map<Integer, String> synchash = Collections.synchronizedMap(IntStrMap);
        System.out.println(synchash);

        //creating cuncurentHashmap
        // thread safe
        // null keys and value not allowed
        // Multiple reading threads are allowed
        ConcurrentHashMap<String, String> cuncurentHashmap = new ConcurrentHashMap<>();
        cuncurentHashmap.put("Name", "Aashutosh");
        cuncurentHashmap.put("Age", "25");
        cuncurentHashmap.put("city", "Aurangabad");
        cuncurentHashmap.put("State", "Bihar");
        cuncurentHashmap.put("Country", "India");
        System.out.println(cuncurentHashmap);

        List<String> list = new ArrayList<>(cuncurentHashmap.keySet());
        List<String> listval = new ArrayList<>(cuncurentHashmap.values());
        System.out.println(list);
        System.out.println(listval);

    }
}
