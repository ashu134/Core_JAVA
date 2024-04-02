package com.ashu.DSA.treenode;

public class TreeSearch {
    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    Node root;

    public TreeSearch(int value) {
        Node newNode = new Node(value);
        root = newNode;
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) {
                return false;
            }
            if (newNode.value < temp.value) { //means it will go to left side of tree
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {  // Means Right side of tree will be iterated
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int node) {
        if (root == null) return false;
        Node temp = root;
        int count = 0;
        while (temp != null) {
            count++;
            if (node == temp.value) {
                System.out.println("No of iteration :  " + count);
                return true;

            }
            if (node < temp.value) { //means it will go to left side of tree
                temp = temp.left;
            } else {  // Means Right side of tree will be iterated
                temp = temp.right;
            }
        }
        return false;
    }
}
