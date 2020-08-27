package com.imooc.animal;

public class Dog {
    //成员属性：昵称
    String name;//昵称

    public void run(Dog one){
        System.out.println("昵称为："+one.name+"的小猫在奔跑");
    }

    public void call(){
        run(this);//谁调用了call,谁就是this
    }
}
