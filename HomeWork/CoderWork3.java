package com.itheima.HomeWork;

public class CoderWork3 {
    private int id;
    private String name;
    private double salary;


    public CoderWork3() {
    }

    public CoderWork3(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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
    public void work(){
        System.out.println("工号为" + id + "的基本工资是" + salary  +  "的李四正在try work,写代码");
    }
}

