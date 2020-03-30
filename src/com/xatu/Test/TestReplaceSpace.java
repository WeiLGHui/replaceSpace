package com.xatu.Test;

/**
 * @Auther WeiLGHui
 * @Date 2020-03-30 13:57
 */
public class TestReplaceSpace {
    /**
     * 方式1：使用replace方法  直接替换
     * @param str
     * @return
     */
    public static String replaceSpace(StringBuffer str){
        String str1 = str.toString();
        String s = str1.replace(" ", "%20");
        System.out.println(s);
        return s;
    }
    public static String replaceSpace2(StringBuffer str){
        StringBuilder stringBuilder = new StringBuilder();
        String s = str.toString();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                stringBuilder.append("%20");
            }else{
            stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("we are family");
        //replaceSpace(stringBuffer);
        String s = replaceSpace2(stringBuffer);
        System.out.println(s);
    }
}
