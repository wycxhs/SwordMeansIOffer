package com.wyc.sword.other;

/**
 * 归并排序
 */
public class Merge {
    //合并两个数组,并排序
   static int[] merge(int[] arrayA,int[] arrayB){
        int sizeA=arrayA.length;
        int sizeB=arrayB.length;
        if (sizeA+sizeB<=0){
            return null;
        }
        int[] arrayC=new int[sizeA+sizeB];
        int dexA=0;
        int dexB=0;
        int dexC=0;
        while(dexA<sizeA&&dexB<sizeB){
            if (arrayA[dexA]<arrayB[dexB])
                arrayC[dexC++]=arrayA[dexA++];
            else
                arrayC[dexC++]=arrayB[dexB++];
        }
        while (dexA<sizeA){
            arrayC[dexC++]=arrayA[dexA++];
        }
        while (dexB<sizeB){
            arrayC[dexC++]=arrayB[dexB++];
        }
        return arrayC;
    }

    public static void main(String[] args) {
//        int[] arrayA={23,47,81,95};
//        int[] arrayB={7,14,39,55,62,74};
//        int[] arrayC=merge(arrayA,arrayB);
//        if (arrayC!=null){
//            for (int c:arrayC){
//                System.out.println(c);
//            }
//        }else {
//            System.out.println("数组为空");
//        }
        int[] array={7,14,39,55,62,74,23,47,81,95};
        int[] sort = mergeSort(array, 0, array.length - 1);
        for (int i = 0; i < sort.length; i++) {
            System.out.println(sort[i]);
        }
    }

    //归并排序
   static int[] mergeSort(int[] array,int low,int high){
       if (low<high){
           int mid=(low+high)/2;
           mergeSort(array,low,mid);
           mergeSort(array,mid+1,high);
           mergeTwo(array,low,mid,high);
       }
       return array;
    }

    static void mergeTwo(int[] array,int low,int mid,int high){
       int[] temp=new int[high-low+1];
       int dexLow=low;
       int dexTemp=0;
       int dexMid=mid+1;
       while(dexLow<=mid&&dexMid<=high){
           if (array[dexLow]<array[dexMid])
               temp[dexTemp++]=array[dexLow++];
           else
               temp[dexTemp++]=array[dexMid++];
       }
       while(dexLow<=mid){
           temp[dexTemp++]=array[dexLow++];
       }
       while (dexMid<=high){
           temp[dexTemp++]=array[dexMid++];
       }
        for (int i = 0; i < temp.length; i++) {
            array[low+i]=temp[i];
        }
    }
}
