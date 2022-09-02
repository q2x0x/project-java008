package com.itheima.test1;

public class phoneTest {
    public static void main(String[] args) {
        //创建手机的对象
        phone p = new phone();

        //给手机赋值
        p.brand = "一加";
        p.price = 2599.98;

        //获取手机对象中的值
        System.out.println(p.brand);
        System.out.println(p.price);

        p.call();
        p.playGame();
    }
}
