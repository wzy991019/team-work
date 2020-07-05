package com.model;

/**
 * 用户状态模型：启用或禁用
 */
public class UserStatus {
    private String uname;

    private Integer userStatus;


    public UserStatus() {

    }

    public UserStatus(String uname,Integer userStatus) {
        this.uname = uname;
        this.userStatus = userStatus;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public String toString() {
        return "UserStatus{" +
                "uname='" + uname + '\'' +
                ", userStatus=" + userStatus +
                '}';
    }
}
