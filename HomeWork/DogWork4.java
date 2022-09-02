package com.itheima.HomeWork;

public class DogWork4 {
    private String color;
    private String bread;


    public DogWork4() {
    }

    public DogWork4(String color, String bread) {
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
    public void eat(){
        System.out.println(color + "的" + bread + "正在啃骨头");
    }
    public void lookHome(){
        System.out.println(color + "的" + bread + "lookhome");
    }
}
