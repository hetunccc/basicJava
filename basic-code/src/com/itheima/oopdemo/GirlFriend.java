package com.itheima.oopdemo;

public class GirlFriend {
    private  String name;
    private  int age;
    private  String gender;

    public void setAge(int age) {
        if (age >= 18 && age < 50){
            this.age = age;
        }

    }

    public int getAge() {
        return age;
    }
}
