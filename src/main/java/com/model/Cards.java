package com.model;

import java.util.Date;

/**
 * 建卡--开单模型
 */
public class Cards {
    private Integer cid;
    private String cardsid;
    private String cname;
    private Date cdate;
    private String sex;
    private Integer age;
    private String telephone;
    private double cprice;
    private Integer teid;
    private String prid;
    private String state;

    public Cards() {

    }

    public Cards(Integer cid, String cardsid, String cname, Date cdate, String sex, Integer age, String telephone, double cprice, Integer teid, String prid, String state) {
        this.cid = cid;
        this.cardsid = cardsid;
        this.cname = cname;
        this.cdate = cdate;
        this.sex = sex;
        this.age = age;

        this.telephone = telephone;
        this.cprice = cprice;
        this.teid = teid;
        this.prid = prid;
        this.state = state;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCardsid() {
        return cardsid;
    }

    public void setCardsid(String cardsid) {
        this.cardsid = cardsid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public double getCprice() {
        return cprice;
    }

    public void setCprice(double cprice) {
        this.cprice = cprice;
    }

    public Integer getTeid() {
        return teid;
    }

    public void setTeid(Integer teid) {
        this.teid = teid;
    }

    public String getPrid() {
        return prid;
    }

    public void setPrid(String prid) {
        this.prid = prid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "cid=" + cid +
                ", cardsid='" + cardsid + '\'' +
                ", cname='" + cname + '\'' +
                ", cdate=" + cdate +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", telephone='" + telephone + '\'' +
                ", cprice=" + cprice +
                ", teid=" + teid +
                ", prid='" + prid + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
