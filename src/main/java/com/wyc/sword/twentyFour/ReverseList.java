package com.wyc.sword.twentyFour;

import com.wyc.sword.other.Node;

/**
 * 反转链表
 */
public class ReverseList {
    public Node reverseList(Node head){
        if (head==null){
            return null;
        }
        Node pre = null;
        Node pNode = head;
        Node reverseHead = null;
        while(pNode!=null){
            Node pNext = pNode.next;
            if (pNext==null){
                reverseHead = pNode;
            }
            pNode.next = pre;
            pre = pNode;
            pNode = pNext;
        }
        return reverseHead;
    }
}
