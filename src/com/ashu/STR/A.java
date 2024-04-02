package com.ashu.STR;

class A {
    String name = "A";

    String display() {
        return "this is A";
    }
}

class B extends A {
    String name = "B";

    String display() {
        return "This is B";
    }
}

class inheritance_demo {
    public static void main(String[] args) {
        A obj = new B();
        System.out.println(obj.name + " " + obj.display());
    }
}
