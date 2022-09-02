package com.itheima.test5;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象

        //调用的空参构造
        Student s1 = new Student();

        ////调用有参构造
        Student s2 = new Student("张三", 20);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
    }
}
