package com.itheima.stringdemo;

import java.util.Scanner;

public class StringBuilderTest1 {
    public static void main(String[] args) {
        int len = getString().substring(1).replace("a","b").length();  //鏈式編程
        System.out.println(len);
    }
    public static  String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("qingshuruzifuchuan");
        String str = sc.next();
        return str;
    }
}

