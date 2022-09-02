package com.itheima.test5;

public class Student {
    private String name;
    private int age;
    //如果我们自己没有写任何的构造方法
    //虚拟机会给我们构造一个空参的方法

    //空参
    public Student() {
        System.out.println("我必然执行呀!");
    }

    //有参
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


