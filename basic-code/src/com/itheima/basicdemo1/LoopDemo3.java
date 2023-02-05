package com.itheima.basicdemo1;

public class LoopDemo3 {
    public static void main(String[] args) {
   /*  //   for (;;){
       //     System.out.println("1");
        //}
    //    while (true){
     //       System.out.println("1");
       // }
       // for (int i = 1;i <=5 ;i++){
        //    if (i == 3){
       //         continue;
            }
            System.out.println("tiger eat" + i + "cat");
        }
       *//* for (int a = 1;a <= 5; a++ ){
            System.out.println("tiger eat" + a + "cat");
            if (a == 3){
                break;*//*
            }
        }*/
        for (int b = 1;b <= 100;b++){
            if (b % 10 == 7 || b / 10 % 10 == 7 || b % 7 == 0){
                System.out.println("pass");
                continue;
            }
            System.out.println(b);
        }
    }
}
