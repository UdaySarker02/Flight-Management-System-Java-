package Classes;

public class Crew extends Person {

    public Crew(String name, String NID, String contactNumber) {
        super(name, NID, contactNumber);
    }

    public void showDetails() {
        System.out.println("Name : " + super.getName());
        System.out.println("NID : " + super.getNID());
        System.out.println("Contact Number : " + super.getContactNumber());
    }
    
}
