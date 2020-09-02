package com.imooc.test;
import com.imooc.model.Student;
import com.imooc.model.Subject;
public class SchoolTest {

    public static void main(String[] args){//test
        Subject sub1 = new Subject("计算机科学与应用", "J001", 4);
        //如果年限输入为负数，则会返回int默认值
        System.out.println(sub1.info());
        Student stu1=new Student("S01","张三","男",18,sub1);
        System.out.println(stu1.introduction());
        Student stu2=new Student("S02","李四","女",17);
        System.out.println(stu2.introduction("计算机科学与应用",4));
        Student stu3=new Student("S03","王五","男", 18);
        System.out.println(stu3.introduction(sub1));
    }
}
