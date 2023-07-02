package models;

import jakarta.persistence.Embeddable;

@Embeddable
public class ClothesWornByModelOnShow {
    private Model model;
    private Clothes clothes;

    public ClothesWornByModelOnShow(Model model, Clothes clothes) {
        this.model = model;
        this.clothes = clothes;
    }

    public ClothesWornByModelOnShow() {

    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }
}
