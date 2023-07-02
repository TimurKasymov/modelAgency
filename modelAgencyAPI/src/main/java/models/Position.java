package models;

import jakarta.persistence.Entity;

@Entity
public class Position extends BaseModelWithName{
    private String description;

    public Position(String name, String description) {
        super(name);
        this.description = description;
    }

    public Position() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
