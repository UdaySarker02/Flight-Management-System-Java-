package Classes;

public abstract class Person {
    private String name;
    private String NID;
    private String contactNumber;

    public Person (String name, String NID, String contactNumber) {
        this.name = name;
        this.NID = NID;
        this.contactNumber = contactNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNID(String nID) {
        NID = nID;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public String getNID() {
        return NID;
    }
    public String getName() {
        return name;
    }
    public abstract void showDetails();
}
