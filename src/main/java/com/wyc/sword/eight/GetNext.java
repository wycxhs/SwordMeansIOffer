package com.wyc.sword.eight;

/**
 * 找出二叉树的下一个节点
 * 已知该节点的左右节点和父节点
 */
public class GetNext {
    class Node{
        private String data;
        private Node leftChild;
        private Node rightChild;
        private Node parent;
        Node(Node node){
           this.data=node.data;
           leftChild=null;
           rightChild=null;
           parent=null;
        }
    }

    Node getNext(Node node){
        if (node==null){
            return null;
        }
        if (node.rightChild!=null){
            node=node.rightChild;
            while (node.leftChild!=null){
                node=node.leftChild;
            }
            return node;
        }else if (node.parent!=null){
           if (node.parent.rightChild==node){
                while(node.parent!=null&&node.parent.rightChild==node){
                    node=node.parent;
                }
            }
            return node.parent;
        }
        return null;
    }
}
