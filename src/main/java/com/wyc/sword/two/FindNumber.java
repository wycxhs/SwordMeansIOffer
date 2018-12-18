package com.wyc.sword.two;

/**
 * 查找二维数组中的数字
 */
public class FindNumber {
    String findNumber(int[][] numbers,int number){
        if (numbers==null || numbers.length<=0){
            return "数组为空";
        }
        if (numbers[0].length<=0){
            return "数组不是二维数组";
        }else {
            int row=0;
            int column=numbers[0].length-1;
            while (row<numbers.length&&column>=0){
                if (number==numbers[row][column]){
                    return (row+1)+"行"+(column+1)+"列";
                }else if (number>numbers[row][column]){
                    row++;
                }else {
                    column--;
                }
            }
            return "数组中没有这个数字";
        }
    }

    public static void main(String[] args) {
        int[][] numbers = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int number = 7;
        FindNumber findNumber = new FindNumber();
        String result = findNumber.findNumber(numbers, number);
        System.out.println(result);
    }
}
