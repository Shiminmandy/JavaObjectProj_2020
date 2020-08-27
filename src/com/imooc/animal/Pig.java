package com.imooc.animal;
//class capsuling intro
public class Pig {
    //修改属性的可见性--private 限定只能在当前类内访问
    private String name;

    //创建get/set方法
    //在get/set方法中添加对属性的限定
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return "我是一只名叫"+this.name+"的小猪";
    }
}
