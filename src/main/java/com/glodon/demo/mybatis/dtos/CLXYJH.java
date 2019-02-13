package com.glodon.demo.mybatis.dtos;

import com.glodon.demo.mybatis.models.JHLX;

import java.util.Date;

public class CLXYJH {
    private int Id;
    private String code;
    private Date bizDate;
    private JHLX jhlx;
    private String remark;

    public int getId(){
        return  this.Id;
    }

    public void setId(int Id){
        this.Id=Id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code){
        this.code=code;
    }

    public Date getBizDate(){
        return this.bizDate;
    }

    public void setBizDate(Date bizDate){
        this.bizDate=bizDate;
    }

    public JHLX getJhlx(){
        return this.jhlx;
    }

    public void setJhlx(JHLX jhlx) {
        this.jhlx = jhlx;
    }

    public String getRemark(){
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
