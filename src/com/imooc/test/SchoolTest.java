package com.imooc.test;
import com.imooc.model.Student;
import com.imooc.model.Subject;
public class SchoolTest {

    public static void main(String[] args){//test
        Subject sub1 = new Subject("计算机科学与应用", "J001", 4);
        //如果年限输入为负数，则会返回int默认值
        System.out.println(sub1.info());
        Student stu1=new Student("S01","张三","男",18);
        //因为a.setStudentSubject(this)可以去掉sbu1
        System.out.println(stu1.introduction());
        Student stu2=new Student("S02","李四","女",17);
        System.out.println(stu2.introduction("计算机科学与应用",4));
        Student stu3=new Student("S03","王五","男", 18);
        System.out.println(stu3.introduction(sub1));
        System.out.println("====================================");
        //测试指定专业学生中到底有多少学生报名
        sub1.addStudent(stu1);//因为本身数组类型就是类，所以把类放进数组没有问题
        sub1.addStudent(stu2);
        sub1.addStudent(stu3);
        System.out.println(sub1.getSubjectName()+"的专业中已有"+sub1.getStudentNum()+"学生进行了报名");
    }
}
