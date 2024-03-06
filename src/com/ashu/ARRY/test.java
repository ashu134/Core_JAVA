package com.ashu.ARRY;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        Array array = new Array();
        //int[] arr = new int[]{49, 57, 62, 90, 21, 9, 59, 6, 20, 20, 72, 3, 14, 56, 25, 6, 19, 94, 69, 81, 0};
        ArrayList arrayList= new ArrayList();
        for (int i=0; i<20;i++){
            int x= (int) (Math.random()*100);
            arrayList.add(x);
        }
        System.out.println(arrayList);
        Collections.sort(arrayList);
//        System.out.println(arrayList);
        ArrayList oddArray= new ArrayList();
        ArrayList evenArray= new ArrayList();
//        System.out.println(arrayList.get(2));

//        for (int i=0; i<=arrayList.size();i++){
//            int x = arrayList.get(i);
//            if(arrayList.get(i)/2 ==0){
//                arrayList.add(x);
//            }
//        }
        for(Object i : arrayList){
            int x = (int) i;
            if(x%2 ==0){
                evenArray.add(x);
            }else{
                oddArray.add(x);
            }
            System.out.print(i + " ");
        }
//        for (int i=0; i<=arrayList.size()+1;i++){
//            int x = (int) arrayList.get(i);
//            if(x%2 ==0){
//                evenArray.add(x);
//            }else{
//                oddArray.add(x);
//            }
//        }
        System.out.println();
        Collections.sort(evenArray);
        Collections.sort(oddArray);
        System.out.println("Even Array "+evenArray +" "+oddArray.size());
        System.out.println("Odd Array"+ oddArray +" "+evenArray.size());
        ArrayList arrayList1 = new ArrayList();
        //arrayList1=evenArray.add()
        evenArray.addAll(oddArray);
        System.out.println(evenArray);

    }
}
