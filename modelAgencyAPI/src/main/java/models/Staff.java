package models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Staff extends BaseModelWithName {

    private String sureName;
    private Date birthDate;
    @Basic(optional = false, fetch = FetchType.LAZY)
    private Sex sex;
    @OneToOne(cascade = CascadeType.ALL)
    private Position position;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(joinColumns = @JoinColumn(name = "staff_id"),
            inverseJoinColumns = @JoinColumn(name = "show_id"))
    private List<Show> shows;

    public Staff(String name, String sureName, Date birthDate, Sex sex, Position position, List<Show> shows) {
        super(name);
        this.sureName = sureName;
        this.birthDate = birthDate;
        this.sex = sex;
        this.position = position;
        this.shows = shows;
    }

    public Staff() {

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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}
