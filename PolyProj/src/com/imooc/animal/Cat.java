package com.imooc.animal;

public class Cat extends Animal {
    //属性： 体重
    private double weight;
    public Cat(){

    }

    public Cat(String name,int month,double weight){
        super(name,month);
        this.weight=weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //方法：跑动
    public void run(){
        
    }
}