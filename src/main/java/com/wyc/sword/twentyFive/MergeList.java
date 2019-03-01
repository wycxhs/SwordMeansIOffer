package com.wyc.sword.twentyFive;

import com.wyc.sword.other.Node;

/**
 * 合并两个有序的链表,合并后仍然为有序的
 */
public class MergeList {
    public Node mergeList(Node head1,Node head2){
        if (head1==null&&head2==null){
            return null;
        }else if (head1==null){
            return head2;
        }else if (head2==null){
            return head1;
        }
        Node pHead;
        if (head1.data<=head2.data){
            pHead = head1;
            pHead.next = mergeList(head1.next,head2);
        }else {
            pHead = head2;
            pHead.next = mergeList(head1,head2.next);
        }
        return pHead;
    }
}
