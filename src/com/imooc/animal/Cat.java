package com.imooc.animal;
//文档注释

/**
 * 宠物猫类
 */
public class Cat {
    //成员属性：昵称、年龄、体重、品种
    String name;//昵称(默认值 null)
    static int month;//年龄(默认值 0)
    double weight;//体重(默认值 0.0)
    String species;//品种(默认值 null)


    {
        name="妞妞";
        month=12;//构造代码块中可以给普通成员赋值也可以给静态成员赋值
        System.out.println("我是一个构造代码块1");
    }//构造代码块：创建对象时调用，优先于构造方法执行

    //成员方法： 跑动、吃东西
    //跑动的方法(method)
    public void run(){
        {
            System.out.println("我是一个普通代码块");
        }//普通代码块：顺序执行，先出现，先执行
        System.out.println("小猫快跑！");
    }

    {
        System.out.println("我是一个构造方法块2");
    }
    static{
        month=10;//静态代码块只可以给静态成员赋值，若想给普通成员赋值，得先在代码块里实例化对象
        System.out.println("我是一个静态代码块");
    }//静态代码块：类加载时调用，优先于构造代码块执行
    //无论产生对少实例，静态代码块只执行一次

    //方法重载
    public void run(String name){
        System.out.println(name+"快跑！");
    }

    public Cat(){
        System.out.println("我是无参构造方法");
    }
    public Cat(String name){
        this.name=name;
        System.out.println("我是带参构造方法");
    }
    //吃东西的方法(method)
    public void eat(){
        System.out.println("小猫吃鱼。");
    }
}
