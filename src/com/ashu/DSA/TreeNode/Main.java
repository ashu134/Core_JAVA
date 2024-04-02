package com.ashu.DSA.treenode;

public class Main {
    public static void main(String[] args) {
        TreeSearch ts = new TreeSearch(100);
        System.out.println("TreeRoot : " + ts.root.value);
        ts.insert(90);
        ts.insert(80);
        ts.insert(65);
        ts.insert(85);
        ts.insert(110);
        ts.insert(111);
        ts.insert(112);
        System.out.println(ts.root.left.left.right.value);
        System.out.println(ts.contains(111));

    }
}
