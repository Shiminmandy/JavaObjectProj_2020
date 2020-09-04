package com.imooc.model;

public class Department {
    //成员属性：所在部门、职务
    private String departmentName;
    private String departmentNo;
    private Employee[] employee;
    private Employee[] employee2;
    private int employeeNum1;
    private int employeeNum2;

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

    public Employee[] getEmployee() {
        if(this.employee==null)
            this.employee=new Employee[10];
        return employee;
    }

    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }

    public Employee[] getEmployee2() {
        if(this.employee2==null)
            this.employee2=new Employee[10];
        return employee2;
    }

    public void setEmployee2(Employee[] employee2) {
        this.employee2 = employee2;
    }

    public int getEmployeeNum1() {
        return employeeNum1;
    }

    public void setEmployeeNum1(int employeeNum1) {
        this.employeeNum1 = employeeNum1;
    }

    public int getEmployeeNum2() {
        return employeeNum2;
    }

    public void setEmployeeNum2(int employeeNum2) {
        this.employeeNum2 = employeeNum2;
    }

    public String info(){
        String str="职务："+this.getDepartmentName()+"\n工号："+this.getDepartmentNo();
        return str;
    }

    public void addEmployee(Employee a){
        for(int i=0;i<this.getEmployee().length;i++){
            if(this.getEmployee()[i]==null){
                this.getEmployee()[i]=a;
                this.employeeNum1=i+1;
                return;
            }
        }
    }

    public void addEmployee2(Employee b){
        for(int i=0;i<this.getEmployee2().length;i++){
            if(this.getEmployee2()[i]==null){
                this.getEmployee2()[i]=b;
                this.employeeNum2=i+1;
                return;
            }
        }
    }
}
