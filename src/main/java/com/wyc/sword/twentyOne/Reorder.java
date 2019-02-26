package com.wyc.sword.twentyOne;

/**
 * 排序，奇数放在偶数之前
 */
public class Reorder {
    public int[] reorder(int[] array){
        if (array==null||array.length==0){
            return null;
        }
        int begin=0;
        int end=array.length-1;
        while(begin<end){
            while (begin<end&&!checkNumber(array[begin])){
                begin++;
            }
            while (begin<end&&checkNumber(array[end])){
                end--;
            }
            if (begin<end){
                int temp = array[begin];
                array[begin]=array[end];
                array[end]=temp;
            }
        }
        return array;
    }

    private boolean checkNumber(int number){
        return (number&1)==0;
    }

    public static void main(String[] args) {
        int[] array = {2,4,1,3};
        Reorder reorder = new Reorder();
        int[] ints = reorder.reorder(array);
        for (int i:ints) {
            System.out.println(i);
        }
    }
}
