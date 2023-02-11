package com.itheima.stringdemo;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("---");
        StringJoiner sj1 = new StringJoiner("---","{","}");
        sj.add("aaa").add("bbb").add("ccc");
        sj1.add("aaa").add("bbb").add("ccc");
        System.out.println(sj);
        System.out.println(sj1);
    }
}

