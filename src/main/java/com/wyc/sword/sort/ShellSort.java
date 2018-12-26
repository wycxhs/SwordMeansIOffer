package com.wyc.sword.sort;

/**
 * 希尔排序
 */
public class ShellSort {

    static int[] shellSort(int[] array){
        if (array.length<=0){
            return null;
        }
        int h=1;
        while (h<=array.length/3){
            h=h*3+1;
        }
        while (h>0){
            for (int i = h; i < array.length; i++) {
                int temp=array[i];
                int j=i;
                while(j>h-1&&array[j-h]>=temp){
                    array[j]=array[j-h];
                    j=j-h;
                }
                array[j]=temp;
            }
            h=(h-1)/3;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array={2,5,4,3,7,1,9,13,10};
        int[] sort = shellSort(array);
        if (sort!=null)
        for (int a:sort){
            System.out.println(a);
        }
    }

}
