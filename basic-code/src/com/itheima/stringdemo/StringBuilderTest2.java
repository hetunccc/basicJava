package com.itheima.stringdemo;

import java.util.Scanner;

public class StringBuilderTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("qingshuruzifuchuan");
        String str = sc.next();

        String result = new StringBuilder().append(str).reverse().toString();

        if (str.equals(result)){
            System.out.println("dangqianzifuchuanshiduicheng");
        }else {
            System.out.println("dangqianzifuchuanbushiduicheng");
        }
    }
}

