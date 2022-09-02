package com.itheima.HomeWork;

public class ManagerWork3 {
      /*
      * 定义项目经理类Manager。属性：姓名name，工号id，工资salary，奖金bonus。 行为：工作work()
      * 定义程序员类Coder。属性：姓名name，工号id，工资salary。                行为：工作work()

    要求：

    ​ 1.按照以上要求定义Manager类和Coder类,属性要私有,生成空参、有参构造，set和get方法
    *  2.定义测试类,在main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)​
    *  3.调用成员方法,打印格式如下:

    工号为123基本工资为15000奖金为6000的项目经理张三正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
    工号为135基本工资为10000的程序员李四正在努力的写着代码......

    * 训练提示
    类中的属性就是成员变量，类中的行为功能就是成员方法。
    成员变量要被private修饰。
    在工作work()方法中调用成员变量，输出成员变量的值。

    * 解题方案

    * 操作步骤
    定义项目经理类，定义成员变量，构造方法，set和get方法，work方法，方法中根据打印格式输出id,salary,bonus的值。
    定义程序猿类，定义成员变量，构造方法，set和get方法，work方法，方法中根据打印格式输出id和salary的值。
    在测试类中使用有参构造创建项目经理对象并赋值，调用工作方法打印结果。
    在测试类中使用有参构造创建程序员对象并赋值，调用工作方法打印结果。*/


    //  * 定义项目经理类Manager。属性：姓名name，工号id，工资salary，奖金bonus。 行为：工作work()

    private int id;
    private String name;
    private double salary;
    private double bonus;

    public ManagerWork3() {
    }

    public ManagerWork3(int id, String name, double salary, double bonus) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void work() {
        System.out.println("工号为" + id + "的基本工资是" + salary + "奖金是" + bonus +  "的项目经理张三正在try work,检查员工的代码");
    }
}

