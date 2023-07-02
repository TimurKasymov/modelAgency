package models;

import java.time.LocalDateTime;

public class Clothes extends BaseModelWithName {
    private LocalDateTime supplyDate;
    private Sex clothesSex;

    public Clothes(String name, LocalDateTime supplyDate, Sex clothesSex) {
        super(name);
        this.supplyDate = supplyDate;
        this.clothesSex = clothesSex;
    }

    public LocalDateTime getSupplyDate() {
        return supplyDate;
    }

    public void setSupplyDate(LocalDateTime supplyDate) {
        this.supplyDate = supplyDate;
    }

    public Sex getClothesSex() {
        return clothesSex;
    }

    public void setClothesSex(Sex clothesSex) {
        this.clothesSex = clothesSex;
    }
}
