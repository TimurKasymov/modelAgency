package models.associative;

import models.*;

public class ShowModel extends BaseModel {
    private Show show;
    private Model model;

    public ShowModel(Show show, Model model) {
        this.show = show;
        this.model = model;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
