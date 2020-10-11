package com.imooc.test;

import com.imooc.tel.ForthPhone;

public class PhoneTest {
    public static void main(String[] args){
        ForthPhone phone=new ForthPhone();
        phone.call();
        phone.message();
        phone.vedio();
        phone.music();
        phone.photo();
        phone.network();
    }
}
