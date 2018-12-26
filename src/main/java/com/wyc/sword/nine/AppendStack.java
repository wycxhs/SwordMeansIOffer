package com.wyc.sword.nine;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 用两个队列实现栈
 */
public class AppendStack {
    private Queue<Integer> queue1=new ArrayDeque<>();
    private Queue<Integer> queue2=new ArrayDeque<>();

    void add(int data){
        queue1.add(data);
    }

    int delete(){
        if (queue1.size()<=0){
            return -1;
        }
        if (queue2.size()<=0) {
            while (queue1.size()>1) {
                Integer remove = queue1.remove();
                queue2.add(remove);
            }
        }
        return queue1.remove();
    }

    public static void main(String[] args) {
        AppendStack appendStack = new AppendStack();
        appendStack.add(1);
        appendStack.add(2);
        appendStack.add(3);
        System.out.println(appendStack.delete());
    }
}
