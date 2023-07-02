package models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
@Entity
public class Model extends BaseModelWithName {
    private String sureName;
    private Date inCompanySince;
    private Date birthDate;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(joinColumns = @JoinColumn(name = "model_id"),
            inverseJoinColumns = @JoinColumn(name = "show_id"))
    private List<Show> shows;
    @Basic(optional = false, fetch = FetchType.LAZY)
    private Sex sex;
    public Model(){
    }

    public Model(String name, String sureName, Date inCompanySince, Date birthDate, List<Show> shows, Sex sex) {
        super(name);
        this.sureName = sureName;
        this.inCompanySince = inCompanySince;
        this.birthDate = birthDate;
        this.shows = shows;
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

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}
