package com.ashu.DSA;

public class LinkedListMain {
    public static void main(String[] args) {


        LinkedListConcept newConcept = new LinkedListConcept(4);
        newConcept.AppendNode(5);
        newConcept.AppendNode(6);
        //newConcept.printList();
//        newConcept.getLength();
//        newConcept.RemoveLast();
//        newConcept.printList();
//        newConcept.RemoveLast();
//        newConcept.printList();
//        newConcept.getLength();
//        newConcept.prepend(100);
//        newConcept.printList();
//        newConcept.RemoveFirst();
//        newConcept.printList();
//        newConcept.RemoveFirst();
//        newConcept.printList();
        System.out.println(newConcept.get(0).value);
        System.out.println(newConcept.set(1,9).value);
        newConcept.printList();
    }

}
