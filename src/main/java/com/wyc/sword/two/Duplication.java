package com.wyc.sword.two;

/**
 *查找数组中是否有重复的数字,从头往后找,将位置错误的数字放回正确的位置,不断重复
 */
public class Duplication {
    private boolean duplicate(int[] numbers){
        if (numbers == null || numbers.length<=0) {
            return false;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<0){
                return false;
            }
            while(numbers[i]!=i){
                if (numbers[i]==numbers[numbers[i]]){
                    return true;
                }else {
                    int temp = numbers[i];
                    numbers[i] = numbers[temp];
                    numbers[temp] = temp;
                }
            }
        }
        return false;
    }
}
