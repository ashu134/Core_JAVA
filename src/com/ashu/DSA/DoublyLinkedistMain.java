package com.ashu.DSA;

public class DoublyLinkedistMain {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(23);
        doublyLinkedList.prepend(100);
        //doublyLinkedList.getLength();
        doublyLinkedList.printList();
        //System.out.println(doublyLinkedList.removeLast().value);
        //System.out.println("First value removed : "+doublyLinkedList.removeFirst().value);
       // doublyLinkedList.printList();
        //System.out.println(doublyLinkedList.get(10).value);
        System.out.println();
        System.out.println(doublyLinkedList.remove(1).value);
        doublyLinkedList.printList();

    }
}
