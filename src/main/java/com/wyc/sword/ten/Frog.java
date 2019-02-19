package com.wyc.sword.ten;

/**
 * 青蛙跳台阶,一次跳1层或者2层,则n层有多少种跳法
 */
public class Frog {
    static int frog(int n){
        if (n<=0){
            return -1;
        }
        if (n==1){
            return 1;
        }else if (n==2){
            return 2;
        }
        int one=1;
        int two=2;
        int m=0;
        for (int i = 3; i <=n ; i++) {
            m=one+two;
            one=two;
            two=m;
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println(frog(5));
    }
}
