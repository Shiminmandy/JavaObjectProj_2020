package com.imooc.test;
import com.imooc.model.Department;
import com.imooc.model.Employee;
import com.imooc.model.Position;

public class ManagementTest {
    public static void main(String[] args){
        //实例化company类
        Department d1 = new Department("人事部", "D001");
        Department d2=new Department("市场部","D002");
        System.out.println(d1.info());
        System.out.println("=========================================");
        Position p1=new Position("P001","经理");
        Position p2=new Position("P002","助理");
        Position p3=new Position("P003","职员");
        System.out.println(p1.introPositon());
        System.out.println("=========================================");
        Employee e1=new Employee("张铭","S001","男",29,d1,p1);
        System.out.println(e1.intro());
        System.out.println("=========================================");
        Employee e2=new Employee("李艾爱","S002","女",21,d1,p2);
        System.out.println(e2.intro());
        System.out.println("=========================================");
        Employee e3=new Employee("孙超","S003","男",29,d1,p3);
        System.out.println(e3.intro());
        System.out.println("=========================================");
        Employee e4=new Employee("张美美","S004","女",26,d2,p3);
        System.out.println(e4.intro());
        System.out.println("=========================================");
        Employee e5=new Employee("蓝迪","S005","男",37,d2,p1);
        System.out.println(e5.intro());
        System.out.println("=========================================");
        Employee e6=new Employee("米莉","S006","女",24,d2,p3);
        System.out.println(e6.intro());
    }

}
