package com.itheima.basicdemo1;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        //机票价格 淡季旺季 头等舱 经济舱收费 输入机票原价 月份和头等舱和经济舱
        // 旺季 5-10 月 头等舱9折 经济舱8.5折 淡季 11-4月 头等舱7折 经济舱6.5折
        Scanner sc = new Scanner(System.in);
        System.out.println("please ticket ");
        int ticket = sc.nextInt();
        System.out.println("please mouth ");
        int mouth = sc.nextInt();
        System.out.println("please seat ");
        int seat = sc.nextInt();
        if (mouth >= 5 && mouth <= 10){
            if (seat == 0){
                ticket = (int) (ticket*0.9);
            } else if (seat == 1) {
                ticket = (int)(ticket * 0.85);

            }
        }else if ((mouth >= 1 && mouth <= 4) || (mouth >= 11 &&mouth <= 12)){
            if (seat == 0){
                ticket = (int) (ticket*0.7);
            } else if (seat == 1) {
                ticket = (int)(ticket * 0.65);

            }else {
                System.out.println("no seat");
            }
        }else {
            System.out.println("erro mouth");
        }
        System.out.println(ticket);
    }
}
