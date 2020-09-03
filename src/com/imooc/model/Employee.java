package com.imooc.model;

public class Employee {
    //成员属性：员工姓名、工号、性别、年龄
    private String employeeName;
    private String employeeNo;
    private String employeeGender;
    private int employeeAge;

    public Employee(){

    }

    public Employee(String employeeName,String employeeNo,String employeeGender,int employeeAge){
        this.setEmployeeName(employeeName);
        this.setEmployeeNo(employeeNo);
        this.setEmployeeGender(employeeGender);
        this.setEmployeeAge(employeeAge);
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeNo() {
        return this.employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getEmployeeGender() {
        return this.employeeGender;
    }

    /**
     * 限定员工性别只能为男或女
     * @param employeeGender 传入的员工性别
     */
    public void setEmployeeGender(String employeeGender) {
        if("男".equals(employeeGender)||"女".equals(employeeGender))
            this.employeeGender = employeeGender;
        else
            return;
    }

    public int getEmployeeAge() {
        return this.employeeAge;
    }

    /**
     * 限定员工年龄只能是18-65之间，反之则设置默认值为18岁
     * @param employeeAge 传入的员工年龄
     */
    public void setEmployeeAge(int employeeAge) {
        if(employeeAge<18||employeeAge>65)
            this.employeeAge=18;
        else
            this.employeeAge = employeeAge;
    }
}
