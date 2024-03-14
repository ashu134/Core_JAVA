package com.ashu.DSA.Queuepkg;

public class Main {
    public static void main(String[] args) {
        Queue newQuew = new Queue(99);
        newQuew.enqueue(100);
        newQuew.enqueue(101);
        newQuew.enqueue(102);
        newQuew.deequeue();
        newQuew.enqueue(103);
        newQuew.printQueue();
        newQuew.getLength();
        newQuew.getFirst();
        newQuew.getLast();

    }
}
