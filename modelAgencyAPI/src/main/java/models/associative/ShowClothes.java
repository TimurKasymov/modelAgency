package models.associative;

import models.*;

public class ShowClothes extends BaseModel{
    private ShowModel showModel;
    private Clothes clothes;

    public ShowClothes(ShowModel showModel, Clothes clothes) {
        this.showModel = showModel;
        this.clothes = clothes;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public ShowModel getShowModel() {
        return showModel;
    }

    public void setShowModel(ShowModel showModel) {
        this.showModel = showModel;
    }
}
