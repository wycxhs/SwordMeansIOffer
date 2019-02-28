package com.wyc.sword.twentyTwo;

/**
 * 查找链表第K个数
 */
public class FindKthToTail {
    private Node head;

    public FindKthToTail(){
        head = null;
    }

    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node findKthToTail(int k){
        if (k<=0){
            return null;
        }
        Node begin = null;
        Node end = head;
        for (int i = 0; i < k - 1; i++) {
            end = end.next;
        }
        end = head;
        while(end.next!=null){
            end=end.next;
            begin=begin.next;
        }
        return begin;
    }
}
