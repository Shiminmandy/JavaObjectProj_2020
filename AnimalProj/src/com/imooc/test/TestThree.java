package com.imooc.test;

import com.imooc.animal.Animal;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
//use of equals
public class TestThree {
    public static void main(String[] args){
        Animal one=new Animal("花花",2);
        Animal two=new Animal("花花",2);
        /*equals:继承Object中的equals方法是，比较的是两个引用是否指向同一个对象
         *子类可以通过重写equals方法的形式，改变比较的内容
         */
        boolean flag=one.equals(two);
        System.out.println("one和two的引用比较："+flag);
        System.out.println("one和two的引用比较："+(one==two));
        System.out.println("=======================");
        String str1=new String("hello");
        String str2=new String("hello");
        boolean flag1=str1.equals(str2);
        System.out.println("str1和str2的引用比较："+flag);
        System.out.println("str1和str2的引用比较："+(str1==str2));
    }
}
/*
one和two的引用比较：false
one和two的引用比较：false
=======================
str1和str2的引用比较：false
str1和str2的引用比较：false
 */
//after rewrite equals: one和two的引用比较：true
