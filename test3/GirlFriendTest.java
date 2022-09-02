package com.itheima.test3;

public class GirlFriendTest {
    public static void main(String[] args) {
        //创建女朋友的对象
        GirlFriend gf1 = new GirlFriend();

        gf1.setName("张三");
        gf1.setHeight(165);
        gf1.setAge(20);

        System.out.println(gf1.getName());
        System.out.println(gf1.getHeight());
        System.out.println(gf1.getAge());

        gf1.sleep(); //调用
        gf1.dine();
    }
}
