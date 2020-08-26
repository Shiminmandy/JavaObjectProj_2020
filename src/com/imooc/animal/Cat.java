package com.imooc.animal;
//文档注释

/**
 * 宠物猫类
 */
public class Cat {
    //成员属性：昵称、年龄、体重、品种
    String name;//昵称(默认值 null)
    int month;//年龄(默认值 0)
    double weight;//体重(默认值 0.0)
    String species;//品种(默认值 null)

    //成员方法： 跑动、吃东西
    //跑动的方法(method)
    public void run(){
        System.out.println("小猫快跑！");
    }

    //方法重载
    public void run(String name){
        System.out.println(name+"快跑！");
    }

    public Cat(){
        System.out.println("我是无参构造方法");
    }
    //吃东西的方法(method)
    public void eat(){
        System.out.println("小猫吃鱼。");
    }
}
