package models;

import java.util.Date;

public class Model extends BaseModelWIthName {
    private String sureName;
    private Date inCompanySince;
    private Date birthDate;
    private Sex sex;
    public Model(){
    }

    public Model(String name, String sureName, Date inCompanySince, Date birthDate, Sex sex) {
        super(name);
        this.sureName = sureName;
        this.inCompanySince = inCompanySince;
        this.birthDate = birthDate;
        this.sex = sex;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public Date getInCompanySince() {
        return inCompanySince;
    }

    public void setInCompanySince(Date inCompanySince) {
        this.inCompanySince = inCompanySince;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
