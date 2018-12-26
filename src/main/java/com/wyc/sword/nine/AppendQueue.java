package com.wyc.sword.nine;

import java.util.Stack;

/**
 * 两个栈实现队列
 */
public class AppendQueue {
    private Stack<Integer> stack1=new Stack<>();
    private Stack<Integer> stack2=new Stack<>();

    void push(int data){
        stack1.push(data);
    }

    int pop(){
        if (stack2.size()<=0){
            while(stack1.size()>0){
                Integer pop = stack1.pop();
                stack2.push(pop);
            }
        }
        if (stack2.empty()){
            return -1;
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        AppendQueue appendQueue = new AppendQueue();
        appendQueue.push(1);
        appendQueue.push(2);
        appendQueue.push(3);
        int pop = appendQueue.pop();
        int pop1 = appendQueue.pop();
        int pop2 = appendQueue.pop();
        System.out.println(pop);
        System.out.println(pop1);
        System.out.println(pop2);
        int pop3 = appendQueue.pop();
        System.out.println(pop3);
    }
}
