package com.wyc.sword.other;

/**
 * 链表
 */
public class LinkedList {
    public Node head;

    public LinkedList(){
        head=null;
    }

    public class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data=data;
        }
    }
}
