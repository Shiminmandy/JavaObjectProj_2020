package com.imooc.animal;
//在Dog类中，定义run方法，方法参数为Dog类型对象。call方法中，调用run方法，并通过this指代，传入当前对象。
//Dog类型对象就是Dog one的one
public class DogTest {
    public static void main(String[] args){
        Dog one=new Dog();
        one.name="花花";
        one.call();
        //昵称为：花花的小猫在奔跑
    }
}
