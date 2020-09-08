package com.imooc.animal;

public class Dog extends Animal{
    private String Gender;//性别

    public Dog(){

    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void sleep() {
        System.out.println(this.getName() + "现在" + this.getMonth() + "个月大，它在睡觉");
    }

        /*
         *方法重载：
         * 1.同一个类中
         * 2.方法名相同，参数列表不同（参数顺序、个数、类型）
         * 3.方法返回值、访问修饰符任意
         * 4.与方法的参数名无关
         *
         * 方法重写：
         * 1.有继承关系的子类中
         * 2.方法名相同，参数列表相同（参数顺序、个数、类型）
         * 3.与方法的参数名无关
         * 4.方法的返回值和访问修饰符是可以允许（在一定范围内）有变化的
         * 5.当方法返回值是void或基本数据类型时，必须相同；当返回值是引用类型时，可以是父类或其子类
         *
         * */


    //吃东西
    public void eat(){
        System.out.println(this.getName() + "最近没有食欲~");

    }

    public void eat(String month){
        System.out.println(month + "最近没有食欲~");
    }
}
