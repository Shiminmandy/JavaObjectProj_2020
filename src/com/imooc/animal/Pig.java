package com.imooc.animal;
//class capsuling intro
public class Pig {
    //修改属性的可见性--private 限定只能在当前类内访问
    private String name;
    private int month;
    private double weight;
    private String species;

    public Pig(int month){
//        this.month=month;
        this.setMonth(month);//在本类中调用本类的普通方法，可以不使用this，直接进行调用
    }
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month<=0)
            System.out.println("输入信息有误，年龄必须大于0");
        else
            this.month = month;
    }




    //创建get/set方法
    //在get/set方法中添加对属性的限定
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return "我是一只名叫"+this.name+"的小猪";
    }
}
