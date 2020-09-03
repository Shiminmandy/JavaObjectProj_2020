package com.imooc.model;

public class Company {
    //成员属性：所在部门、职务
    private String department;
    private String position;

    public Company(){

    }

    public Company(String department,String position){
        this.setDepartment(department);
        this.setPosition(position);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
