package com.datastructure;

/**
 * @auther guan.c.wang
 * @date 3/9/2022.
 * @see
 */
public class Main {

    public static void main(String[] args) throws Exception {
        int[]  data = {4,9,2,7,10,12,8};
        BinaryTree binaryTree = new BinaryTree(data);
        binaryTree.insertNode(15);
        System.out.println(binaryTree.printBinaryTree());


    }
}
