package models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Show extends BaseModelWithName {
    private String location;
    private int winningPrize;
    private Date showDate;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Model winner;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "shows", cascade = CascadeType.ALL)
    private List<Sponsor> sponsors;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "shows", cascade = CascadeType.ALL)
    private List<Staff> staff;
    @ElementCollection
    private List<ClothesWornByModelOnShow> clothesWornByModelOnShow;

    public Show(String name, String location, int winningPrize, Date showDate, Model winner, List<Sponsor> sponsors, List<Staff> staff) {
        super(name);
        this.location = location;
        this.winningPrize = winningPrize;
        this.showDate = showDate;
        this.winner = winner;
        this.sponsors = sponsors;
        this.staff = staff;
    }

    public Show() {

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getWinningPrize() {
        return winningPrize;
    }

    public void setWinningPrize(int winningPrize) {
        this.winningPrize = winningPrize;
    }

    public Date getShowDate() {
        return showDate;
    }

    public void setShowDate(Date showDate) {
        this.showDate = showDate;
    }

    public Model getWinner() {
        return winner;
    }

    public void setWinner(Model winner) {
        this.winner = winner;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public void setSponsors(List<Sponsor> sponsors) {
        this.sponsors = sponsors;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }
}
