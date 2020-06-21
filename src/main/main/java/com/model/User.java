package com.model;

import java.util.Date;

/**
 * 用户模型
 */
public class User {
    private Integer uid;
    private String uname;
    private String upwd;
    private String udate;
    private String wid;
    private String prid;

    public User() {

    }

    public User(Integer uid, String uname, String upwd, String udate, String wid, String prid) {
        this.uid = uid;
        this.uname = uname;
        this.upwd = upwd;
        this.udate = udate;
        this.wid = wid;
        this.prid = prid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUdate() {
        return udate;
    }

    public void setUdate(String udate) {
        this.udate = udate;
    }

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid;
    }

    public String getPrid() {
        return prid;
    }

    public void setPrid(String prid) {
        this.prid = prid;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", udate='" + udate + '\'' +
                ", wid='" + wid + '\'' +
                ", prid='" + prid + '\'' +
                '}';
    }
}
