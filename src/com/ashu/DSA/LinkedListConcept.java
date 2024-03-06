package com.ashu.DSA;

public class LinkedListConcept {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    public void AppendNode(int value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;

    }
    public void printList(){
        if(length==0){
            System.out.println("List is empty");
            return;
        }
        Node temp= head;
        while (temp != null){
            System.out.print(temp.value);
            System.out.print(" ");
            temp=temp.next;
        }

    }
    public void getHead(){
        System.out.println("Head : "+ head.value);
    }
    public void getTail(){
        System.out.println("Tail : "+ tail.value);
    }
    public void getLength(){
        System.out.println("length : "+ length);
    }
    public LinkedListConcept(int value){
        Node newNode= new Node(value);
        head = newNode;
        tail= newNode;
        length= 1;
    }
    public Node RemoveLast(){
        if (length==0){
            return null;
        }
        Node temp=head;
        Node pre= head;
        while (temp.next != null){
            pre=temp;
            temp=temp.next;
        }
        tail= pre;
        tail.next=null;
        length--;

        if(length==0){
            tail = null;
            head = null;
        }
        return temp;
    }
    public void prepend(int value){
        Node newLink= new Node(value);
        if(length==0){
            head = newLink;
            tail = newLink;
        }else {
            newLink.next = head;
            head= newLink;

        }
        length++;
    }
    public Node RemoveFirst(){
        Node temp = head;
        if (length==0){
            return null;
        }else{
            temp.next= head;
        }
        length--;
        return temp;
    }

    public Node get(int index){
        if(index<0 || index>length){
            return null;
        }
        Node temp= head;
        for(int i=0; i<index; i++){
                temp= temp.next;
        }
        return temp;
    }
    public Node set(int index, int value){
        Node temp =get(index);
        if(temp != null){
            temp.value= value;
            return temp;
        }else {
            return null;
        }
    }

}
