package com.imooc.animal;

public class UserTest {
    // 测试方法
    public static void main(String[] args) {
        //实例化对象，调用相关方法实现运行效果
        User u1=new User("Lucy","123456");
        User u2=new User("Mike","123456");

        u1.info();
        u2.info();
        System.out.println("=================");

        UserManager um=new UserManager();
        System.out.println(um.checkUser(u1,u2));
    }
}
/*
用户名：Lucy
密码：123456
用户名：Mike
密码：123456
=================
用户名和密码不一致
 */