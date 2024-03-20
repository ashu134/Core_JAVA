package com.ashu.DSA.TreeNode;

public class TreeSearch {
    class Node {
         int value;
         Node left;
         Node right;

        Node(int value){
            this.value= value;
        }
    }

    Node root;

    public TreeSearch(int value){
        Node newNode = new Node(value);
        root = newNode;
    }
}
