package com.imooc.test;//定义包
//import com.imooc.animal.*;//加载这个包下所有类
import com.imooc.animal.Sheep;//加载这个包下指定的Sheep类
import com.imooc.mechanics.*;
public class Test {
    public static void main(String[] args){
        Sheep sheep1=new Sheep();
        //直接加载想要的类
        com.imooc.mechanics.Sheep sheep2=new com.imooc.mechanics.Sheep();
        //我是牧场里的羊
        //我是机械羊
    }
}

