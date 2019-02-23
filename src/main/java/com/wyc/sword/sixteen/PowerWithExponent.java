package com.wyc.sword.sixteen;

/**
 * 次方
 */
public class PowerWithExponent {
    public long powerWithExponent(long number,int exponent){
        if (exponent==0){
            return 1;
        }else if (exponent==1){
            return number;
        }
        long result=powerWithExponent(number,exponent>>1);
        result*=result;
        if (exponent%2==1){
            result=result*number;
        }
        if (exponent<0){
            result=1/result;
        }
        return result;
    }
}
