package models;

import java.util.Date;

public class Staff extends BaseModelWithName {

    private String sureName;
    private Date birthDate;
    private Sex sex;

    public Staff(String name, String sureName, Date birthDate, Sex sex) {
        super(name);
        this.sureName = sureName;
        this.birthDate = birthDate;
        this.sex = sex;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date date) {
        birthDate = date;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
