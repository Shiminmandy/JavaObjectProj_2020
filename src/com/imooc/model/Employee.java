package com.imooc.model;

public class Employee {
    //成员属性：员工姓名、工号、性别、年龄、所属部门、职务信息
    private String employeeName;
    private String employeeNo;
    private String employeeGender;
    private int employeeAge;
    private Department employeeDepartment;
    private Position employeePosition;

    public Employee(){

    }

    public Employee(String employeeName,String employeeNo,String employeeGender,int employeeAge
            ,Department employeeDepartment,Position employeePosition){
        this.setEmployeeName(employeeName);
        this.setEmployeeNo(employeeNo);
        this.setEmployeeGender(employeeGender);
        this.setEmployeeAge(employeeAge);
        this.setEmployeeDepartment(employeeDepartment);
        this.setEmployeePosition(employeePosition);
    }

    public Department getEmployeeDepartment() {
        if(this.employeeDepartment==null)
            this.employeeDepartment=new Department();
        return this.employeeDepartment;
    }

    public void setEmployeeDepartment(Department employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public Position getEmployeePosition() {
        if(this.employeePosition==null)
            this.employeePosition=new Position();
        return employeePosition;
    }

    public void setEmployeePosition(Position employeePosition) {
        this.employeePosition = employeePosition;
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

    public String intro(){
        String str="姓名："+this.getEmployeeName()+"\n工号："+this.getEmployeeNo()+"\n性别："+this.getEmployeeGender()
                +"\n年龄:"+this.getEmployeeAge()+"\n职务："+this.getEmployeeDepartment().getDepartmentName()
                +this.getEmployeePosition().getPositionName();
        return str;
    }
}
