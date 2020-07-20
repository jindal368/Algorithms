//height of binary search treee..
//Given : In this question nodes are given we have to construct a BST with that given nodes and have to calculate the height of constructed BST.

import java.util.*;
import java.io.*;

//creation of node..

class Node {
    Node left;
    Node right;
    int data;

    // constructor...
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

}

public class test {
    // claculating heigth of BST.
    public static int height(Node root) {
        if (root == null)
            return -1;
        return (height(root.left) > height(root.right) ? height(root.left) : height(root.right)) + 1;
    }

    // creating BST by givrn nodes..that returning root nodes..
    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node current;
            if (data <= root.data) {
                current = insert(root.left, data);
                root.left = current;
            } else {
                current = insert(root.right, data);
                root.right = current;
            }
            return root;
        }
    }
    // f(N) to implement..

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;
        while (n-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        // BST is created....
        int height = height(root);
        System.out.prinln(height);
        // output of height
    }

}
