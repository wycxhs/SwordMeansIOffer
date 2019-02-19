package com.wyc.sword.ten;

/**
 * 斐波那契数列解法:1,1,2,3,5,8,13...
 */
public class Fibonacci {
    //时间复杂度为O(n)的方式
    static int fibonacciFirst(int n){
        if (n<=0){
            return -1;
        }
        int[] result={1,1};
        if (n<=2){
            return result[n];
        }
        int one=1;
        int two=1;
        int m=0;
        for (int i = 3; i <= n; i++) {
            m=one+two;
            two=one;
            one=m;
        }
        return m;
    }

    //时间复杂度为O(log(n))的最优解

    public static void main(String[] args) {
        System.out.println(fibonacciFirst(7));
    }
}
