package com.imooc.model;

/**
 * 专业类
 */
public class Subject {
    //成员属性：学科名称、学科编号、学制年限
    private String subjectName;
    private String subjectNo;
    private int subjectLife;

    //无参构造方法
    public Subject(){

    }

    //带参构造，实现对属性的全部赋值
    public Subject(String subjectName,String subjectNo,int subjectLife){
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
     * 专业介绍的方法
     * @return 专业介绍的相关信息，包括名称、编号、年限
     */
    public String info(){
        String str="专业信息如下：\n专业名称："+this.getSubjectName()+"\n专业编号："
                +this.getSubjectNo()+"\n学制年限："+this.getSubjectLife();
        return str;
    }
}
