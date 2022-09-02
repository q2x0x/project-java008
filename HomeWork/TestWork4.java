package com.itheima.HomeWork;

public class TestWork4 {
    public static void main(String[] args) {
        CatWork4 c = new CatWork4("花色", "加菲猫");
        c.eat();
        c.catchMouse();

        DogWork4 D = new DogWork4("黑色", "藏獒");
        D.eat();
        D.lookHome();
    }
}
