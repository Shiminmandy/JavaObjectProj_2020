package com.imooc.animal;
//单一职责(功能)原则
//有且只有一个引起功能变化的原因
public class CatTest {
    public static void main(String[] args){
        //另开一个类用main方法进行对象实例化操作
        //类名 自取名=new 类名()
        Cat one=new Cat();
        Cat two=new Cat();//开辟另一个空间
        //Cat two=one; one的信息会被two的操作完全覆盖掉
        //one.run();
        one.eat();
        //测试  重新赋值
        one.name="小白";
        one.month=6;
        one.weight=1600;
        one.species="英国短毛猫";
        two.name="小白";
        two.month=6;
        two.weight=1600;
        two.species="英国短毛猫";
        //调用属性时不加括号，调用方法时加括号
        System.out.println("年龄："+one.month);
        System.out.println("体重："+one.weight);
        System.out.println("品种："+one.species);
        System.out.println("昵称："+one.name);
        System.out.println("--------------------");
        System.out.println("年龄："+two.month);
        System.out.println("体重："+two.weight);
        System.out.println("品种："+two.species);
        System.out.println("昵称："+two.name);
        //小猫快跑！
        //小猫吃鱼。
        //年龄：6
        //体重：1600.0
        //品种：英国短毛猫
        //昵称：小白
        one.run("小白");
        //小白快跑！

        //匿名对象进行方法调用
        new Cat().run();
    }
}
