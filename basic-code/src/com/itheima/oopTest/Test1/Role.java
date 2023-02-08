package com.itheima.oopTest.Test1;

import java.util.Random;

public class Role {
    private int blood;
    private String name;

    public Role() {
    }

    public Role(int blood, String name) {
        this.blood = blood;
        this.name = name;
    }

    /**
     * 获取
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public void attack(Role role){
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        int remainBoold = role.getBlood() - hurt;

        remainBoold = remainBoold < 0 ? 0 : remainBoold;
        role.setBlood(remainBoold);
        System.out.println(this.getName() + "hold on the hand and beat" + role.getName() + "once" +
                "on" + hurt + "shanghai,haishengxiale" + remainBoold + "blood");
    }
}
