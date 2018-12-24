package com.wyc.sword.other;

/**
 * 二叉搜索树(或者叫查找树)
 */
public class BinaryTree {
    private Node root;

    BinaryTree(){
        root=null;
    }

    private class Node{
        private int data;
        private Node leftChild;
        private Node rightChild;

        Node(int data){
            this.data=data;
        }
    }

    //中序遍历
    void infixOrder(Node current){
        if (current!=null){
            infixOrder(current.leftChild);
            System.out.println(current.data+" ");
            infixOrder(current.rightChild);
        }
    }

    //前序遍历
    void preOrder(Node current){
        if (current!=null){
            System.out.println(current.data+" ");
            preOrder(current.leftChild);
            preOrder(current.rightChild);
        }
    }

    //后序遍历
    void postOrder(Node current){
        if (current!=null){
            postOrder(current.leftChild);
            postOrder(current.rightChild);
            System.out.println(current.data+" ");
        }
    }

    //删除节点,该节点是叶子节点
    boolean deleteOne(int data){
        if (root==null){
            return false;
        }
        Node parent=root;
        Node current=root;
        boolean isleft=false;
        while(current.data!=data){
            parent=current;
            if (current.data>data){
                isleft=true;
                current=current.leftChild;
            }else {
                isleft=false;
                current=current.rightChild;
            }
            if (current==null){
                return false;
            }
        }
        //该节点是叶子节点
        if (current.leftChild==null&&current.rightChild==null){
            if (current==root){
                root=null;
            }else if (isleft){
                parent.leftChild=null;
            }else {
                parent.rightChild=null;
            }
        }

        //该节点有一个子节点
        if (current==root){
            root=null;
        }else if (isleft){
            if (current.leftChild!=null){
                parent.leftChild=current.leftChild;
            }else {
                parent.leftChild=current.rightChild;
            }
        }else {
            if (current.leftChild!=null){
                parent.rightChild=current.leftChild;
            }else {
                parent.rightChild=current.rightChild;
            }
        }
        return true;
    }

    //该节点有两个子节点
    void deleteTwo(Node delNode){
        Node successorParent=delNode;
        Node successor=delNode;
        Node current=delNode.rightChild;
        while(current!=null){
            successorParent=successor;
            successor=current;
            current=current.leftChild;
        }
        if (successor!=delNode.rightChild){
            successorParent.leftChild=successor.rightChild;
            successor.rightChild=delNode.rightChild;
        }
    }
}
