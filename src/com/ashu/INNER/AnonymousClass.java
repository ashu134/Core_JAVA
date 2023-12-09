package com.ashu.INNER;

public class AnonymousClass {
    public static void main(String[] args) {

    }

    public void State(){
        System.out.println("Bihar");
    }
    public void Capital(){
        System.out.println("Patna");
    }
}
class StateAndCapital{
    public static void main(String[] args) {
        AnonymousClass anonymousClass=new AnonymousClass();
        anonymousClass.State();
        anonymousClass.Capital();  // Normal way of Call
        AnonymousClass anonymousClass1=new AnonymousClass(){
            public void State(){
                System.out.println("Karnataka");
            }
            public void Capital(){
                System.out.println("Bengaluru");
            }
        };
        anonymousClass1.State();
        anonymousClass1.Capital(); //Anonymous class call
        System.out.println(anonymousClass.getClass().getName()); //AnonymousClass
        System.out.println(anonymousClass1.getClass().getName()); //StateAndCapital$1
    }
}
