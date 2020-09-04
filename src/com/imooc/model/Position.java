package com.imooc.model;

public class Position {
    //成员属性：职务编号、职务名称
    private String PositionNo;
    private String positionName;

    //无参构造
    public Position(){

    }

    //带参构造，实现职务编号、职务名称属性赋值
    public Position(String positionNo,String positionName){
        this.setPositionNo(positionNo);
        this.setPositionName(positionName);
    }

    public String getPositionNo() {
        return this.PositionNo;
    }

    public void setPositionNo(String positionNo) {
        PositionNo = positionNo;
    }

    public String getPositionName() {
        return this.positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String introPositon(){
        String str="职务编号："+this.getPositionNo()+"\n职务名称:"+this.getPositionName();
        return str;
    }
}
