package com.wyc.sword.twenty;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 判断一个数值是否正确
 */
public class IsNumeric {
    int index = 0;
    public boolean isNumberic(String[] array){
        if (array==null||array.length==0) {
            return false;
        }
        boolean numberic = scanInteger(array);
        if (index<array.length&&array[index].equals(".")){
            index++;
            numberic = scanUnInteger(array)||numberic;
        }
        if (index<array.length&&array[index].equals("e")||index<array.length&&array[index].equals("E")){
            index++;
            numberic = scanUnInteger(array)&&numberic;
        }
        return numberic&&index>=array.length;
    }

    private boolean scanInteger(String[] array){
        if (array[index].equals("+")||array[index].equals("-")){
            index++;
        }
        return scanUnInteger(array);
    }

    private boolean scanUnInteger(String[] array){
        int inx = 0;
        while (index<array.length&&isInteger(array[index]) && Integer.valueOf(array[index]) <= 9 && Integer.valueOf(array[index]) >= 0) {
            index++;
        }
        return index>inx;
    }

    public boolean isInteger(String str) {
        for (int i = 0; i < str.length(); i++){
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] array = {"3",".","1","4","6"};
        IsNumeric isNumeric = new IsNumeric();
        boolean numberic = isNumeric.isNumberic(array);
        System.out.println(numberic);
    }
}
