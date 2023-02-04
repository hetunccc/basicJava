package com.itheima.basicdemo1;

public class ArithmeticoperatorDemo {
    public static void main(String[] args) {
        //+
        System.out.println(2 + 3);
        //-
        System.out.println( 3- 2);
        //*
        System.out.println(2 * 2);

        //小数が計算する場合
        System.out.println(1.2 + 3.5);
        System.out.println(9.2 - 1.2);
        System.out.println(2.3 * 21.1);


        //   /
        System.out.println(10 / 2);
        System.out.println(10 / 3);

        //%
        System.out.println(10%3);
        //byte--short--int-long--float--double　　　(btye short char  int に自動転換)
        //強制転換  範囲大ーーー＞範囲小さ
        double a = 12.3;
        int b =(int)a;
        System.out.println("123" + 123 );
        System.out.println(1 + 99 + "12123");

        int x = 10;
        int y = x++; //先にｘの値を使って、ｙに値を挙げる　
        int z = ++x;
        System.out.println(x);//12
        System.out.println(y);//10
        System.out.println(z);//12
    }
}
