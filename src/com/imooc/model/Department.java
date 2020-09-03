package com.imooc.model;

public class Department {
    //成员属性：所在部门、职务
    private String departmentName;
    private String departmentNo;

    //无参构造
    public Department(){

    }

    //带参构造，实现对所在部门、职务属性赋值
    public Department(String departmentName, String departmentNo){
        this.setDepartmentName(departmentName);
        this.setDepartmentNo(departmentNo);
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(String departmentNo) {
        this.departmentNo = departmentNo;
    }

    public String info(){
        String str="职务："+this.getDepartmentName()+"\n工号："+this.getDepartmentNo();
        return str;
    }
}
