package com.itheima.HomeWork;

public class work1 {
        /*定义手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性，
          有打电话call()和sendMessage()两个功能。

        请定义出手机类，类中要有空参、有参构造方法，set/get方法。

        定义测试类，在主方法中使用空参构造创建对象，使用set方法赋值。

        调用对象的两个功能，打印效果如下：

        正在使用价格为3998元黑色的小米手机打电话....
        正在使用价格为3998元黑色的小米手机发短信....

        训练提示
        类中的属性就是成员变量，类中的行为功能就是成员方法。
        成员变量要被private修饰。

        解题方案

        操作步骤
        定义手机类，手机类中定义String类型的品牌，int类型的价格，String类型的颜色，三个成员变量都用privice修饰。
        提供空参构造方法和有参构造方法。

        提供set/get方法。
        编写打电话的成员方法，方法中对成员变量进行使用。
        编写发短信的成员方法，方法中对成员变量进行使用。
        在测试类中创建手机对象，使用set方法赋值，分别调用各个方法。
        */

    //属性
    private String brand;
    private int price;
    private String color;

    public work1() {
    }

    public work1(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void call() {
        System.out.println("正在使用价格为" + price + "元的" + color + brand + "手机给对象打电话");
    }

    public void sendMessage() {
        System.out.println("正在使用价格为" + price + "元的" + color + brand + "手机给对象发短信");
    }

}

