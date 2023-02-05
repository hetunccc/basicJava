package com.itheima.basicdemo1;

public class LoopDemo2 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100){
            System.out.println(i);
            i++;
        }//循環条件を知ってる場合
        double height = 8844430;
        double paper = 0.1;
        int count = 0;
        while(paper < height){
            paper = paper * 2;
            count++;
        }
        System.out.println(count);
    }
}
