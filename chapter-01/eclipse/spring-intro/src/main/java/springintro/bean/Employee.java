package springintro.bean;

public class Employee {
    private String firstName;
    private String lastName;
    private Address homeAddress;
    
    public Employee() {
    }
    
    public Employee(String firstName, String lastName, Address homeAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName
                + "\n" + homeAddress;
    }

}
