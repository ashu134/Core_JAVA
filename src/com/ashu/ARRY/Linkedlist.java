package com.ashu.ARRY;
import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<String> PlacesToVisit= new LinkedList<>();
        var anotherWay = new LinkedList<String>();
        PlacesToVisit.add(0,"[1]Pune");
        PlacesToVisit.add(1,"[2]Rajgir");
        System.out.println(PlacesToVisit);
        addmoreElements(PlacesToVisit);
        gettingElements(PlacesToVisit);
        printItinerary(PlacesToVisit);
        printitinerary2(PlacesToVisit);


    }
    private static void addmoreElements(LinkedList<String> LL){
        LL.add("[3]Rameshwaram");
        LL.add("[4]Chennai");
        LL.offer("[5]TiruanantPuram");
        LL.offerFirst("[0]Madurai");
        System.out.println(LL);
        //4 will remove index 4 value and without any value
        // .remove() will remove only index 0 value
       // String r1=LL.remove(4);
       // String r2=LL.remove();
       // String r3=LL.removeLast();// This will Remove last element
       // System.out.println(r1+" "+r2+" "+r3+" Removed from LinkedList");
    }
    private static void gettingElements(LinkedList<String> list){
        System.out.println("Retrive Element = "+list.get(4));
        System.out.println("First Element: "+list.getFirst());
        System.out.println("Last Element : "+list.getLast());
        System.out.println("ClassName="+ Arrays.toString(list.toArray()));

        System.out.println("ndex of rajgir= "+list.indexOf("Rajgir"));
        System.out.println("Element from element()= "+list.element());
    }
    private static void printItinerary(LinkedList<String> list){
        System.out.println("Trip will Start from: "+list.getFirst());
        for(int i=1;i<list.size();i++){
            System.out.println("--> from : "+list.get(i-1)+" to "+list.get(i));
        }
        System.out.println("Trip Ends at "+ list.getLast());
    }
    private static void printitinerary2(LinkedList<String> list){
        System.out.println("Trip Starts at "+ list.getFirst());
        String previouTown=list.getFirst();
        for(String town: list){
            System.out.println("--> From "+previouTown+" To "+ town);
            previouTown=town;
        }
    }

}
