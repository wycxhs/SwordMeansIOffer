package com.wyc.sword.sort;

/**
 * 插入排序
 */
public class InsertSort {
    static int[] insertSort(int[] array){
        if (array.length<=0){
            return null;
        }
        for (int i = 1; i <array.length ; i++) {
            int temp=array[i];
            int j=i;
            while(j>0&&array[j-1]>=temp){
                array[j]=array[j-1];
                j--;
            }
            array[j]=temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array={2,5,4,3};
        int[] sort = insertSort(array);
        if (sort!=null){
            for(int a:sort){
                System.out.println(a);
            }
        }
    }
}
