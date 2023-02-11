package com.itheima.arraydemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
       /*
       add boolean add(E e)
       boolean remove(E e) shanchu


        */
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        /*boolean result = list.remove("aaa");

        System.out.println(result);
        boolean result1 = list.remove("vvv");
        System.out.println(result1);

        String str = list.remove(2);
        System.out.println(str);*/
        /*
        String result = list.set(1,"ppp");
        System.out.println(result);

        String s = list.get(0);
        System.out.println(s);*/

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }
    }
}
