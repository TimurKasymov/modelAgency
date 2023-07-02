package models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private int id;

    @CreationTimestamp
    private LocalDateTime creatingTime;

    public BaseModel(LocalDateTime creatingTime) {
        this.creatingTime = creatingTime;
    }

    public BaseModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getCreatingTime() {
        return creatingTime;
    }
}
