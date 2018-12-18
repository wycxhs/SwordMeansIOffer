package com.wyc.sword.two;

/**
 *不修改数组,查找数组中任意一个重复的数字,采用二分法查找
 */
public class GetDuplication {
    int getDuplication(int[] numbers){
        if (numbers == null || numbers.length<=0){
            return -1;
        }
        int start = 1;//范围是1-n,所以开始是1
        int end = numbers.length-1;//结束就是n
        while (end>=start){
            int middle=0;
            if ((start+end)%2>0){
                middle=(end+start)/2+1;
            }else {
                middle=(start+end)/2;
            }
            int count = getCount(numbers, start, middle);
            if(end==start){
                if (count>1){
                    return start;
                }else {
                    break;
                }
            }
            if (count>middle-start+1){
                end = middle;
            }else {
                start = middle+1;
            }
        }
        return -1;
    }

    private int getCount(int[] numbers, int start, int end){
        int count=0;
        for (int number : numbers) {
            if (number >= start && number <= end) {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {2,3,5,4,3,2,6,7};
        GetDuplication getDuplication = new GetDuplication();
        int duplication = getDuplication.getDuplication(numbers);
        System.out.println(duplication);
    }
}
