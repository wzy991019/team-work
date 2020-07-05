package com.model.vo;

/**
 * 科室对应的临时实体类
 */
public class Office {
    private String prid;
    private String cid;
    private String cardsid;
    private String cname;
    private String sex;
    private Integer age;
    private String telephone;
    private String finame;
    private String ficonsult;
    private String room;
    private String uname;

    public Office() {
    }

    public Office(String prid, String cid, String cardsid, String cname, String sex, Integer age, String telephone, String finame, String ficonsult, String room, String uname) {
        this.prid = prid;
        this.cid = cid;
        this.cardsid = cardsid;
        this.cname = cname;
        this.sex = sex;
        this.age = age;
        this.telephone = telephone;
        this.finame = finame;
        this.ficonsult = ficonsult;
        this.room = room;
        this.uname = uname;
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

    public String getFiname() {
        return finame;
    }

    public void setFiname(String finame) {
        this.finame = finame;
    }

    public String getFiconsult() {
        return ficonsult;
    }

    public void setFiconsult(String ficonsult) {
        this.ficonsult = ficonsult;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Override
    public String toString() {
        return "Office{" +
                "prid='" + prid + '\'' +
                ", cid='" + cid + '\'' +
                ", cardsid='" + cardsid + '\'' +
                ", cname='" + cname + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", telephone='" + telephone + '\'' +
                ", finame='" + finame + '\'' +
                ", ficonsult='" + ficonsult + '\'' +
                ", room='" + room + '\'' +
                ", uname='" + uname + '\'' +
                '}';
    }
}
