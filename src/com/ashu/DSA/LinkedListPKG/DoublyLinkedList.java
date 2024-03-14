package com.ashu.DSA.LinkedListPKG;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;
    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length= 1;
    }
    class Node{
        int value;
        Node next;
        Node prev;
        Node(int value){
            this.value=value;
        }
    }

    public void getLength(){
        System.out.println("Length : "+length);
    }
    public void getHead(){
        System.out.println("Length : "+head.value);
    }
    public void getTail(){
        System.out.println("Length : "+tail.value);
    }
    public void printList(){
        if(length==0){
            System.out.println("List is empty");
            return;
        }
        DoublyLinkedList.Node temp= head;
        while (temp != null){
            System.out.print(temp.value);
            System.out.print(" ");
            temp=temp.next;
        }

    }
    public void append(int value){
        if(length==0){
            head=null;
            tail=null;
        }
        Node newNode = new Node(value);
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        length++;
    }
    public Node removeLast(){
        Node temp=tail;
        if(length==0){
            return null;
        }else if (length==1){
            head = null;
            tail = null;
            length--;
        }else {
        tail=tail.prev;
        tail.next=null;
        temp.prev=null;
        length--;
        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if (length==0){
            head = newNode;
            tail = newNode;
            length++;
        }else {
            head.prev=newNode;
            newNode.next= head;
            head = newNode;
            length++;
        }
    }
    public Node removeFirst(){
        Node temp = head;
        if(length==1){
            head= null;
            tail=null;
            length--;
        }else {
            head = head.next;
            head.prev = null;
            temp.next= null;
            length--;
        }
        return temp;
    }
    public Node get(int index){
        Node temp= head;
        if(index<0 || index >length){
            return null;
        }else {
            if (length/2>index){
            for(int i =0; i<index; i++){
                temp= temp.next;
            }}else {
                temp= tail;
                for (int i =length-1; i>index; i--){}
                temp = temp.prev;
            }

        }
        if(temp==null){
            return null;
        }
        return  temp;
    }

    public  boolean set(int index, int value){
        Node temp = get(index);
        if(temp != null){
            temp.value= value;
            return true;
        }
        return false;

    }
    public boolean insert(int index, int value){
        if(index<0 || index >length){
            return false;
        }
        Node newNode = new Node(value);
        if(index==0){
            prepend(value);
            return true;
        }else if(index==length){
            append(value);
            return true;
        }else {
            Node temp = get(index-1);
            newNode.next = temp.next;
            temp.next.prev = newNode;
            temp.next = newNode;
            newNode.prev = temp;
            length++;
            return true;
        }
    }
    public Node remove(int index){
        if(index<0 || index >length){
            return null;
        }
        if(index==0){
            return removeFirst();
        }else if(index==length-1){
            return removeLast();
        }else {
            Node temp = get(index-1);
            temp.next = temp.next.next;
            temp.next.prev = temp;
            length--;
            return temp;
        }
    }

}
