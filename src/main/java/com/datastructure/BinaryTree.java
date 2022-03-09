package com.datastructure;

/**
 * @auther guan.c.wang
 * @date 3/9/2022.
 * @purpose according to the given an array numbers , to print the binary tree graph
 */
public class BinaryTree {
    private Node[] tree;

    public BinaryTree(int[] array) throws Exception {
        int len = array.length;
        tree = new Node[len];
        for (int i = 0; i < len; i++) {
            tree[i] = new Node(array[i], null, null);
            if (i == 0) {
                continue;
            }
            setNode(tree[0], tree[i]);
//            if (i == 0) {
//               continue;
//            } else {
//                second:
//                for (int j = 0; j < i; j++) {
//                    if (array[i] > array[j] & tree[j].getRight() == null) {
//                        tree[j].setRight(tree[i]);
//                        break second;
//                    } else if (array[i] < array[j] & tree[j].getLeft() == null) {
//                        tree[j].setLeft(tree[i]);
//                        break second;
//                    } else {
//                        continue;
//                    }
//                }
//            }
        }
    }


    public void setNode(Node firstNode, Node node) throws Exception {

        if (node.getData() > firstNode.getData() && firstNode.getRight() == null) {
            firstNode.setRight(node);
        } else if (node.getData() > firstNode.getData() && firstNode.getRight() != null) {
            setNode(firstNode.getRight(), node);
        } else if (node.getData() < firstNode.getData() && firstNode.getLeft() == null) {
            firstNode.setLeft(node);
        } else if (node.getData() < firstNode.getData() && firstNode.getLeft() != null) {
            setNode(firstNode.getLeft(), node);
        } else {
            throw new Exception("the same value");
        }

    }


    public String printBinaryTree() {
        StringBuffer sb = new StringBuffer();
        for (Node n : tree) {
            sb.append("\n");
            sb.append(n.toString());
        }
        return sb.toString();

    }
}


class Node {
    private Integer data;
    private Node left;
    private Node right;

    public Node(Integer data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    @Override
    public String toString() {

        StringBuffer sb = new StringBuffer();
        sb.append("Node{" +
                "data=" + data +
                ", left=");
        if (left != null && left.getData() != null) {
            sb.append(left.data.toString());
        } else {
            sb.append("NULL");
        }

        sb.append(",right=");
        if (right != null && right.getData() != null) {
            sb.append(right.data.toString());
        } else {
            sb.append("NULL");
        }

        return sb.toString();
    }
}