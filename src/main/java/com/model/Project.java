package com.model;

/**
 * 项目模型
 */
public class Project {
    private Integer teid;
    private String pjname;
    private double pjprice;
    private String prid;

    public Project() {

    }

    public Project(Integer teid, String pjname, double pjprice, String prid) {
        this.teid = teid;
        this.pjname = pjname;
        this.pjprice = pjprice;
        this.prid = prid;
    }

    public Integer getTeid() {
        return teid;
    }

    public void setTeid(Integer teid) {
        this.teid = teid;
    }

    public String getPjname() {
        return pjname;
    }

    public void setPjname(String pjname) {
        this.pjname = pjname;
    }

    public double getPjprice() {
        return pjprice;
    }

    public void setPjprice(double pjprice) {
        this.pjprice = pjprice;
    }

    public String getPrid() {
        return prid;
    }

    public void setPrid(String prid) {
        this.prid = prid;
    }

    @Override
    public String toString() {
        return "Project{" +
                "teid=" + teid +
                ", pjname='" + pjname + '\'' +
                ", pjprice=" + pjprice +
                ", prid='" + prid + '\'' +
                '}';
    }
}
