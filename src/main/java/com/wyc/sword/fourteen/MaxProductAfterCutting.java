package com.wyc.sword.fourteen;

/**
 * 剪绳子，要求每段长度的乘积最大，求最大值
 */
public class MaxProductAfterCutting {
    /**
     * 动态规划实现，时间复杂度O(n^2),空间复杂度O(n)
     */
    public int maxProductAfterCutting_solution1(int length){
        if (length<=1){
            return 0;
        }else if (length==2){
            return 1;
        }else if (length==3){
            return 2;
        }
        int[] product=new int[length+1];
        product[0]=0;
        product[1]=1;//这里的1表示一段，是裁剪后的段数为1
        product[2]=2;
        product[3]=3;
        int max;
        for (int i = 4; i <=length; i++) {
            max=0;
            for (int j = 1; j <=i/2; j++) {
                int pro=product[j]*product[i-j];
                if (pro>max){
                    max=pro;
                    product[i]=max;
                }
            }
        }
        return product[length];
    }

    /**
     * 贪婪算法，时间和空间复杂度都为O(1)
     */
    public int maxProductAfterCutting_solution2(int length){
        if (length<2){
            return 0;
        }else if (length==2) {
            return 1;
        }else if (length==3){
            return 2;
        }
        int timeOf3=length/3;
        if (length-3*timeOf3==1){
            timeOf3-=1;
        }
        int timeOf2=(length-3*timeOf3)/2;
        return (3^timeOf3)*(2^timeOf2);
    }
}
