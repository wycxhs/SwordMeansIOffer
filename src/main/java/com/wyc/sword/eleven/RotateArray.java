package com.wyc.sword.eleven;

public class RotateArray {

    public static int rotateArray(int[] array){
        if (array==null || array.length<=0){
            return -1;
        }
        int index1=0;
        int index2=array.length-1;
        int indexMid=index1;
        while(array[index1]>=array[index2]){
            if (index2-index1==1){
                indexMid=index2;
                break;
            }
            indexMid=(index1+index2)/2;
            if (array[index1]==array[index2]&&array[indexMid]==array[index1]){

            }
            if (array[index1]>=array[indexMid]){
                index1=indexMid;
            }else {
                index2=indexMid;
            }
        }
        return array[indexMid];
    }

    private int minInOrder(int[] array,int index1,int index2){
        int result = array[index1];
        for (int i = index1+1; i <index2 ; ++i) {
            if (result>array[i]){
                result=array[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = null;
        int result = rotateArray(array);
        System.out.println(result);
    }
}
