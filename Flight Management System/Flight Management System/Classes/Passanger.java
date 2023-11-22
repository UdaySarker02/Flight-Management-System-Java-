package Classes;

public class Passanger extends Person {
    String ticket;

    public Passanger(String name, String NID, String contactNumber) {
        super(name, NID, contactNumber);
    }
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
    public String getTicket() {
        return ticket;
    }
    public void showDetails() {
        System.out.println("Name : " + super.getName());
        System.out.println("NID : " + super.getNID());
        System.out.println("Contact Number : " + super.getContactNumber());
        System.out.println("Ticket : " + ticket);
    }
}
