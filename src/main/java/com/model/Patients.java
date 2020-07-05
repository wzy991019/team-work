package com.model;

public class Patients {
    private Integer bid;
    private String bname;
    private String finame;
    private String bresult;
    private Integer cid;
    private String prid;
    private String uname;

    public Patients() {
    }

    public Patients(Integer bid, String bname, String finame, String bresult, Integer cid, String prid, String uname) {
        this.bid = bid;
        this.bname = bname;
        this.finame = finame;
        this.bresult = bresult;
        this.cid = cid;
        this.prid = prid;
        this.uname = uname;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getFiname() {
        return finame;
    }

    public void setFiname(String finame) {
        this.finame = finame;
    }

    public String getBresult() {
        return bresult;
    }

    public void setBresult(String bresult) {
        this.bresult = bresult;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getPrid() {
        return prid;
    }

    public void setPrid(String prid) {
        this.prid = prid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Override
    public String toString() {
        return "Patients{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", finame='" + finame + '\'' +
                ", bresult='" + bresult + '\'' +
                ", cid=" + cid +
                ", prid='" + prid + '\'' +
                ", uname='" + uname + '\'' +
                '}';
    }
}
