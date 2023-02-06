package com.itheima.basicdemo1;

public class ArrayDemo {
    public static void main(String[] args) {
        //array 定義する
        //int [] array;
        //array　初期化
        //int[] array = new int[]{11,22,33};
        int[]array ={11,22,33};
        //double[] hight = {191,191,182,188};
       // System.out.println(array[0]);
        /*System.out.println(hight);
        for (int i = 0;i <= 5;i++){
            System.out.println(array[i]);}
        */
        for (int i = 0;i <= array.length;i++){
            System.out.println(array[i]);}
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            sum += i;
            System.out.println(sum);
        }
    }
}
