package com.itheima.test2;

public class GirlFriendTest {
    public static void main(String[] args) {
        //创建女朋友的对象
        GirlFriend gf1 = new GirlFriend();
        gf1.name = "张三";
        gf1.age = 18;
        gf1.height = 160.5;

        System.out.println(gf1.name);
        System.out.println(gf1.age);
        System.out.println(gf1.height);


        System.out.println("===============");


        GirlFriend gf2 = new GirlFriend();
        gf2.name = "李四";
        gf2.age = 20;
        gf2.height = 160.9;

        System.out.println(gf2.name);   //将复制过来的1改成2 只需要按住鼠标滚轮往下拖动即可选中
        System.out.println(gf2.age);    //没有鼠标滚轮:按住alt键,鼠标左键拖动一样
        System.out.println(gf2.height);

        gf2.sleep(); //调用
        gf2.dine();
    }
}
