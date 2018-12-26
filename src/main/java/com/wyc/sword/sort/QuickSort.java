package com.wyc.sword.sort;

/**
 * 快速排序
 */
public class QuickSort {
    private int[] array=new int[9];
    private int ele;

    void insert(int element){
        array[ele]=element;
        ele++;
    }

    void quickSort(){
        recQuickSort(0,ele-1);
    }

    void recQuickSort(int left,int right){
        if (left>=right){
            return;
        }else {
            int pivot=array[right];
            int partition=partitionIt(left,right,pivot);
            recQuickSort(left,partition-1);
            recQuickSort(partition+1,right);
        }
    }

    int partitionIt(int left,int right,long pivot){
        int leftPtr=left-1;
        int rightPtr=right;
        while (true){
            while (array[++leftPtr]<pivot){}
            while (rightPtr>0&&array[--rightPtr]>pivot){}
            if (leftPtr>=rightPtr){
                break;
            }else {
                swap(leftPtr,rightPtr);
            }
        }
        swap(leftPtr,right);
        return leftPtr;
    }

    void swap(int dex1,int dex2){
        int temp=array[dex1];
        array[dex1]=array[dex2];
        array[dex2]=temp;
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        quickSort.insert(2);
        quickSort.insert(5);
        quickSort.insert(4);
        quickSort.insert(3);
        quickSort.insert(6);
        quickSort.insert(9);
        quickSort.insert(7);
        quickSort.insert(10);
        quickSort.insert(13);
        quickSort.quickSort();
        for (int a:quickSort.array){
            System.out.println(a);
        }
    }

}
