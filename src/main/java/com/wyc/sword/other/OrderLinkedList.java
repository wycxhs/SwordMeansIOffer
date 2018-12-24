package com.wyc.sword.other;

/**
 * 有序链表
 */
public class OrderLinkedList {
    private Node head;

    OrderLinkedList(){
        head=null;
    }

    private class Node{
        private int data;
        private Node next;

        Node(int data){
            this.data=data;
        }
    }

    boolean insert(int obj){
        Node node = new Node(obj);
        Node current=head;
        Node previous=null;
        while(current!=null&&obj>current.data){
            previous=current;
            current=current.next;
        }
        if (previous==null){
            head=node;
            head.next=current;
        }else {
            previous.next=node;
            node.next=current;
        }
        return true;
    }

    boolean deleteHead(){
        head=head.next;
        return true;
    }

    void display(){
        Node current=head;
        while(current!=null){
            if (current==head){
                System.out.println("{"+current.data);
            } else if (current.next!=null){
                System.out.println(current.data+"->");
            }else {
                System.out.println(current.data+"}");
            }
            current=current.next;
        }
    }
}
