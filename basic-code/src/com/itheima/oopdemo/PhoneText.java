package com.itheima.oopdemo;

public class PhoneText {
    public static void main(String[] args) {
       Phone p  = new Phone();

       p.brand = "xiaomi";
       p.price = 1999.92;
       System.out.println(p.brand);
       System.out.println(p.price);

       p.call();
       p.playGame();
    }
}
