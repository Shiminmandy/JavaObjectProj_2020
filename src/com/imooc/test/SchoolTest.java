package com.imooc.test;
import com.imooc.model.Subject;
public class SchoolTest {

    public static void main(String[] args){//test
        Subject sub1 = new Subject("计算机科学与应用", "J001", 4);
        //如果年限输入为负数，则会返回int默认值
        System.out.println(sub1.info());
    }
}
