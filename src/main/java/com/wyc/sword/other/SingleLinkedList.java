package com.wyc.sword.other;

/**
 * 单链表
 */
public class SingleLinkedList {
    private int size;//链表节点的个数
    private Node head;//头结点

    public SingleLinkedList(){
        size=0;
        head=null;
    }

    //链表的每个节点类
    private class Node{
        private Object data;//每个节点的数据
        private Node next;//每个节点指向下一个节点的链接

        Node(Object data){
            this.data = data;
        }
    }

    //在链表头添加元素
    public Object addHead(Object obj){
        Node newHead = new Node(obj);
        if (size==0){
            head=newHead;
        }else {
            head.next=head;
            head=newHead;
        }
        size++;
        return obj;
    }

    //在链表头删除元素
    public Object deleteHead(){
        Object obj = head.data;
        head=head.next;
        size--;
        return obj;
    }

    //查找指定的元素
    public Node find(Object obj){
        Node current = head;
        int tempSize = size;
        while(tempSize>0){
            if (obj.equals(current.data)){
                return current;
            }else {
                current=current.next;
            }
            tempSize--;
        }
        return null;
    }

    public boolean delete(Object obj){
        if (size==0){
            return false;
        }
        Node current=head;
        Node previous=head;
        while (!current.data.equals(obj)){
            if (current.data==null){
                return false;
            }else {
                previous=current;
                current=current.next;
            }
        }
        if (current==head){
            head=current.next;
            size--;
        }else {
            previous.next=current.next;
            size--;
        }
        return true;
    }

    public String display(){
        int tempSize=size;
        Node current=head;
        if (tempSize==0){
            return "{}";
        }else if (tempSize==1){
            return "{"+current.data+"}";
        }
        String str=null;
        while(current!=null){
            if (current==head){
                str="{"+current.data;
            }else if (current.next==null){
                str=str+current.data+"}";
            }else {
                str=str+current.data+"->";
            }
            current=current.next;
        }
        return str;
    }


}
