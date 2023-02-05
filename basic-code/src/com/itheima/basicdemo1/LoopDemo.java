package com.itheima.basicdemo1;

public class LoopDemo {
    public static void main(String[] args) {
        for (int a = 1;a <= 5; a++){
            System.out.println("Hallo,World!");
        }
        int b = 0;
        for (int c = 1;c <= 5; c++ ){
            System.out.println(c);
            b = b + c;// sum += b;
        }
        System.out.println(b);
    }
}
