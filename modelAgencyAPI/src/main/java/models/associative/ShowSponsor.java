package models.associative;

import models.*;

public class ShowSponsor extends BaseModel {
    private Show show;
    private Sponsor sponsor;

    public ShowSponsor(Show show, Sponsor sponsor) {
        this.show = show;
        this.sponsor = sponsor;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }
}
