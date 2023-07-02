package models.associative;

import models.BaseModel;
import models.Show;
import models.Staff;

public class ShowStaff extends BaseModel {
    private Show show;
    private Staff staff;

    public ShowStaff(Show show, Staff staff) {
        this.show = show;
        this.staff = staff;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
}
