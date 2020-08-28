package com.imooc.animal;

public class PigTest {
    public static void main(String[] args){
        Pig one = new Pig(-3);
        //测试
        one.setName("凡凡");
        //one.setMonth(-3);

        System.out.println(one.getName());
        if(one.getMonth()==0)
            return;//若不添加结束条件，那么get方法会直接获取int默认值
            //return是用来结束整个程序的，break是用来结束循环和switch语句的
//        System.out.println("年龄："+one.getMonth());
    }
}
