package models;

import java.util.Date;

public class Show {
    private String location;
    private int winningPrize;
    private Date showDate;
    private Model winner;

    public Show(String location, int winningPrize, Date showDate, Model winner) {
        this.location = location;
        this.winningPrize = winningPrize;
        this.showDate = showDate;
        this.winner = winner;
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
}
