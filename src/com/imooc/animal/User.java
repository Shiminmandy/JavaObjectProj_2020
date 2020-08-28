package com.imooc.animal;

public class User {
    //定义属性用户名、密码
    private String name;
    private String password;
    /*
    在一个java类中如果没有写构造方法，JVM(Java虚拟机)会默认添加一个无参构造方法；但是当写了有参构造后，JVM(Java虚拟机)
    不会再默认添加一个，如果只写了一个带参构造，假如有一个子类继承了它，一般子类的无参构造默认去调用的是
    父类的无参构造(而此时父类并没有无参构造)，这个时候就会报错了。
     */
    public User(){

    }

    /**
     * 构造方法
     * @param name 用户名
     * @param password 密码
     */
    public User(String name,String password){
        this.setName(name);
        this.setPassword(password);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public void info(){
        System.out.println("用户名："+this.getName());
        System.out.println("密码："+this.getPassword());
    }
}
