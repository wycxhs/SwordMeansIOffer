package com.wyc.sword.other;

/**
 * 双向链表
 */
public class TwoWayLinkedList {
    private Node head;
    private Node tail;
    private int size;

    TwoWayLinkedList(){
        head=null;
        tail=null;
        size=0;
    }

    private class Node{
        private Object data;
        private Object prev;
        private Object next;

        Node(Object data){
            this.data=data;
        }
    }

    void addHead(Object data){
        Node node = new Node(data);
        if (size==0){
            head=node;
            tail=node;
            size++;
        }else {
            head.prev=node;
            node.next=head;
            head=node;
            size++;
        }
    }
}
