package com.itheima.basicdemo1;

import java.util.Scanner;

public class OrderDemo {
    public static void main(String[] args) {
        int wine = 1;
        if (wine >= 2){
            System.out.println("いい子だ");
        }
        if (wine >= 2){
            System.out.println("いい子だ");
        }else{
            System.out.println("悪い子だ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("please put in one code");
        int money = sc.nextInt();
        if (money >= 1000){
            System.out.println("Eat youtube resturant");
        }else {
            System.out.println("Eat KFC");
        }
        if (money >= 1000){
            System.out.println("Eat youtube resturant");
        }else if (money < 1000) {
            System.out.println("Eat KFC");
        }
        else {
            System.out.println("eat cupnuddles" );
        }
    }
}
