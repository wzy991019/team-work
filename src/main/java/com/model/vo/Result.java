package com.model.vo;

public class Result {
    private Integer rid;
    private String rresult;
    private String prid;
    private String cid;
    private String cname;
    private String uname;

    public Result() {
    }

    public Result(Integer rid, String rresult, String prid, String cid, String cname, String uname) {
        this.rid = rid;
        this.rresult = rresult;
        this.prid = prid;
        this.cid = cid;
        this.cname = cname;
        this.uname = uname;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRresult() {
        return rresult;
    }

    public void setRresult(String rresult) {
        this.rresult = rresult;
    }

    public String getPrid() {
        return prid;
    }

    public void setPrid(String prid) {
        this.prid = prid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Override
    public String toString() {
        return "Result{" +
                "rid=" + rid +
                ", rresult='" + rresult + '\'' +
                ", prid='" + prid + '\'' +
                ", cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                ", uname='" + uname + '\'' +
                '}';
    }
}
