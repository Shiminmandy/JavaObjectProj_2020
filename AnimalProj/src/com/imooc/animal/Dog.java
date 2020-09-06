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

    public void sleep(){
        System.out.println(this.getName()+"现在"+this.getMonth()+"个月大，它在睡觉");
    }
}
