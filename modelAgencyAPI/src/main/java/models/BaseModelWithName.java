package models;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;

@Entity
@MappedSuperclass
public class BaseModelWithName extends BaseModel{
    private String name;

    public BaseModelWithName() {
    }

    public BaseModelWithName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
