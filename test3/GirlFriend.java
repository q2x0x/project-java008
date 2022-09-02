package com.itheima.test3;

public class GirlFriend {
    //属性:
    private String name;
    private int age;
    private double height;


    //private: 保护程序的安全性;


    //针对每一个私有化的成员变量,都要提供get和set方法
    //set方法:给成员变量赋值
    //get方法:对外提供成员变量的值

    //作用:给成员变量name进行赋值
    public void setName(String name) {
        //局部变量表示测试类中的方法传递过来的数据
        //等号左边,表示成员的位置的name
        this.name = name;
    }

    //作用:对外提供name属性
    public String getName() {
        return name;
    }

    //age
    //setAge:给成员变量age赋值
    //getAge:对外提供成员变量age的值
    public void setAge(int a) {  //一开始将public写成了private
        if (age >= 18 && age <= 25) {
            this.age = age;
        } else {
            System.out.println("不合适!!!");
        }
    }

    public int getAge() {
        return age;
    }

    //gender
    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    //行为:
    public void sleep() {
        System.out.println("在睡觉");
    }

    public void dine() {
        System.out.println("在吃饭");
    }

    public void playFame() {
        System.out.println("在打游戏");
    }
}
