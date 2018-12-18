package com.wyc.sword.three;

/**
 * 替换字符串中的空格
 */
public class ReplaceBlank {
    String replaceBlank(String str){
        if (str==null || str.length()<=0){
            return "字符串为空";
        }
        char[] chars = str.toCharArray();
        int numberOfBlank=0;
        for (char ch:chars) {
            if (ch==' '){
                numberOfBlank++;
            }
        }
        int indexOfOriginal=chars.length-1;
        int indexOfNew=chars.length-1+numberOfBlank*2;
        char[] charNew = new char[indexOfNew+1];
        while (indexOfOriginal>=0&&indexOfNew>=indexOfOriginal){
            if (chars[indexOfOriginal]==' '){
                charNew[indexOfNew]='0';
                charNew[indexOfNew-1]='2';
                charNew[indexOfNew-2]='%';
                indexOfOriginal--;
                indexOfNew = indexOfNew-3;
            }else {
                charNew[indexOfNew]=chars[indexOfOriginal];
                indexOfOriginal--;
                indexOfNew--;
            }
        }
        return new String(charNew);
    }

    public static void main(String[] args) {
        String str = "we are happy";
        ReplaceBlank replaceBlank = new ReplaceBlank();
        String result = replaceBlank.replaceBlank(str);
        System.out.println(result);
    }
}
