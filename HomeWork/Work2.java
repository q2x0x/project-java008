package com.itheima.HomeWork;

public class Work2 {
         /*
         * 定义一个女朋友类。女朋友的属性包含：
         * 姓名，身高，体重。行为包含：洗衣服wash()，做饭cook()。
         * 另外定义一个用于展示三个属性值的show()方法。
         * 请在测试类中通过有参构造方法创建对象并赋值，
         * 然后分别调用展示方法、洗衣服方法和做饭方法。


         * 打印效果如下：

        我女朋友叫凤姐,身高155.0厘米,体重130.0斤
        女朋友帮我洗衣服
        女朋友给我做饭

        * 训练提示
        类中的属性就是成员变量，类中的行为功能就是成员方法。
        成员变量要被private修饰。
        展示方法的作用就是打印姓名、身高、体重三个成员变量的值。

        * 解题方案

       * 操作步骤
        定义女朋友类，定义String类型姓名，double类型身高和double类型体重三个成员变量，三个成员变量都用privice修饰。
        提供空参构造方法和有参构造方法。
        提供set/get方法。
        编写展示方法show()，方法打印三个成员变量的值。
        编写洗衣服wash()方法，输出洗衣服的语句。
        编写做饭cook()方法，输出做饭的语句。
        在测试类中使用有参构造创建女友对象，分别调用各个方法。*/


    private String name;
    private double height;
    private int heavy;

    public Work2() {
    }

    public Work2(String name, double height, int heavy) {
        this.name = name;
        this.height = height;
        this.heavy = heavy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getHeavy() {
        return heavy;
    }

    public void setHeavy(int heavy) {
        this.heavy = heavy;
    }

    public void wash() {
        System.out.println("帮我洗衣服");
    }

    public void cook() {
        System.out.println("帮我做饭");
    }

    public void show() {
        System.out.println("她叫" + name + "身高" + height + "米" + "体重" + heavy + "斤");
    }
}
