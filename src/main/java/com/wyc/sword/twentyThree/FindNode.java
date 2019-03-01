package com.wyc.sword.twentyThree;

import com.wyc.sword.other.Node;

/**
 * 查找链表中环的入口节点
 */
public class FindNode {
    public Node meetingNode(Node head){
        Node slow = head.next;
        Node fast = slow.next;
        while(slow!=null&&fast!=null){
            if (slow==fast){
                return fast;
            }
            slow = slow.next;
            fast = fast.next;
            if (fast!=null){
                fast = fast.next;
            }
        }
        return null;
    }

    public Node findNode(Node head){
        if (head.next==null){
            return null;
        }
        Node node = meetingNode(head);
        if (node==null){
            return null;
        }
        int loop = 1;
        while(node.next!=meetingNode(head)){
            node = node.next;
            loop++;
        }
        node = head;
        for (int i = 0; i < loop; i++) {
            node = node.next;
        }
        Node pBegin = head;
        Node pEnd = node;
        while (pBegin!=pEnd){
            pBegin = pBegin.next;
            pEnd = pEnd.next;
        }
        return pBegin;
    }
}
