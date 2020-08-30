package com.imooc.animal;


//static+类--》不存在
//static+方法内局部变量--》不存在
public class Book {
    //私有属性：书名、作者、出版社、价格
    private String name,author,copyRight;
    private double price;

    //static: 静态 静态成员、类成员
    //static+属性--》静态属性、类属性
    public static int amount;//数量

    //通过构造方法实现属性赋值
    public Book(String name,String author,String copyRight,double price){
        this.name=name;
        this.author=author;
        this.setCopyRight(copyRight);
        this.setPrice(price);
    }
    /*通过公有的get/set方法实现属性的访问，其中：
    1、限定图书价格必须大于10，如果无效需进行提示，并强制赋值为10
    2、限定作者、书名均为只读属性
    */
    public String getName(){

        return "书名："+this.name;//虽然this可以省略，但为了以后其他语言学习，都加上this
    }


    public String getAuthor(){
        return "作者："+this.author;
    }


    public String getCopyRight(){
        return "出版社："+this.copyRight;
    }

    public void setCopyRight(String copyRight){
        this.copyRight=copyRight;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        if(price<10){
            System.out.println("图书价格最低10元");
            this.price=10;
        }else{
            this.price=price;
        }
    }
    //信息介绍方法，描述图书所有信息

    //static+方法--》类方法、静态方法
    //在成员方法中，可以直接访问类中静态成员
    //静态方法中不能直接访问同一个类中的非静态成员，只能直接调用静态成员
    //静态方法中不能使用this
    public static void display(){
        System.out.println("以下为图书信息：");
    }

    public void info(){
        System.out.println(getName());
        System.out.println(getAuthor());
        System.out.println(getCopyRight());
        System.out.println("价格："+getPrice()+"元");
    }
}
