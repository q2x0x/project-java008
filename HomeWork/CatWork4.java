package com.itheima.HomeWork;

public class CatWork4 {
    /*
    * 定义猫类Cat。属性:毛的颜色color，品种breed。行为:吃饭eat()，抓老鼠catchMouse()
    * 定义狗类Dog。属性:毛的颜色color，品种breed。行为:吃饭()，看家lookHome() 要求:
    * ​ 1.按照以上要求定义Cat类和Dog类,属性要私有,生成空参、有参构造，set和get方法​
    *  2.定义测试类,在main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)​

    *  3.调用成员方法,打印格式如下:

    花色的波斯猫正在吃鱼.....
    花色的波斯猫正在逮老鼠....
    黑色的藏獒正在啃骨头.....
    黑色的藏獒正在看家.....

    * 训练提示
    类中的属性就是成员变量，类中的行为功能就是成员方法。
    成员变量要被private修饰。

    解题方案

    操作步骤

    * 定义猫类，定义成员变量，构造方法，set和get方法，吃饭方法eat()，抓老鼠方法catchMouse()，
    * 方法中根据题目给出的格式输出成员变量的值。

    * 定义狗类，定义成员变量，构造方法，set和get方法，吃饭方法eat()，看家方法lookHome()，
    * 方法中根据题目给出的格式输出成员变量的值。
    在测试类中使用有参构造创建猫类对象，调用eat()方法和catchMouse()方法。
    在测试类中使用有参构造创建狗类对象，调用eat()方法和lookHome()方法。*/

    //* 定义猫类Cat。属性:毛的颜色color，品种breed。行为:吃饭eat()，抓老鼠catchMouse()
    private String color;
    private String bread;

    public CatWork4() {
    }

    public CatWork4(String color, String bread) {
        this.color = color;
        this.bread = bread;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void eat() {
        System.out.println(color + "的" + bread + "正在eatfish");
    }

    public void catchMouse() {
        System.out.println(color + "的" + bread + "正在抓老鼠");
    }
}
