package models;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Sponsor extends BaseModelWithName {
    private String address;
    private String contact;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(joinColumns = @JoinColumn(name = "sponsor_id"),
               inverseJoinColumns = @JoinColumn(name = "show_id"))
    private List<Show> shows;

    public Sponsor(String name, String address, String contact, List<Show> shows) {
        super(name);
        this.address = address;
        this.contact = contact;
        this.shows = shows;
    }

    public Sponsor() {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}
