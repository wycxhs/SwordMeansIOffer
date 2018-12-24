package com.wyc.sword.four;

import java.util.Stack;

/**第六题
 * 从尾到头打印链表,用栈来实现
 */
public class PrintListReverse {
    class Node{
        private int data;
        private Node next;

        Node(int data){
            this.data=data;
        }
    }

    void printListReverse(Node head){
        if (head==null){
            System.out.println("链表为空");
        }
        Stack<Node> stack = new Stack<>();
        while(head!=null){
            stack.push(head);
            head=head.next;
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop().data+" ");
        }
    }
}
