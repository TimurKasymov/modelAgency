package models;

public class Sponsor extends BaseModelWithName {
    private String address;
    private String contact;


    public Sponsor(String name, String address, String contact) {
        super(name);
        this.address = address;
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
