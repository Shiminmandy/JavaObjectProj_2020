package com.imooc.model;

/**
 * 专业类
 */
public class Subject {
    //成员属性：学科名称、学科编号、学制年限、报名选修的学生信息、报名选修的学生个数
    private String subjectName;
    private String subjectNo;
    private int subjectLife;
    private Student[] myStudents;
    private int studentNum;
    //无参构造方法
    public Subject(){

    }

    //带参构造，实现对学科名称、编号、学制年限的赋值
    public Subject(String subjectName,String subjectNo,int subjectLife){
        //this.subjectName=subjectName;若在set方法里有逻辑操作，这种属性赋值是没办法进行验证的，不建议用
        this.setSubjectName(subjectName);
        this.setSubjectNo(subjectNo);
        this.setSubjectLife(subjectLife);
    }

    //带参构造，实现对全部属性赋值
    public Subject(String subjectName,String subjectNo,int subjectLife,Student[] myStudents){
        //this.subjectName=subjectName;若在set方法里有逻辑操作，这种属性赋值是没办法进行验证的，不建议用
        this.setSubjectName(subjectName);
        this.setSubjectNo(subjectNo);
        this.setSubjectLife(subjectLife);
    }

    public void setSubjectName(String subjectName){
        this.subjectName=subjectName;
    }

    public String getSubjectName(){
        return this.subjectName;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public String getSubjectNo() {
        return this.subjectNo;
    }

    //设置学制年限，限制必须大于0
    public void setSubjectLife(int subjectLife) {
        if(subjectLife<=0) {
            return;
        }
        this.subjectLife = subjectLife;
    }

    public int getSubjectLife() {
        return this.subjectLife;
    }

    /**
     *获取选修专业的学生信息，如果保存学生信息的数组未被初始化，则先初始化
     * @return 保存学生信息的数组
     */
    public Student[] getMyStudents() {
        if(this.myStudents==null)
            this.myStudents=new Student[200];
        return this.myStudents;
    }

    public void setMyStudents(Student[] myStudents) {
        this.myStudents = myStudents;
    }

    /**
     * 专业介绍的方法
     * @return 专业介绍的相关信息，包括名称、编号、年限
     */
    public String info(){
        String str="专业信息如下：\n专业名称："+this.getSubjectName()+"\n专业编号："
                +this.getSubjectNo()+"\n学制年限："+this.getSubjectLife();
        return str;
    }
}
