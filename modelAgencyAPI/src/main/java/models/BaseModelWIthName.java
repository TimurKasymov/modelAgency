package models;

public class BaseModelWIthName extends BaseModel{
    private String name;

    public BaseModelWIthName() {
    }

    public BaseModelWIthName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
