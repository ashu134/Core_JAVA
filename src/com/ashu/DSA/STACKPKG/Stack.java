package com.ashu.DSA.STACKPKG;

public class Stack {
    private Node top;
    private  int height;
    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }
    class Node{
        private int value;
        Node next;
        public Node(int value){
            this.value= value;
        }
    }

    public void printStack(){
        Node first = top;
        while (first != null){
            System.out.print(first.value +" ");
            first= first.next;
        }
        System.out.print("\n");
    }

    public void getTop() {
        System.out.println("Top : "+ top.value);
    }

    public void getHeight() {
        System.out.println("Height : "+ height);
    }

    public  void push(int value){
        Node newNode = new Node(value);
        if (height == 0){
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }
    public Node pop(){
        if (height== 0) return null;
        Node temp = top;
        temp = temp.next;
        temp.next = null;
        height--;
        return temp;
    }
}
