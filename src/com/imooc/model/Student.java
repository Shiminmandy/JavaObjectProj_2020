package com.imooc.model;

public class Student {
    //成员属性：学号、姓名、性别、年龄
    private String studentNo;
    private String studentName;
    private String studentGender;
    private int studentAge;

    //无参构造
    public Student(){

    }

    //多参构造，实现对全部属性的赋值
    public Student(String studentNo,String studentName,String studentGender,int studentAge){
        this.setStudentNo(studentNo);
        this.setStudentName(studentName);
        this.setStudentGender(studentGender);
        this.setStudentAge(studentAge);
    }

    public String getStudentNo() {
        return this.studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentGender() {
        return this.studentGender;
    }

    public void setStudentGender(String studentGender) {
        //限制性别只能是男或女,反之，赋值为男
//        if(studentGender=="男"||studentGender=="女")
        //用equals()进行对象内容比较更好
        if("男".equals(studentGender)||"女".equals(studentGender))
            this.studentGender = studentGender;
        else
            this.studentGender="男";
    }

    /**
     * 给年龄赋值，限定必须在10--100之间，反之赋值为18
     * @return studentAge传入的年龄
     */
    public int getStudentAge() {
        return this.studentAge;
    }

    public void setStudentAge(int studentAge) {
        if(studentAge<10||studentAge>100)
            this.studentAge=18;
        else
            this.studentAge = studentAge;
    }

    /**
     * 学生自我介绍的方法
     * @return 自我介绍的信息，包括姓名、学号、性别、年龄
     */
    public String introduction(){
        String str="学生信息如下：\n姓名："+this.getStudentName()+"\n学号："+this.getStudentNo()
                +"\n性别："+this.getStudentGender() +"\n年龄："+this.getStudentAge();
        return str;
    }

    /**
     * 学生自我介绍的方法(方法1)
     * @param subjectName 所学专业名称
     * @param subjectLife 学制年限
     * @return 自我介绍的信息，包括姓名、学号、性别、年龄、所报专业、学制年限
     */
    public String introduction(String subjectName,int subjectLife){
        String str="学生信息如下：\n姓名："+this.getStudentName()+"\n学号："+this.getStudentNo()
                +"\n性别："+this.getStudentGender() +"\n年龄："+this.getStudentAge()+
                "\n所报专业："+subjectName+"\n学制年限："+subjectLife;
        return str;
    }

    /**
     * 学生自我介绍的方法(方法2)
     * @param mySbuject 所选专业的对象
     * @return 自我介绍的信息，包括姓名、学号、性别、年龄、所报专业、学制年限
     */
    public String introduction(Subject mySbuject){//传入一个subject类型的对象
        String str="学生信息如下：\n姓名："+this.getStudentName()+"\n学号："+this.getStudentNo()
                +"\n性别："+this.getStudentGender() +"\n年龄："+this.getStudentAge()+
                "\n所报专业："+mySbuject.getSubjectName()+"\n学制年限："+mySbuject.getSubjectLife();
        return str;
    }
}
