package com.imooc.test;
import com.imooc.model.Department;

public class ManagementTest {
    public static void main(String[] args){
        //实例化company类
        Department com1 = new Department("人事部", "D001");
        System.out.println(com1.info());
    }

}
