package com.ashu.DSA.Queuepkg;

public class Queue {
    private Node first;
    private Node last;
    private int length;
    public Queue(int value){
        Node newNode = new Node(value);
        this.first = newNode;
        this.last = newNode;
        this.length=1;
    }

    class Node{
        int value;
        Node  next;
        public  Node(int value){
            this.value = value;

        }
    }
    public void printQueue(){
        Node temp = first;
        if(length ==0 ){
            System.out.println("Queue is empty");
            return;
        }
        while (temp!= null){
            System.out.print(temp.value +" ");
            temp= temp.next;
        }
        System.out.println("\n");
    }
    public void getLength(){
        System.out.println("Length : "+ length);
    }
    public void getFirst(){
        System.out.println("First: "+ first.value);
    }
    public  void  getLast(){
        System.out.println("Last : "+ last.value);
    }
    public void enqueue(int value){
        Node newNode = new Node(value);
        if(length ==0){
            first = newNode;
        }else {
            last.next= newNode;
        }
        last = newNode;
        length++;
    }

    public Node deequeue(){
        if(length ==0) return null;
        Node temp = first;
        if (length == 1){
            first = null;
            last = null;
        }else{
            first= first.next;
            temp.next= null;
        }
        return temp;
    }

}
