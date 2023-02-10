package com.itheima.stringdemo;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        sb.append(1);// 添加
        sb.reverse();// 反轉




        System.out.println(sb);//屬性值
        String str = sb.toString();//變回字符串
        System.out.println(sb);
    }
}
