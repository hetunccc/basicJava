package com.itheima.basicdemo1;

public class MethodDemo {
    public static void main(String[] args) {
        playGame();//meet method in method
        int spring = getSum(10,20,30);
        int summer = getSum(20,30,40);
        int autoun = getSum(30,40,50);
        int winter = getSum(10,5,1);
        int season = spring + summer + autoun + winter;
        System.out.println(season);
    }
    public static void playGame(){
        System.out.println("choose char!");
        System.out.println("beat me!");
        System.out.println("beat you!");
        System.out.println("beat he!");
        System.out.println("beat she!");
    }
    public  static int getSum(int sum1,int sum2,int sum3){
        int result = sum1 + sum2 + sum3;
        return result;
    }
}
