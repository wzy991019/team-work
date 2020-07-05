package com.model;

/**
 * 套餐模型
 */
public class Team {
    private Integer teid;
    private String tname;

    public Team() {

    }

    public Team(Integer teid, String tname) {
        this.teid = teid;
        this.tname = tname;
    }

    public Integer getTeid() {
        return teid;
    }

    public void setTeid(Integer teid) {
        this.teid = teid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teid=" + teid +
                ", tname='" + tname + '\'' +
                '}';
    }
}
