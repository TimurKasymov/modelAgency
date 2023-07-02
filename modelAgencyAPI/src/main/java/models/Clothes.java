package models;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;

import java.time.LocalDateTime;
@Entity
public class Clothes extends BaseModelWithName {
    private LocalDateTime supplyDate;
    @Basic(optional = false, fetch = FetchType.LAZY)
    private Sex clothesSex;

    public Clothes(String name, LocalDateTime supplyDate, Sex clothesSex) {
        super(name);
        this.supplyDate = supplyDate;
        this.clothesSex = clothesSex;
    }

    public Clothes() {

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
