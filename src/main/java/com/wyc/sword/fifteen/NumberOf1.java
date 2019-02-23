package com.wyc.sword.fifteen;

/**
 * 二进制数字中有多少个1
 */
public class NumberOf1 {
    public int numberOf1(int number){
        int count=0;
        while(number!=0){
            count++;
            number=number&(number-1);
        }
        return count;
    }
}
