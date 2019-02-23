package com.wyc.sword.eighteen;

/**
 * 链表的操作
 */
public class LinkedList {
    private Node head;

    public LinkedList(){
        head=null;
    }

    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data=data;
        }

        public void deleteNode(Node head,Node toBeDeleteNode){
            if (toBeDeleteNode==null){
                return;
            }else if (toBeDeleteNode==head){
                toBeDeleteNode=null;
                head=null;
            }else if (toBeDeleteNode.next==null){
                Node node=head.next;
                while(node!=toBeDeleteNode){
                    node=node.next;
                }
                node=null;
            }else{
                Node next=toBeDeleteNode.next;
                toBeDeleteNode.data=next.data;
                toBeDeleteNode.next=next.next;
            }
        }
    }
}
